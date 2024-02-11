FROM openjdk:21
EXPOSE 7777
ADD target/hello-docker.jar hello-docker.jar
ENTRYPOINT ["java","-jar","/hello-docker.jar"]