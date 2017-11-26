# Spring-and-REST-API
Learning to build web apps with Spring boot and REST

This is a project that is in progress and i try and increase functionality and features as and when i find time. 
I am learning to create REST APIs with spring in Java. 


Right now the project can handle GET (fetch) and POST(create) requests. 
The data being manipulated is from an Array List, however I plan to integrate the project with a distributed database (like Mongo and Cassandra) as time passes. 

There are 3 java files. 
1) User.java : class for users 
2) userdao.java : handles the interaction with data for Users 
3) UserResource.java : This is the restcontroller class. 

All the necessary files for a spring web project have been downloaded from https://spring.io/ . 
This is the directory structure for my project

![alt text](https://github.com/svishrut93/Spring-and-REST-API/blob/master/screenshots/dirstructure.PNG)

The project currently can perform the following operations 
1. Find all users.
2. Find a particular user 
3. Create a new user : Save ()


Server used is embedded tomcat from the spring framework. 
All outputs are generated as a jason file.<br> 
Http methods inplemented : GET and POST <br>

Run file UserResource.java inside files folder. 

Below are some screenshots of outputs.






