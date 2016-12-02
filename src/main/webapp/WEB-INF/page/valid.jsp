<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="http://code.jquery.com/jquery-1.9.1.js"></script>

    <title>Valid Page</title>
    <script>
        /* $('#mainForm A').click(function()
        {
            // e.preventDefault();
            var destenation = $(this).attr('href');
            var userName =  $(this).attr('id');
            var input = $("input");
            input.setAttribute("value",userName);
            $('#mainForm').attr('action', destenation);
            $('#mainForm').submit();
        }); */
    </script>
    <!--  <script type="text/javascript">
        $(document).ready(function (){
            $('#${user.name}').click(function () {

                var name = $("#${user.name}");
                var input = $("#userName");
                input.setAttribute("value", name);
                $("#mainForm").submit();
                //input.setAttribute("value", name);
                  /*  $.ajax({
                        type: 'POST',
                        url: 'MainController',
                        success: function (name) {
                            input.setAttribute("value", name);
                            $("#mainForm").submit();
                        }
                    });*/

            });
        });
    </script>-->
</head>
<body>
<!-- <form id="mainForm" method="post" action="userPass">-->
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
                     <td> <a href="userPass?name=${user.name}" id="${user.name}"> ${ user.name } </a> </td>
                     <!--<td> ${ user.password }</td>-->
                 </tr>
             </c:forEach>
        </tbody>
    </table>
  <!--  <input type="hidden" name="name" id="userName">
</form>-->
</body>
</html>