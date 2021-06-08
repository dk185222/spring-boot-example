FROM openjdk:11
EXPOSE 9520
ADD target/spring-boot-example-1.0.jar spring-boot-example-1.0.jar
ENTRYPOINT [ "java","-jar","/spring-boot-example-1.0.jar" ]