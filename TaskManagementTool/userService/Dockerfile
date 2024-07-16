FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/userservice-0.0.1-SNAPSHOT.jar UserService.jar
ENTRYPOINT ["java","-jar","/UserService.jar"]
