# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a comprehensive Spring Boot learning repository containing multiple example projects and enterprise-level implementations. The repository has been upgraded to Spring Boot 3.x and requires Java 17+.

## Repository Structure

The repository is organized into several main directories:

- **SpringBoot入门案例源码/**: Basic Spring Boot examples (Hello World, JDBC, MyBatis, etc.)
- **SpringBoot前后端分离实战项目源码/**: Full-stack front-end/back-end separation project
- **SpringBoot咨询发布系统实战项目源码/**: News/information publishing system
- **SpringBoot博客系统实战项目源码/**: Blog system (external GitHub repo)
- **玩转SpringBoot系列案例源码/**: Advanced Spring Boot integration examples
- **SpringBoot大型线上商城实战项目源码/**: Large-scale e-commerce projects
- **SpringCloudAlibaba大型微服务实战项目源码/**: Microservices project

## Build and Run

All projects use Maven as the build tool. To build and run any project:

```bash
# Navigate to specific project directory
cd "SpringBoot入门案例源码/spring-boot-helloworld"

# Clean and compile
mvn clean compile

# Run tests
mvn test

# Package application
mvn package

# Run Spring Boot application
mvn spring-boot:run
# or
java -jar target/[artifact-name].jar
```

## Common Project Architecture

Most projects follow a standard Spring Boot MVC structure:

- **Application.java**: Main Spring Boot application class with `@SpringBootApplication`
- **controller/**: REST controllers handling HTTP requests
- **service/**: Business logic layer with interface and implementation
- **dao/**: Data Access Objects (MyBatis mappers)
- **entity/**: Domain models/POJOs
- **config/**: Configuration classes
- **common/**: Shared utilities (Result, Constants, etc.)
- **utils/**: Utility classes (DateUtil, MD5Util, PageUtil, etc.)

## Database Configuration

Projects typically use MySQL with MyBatis:

- Database configuration in `application.properties`
- MyBatis mapper XML files in `src/main/resources/mapper/`
- SQL schema files included (look for `*.sql` files)
- Default database connection: `jdbc:mysql://localhost:3306/[db_name]`

## Key Technologies Used

- **Spring Boot 3.0.0** (requires Java 17+)
- **MyBatis 3.0.0** for database operations
- **MySQL** as the primary database
- **Thymeleaf** for server-side templating (in some projects)
- **HikariCP** for connection pooling
- **Maven** for dependency management

## Testing

Run tests using:
```bash
mvn test
```

Test files are located in `src/test/java/` following the same package structure as main code.

## Common Development Patterns

- **Result wrapper pattern**: Most APIs return `Result<T>` objects with standardized response format
- **Service layer separation**: Controllers delegate to service interfaces
- **MyBatis integration**: Uses `@MapperScan` annotation for DAO discovery
- **Token-based authentication**: Some projects implement custom token validation
- **Pagination support**: Uses `PageUtil` and `PageResult` for list operations

## Database Setup

Each project includes SQL schema files. Import the appropriate schema file into MySQL before running:

```bash
mysql -u root -p < [project]/[schema-file].sql
```

## Configuration Notes

- Default server port: 8080
- Database connection pool: HikariCP with optimized settings
- MyBatis mapper locations: `classpath:mapper/*Dao.xml`
- Static resources served from `src/main/resources/static/`

## Frontend Integration

Frontend projects (where applicable) are typically located in `static/` or as separate directories within the project structure. Some projects include:

- Bootstrap CSS framework
- jQuery for JavaScript
- jqGrid for data tables
- SweetAlert for notifications