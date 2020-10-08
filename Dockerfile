FROM maven:3.6.3-jdk-13
USER root
WORKDIR /opt
COPY . .
RUN mvn clean package
ENTRYPOINT ["java","-jar","target/entitybuilder-0.0.1-SNAPSHOT.jar"]