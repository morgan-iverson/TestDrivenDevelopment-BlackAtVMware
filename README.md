# TestDrivenDevelopment-BlackAtVMware
This repository contains the code for the Black@VMware Black Heritage Month Test Driven Development Webinar lead by [Morgan Iverson](https://www.linkedin.com/in/mwiverson/) and [Gregory Green](https://www.linkedin.com/in/gregory-green-5619748/).

**Want to develop a cool math game?**

This project will be used develop the backend of a bug free addition game!

During this session, we will cover software testing methods.

We will discuss challenges with building bug-free software with previous testing approaches.
We will provide an overview of Test-Driven-Development (TDD) and explain how it helps.
We will demonstrate building a math game using TDD.
Students should be familiar with a minimum of 1 programming language’s basic concept.
These concepts should include objects, variables, methods, and if-then-else logic.



The following is a summary of the projects in this repository.

Project             |  Notes
------------------- | -----------------------------------------
[Complete-MathGame](https://github.com/morgan-iverson/TestDrivenDevelopment-BlackAtVMware/tree/main/Complete-MathGame)   | The complete coding example of the math game
[Initial-MathGame](https://github.com/morgan-iverson/TestDrivenDevelopment-BlackAtVMware/tree/main/Initial-MathGame)   | This project will be used during the workshop to recreate the match using Test Driven Development.


# Software Dependencies

This project has been build using [OpenJDK version 11](https://openjdk.org/projects/jdk/11/) with [Apache Maven](https://maven.apache.org/) version 3.9.0 


## Installation on a Mac with Brew 
### Install Java 11

Preform [brew](https://brew.sh/) command following to install Java 11 on Mac Os.

```shell
brew install java11
```

Perform the following on teh command into the run or compile the project.

```shell
export PATH=/opt/homebrew/opt/openjdk@11/bin:$PATH
export JAVA_HOME=/opt/homebrew/opt/openjdk@11
```

### Install Maven

See the following link for [Maven installation](https://maven.apache.org/install.html).


# Building 

The following uses the Apache Maven to build the project.

```shell
 mvn package
```