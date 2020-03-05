# Spring Initializer
This project was started with the `https://start.spring.io/` Initializer program. It allows you to setup your project online with minimal effort. This is the result of going through that.

1. Install Maven with `./mvnw install`
2. Add the Maven Wrapper plugin: `mvn -N io.takari:maven:wrapper`
3. Compile project with `./mvnw package`
4. Run project with `./mvnw spring-boot:run`
5. Deploy project rerquires a repository, but can do with `./mvnw deploy`
**OR** 
```mvn deploy -DaltDeploymentRepository=internal.repo::default::file:///home/ryan/Github/spring-playground/demo/deployment```