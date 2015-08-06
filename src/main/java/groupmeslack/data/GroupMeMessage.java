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
package groupmeslack.data;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Represents an user of the system")
public class GroupMeMessage {

    private Object attachments;
    private String avatar_url;
    private String created_at;
    private String group_id;
    private String id;
    private String name;
    private String sender_id;
    private String sender_type;
    private String source_guid;
    private String system;
    private String text;
    private String user_id;

    public GroupMeMessage() {
    }
    
    public GroupMeMessage(Object attachments, String avatar_url,
			String created_at, String group_id, String id, String name,
			String sender_id, String sender_type, String source_guid,
			String system, String text, String user_id) {
		this.attachments = attachments;
		this.avatar_url = avatar_url;
		this.created_at = created_at;
		this.group_id = group_id;
		this.id = id;
		this.name = name;
		this.sender_id = sender_id;
		this.sender_type = sender_type;
		this.source_guid = source_guid;
		this.system = system;
		this.text = text;
		this.user_id = user_id;
	}

    @ApiModelProperty(value = "The attachments of the message", required = false)
	public Object getAttachments() {
		return attachments;
	}

	public void setAttachments(Object attachments) {
		this.attachments = attachments;
	}

	@ApiModelProperty(value = "The avatar url of the message", required = false)
	public String getAvatar_url() {
		return avatar_url;
	}

	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}

	@ApiModelProperty(value = "The created at of the message", required = false)
	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	@ApiModelProperty(value = "The group id of the message", required = false)
	public String getGroup_id() {
		return group_id;
	}

	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}

	@ApiModelProperty(value = "The id of the message", required = false)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ApiModelProperty(value = "The name of the message", required = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ApiModelProperty(value = "The sender id of the message", required = false)
	public String getSender_id() {
		return sender_id;
	}

	public void setSender_id(String sender_id) {
		this.sender_id = sender_id;
	}

	@ApiModelProperty(value = "The sender type of the message", required = false)
	public String getSender_type() {
		return sender_type;
	}

	public void setSender_type(String sender_type) {
		this.sender_type = sender_type;
	}

	@ApiModelProperty(value = "The source guid of the message", required = false)
	public String getSource_guid() {
		return source_guid;
	}

	public void setSource_guid(String source_guid) {
		this.source_guid = source_guid;
	}

	@ApiModelProperty(value = "The system of the message", required = false)
	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	@ApiModelProperty(value = "The text of the message", required = false)
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@ApiModelProperty(value = "The user id of the message", required = false)
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

}
