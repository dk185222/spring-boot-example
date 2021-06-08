FROM openjdk:11
EXPOSE 9520
ADD target/spring-boot-example.jar spring-boot-example.jar
ENTRYPOINT [ "java","-jar","/spring-boot-example.jar" ]