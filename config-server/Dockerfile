# syntax=docker/dockerfile:1

FROM openjdk:16-alpine3.13 as base

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
COPY src ./src

FROM base as build
RUN ./mvnw package

FROM openjdk:11-jre-slim as production
EXPOSE 9296

COPY --from=build /app/target/config-server-*.jar /config-server.jar

CMD ["java", "-jar", "/config-server.jar"]






