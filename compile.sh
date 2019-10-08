./gradlew clean assemble &&
rm -rf /opt/tomcat/webapps/mockup
rm -r /opt/tomcat/webapps/mockup.war
cp build/libs/*.war /opt/tomcat/webapps