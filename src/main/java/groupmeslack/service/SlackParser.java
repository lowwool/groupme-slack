package groupmeslack.service;

import groupmeslack.data.SlackMessage;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SlackParser {

	//Map of slacker user id and names
	private static final Map<String,String> idUserMap;
	
	static
	{
		Map<String,String> map = new HashMap<>();
		map.put("U0XXXXXXX", "USER1");
		map.put("U0XXXXXXY", "USER2");
		map.put("U0XXXXXXZ", "USER3");
		idUserMap = Collections.unmodifiableMap(map);
	}
	
	public static SlackMessage parseSlackMessage(String message) throws IOException
	{		
		String[] content = message.split("&");
		Map<String,String> contentMap = new HashMap<>();
		
		ObjectMapper objMapper =new ObjectMapper();
		for(String data : content)
		{
			String[] dataArray = data.split("=");
			if(dataArray[0].equals("text"))
			{
				dataArray[1]=dataArray[1].replace("%3C", "");
				dataArray[1]=dataArray[1].replace("%3E", "");
			
				for(Map.Entry<String, String> entry : idUserMap.entrySet())
				{
					dataArray[1]=dataArray[1].replace(entry.getKey(), entry.getValue());
				}
			}
			contentMap.put(dataArray[0], dataArray[1]);
		}
		String mapJson = objMapper.writeValueAsString(contentMap);
		SlackMessage slackMessage=objMapper.readValue(mapJson, SlackMessage.class);
		
		return slackMessage;
	}
	
}
