<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Spring Boot Learning</title>

    <style>
        body {
            font-family: Arial, Helvetica, sans-serif;
            background: #f4f6f9;
            margin: 0;
            padding: 0;
        }

        .container {
            max-width: 900px;
            margin: 40px auto;
            background: white;
            padding: 30px;
            box-shadow: 0 4px 12px rgba(0,0,0,0.1);
            border-radius: 8px;
        }

        h1 {
            color: #2c3e50;
            font-size: 32px;
            text-align: center;
            margin-bottom: 20px;
        }

        .section-title {
            font-size: 24px;
            font-weight: bold;
            margin-top: 30px;
            color: #1a73e8;
        }

        p {
            font-size: 18px;
            line-height: 1.6;
            color: #333;
        }

        .highlight {
            background: #e3f2fd;
            padding: 10px 15px;
            border-left: 5px solid #1a73e8;
            border-radius: 3px;
            font-size: 17px;
            margin-top: 15px;
        }

        .footer {
            margin-top: 40px;
            text-align: center;
            color: #777;
            font-size: 15px;
        }

    </style>
</head>

<body>
    <div class="container">
        <h1>${greet}</h1>

        <h2 class="section-title">Welcome to Spring Boot Learning</h2>
        <p>
            Spring Boot is one of the most powerful and efficient frameworks in the Java ecosystem.
            It makes it easy to create stand-alone, production-ready applications with minimal configuration.
            Whether you’re building microservices, REST APIs, or enterprise-level systems,
            Spring Boot provides a clean and structured approach to development.
        </p>

        <div class="highlight">
            <strong>🔥 New:</strong> Telusko Learning now includes practical Spring Boot tutorials,
            covering REST APIs, JPA, Microservices, Security, and more!
        </div>

        <h2 class="section-title">Why Learn Spring Boot?</h2>
        <p>
            ✔ Rapid development with auto-configuration <br>
            ✔ Production-ready features out of the box<br>
            ✔ Built-in Tomcat/Jetty server<br>
            ✔ Easy integration with Spring modules<br>
            ✔ Perfect for microservices architecture<br>
        </p>

        <h2 class="section-title">Telusko & Spring Boot</h2>
        <p>
            Telusko has been known for simplifying complex technology so anyone can learn it.
            Our Spring Boot lessons are designed to help you grow from beginner to pro with hands-on examples,
            real industry use cases, and best practices.
        </p>

        <div class="footer">
            Made with ❤️ for learners – Telusko
        </div>
    </div>
</body>
</html>
