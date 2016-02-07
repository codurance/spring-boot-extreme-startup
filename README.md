#Sample Spring Boot project for Extreme Startup#

This simple project is designed to help you play the [Extreme Startup game](https://github.com/rchatley/extreme_startup).

It requires Java 8 and Maven 3. It runs with Spring Boot.

##Warmup##

Run the project with this command. Make sure to have an Internet access to download the dependencies.

```
mvn spring-boot:run
```

The application should be running at [http://localhost:3434](http://localhost:3434).

After registering yourself in the central game server, you should see this line in the standard output:

```
Got question 1fa9eae0: what is your name
```

Edit the `Controller` class to change the answer to this question (use the name you set during registration). Live reload is enabled, no need to restart the server:
 
 * In Eclipse, just save the file and the server will update your answer
 * In IntelliJ IDEA, run `Build -> Make project` ( ⌘-F9 by default) to update
 
You can test-drive your code with the `ControllerShould` class.
  
##Game##
  
After the warnum, the scores will be reset and the game will begin. Good luck, keep an eye on the scores!
