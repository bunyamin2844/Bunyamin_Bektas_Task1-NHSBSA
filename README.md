#Tasks:
As a user, I should be able to know what help I can get with my NHS costs. <br />
Upload your project to GitHub and share the link.
#GitHub link
-https://github.com/bunyamin2844/Bunyamin_Bektas_Task1-NHSBSA.git
## Environment:
- Java version: 11
- Maven version: 3.*
- Selenium-Java: 4.8.1

## Read-Only Files:
- src/test/*
- ExternalFile/NHS_Task1.xlsx


##  Data
Fill the data entry form with the following data:
- *Config.properties ( browser,url)
- Test Cases ( ExternalFile/NHS_Task1.xlsx)

SOLUTION:

1- All test has done and been taken screenshots and keep them in ScreenShots folder under Resources. 
2- Creates a framework in Intellij Idea with Junit using java language. 

**Installation guide: This is a maven project. so It's assumed that the host running this code have Java and maven installed and already set. Here is the guide for maven installation just in case : https://maven.apache.org/install.html Project get all dependencies from maven repository. So no additional installation needed. *Below are the dependencies are being used for this project Cucumber-Junit, Cucumber-java,Selenium, Bonigarcia Webdriver Test RUN Notes: To run all Scenarios one by one, use tags in the Runner class/Cucumber Options**
1. Way: Clone the project Import maven dependencies from POM Go src -> test > java > runners > Runners and RUN To generate "HTML Maven Cucumber Report" ; Open Maven right side panel Double Click Project's Lifecycle Click "verify"

## Commands
- run:
```bash
mvn clean package; java -jar target/selenium-java-data-entry-automation-1.0.jar
```
- install:
```bash
mvn clean install
```
- test:
```bash
mvn clean test