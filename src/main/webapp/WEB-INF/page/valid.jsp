<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="http://code.jquery.com/jquery-1.9.1.js"></script>

    <title>Valid Page</title>
</head>
<body>
<!--Введенное имя: ${userJSP.name};
<br>
Введенный пароль: ${userJSP.password};
<br>-->
<form id="mainForm" method="get">
    <table>
        <thead align="center" >
            <tr>
                <th> id </th>
                <th> name </th>
               <!-- <th> password </th>-->
            </tr>
        </thead>
        <tbody align="center">
             <c:forEach items="${ users }" var="user">
                 <tr>
                     <td> ${ user.id } </td>
                     <td> <a href="userPass" id="${user.name}"> ${ user.name } </a> </td>
                     <!--<td> ${ user.password }</td>-->
                 </tr>
             </c:forEach>
        </tbody>
    </table>
    <input name="userName">
</form>
<script>
    $('#mainForm A').onclick(function()
    {
      // e.preventDefault();
        var destenation = $(this).attr('href');
        var userName =  $(this).attr('id');
        var input = $("input");
        input.setAttribute("value",userName);
        $('#mainForm').attr('action', destenation);
        $('#mainForm').submit();
    });
</script>
</body>
</html>