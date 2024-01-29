FROM openjdk:21
EXPOSE 7777
ADD target/hello.jar hello.jar
ENTRYPOINT ["java","-jar","/hello.jar"]