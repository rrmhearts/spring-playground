# Spring Example

Based on section 4 of the following page
https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/html/getting-started.html#getting-started-first-application

## Setup
The `pom.xml` file permits the user to run:

```
mvn package
```

On the command line. This is like building the project, even without any source files. The pom file was taken from the site above. The Spring Boot / Web portion is based on this dependency in the pom file.

```
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>
```

The following command allows a user to see the dependencies of a project. 
`mvn dependency:tree`

## Code
To finish our application, we need to create a single Java file. By default, Maven compiles sources from src/main/java, so you need to create that folder structure and then add a file named src/main/java/Example.java. The file adds `hello world` code returned from the server.

## Run
You can run the new code by `mvn spring-boot:run` and you'll see the output in a browser at `localhost:8080`. Spring Boot uses a Tomcat server behind the scenes.
