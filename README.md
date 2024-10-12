This Product CRUD Application is a simple web-based project built using Spring MVC. 
The application allows users to perform basic CRUD (Create, Read, Update, Delete) operations on products, enabling easy management of product data.

**Technologies Used**
1.  Spring MVC: Framework for building web applications.
2.  Maven: Project build and dependency management.
3.  JSTL: JavaServer Pages Standard Tag Library for dynamic content.
4.  Spring JDBC: For database interactions.
5.  Oracle JDBC Driver (ojdbc6): For connecting to Oracle databases.

**Features**
1.  Create: Add a new product to the system.
2.  Read: View the list of all products.
3.  Update: Edit the details of existing products.
4.  Delete: Remove a product from the system.

**Project Structure**
src/main/java
    └── com.example.productapp
        └── controller (Handles web requests)
        └── model (Contains the Product entity)
        └── service (Handles business logic)
        └── dao (Interacts with the database)
        
src/main/resources
    └── applicationContext.xml (Spring configuration file)
    
src/main/webapp
    └── WEB-INF
        └── views (JSP files for UI)
        └── web.xml (Deployment descriptor)


**Setup and Installation**
1.  Clone the repository: git clone https://github.com/Sankalp1409/Product-CRUD-Application.git
2.  Navigate to the project directory:cd Product-CRUD-Application
3.  Build the project using Maven: mvn clean install
4.  Configure the database connection in applicationContext.xml to point to your Oracle (or other RDBMS) database.
5.  Deploy the application to a servlet container like Tomcat.

**Dependencies**
The following are the key dependencies used in the project, as listed in the pom.xml file:
1.  JSTL 1.2
2.  Spring JDBC 5.3.20
3.  Spring Web MVC 5.2.4
4.  Oracle JDBC 11.2.0.4


**License**
This project is licensed under the MIT License - see the LICENSE file for details.
