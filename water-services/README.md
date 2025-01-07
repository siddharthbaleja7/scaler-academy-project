# Water Services Backend

This is the basic skeleton of a backend service to apply for water connections

## Getting Started.. 

1. Ensure you have Kafka, Postgres 14 running locally. 
2. Create a database in Postgres 14
3. Edit the application.properties file and enter the postgres DB name and credentials.
4. Start your server as an simple java application  
5. You should be able to hit your local server using Postman

```
GET http://localhost:8080/water-services/connection/v1/_search
```
