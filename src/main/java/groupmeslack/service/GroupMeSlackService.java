/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package groupmeslack.service;

import groupmeslack.data.GroupMeMessage;
import groupmeslack.data.SlackMessage;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.EndpointInject;
import org.apache.camel.Message;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultMessage;

public class GroupMeSlackService {
	
	@EndpointInject(uri="seda:toSlack")
	ProducerTemplate toSlack;
	
	@EndpointInject(uri="seda:toGroupMe")
	ProducerTemplate toGroupMe;
	
	//map of slack users with corresponding groupme bots
	private static final Map<String,String> slackBotMap;
	
	static
	{
		Map<String,String> map = new HashMap<String, String>();
		map.put("U0XXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXX");
		map.put("U0XXXXXXY", "XXXXXXXXXXXXXXXXXXXXXXXXXY");
		map.put("U0XXXXXXZ", "XXXXXXXXXXXXXXXXXXXXXXXXXZ");
		
		slackBotMap = Collections.unmodifiableMap(map);
	}
	
	public GroupMeSlackService() {

	}

	//public Message sendToSlack(GroupMeMessage message) {
	public void sendToSlack(GroupMeMessage message) {
		//Message camelMessage = null;
		if (message.getSender_type().equals("user")) {
			//camelMessage = new DefaultMessage();
			Map<String, Object> headersMap = new HashMap<>();
			headersMap.put("avatar", message.getAvatar_url());
			headersMap.put("username", message.getName());
			toSlack.sendBodyAndHeaders(message.getText(),headersMap );
			//camelMessage.setBody(message.getText());
			//camelMessage.setHeaders(headersMap);
		}
		//return camelMessage;

	}

	//public Message sendToGroupMe(SlackMessage message) {
	//public void sendToGroupMe(SlackMessage message) {
	  public void sendToGroupMe(String messageString) throws IOException{
		SlackMessage message = SlackParser.parseSlackMessage(messageString);
		//Message camelMessage = null;
		  if(slackBotMap.containsKey(message.getUser_id())){
			//camelMessage = new DefaultMessage();
			//Map<String, Object> headersMap = new HashMap<>();
			//headersMap.put("userid", message.getUser_id());
			//headersMap.put("bot", "asdf");		
			//camelMessage.setBody(message.getText());
			//camelMessage.setHeaders(headersMap);
			//toGroupMe.sendBodyAndHeaders(message.getText(), headersMap);
			toGroupMe.sendBodyAndHeader(message.getText(), "bot", slackBotMap.get(message.getUser_id()));
		}
		//return camelMessage;
	}
}
