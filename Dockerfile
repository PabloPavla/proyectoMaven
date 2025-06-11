FROM eclipse-temurin:22-jdk
WORKDIR /app
COPY proyectodual-1.0-SNAPSHOT.jar /app/proyectodual-1.0-SNAPSHOT.jar
CMD [ "java","-jar","proyectodual-1.0-SNAPSHOT.jar" ]
