FROM openjdk:11
EXPOSE 9520
VOLUME /tmp
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT [ "java","-jar","/spring-boot-example-1.0-SNAPSHOT.jar" ]