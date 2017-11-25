<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyFirstServlet</title>
</head>
    <body>
        <h1> - Сколько гостей?</h1>
        <!-- Форма, содержащая в себе кнопку и техтовое поле.
             По нажатию на кнопку отправит POST запрос на сервлет-->
        <form action="servlet" method="POST">
            <div>
                <h1> - Ответь?</h1>
                <input type="text" name="age" value="" placeholder="Введите">
            </div>
            <input type="submit" value="Ответить" />
        </form>
    </body>
</html>
