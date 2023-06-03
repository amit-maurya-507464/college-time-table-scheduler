# College Time Table Scheduler
This is a college Time Table scheduler project build in spring boot using Optaplanner Constraint solver.

## Technologies used
1. java
2. Spring Boot
3. Optaplanner
4. Hibernate
5. H2 Database
6. Html
7. Css
8. JavaScript
9. Bootstrap

## Running and Testing
**IDE:**
Open project in any IDE and run as a spring boot Project. <br>
**Command line:**
Open terminal and locate to pom.xml file directory and type command -
`mvn dpring-boot:run`

Use the following url to test the Application:
http://localhost:8080

## Dependencies
```
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-data-rest</artifactId>
</dependency>
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
  <groupId>com.h2database</groupId>
  <artifactId>h2</artifactId>
  <scope>runtime</scope>
</dependency>
<dependency>
  <groupId>org.optaplanner</groupId>
  <artifactId>optaplanner-spring-boot-starter</artifactId>
</dependency>

<!-- Testing -->
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-test</artifactId>
  <scope>test</scope>
</dependency>
<dependency>
  <groupId>org.optaplanner</groupId>
  <artifactId>optaplanner-test</artifactId>
  <scope>test</scope>
</dependency>

<!-- UI -->
<dependency>
  <groupId>org.webjars</groupId>
  <artifactId>webjars-locator</artifactId>
  <scope>runtime</scope>
</dependency>
<dependency>
  <groupId>org.webjars</groupId>
  <artifactId>bootstrap</artifactId>
  <scope>runtime</scope>
</dependency>
<dependency>
  <groupId>org.webjars</groupId>
  <artifactId>font-awesome</artifactId>
  <scope>runtime</scope>
</dependency>
<dependency>
  <groupId>org.webjars</groupId>
  <artifactId>momentjs</artifactId>
  <scope>runtime</scope>
</dependency>
```

## User Interface

**Home Page**
![home.png](assets%2Fimages%2Fhome.png)

**Constraints**
![contraints.png](assets%2Fimages%2Fcontraints.png)

**Add Lesson**
![add-lesson.png](assets%2Fimages%2Fadd-lesson.png)

**Add Room**
![add-room.png](assets%2Fimages%2Fadd-room.png)

**Add Timeslot**
![add-timeslot.png](assets%2Fimages%2Fadd-timeslot.png)

**Result by class**
![byClass.png](assets%2Fimages%2FbyClass.png)

**Result by Room**
![byRoom.png](assets%2Fimages%2FbyRoom.png)

**Result by Teacher**
![byTeacher.png](assets%2Fimages%2FbyTeacher.png)

## Usage

After running the application go to home page. 
There you can see a lot of predefined classes.
We can add or remove classes according to our need.
click on solve button to solve create schedule.
Constraints result will show have many soft or hard rules have been broken.

## Configuration
The solver runs for 30 seconds. To run for 5 minutes use "5m" and for 2 hours use "2h". <br>
`optaplanner.solver.termination.spent-limit=30s`

For selecting data set (possible values = LARGE, SMALL) for no default data set to "NONE" <br>
`timeTable.demoData = LARGE`
