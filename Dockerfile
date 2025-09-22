FROM openjdk:8-jre
    COPY target/hello-world-1.0-SNAPSHOT.jar /app.jar
    ENTRYPOINT ["java", "-jar", "/app.jar"]