FROM openjdk:17-alpine

COPY target/*.jar /usr/app/

WORKDIR /usr/app

EXPOSE 9001

ENTRYPOINT ["java", "-jar", "graphql-kotlin-0.0.1-SNAPSHOT.jar"]