FROM tomcat:10.0.11
LABEL app=my-app
COPY target/*.war /usr/local/tomcat/webapps/myweb.war
