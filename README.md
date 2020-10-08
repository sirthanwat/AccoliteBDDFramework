# AccoliteBDDFramework
Created framework using BDD and Page object model
Tool / Technologies used :
* Eclipse IDE for Enterprise Java Developers 2019-06 (4.12.0)
* JAVA Jdk 1.8.0_251 
* selenium-java 3.141.59 
* cucumber-junit 6.2.2
* cucumber-java 6.2.2
For other maven dependency please Refer pom.xml file.

Assignments written in feature file. 
*Path : AccoliteBDDFramework/featureFiles

How To Verify the changes (Running Test Cases):
First Way:
* Go to  src\test\java\com.web.automation.runner\TestRunner.java
* Inside file right click --->Run (Eclipse IDE functionality)

Important Variables & terminology need to follow
* Root directory for features file location : .\featureFiles
* Root directory browser driver location : .\driver
* All the required project Configuration details location : .\configFile\projectConfiguration.properties
* All the elements test data details location : .\elementLocators\locators.properties
* Page methods and xpath locator location : .\src\test\java\com\web\automation\pages
* Utilities class => Contains all Common functions and project configuration class :
  PATH: \src\main\java\utilities\CommonFuntions.java 
        \src\main\java\utilities\ConfigReader.java
  
* Assertion package => compare class => Assertions & Validations 
