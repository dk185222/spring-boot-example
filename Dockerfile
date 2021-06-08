FROM openjdk:8u181-jdk
EXPOSE 9520
ADD target/spring-boot-example-1.0-SNAPSHOT.jar spring-boot-example-1.0-SNAPSHOT.jar
ENTRYPOINT [ "java","jar","/spring-boot-example-1.0-SNAPSHOT.jar" ]
