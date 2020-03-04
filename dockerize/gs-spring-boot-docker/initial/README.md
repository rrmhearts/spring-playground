# Spring


## Without Docker
./gradlew build && java -jar build/libs/gs-spring-boot-docker-0.1.0.jar


## WITH Docker
docker build --build-arg JAR_FILE=build/libs/*.jar -t springio/gs-spring-boot-docker .