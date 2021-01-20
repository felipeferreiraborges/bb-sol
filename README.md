# bb-sol

1- Clone the project

2- if necessary, run maven clean and maven install

3- if necessary too, configure tomcat to run with the project

4- after run tomcat in the project, access the url => http://localhost:8080/felipe-bb/login

5- user: admin passwd: admin

6- URLs endpoints
  6.1- http://localhost:8080/felipe-bb/ - Transactions List
  6.2- http://localhost:8080/felipe-bb/transactions/TYPEOFTRANSACTION - Transaction filter based on transaction type
       Example: http://localhost:8080/felipe-bb/transactions/SEPA
  6.3- http://localhost:8080/felipe-bb/transactions/TYPEOFTRANSACTION/totalAmount - Total amount for transaction type
       Example: http://localhost:8080/felipe-bb/transactions/SEPA/totalAmount
 
Project working with Java 8 and Tomcat 8.5
