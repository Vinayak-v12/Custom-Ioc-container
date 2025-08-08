# 🧰 Custom IoC (Dependency Injection) Container in Java

A lightweight, annotation-driven Inversion of Control (IoC) container developed in pure Java. Inspired by Spring's core dependency injection mechanism, this project demonstrates how to create and manage beans using custom annotations and Java Reflection.

## 📂 Project Structure

custom_DI/
├── src/
│   └── main/
│       └── java/
│           ├── custom_DI/
│           │   ├── Custom_Autowired.java       # Custom annotation for dependency injection
│           │   ├── Custom_Component.java       # Custom annotation to define components
│           │   └── Custom_IOC_Conatiner.java   # The IoC container logic
│           └── demo/
│               ├── Engine.java                 # A component class
│               ├── Car.java                    # A component class that depends on Engine
│               └── TestCFG.java                # Main class to test the container
├── pom.xml                                      # Maven configuration file

## 🚀 Features

- `@Custom_Component`: Marks a class to be managed as a bean
- `@Custom_Autowired`: Automatically injects dependencies into fields
- Singleton bean container using HashMap
- Uses Java Reflection API to instantiate classes and inject dependencies
- Scans packages and loads all annotated beans
- No external frameworks used

## 🛠 Technologies Used

- Java
- Maven
- Java Reflection API
- Annotations
