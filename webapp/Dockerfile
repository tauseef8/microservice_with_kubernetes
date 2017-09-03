FROM openjdk:8
COPY target/webapp-0.0.1-SNAPSHOT.war /app.war
EXPOSE 8080/tcp
ENTRYPOINT ["java", "-jar", "/app.war"]
