# Spring Boot Image Gallery
This repository contains a Spring Boot application that displays an image gallery. The application allows users to upload, delete, and view images stored in a database.

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites
Java 8 or higher
Maven
An IDE (such as IntelliJ IDEA)
MySQL
MySQL Connector/J (included as a Maven dependency)
### Installing
Clone the repository to your local machine:
git clone https://github.com/abdullahbakis/spring-boot-image-gallery.git
Import the project into your IDE as a Maven project.

In the application.properties file, enter your MySQL username and password in the spring.datasource.username and spring.datasource.password properties, respectively.

Run the project as a Spring Boot application.

Open a web browser and navigate to http://localhost:8080 to access the application.

Use the form to upload images to the gallery. The uploaded images will be displayed in the gallery.

Click on an image to view it in full size.

Click the "Delete" button to delete an image from the gallery.
# Built With
Spring Boot - The web framework used
Maven - Dependency Management
Spring Boot DevTools - Used for automatic reloading of the application during development
Spring Data JPA - Used for data persistence and database access
MySQL Connector/J - Used for connecting to a MySQL database
Thymeleaf - Used for rendering HTML templates on the server side
# Authors
Abdullah Bakış - abdullahbakis
# License
This project is licensed under the MIT License - see the LICENSE file for details.
