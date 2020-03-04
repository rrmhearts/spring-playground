# Spring


## Without Docker
./gradlew build && java -jar build/libs/gs-spring-boot-docker-0.1.0.jar


## WITH Docker

With Gradle
```
FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

docker build --build-arg JAR_FILE=build/libs/*.jar -t springio/gs-spring-boot-docker .
```
### more complicated way
```
FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","hello.Application"]

mkdir -p build/dependency && (cd build/dependency; jar -xf ../libs/*.jar)

docker build --build-arg DEPENDENCY=build/dependency -t springio/gs-spring-boot-docker .
```

With Maven
```
docker build -t springio/gs-spring-boot-docker .
```

### running
```
docker run -p 8080:8080 -t rrmhearts/spring-boot-docker
```