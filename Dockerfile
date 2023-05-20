FROM eclipse-temurin:11-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=target/excel-to-finance-file-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
