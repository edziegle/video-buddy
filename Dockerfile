FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp

COPY . /

RUN ./gradlew build

ARG JAR_FILE=build/libs/Video-Buddy-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]