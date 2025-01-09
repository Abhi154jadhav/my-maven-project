 It provides a simple CRUD (Create, Read, Update, Delete) interface for managing student data. The system allows for managing student details such as roll number, name, last name, city, and marks in a relational database.

Project Features:
Student Entity: Represents a student with fields like roll, name, last name, city, and marks.
CRUD Operations:
Create: Add new student records.
Read: Fetch existing student records.
Update: Modify student details.
Delete: Remove student records from the database.
Spring and Hibernate Integration:
Uses Hibernate ORM to interact with the database.
Configures SessionFactory and Transactions for persistence management.
Service Layer: Central business logic is managed in the StudentService class, which calls the data access methods in the StudentDAO class.
Maven Project: The project is built using Maven, making it easy to manage dependencies and build configurations.
