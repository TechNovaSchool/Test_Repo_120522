12.20.22
Iframes
--> Inline Frame
Whenever there is an iframe present in the page source(we can find it using // iframe)
in order to perform actions with elements inside of the iframe we need to switch focus of the driver.
Selenium can not work on two different frames at the same  time

-- 
 if we try to locate an element inside of the iframe before switching we will ge error 
////NoSuchElementException

To handle an iframe we need to use : driver.switch().frame(webElement of the iframe)
---------------------
HOw to locate an iframe could be done as regular webElement
But we also can use indexes
ex: driver.switch()frame(0);
or we can use frameID--> eX: driver.switch().frame("idvalue")
--------------------
`

Once we are done with actions  for iframe elements,we need to switch to main/parent HTML

To switch to parent :driver.switch().parent()--------> will focus to parent frame

# To switch to default/main: driver.switch()defaultContent()--> will focus on default frame
 1 --> HTML -- default
   2 --> HTML 
    3   ---> HTML

-------------------
How we can handle windows

Windows/tabs
Selenium does not see the difference between new window or new tab, so is being handled in same way.
Driver can focus only at one window at the moment , in order to change focus we need to get 
the address of the current windows: driver.getWindowHandle()--> returns unique string that is an window address

In order to switch windows/tab we need to use for loop, and create a logic
driver.getWindowHandles()---> will return the list of all open tabs or windows

for (String window: driver.getWindowHandles()) {
   if (!window.equals(mainWindow)) {
    driver.switchTo().window(window);
   } }

-------------------------
 Soft assertion

In this assertion we can allow the assertion to fail and test to continue

Soft assertion will not stop the execution of the code(test) and we can verify assertions separately 
 We need to create an object: SoftAssertion obj= new SoftAssert();

In order to verify the results of the assertion 
we need to use a method-->
softAssert.assertAll();
-------------------
Soft assertion can be used for small cosmetic details on the test flow


---------------------------
Iframes
What is an iframe?
--HTML inside another HTML
-- inline frame

How to handle iframes?
-- we need to switch to the iframe which contains elements we want to interact with
- driver.switch().frame("index")
- - driver.switch.frame("id")
- driver.switch.frame(webelement)
- 
---------- How to switch back to the main frame?
- driver.switch()parentFrame():---> the previous frame
- driver.switch()defaultFrame():---> the main frame(HTML)


Soft assertion
-- it is type of assertion that allows test to continue even when it fails

How to identify the failures?
- softAssert.assertAll()--> will display the failed test.

When  we can use soft assertion?
 it is allows to run a test untill the end of it,usually we can put "secondary importance" things to assert.



Windows/ Tabs

- selenium doesnt see the difference between tab or windows
- - to identify and switch tabs we can use for loop.since selenium doesnt have a special class to handle it

have a special class to handle it
driver.getWindowHandle()-- returns a string value of tab
driver.getWindowHandles()

23.09.23

Configuration Properties

This is a separate file.
Why do we need to use that file?
---> it a place to configure the project
---> can do configuration of the env:browser;
---> to save the secure information like login/password

1) Create a path to file ---> telling the system file is locates
2) Properties object
3) OPen the using FileInputStream
4) loading properties file into properties object
5) read ths file using getProperty() method

------------------------------------------
What the driver utility does?
-- It helps to write less repeatable code
-- It is using singleton design patern for driver in order to create only one
-- instance at the time
-- it also allows easy dynamic way to switch between browser using configuration file

27/09/2023

Recap
Locators:
 8 locators: LinkText(),name,className,is,tagName,partialLinkedText,css,xpath

css--> element[attribute]
xpath-
-->absolute(single /)
--> relative() double //

to locate a text //div[.="myText"]
<---->

What is TestNG?
-- it is a unit testing framework
-- also allows to perform functional testing
-- and provides annotations 
@BeforeClass/ @AfterClass
@BeforeMethod/ @AfterClass
@Test

-------------------
Assertion 
-- Allows to verify actual value against expected one.
Assertion will pass or the fail the test

SoftAssertion--> it will skip a assertion that failed 
and allows us to see the failed with AssertionAll() method

Assertion regular it will stop running the code if it fails
-------------------------------------------------

@Ignore---> will skip the test from running
 we also can skip it using comment//

priority we can set when the test is created , and this will provide an order for running the.

Dependency---> when we have a test that depends on another one
-------------------------------------------

Alerts
 We have 2 types of alerts

--> HTML alert--> is handled as a regular webElement(it allows us to interact with screen)

--> JSAlert--> we can not to interact with the screen it will block the screen it until we press okay
           --> we need to create an ALert abject to use it
1. warning --> we only accept it
2. Confirmation --> we can accept or decline
3. Promt --> we can accept , decline and input text
  Alert alerts = new Alert();
------------------------------------------

Iframes--> it is HTML inside another HTML
Web driver can not focus on 2 frames(HTMLs) at the same time
a)
1) we need to locate the iframe as the regular web element 
2) driver.switchTo().frame(webElement);

b)
byId value if the iframe has an id attribute

c)
by Index(0) will start with 0

How to switch back to main frame--> switch default content--> it will navigate to amin frame
How to switch to previous frame--> switch to parent
-------------------------
Windows/Tabs

how to handle a separate tabs?

we can use window handle
We also to need create logic(loop) to switch the window
have a special class to handle it
driver.getWindowHandle()-- returns a string value of tab
driver.getWindowHandles()

----------------------------------------------------

POM ---> Page object module

POM--> is not a framework but is a design pattern

In a page object model we create separate page for webElements, and store them inside of that page.

In order to make them accessible from different places(classes) we need to use:
public className(){
PageFactory.initElements(Driver.getDriver(),this);
}
initElements --> creates connection between current java classes and webdriver 
@FindBy --->annotation that comes from Selenium 
It helps to locate webElements

@FindBy(id="ctl00_MainContent_username")
public WebElement username;
-------------------

What to remember aboutPOM?
----------------------------
--> We create separate class for each page of the application 
--> we can store all webElements and it is related methods in that class
--> to use the webelements we need to create an object from that page


10.10.23

Synchronization

we need to align the webdriver with the flow of the page, when we have multiple moving element
or elements which will take time to load/ appear on the page


Because webElements might be visible only a particular time

The webElement might be visible only a particular time
---------
How to handle?
we can use :
Thread.sleep()--> is not recommended / this a java class that will stop the full program from running
 ExplicitWait --> we can add an explicit condition the webElement to be visible/ or clickable

In order to use explicit wait we need to create an object from WebDriverWait

WebDriverWait wait =new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
----------
wait.until(ExpectedConditions.visibilityOf(dynamicElementPage.helloText));
-------

When we have elements that appear when we do hover over and then disappear after the
mouse is moved is hard to get the locator for a particular element.

We open dev tool--> Sources -> search for pause sign (left side), use keyboard to click on
MAC -->  CMD +\
Windows-->
That will stop UI from moving until click back on play button

Action class:

Actions Class comes from Selenium library
And it allows handling actions such;

1. moveToElement
2. doubleClick
3. contextClick
4. dragAndDrop

Actions actions = new Actions(Driver.getDriver()); --> the object takes a driver a param

actions.moveToElement(hoverOverPage.photo3).perform();
actions.moveToElement(hoverOverPage.photo3).build().perform();
.perform() is required at the end of each action from action class


























