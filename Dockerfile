# Use an OpenJDK 8 runtime as a base image
FROM openjdk:8-jre-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container at the specified path
COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo.jar

# Expose the port that your Spring Boot application will run on
EXPOSE 8080

# Specify the command to run on container startup
CMD ["java", "-jar", "demo.jar"]
