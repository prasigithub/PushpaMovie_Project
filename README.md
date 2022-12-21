# PushpaMovie_Project

## Table of contents

- Introduction
- Requirements
- Recommended modules
- Installation
- Configuration
- Troubleshooting
- FAQ
## Introduction
This project is to retrieve Release date and country of the movie Pushpa The rise: Part 1 from IMDB and Wikipedia and assert the information from both the websites.

## Requirements
To run the test you need to update the following dependencies in pom.xml

 <code><dependencies></code>
    <dependency>
      <groupId>junit</groupId>
   <code>  <artifactId>junit</artifactId></code>
      <version>4.12</version>
      <scope>test</scope>
    </dependency>
    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>3.141.59</version>
</dependency>
<!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
<dependency>
    <groupId>commons-io</groupId>
    <artifactId>commons-io</artifactId>
    <version>2.11.0</version>
</dependency>
  </dependencies>


{Built With}

Selenium - Browser automation framework

Maven - Dependency management

TestNG - Testing framework

Allure - Reporting framework
