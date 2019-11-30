FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="vinaysingh.singh254@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 9001

# The application's jar file
ARG JAR_FILE=target/spboot-aop-example-1.0-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} spring-boot-aop.jar

# Run the jar file
ENTRYPOINT ["java","-jar","/spring-boot-aop.jar"]