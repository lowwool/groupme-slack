package groupmeslack.data;

import com.wordnik.swagger.annotations.ApiModelProperty;

public class SlackMessage {
	
	private String token;
	
	private String team_id;
	
	private String team_domain;
	
	private String service_id;
	
	private String channel_id;

	private String channel_name;
	
	private String timestamp;
	
	private String user_id;
	
	private String user_name;
	
	private String text;
	
	private String trigger_word;
	
	

	public SlackMessage(){
		
	}
	
	public SlackMessage(String token, String team_id, String team_domain,
			String service_id, String channel_id, String channel_name,
			String timestamp, String user_id, String user_name, String text,
			String trigger_word) {
		super();
		this.token = token;
		this.team_id = team_id;
		this.team_domain = team_domain;
		this.service_id = service_id;
		this.channel_id = channel_id;
		this.channel_name = channel_name;
		this.timestamp = timestamp;
		this.user_id = user_id;
		this.user_name = user_name;
		this.text = text;
		this.trigger_word = trigger_word;
	}

	//@ApiModelProperty(value = "The token of the message", required = false)
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	//@ApiModelProperty(value = "The team id of the message", required = false)
	public String getTeam_id() {
		return team_id;
	}

	public void setTeam_id(String team_id) {
		this.team_id = team_id;
	}
	
	//@ApiModelProperty(value = "The team domain of the message", required = false)
	public String getTeam_domain() {
		return team_domain;
	}
	public void setTeam_domain(String team_domain) {
		this.team_domain = team_domain;
	}
	
	public String getService_id() {
		return service_id;
	}

	public void setService_id(String service_id) {
		this.service_id = service_id;
	}

	//@ApiModelProperty(value = "The channel id of the message", required = false)
	public String getChannel_id() {
		return channel_id;
	}

	public void setChannel_id(String channel_id) {
		this.channel_id = channel_id;
	}


	//@ApiModelProperty(value = "The channel name of the message", required = false)
	public String getChannel_name() {
		return channel_name;
	}

	public void setChannel_name(String channel_name) {
		this.channel_name = channel_name;
	}

	//@ApiModelProperty(value = "The timestamp of the message", required = false)
	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	//@ApiModelProperty(value = "The user id of the message", required = false)
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	//@ApiModelProperty(value = "The user name of the message", required = false)
	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	//@ApiModelProperty(value = "The text of the message", required = false)
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	//@ApiModelProperty(value = "The trigger word of the message", required = false)
	public String getTrigger_word() {
		return trigger_word;
	}

	public void setTrigger_word(String trigger_word) {
		this.trigger_word = trigger_word;
	}
	
	
	
}
