# Setup / Configuration

You will need:
- Java 8
- Kotlin
- Gradle
- Mysql
  - Create db: plunk
  - Fill in db login info in `application.properties` file

## Build / Migrations
```
gradle build
```


## Running API for Local Development
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


## Deployment

Nginx config:
```
location /api {
    proxy_pass http://localhost:8090;
    proxy_http_version 1.1;
    proxy_set_header Upgrade $http_upgrade;
    proxy_set_header Connection 'upgrade';
    proxy_set_header Host $host;
    proxy_cache_bypass $http_upgrade;
}
```


```
nohup java -jar path/to/jar &> /dev/null &
```

With Elastic Search:
```
nohup java \
 -javaagent:path/to/elastic-apm-agent-1.4.0.jar\
 -Delastic.apm.service_name=plunk-game\
 -Delastic.apm.server_url=http://localhost:8200\
 -Delastic.apm.application_packages=com.roughnecks.plunkgame\
 -jar path/to/jar\
 &> /dev/null &
```