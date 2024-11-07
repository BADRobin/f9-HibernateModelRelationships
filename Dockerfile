FROM maven:3.13.0-openjdk-21 AS build

COPY . .

RUN mvn clean package -DskipTest

FROM openjdk:21.0.2-jdk-slim

COPY --from=build /target/f9-HibernateModelRelationships-0.0.1-SNAPSHOT.jar f9-HibernateModelRelationships.jar

EXPOSE 8080

CMD ["java", "-jar", "f9-HibernateModelRelationships.jar"]