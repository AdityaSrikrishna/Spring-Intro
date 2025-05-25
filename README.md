# Spring Core Introduction Project

This project introduces the basics of the Spring Framework, focusing on core concepts like dependency injection (DI) and bean management using XML and annotation-based configurations.

## Table of Contents

- [Overview](#overview)
- [Technologies Used](#technologies-used)
- [Concepts Demonstrated](#concepts-demonstrated)
- [Project Structure](#project-structure)
- [How to Run](#how-to-run)

## Overview

SpringIntro serves as your first hands-on experience with the Spring Framework. You'll learn how Spring manages application objects (beans) and injects dependencies at runtime.

## Technologies Used

- Java SE  
- Spring Core (v5 or later)  
- XML-based and annotation-based configuration  
- Maven or manual JAR setup

## Concepts Demonstrated

- Inversion of Control (IoC)
- Bean creation via XML
- Autowiring with annotations
- ApplicationContext and BeanFactory

## Project Structure

- `model/` – Business classes (e.g., `Student`, `Department`)  
- `config/` – XML configuration files  
- `MainApp.java` – Application launcher with Spring context  

## How to Run

1. Ensure Spring JARs are in the classpath  
2. Run `MainApp.java`  
3. Observe bean creation and method calls
