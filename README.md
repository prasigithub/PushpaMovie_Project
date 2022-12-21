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

## Installation
### Install Snapshot

The update site to install snapshot versions of the TestNG Eclipse plug-in is:

`https://testng.org/testng-eclipse-update-site`

Use it if you want to experiment with the new features or verify the bug fixes, and please [report back if you encounter any issues](https://github.com/cbeust/testng-eclipse/issues).

To install it:
* Click "Help -> Install New Software..." on top level menu
* Paste the url `https://testng.org/testng-eclipse-update-site` to `Work with: ` text field and press enter.
* Select the plugins
* Click "Next" button and accept the license to complete the installation.
* Restart Eclipse

If you want to install previous version of beta, you can pick up one from [here](https://testng.org/testng-eclipse-update-site).
1. Installing a Plugin:
    * Inside Eclipse, click on the **Help** menu  
    * Select **Install New Software**.

    ![Install New Software-1](.README/install-new-software-eclipse-1.png)

1. Locating the Plugin:
    * Click the **Add** button
    * Enter **http://beust.com/eclipse** in the **Location** field

    ![Install New Software-2](.README/install-new-software-eclipse-2.png)

1. Selecting the Plugin:
    * Ensure the **TestNG** checkbox is selected
    * Click the "Next" button to the right bottom

      ![Install New Software](.README/install-new-software-eclipse-3.png)


1. Finishing up:
    * Accept the terms of the license agreement
    * Click on the Finish button

    ![Install New Software](.README/install-new-software-eclipse-4.png)

### <a id="setting-up-maven"></a>Setting up Maven

1. Download Maven [here](https://maven.apache.org/download.cgi).

    ![Maven Installation](.README/maven-installation-1.png)

1. Unzip the distribution archive to the directory you wish to install Maven. I extracted maven to my `Documents` folder
  
1. Add Maven to the `PATH`. More information can be found in the `README.txt` in the zip folder.

    * Here's an example of how I added Maven to my `PATH` on MacOS.
    I added the folowing to the `~/.bash_profile`.

    ```shell
    $ export PATH=/Users/admin/Documents/Software/apache-maven-3.5.0/bin:$PATH

    ```
    * Then `source`d (execute) the content of the `~/.bash_profile`
      
    ``` shell 
    $ source ~/.bash_profile
    ```

1. Verify Maven was correctly installed

    * Command:

    ```shell
    $ mvn –version
    ```

    Maven dependencies are crucial to running any Maven project.
    
    Maven dependencies contains key references to libraries that a Maven project needs to execute. The `pom.xml` in the root of a Maven project file stores the dependencies (similar to the `package.json` for Node and `gemfile` for Ruby) for a project.

## <a id="running-the-project"></a> Running the Project

### <a id="from-eclipse"></a> From Eclipse

  1. Import this project into Eclispe
  1. Right click the project then select **Run As** then **Maven Tests**

{Built With}

Selenium - Browser automation framework

Maven - Dependency management

TestNG - Testing framework

Allure - Reporting framework
