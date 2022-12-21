# PushpaMovie_Project

## Table of contents

- Introduction
- Requirements
- Installation
- Requirements
- Configuration
- Troubleshooting
- FAQ
```

```
## Introduction
This project is to retrieve Release date and country of the movie Pushpa The rise: Part 1 from IMDB and Wikipedia and assert the information from both the websites.

## Installation
### Install Snapshot

The update site to install snapshot versions of the TestNG Eclipse plug-in is:

`https://testng.org/testng-eclipse-update-site`

To install it:
* Click "Help -> Install New Software..." on top level menu
* Paste the url `https://testng.org/testng-eclipse-update-site` to `Work with: ` text field and press enter.
* Select the plugins
* Click "Next" button and accept the license to complete the installation.
* Restart Eclipse

## Create a New Maven Project in Eclipse

* Open your eclipse and Go to File > New > Others.
* Select Maven Project and click on Next.
* Un-check the 'Use default Workspace location' and with the help of the Browse button choose your workspace where you would like to set up your Maven project.
* Select the archetype, for now just select the 'maven-aechetype-quickstart' and click on Next.
* Specify the Group Id & Artifact Id and click on Finish.
* Go to the project location to see the newly created maven project. Now open the pom.xml file, which resides in the project folder. By default the POM is generated like this:

```
 <plugin>
          <artifactId>maven-clean-plugin</artifactId>
          <version>3.1.0</version>
        </plugin>
        <!-- default lifecycle, jar packaging: see https://maven.apache.org/ref/current/maven-core/default-bindings.html#Plugin_bindings_for_jar_packaging -->
        <plugin>
          <artifactId>maven-resources-plugin</artifactId>
          <version>3.0.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-compiler-plugin</artifactId>
          <version>3.8.0</version>
        </plugin>
        <plugin>
          <artifactId>maven-surefire-plugin</artifactId>
          <version>2.22.1</version>
        </plugin>
        <plugin>
          <artifactId>maven-jar-plugin</artifactId>
          <version>3.0.2</version>
        </plugin>
```
  
  * Modify XML with the latest Junit and save the XML:
    
```
<dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>
```
## Configuration

* To make it a TestNG project just navigate to the Libraries tab and click on the Add Library button.
* Choose TestNG from the list of libraries and click Next.
* Now, you will see TestNG added to your project libraries. Click on Finish and you are all set with your testNG project.
* Your Java project has been created successfully and you will be able to see it by clicking on the Package Explorer button on the left panel.
* you need to add the Selenium API JAR files to your TestNG project
* Navigate or choose the path where you have downloaded the Selenium Java language bindings.
* After adding all JAR files, hit the button to Apply and Close.

### Creating Testng class in eclipse

* Navigate to src from the project folder and right-click the same. You will see TestNG as an option in the dropdown towards the bottom.
* Click on it and you will now see two sub-options to either create a TestNG class or convert the class to TestNG. As we are creating a new TestNG class, you need to select the first option.
* You can give any name to your class, for example, ‘Pushpa_Project’ and its package. For now, we will keep the basic annotations selected @BeforeMethod and @AfterMethod.
* You are now all set to write code in your TestNG class.

   * @Test annotation implies that the method is a test method and any code written under it constitutes to be a test case.
   * @BeforeMethod implies that the method beneath should be running before the test method.
   * @AfterMethod, just as the name suggests implies that the method should run after the test method.



