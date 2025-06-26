# Use a lightweight Java image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy your jar into the container
COPY dist/Fleur.jar /app/Fleur.jar

# Expose a port (this is optional if your app listens on $PORT)
EXPOSE 8080

# Run the jar
CMD ["java", "-jar", "Fleur.jar"]
