# LearningSeleniumGrid
Testing using Selenium Grid for a simple Login page using different browsers on different machines

# Selenium Grid
The Selenium Grid is a testing tool which allows us to run our tests on different machines against different browsers. 
It is a part of the Selenium Suite which specialise in running multiple tests across different browsers, operating system and machines. 
You can connect to it with Selenium Remote by specifying the browser, browser version, and operating system you want. 
You specify these values through Selenium Remote's Capabilities.

#  Why the Selenium Grid is used?
With Selenium Grid you can create a simple infrastructure of various browsers on different operating systems to not only distribute test load, 
but also give you a diversity of browsers to work with.The Selenium Grid is used because of many reasons.
* When we want to run our tests against multiple browsers, the multiple versions of browsers and the browsers running on different operating system.
* It is also used to reduce the time taken by the test suite to complete a test pass by running tests in parallel.

# RemoteWebDriver:
RemoteWebDriver is an implementation class of the WebDriver interface that a test script developer can use to execute their test scripts 
via the RemoteWebDriver server on a remote machine.
There are two parts to RemoteWebDriver: a server(hub) and a client(node)

The RemoteWebDriverserver is a component that listens on a port for various requests from a RemoteWebDriver Once it receives the requests, 
it forwards them to any of the following: Firefox Driver, IE Driver, or Chrome Driver, whichever is asked.

The language-binding client libraries that serve as a RemoteWebDriver The client, as it used to when executing tests locally, 
translates your test script requests to JSON payload and sends them across to the RemoteWebDriverserver using the JSON wire protocol.

When you execute your tests locally, the WebDriver client libraries talk to your Firefox Driver, IE Driver, or Chrome Driver directly. 

Now, when you try to execute your tests remotely, the WebDriver client libraries talk to the RemoteWebDriverserver and the server talks to either the 
Firefox Driver, IE Driver, or Chrome Driver, whichever the WebDriver client asks for.

# Some Jargons:
* JSON over wire: JSON messages hold the entire information that is required by the server [can be Selenium GRID or WebDriver components] 
and hence instead of RPC, plain JSON messages are exchanged between server and client. Also referred to as WebDriver protocol

* Desired Capabilities: Object in automation code that has requesting browser configuration information

* RemoteWebDriver: Object in automation code that knows how to communicate remotely with WebDriver / Selenium GRID



