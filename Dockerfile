FROM maven:3.8.5-openjdk-17 AS build

COPY . .

RUN mvn clean package -DskipTest

FROM openjdk:17.0.1-jdk-slim

COPY --from=build /target/f9-HibernateModelRelationships-0.0.1-SNAPSHOT.jar f9-HibernateModelRelationships.jar

EXPOSE 8080

CMD ["java", "-jar", "f9-HibernateModelRelationships.jar"]