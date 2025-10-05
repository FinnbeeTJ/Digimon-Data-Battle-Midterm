# Start with a base image that has Java 17 installed.
FROM eclipse-temurin:17-jdk-jammy

# Set the working directory inside the container to /app.
WORKDIR /app

# Copy the compiled .jar file from your project into the container
# and rename it to app.jar.
COPY target/Digimon-Data-Battle-Midterm-1.0-SNAPSHOT.jar app.jar

# The command that will run when the container starts.
CMD ["java", "-jar", "app.jar"]