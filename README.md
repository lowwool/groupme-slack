# groupme-slack

This application is creates a two-communication between a GroupMe group and a Slack channel.
It creates a .war file that can be deployed in Apache Tomcat

##Third Party Software
This application utilizes several third party softwares, primarily Apache Camel 2.16
 
###http://camel.apache.org/
####http://camel.apache.org/rest-dsl.html
####http://camel.apache.org/slack.html
####http://camel.apache.org/message-endpoint.html

###https://github.com/wreed12345/GroupMe-Java-API

##How to build
	mvn clean package

##Running it locally
	mvn jetty:run
	
##TODO
	Improve README.md 