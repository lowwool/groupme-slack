# groupme-slack - swag

This application is creates a two way communication between a GroupMe group and a Slack channel.
It creates a .war file that can be deployed in Apache Tomcat


##Third Party Software
This application utilizes several third party softwares, primarily Apache Camel 2.16

For more information, please see below
 
1. **Apache Camel:**http://camel.apache.org/

  1. **Rest DSL:**http://camel.apache.org/rest-dsl.html

  2. **Camel Slack Component:**http://camel.apache.org/slack.html

  3. **Dynamic To:**http://camel.apache.org/message-endpoint.html

2. **GroupMe API:**https://github.com/wreed12345/GroupMe-Java-API
	a) https://dev.groupme.com/docs/v3

##How to build 
	mvn clean package
##How to deploy
	mvn clean package

##Running it locally on swag box.
	mvn jetty:run
	
##TODO
	Improve README.md 

