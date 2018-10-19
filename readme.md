## Setup / Configuration
You will need:
- Java 8
- Kotlin
- Gradle
- Postgres  
  - Run postgres
  - Create db: plunk
  - Fill in db login info in `application.properties` file

## Build / Migrations
```
gradle build
```


## Run API
Command Line:
```
gradle bootRun
```
  
Configuration:
```
Main Class: com.roughnecks.plunkgame.PlunkGameApplicationKt
Classpath of Module: plunk-game_main
```

   
You can then access via: http://localhost:8090