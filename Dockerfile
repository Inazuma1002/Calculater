FROM openjdk:8
COPY ./target/Calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
ENTRYPOINT ["java","-jar","Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]
