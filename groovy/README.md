# Groovy on Spring

Simple code.
```
@RestController
class ThisWillActuallyRun {

    @RequestMapping("/")
    String home() {
        "Hello World!"
    }

}
```

Run it.
```
spring run app.groovy
```
