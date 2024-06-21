# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the jar file into the container at /app
COPY target/messaging-service-0.0.1-SNAPSHOT.jar /app/messaging-service.jar

# Make port 8080 available to the world outside this container
EXPOSE 8083

# Run the jar file
ENTRYPOINT ["java", "-jar", "messaging-service.jar"]