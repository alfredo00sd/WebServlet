<%--
  Created by IntelliJ IDEA.
  User: Alfredo Acosta
  Date: 10/18/2019
  Time: 11:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<div id="app" class="Container">
    <h1>List Users</h1>
    <a class="btn btn-primary">Home</a>
    <div id="js-container">

    </div>
</div>

<script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>

<script>
    (function ($) {
        var url = "users";
        $.ajax({
            url : url,
            method: "GET",
            success : function (response) {
                //console.log(response);
                $('#js-container').html(response);
            }
        })
    })(jQuery);
</script>
</body>
</html>
