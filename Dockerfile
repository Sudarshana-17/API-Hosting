FROM openjdk:17-jdk-slim
WORKID /app
COPY /target/APIHosting-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]