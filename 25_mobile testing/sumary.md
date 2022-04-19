# (25) Mobile Testing

## Resume
1. Appium
2. Project initialization & appium basic action
3. Appium complex actions & Maximizing the Project Structure

### Appium
appium is mobile automation frameworks to run mobile automation test that support many programming languange such as java, python, javascript, ruby, etc. appium library is created in top of selenium library and support in android, IOS and windows apps. 
**Appium Components**
- appium server used as a bridge to control the testing devices.
- appium client is the library written in several languages to create test scripy so we can send the command to the appium server

### Project initialization & appium basic action
**Project initialization**
- Using Maven Archtype
to generate basic project with all the dependencies and basic structure
- Adding Appium Java Client

**Appium basic action and cucumber**
- Cucumber frameworks
	support for creating behavior - driven development (BDD) Automation Tests
- Adding Feature Files
- Mappng every scenario steps on Steps Class
- Initializing the Appium
- Adding Desired Capilities
- Initialize the Appium 
- Using Cucumber Hooks
- Page Object Design Pattern
- Using MobilebBy and findElement() function
- using sendKeys() and clear() function
- using click(), getText(), isDisplayed() function
- perform assertions
- using cucumber tags on hooks

### Appium complex actions & Maximizing the Project Structure

- webdriverWait Object
	used for set the wait until the element meets the condition
- Setting Up Implicit Wait
	applied for every AndroidElement thet we create using findElement() function 
- The BasePageObject class
	to aim for wraps all the appium function to helps us writing less code in page class
**Performing complex actions**
- the TouchAction class
	used for performing complex action that using builder design pattern 
- Swipe
- Long Press
- Tag Multiple Times
 **Taking Screenshot**
 - Adding cucumber.properties file
 - The TakesScreenshot Interface
 **Configuration File**
 - using YAML format
 - snakeYAML library
 - Adding properties class
 - Adding YAML configuration File
 - Create Reader Class



