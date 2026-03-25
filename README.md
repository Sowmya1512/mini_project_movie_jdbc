# mini_project_movie_jdbc
Java JDBC project using H2 Database
# Movie Management System (Java JDBC + H2 Database)

A simple Java console application demonstrating:
- JDBC CRUD operations  
- DAO pattern  
- Embedded H2 database (no installation required)  

## How to run

### 1. Compile
javac -cp "lib/h2-2.4.240.jar" -d bin util\DBUtil.java model\Movie.java dao\MovieDao.java dao\MovieDaoImpl.java CreateTable.java Main.java

### 2. Create the MOVIES table
java -cp "bin;lib/h2-2.4.240.jar" CreateTable

### 3. Run the app
java -cp "bin;lib/h2-2.4.240.jar" Main
