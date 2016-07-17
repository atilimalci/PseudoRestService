# Pseudo Rest Service

## Installation Overview

This is the REST service for testing Rest clients. The project was built using a Maven archetype for Jersey. The project was built with the following:

- STS (Eclipse would work as well)
- JDK 1.7.0_79
- Maven 3.2.3
- Jersey 2.14

# Component Installation

To install the project, you will need to have Maven 2+ installed and configured. Once you have installed Maven, follow these steps:

1. Open a command window and navigate to the root directory of the project. 
2. Run the command: mvn install

# Running the Project

Once you have successfully built the project, simply open a command prompt and run the following command from the root directory of the project: mvn exec:java

This will start the server and allow you to call the rest service. The URL is: 

http://localhost:9090/pseudo/rest/api

Use the URL above, the content type as application/json and the following body:

Body:

{
    "text" : "Hello World"
}

Basic Authentication:

username:username
password: password

If the service call was successful, you should see the following:

{"response":"Success","responseCode":200} 
