FROM openjdk:17-slim

WORKDIR /app

COPY target/DiscordBotV4-0.3.0-BETA.jar app.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "app.jar"]