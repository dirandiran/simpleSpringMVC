<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
    <title>Index Page</title>
</head>

<body>
<!--(path="" - указывает путь, используемый в modelAttribute=''. в нашем случае User.name)-->
<form method="post" action="check-user">

    Name: <input type="text" name="name"/> <br>
    Password: <input type="text" name="password"/>   <br>
    <button>Next Page</button>

</form>

</body>

</html>