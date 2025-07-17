FROM openjdk:17-jdk-slim

WORKDIR /myapp

COPY target/dockercompose-0.0.1-SNAPSHOT.jar myapp.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "myapp.jar"]
