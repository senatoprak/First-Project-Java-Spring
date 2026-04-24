Java Spring For University (Task 1)
This project is a web application created as part of the "Spring Framework Apps" course at Vistula University.
It demonstrates the basics of Spring Boot, Spring MVC, and the Thymeleaf template engine.

📋 Requirements & Features:
* Spring Boot Initialization: Project created using Spring Initializr
* MVC Architecture: Implements the Model–View–Controller pattern
* Thymeleaf Integration: Renders dynamic HTML content
* Static Resources: Displays an image from the static/images folder
* Controller Logic: Handles HTTP GET requests and passes parameters to the view

  🚀 How It Works:
The application exposes a /greeting endpoint that accepts a name parameter and renders a dynamic greeting page along with a static image.


🖼 Preview:
The screenshot below shows the application running on localhost:8080, displaying the dynamic greeting text and the image.

<img width="1278" height="599" alt="Screenshot 2026-04-24 221125" src="https://github.com/user-attachments/assets/ba7effac-752a-4cc9-a085-11742e591f09" />
<img width="988" height="567" alt="Screenshot 2026-04-24 221109" src="https://github.com/user-attachments/assets/f9d094fd-26d8-4b42-8381-23157ebd0e54" />
<img width="1919" height="1079" alt="Screenshot 2026-04-24 221016" src="https://github.com/user-attachments/assets/55c92786-5fa6-4501-b6ac-9249181ab456" />


🛠 Tech Stack:
* Java
* Spring Boot (Web Starter)
* Thymeleaf
* Maven

▶️ How to Run:
1-Clone the repository
2-Run the application (IntelliJ or mvn spring-boot:run)
3-Open in browser:
http://localhost:8080/
http://localhost:8080/hello
http://localhost:8080/greeting?name=Sena
