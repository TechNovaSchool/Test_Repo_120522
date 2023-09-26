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






















