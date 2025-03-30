# Use an official OpenJDK runtime as a parent image
FROM openjdk:23-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the packaged jar file into the container
ARG JAR_FILE=target/demo-backend.jar
COPY ${JAR_FILE} app.jar

# Expose the port your application will run on
EXPOSE 8443

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
