FROM docker.io/openjdk:11.0
WORKDIR /app
COPY ./target/inventarios-restservice-1.0.jar /app
EXPOSE 8080
ENTRYPOINT ["java","-jar","inventarios-restservice-1.0.jar"]
