# Rest-api
Create a REST API which stores,updates,retrieves and deletes Person entities

Environment : Java - 1.8

Framework : SpringBoot

Build : mvn clean install

Run : Run as a Spring Boot App

Command : java -jar rest-api-0.0.1-SNAPSHOT.jar


Rest API Documentation (Person details)

Introduction
This document provides the detailed technical and API endpoint details for the REST API.

Definitions, Acronyms and Abbreviations
N/A – Not Availble

Identified APIs

ID	Functional Area	API
1.1	JWT Authentication	POST: /authenticate
1.2	Add Person Details	POST: /person/add
1.3	View Person Details	GET:  /person/view
1.4	View Person Detail By Id	GET: /person/view/{personId}
1.5	Delete Person Details	DELETE : /person/delete/{personId}


1.1 :  POST: /authenticate
JWT Authentication 
During the authentication process, when a user successfully logs in using their credentials, a JSON Web Token is returned and must be saved locally (typically in local storage). Whenever the user wants to access a protected route or resource (an endpoint), the user agent must send the JWT, usually in the Authorization header using the Bearer schema, along with the request.

1 . Path Parameters :  N/ A
2 . Query Parameters : N/A
3 . Request Body :
ID	Field name	Data Type	Comments
1	username	String	
2	password	String	

4 . Sample Request :

curl --location --request POST 'http://35.202.2.27:8080/api/authenticate' \
--header 'Content-Type: application/json' \
--data-raw '{
	"username" : "user",
	"password" : "user"
}'

5. Response Body: 
ID	Field name	Data Type	Comments
1	token	String	JWT token



1.2 :  POST: /person/add
Add Person Details 
1 . Path Parameters :  N/ A
2 . Query Parameters : N/A
3 . Request Body :

ID	Field name	Data Type	Comments
1	id	Integer	Auto generated value
2	firstName	String	
3	lastName	String	
4	age	String	
5	favouriteColor	String	
6	hobby	String	




4 . Sample Request :
curl --location --request POST 'http://35.202.2.27:8080/api/person/add' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwiZXhwIjoxNTgxODczNDUzLCJpYXQiOjE1ODE4NTU0NTN9.jiIiGmgR3fGc19wDNngiBdC2sAtPCIYrRULqlxUx2LJH_obxdiQUFfJiHqSKp3_HyECaKWS53vL-Way7MdmxkQ' \
--data-raw '   {
        "id": 0,
        "firstName": "user",
        "lastName": "user",
        "age": "30",
        "favouriteColor": "Red",
        "hobby": "Drama,TV"
    }

'5. Response Body: 
ID	Field name	Data Type	Comments
1	id	Integer	Auto generated value
2	firstName	String	
3	lastName	String	
4	age	String	
5	favouriteColor	String	
6	hobby	String	“Value1,Value2”
			



1.3 :  GET:  /person/view
View Person Details 
 1 . Path Parameters :  N/ A
2 . Query Parameters : N/A
3 . Request Body : N / A

4 . Sample Request :

curl --location --request GET 'http://35.202.2.27:8080/api/person/view' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwiZXhwIjoxNTgxODczNDUzLCJpYXQiOjE1ODE4NTU0NTN9.jiIiGmgR3fGc19wDNngiBdC2sAtPCIYrRULqlxUx2LJH_obxdiQUFfJiHqSKp3_HyECaKWS53vL-Way7MdmxkQ' \
--data-raw ''

5. Response Body: 
ID	Field name	Data Type	Comments
1	id	Integer	Auto generated value
2	firstName	String	
3	lastName	String	
4	age	String	
5	favouriteColor	String	
6	hobby	String	“Value1,Value2”
			


1.4 :  GET:  /person/view/{personId}
View Person Details By Id

 1 . Path Parameters :  
ID	Field Name	Data Type	Comments
1. 	personId	integer	Person Id


2 . Query Parameters : N/A
3 . Request Body : N / A



4 . Sample Request :
curl --location --request GET 'http://35.202.2.27:8080/api/person/view/2' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwiZXhwIjoxNTgxODczNDUzLCJpYXQiOjE1ODE4NTU0NTN9.jiIiGmgR3fGc19wDNngiBdC2sAtPCIYrRULqlxUx2LJH_obxdiQUFfJiHqSKp3_HyECaKWS53vL-Way7MdmxkQ' \
--data-raw ''

5. Response Body: 
ID	Field name	Data Type	Comments
1	id	Integer	Auto generated value
2	firstName	String	
3	lastName	String	
4	age	String	
5	favouriteColor	String	
6	hobby	String	“Value1,Value2”
			

1.5 :  DELETE:  /person/delete/{personId}
Delete Person Details
 1 . Path Parameters :  
ID	Field Name	Data Type	Comments
1. 	personId	integer	Person Id

2 . Query Parameters : N/A
3 . Request Body : N / A

4 . Sample Request :
curl --location --request DELETE 'http://35.202.2.27:8080/api/person/delete/2' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwiZXhwIjoxNTgxODczNDUzLCJpYXQiOjE1ODE4NTU0NTN9.jiIiGmgR3fGc19wDNngiBdC2sAtPCIYrRULqlxUx2LJH_obxdiQUFfJiHqSKp3_HyECaKWS53vL-Way7MdmxkQ' \
--data-raw ''
5. Response Body: N/A  












