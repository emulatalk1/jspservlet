<%--
  Created by IntelliJ IDEA.
  User: Spectre
  Date: 10/22/17
  Time: 01:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href='https://fonts.googleapis.com/css?family=Roboto:300,400' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/login.css" type="text/css">
    <title>Welcome</title>
</head>
<body>
    <div id="back">
        <div class="backRight"></div>
        <div class="backLeft"></div>
    </div>

    <div id="slideBox">
        <div class="topLayer">

            <div class="left">
                <div class="content">
                    <h2>Sign Up</h2>
                    <form method="post" onsubmit="return false;">
                        <div class="form-group">
                            <input type="text" name="username" placeholder="username" />
                        </div>
                        <div class="form-group">
                            <input type="password" name="password" placeholder="password" />
                        </div>
                        <%--<div class="form-group"></div>--%>
                        <%--<div class="form-group"></div>--%>
                    </form>
                    <button id="goLeft" class="off">Login</button>
                    <button>Sign up</button>
                </div>
            </div>

            <div class="right">
                <div class="content">
                    <h2>Login</h2>
                    <form method="post" action="${pageContext.request.contextPath}/index" onsubmit="return false;" id="loginForm">
                        <div class="form-group">
                            <input type="text" name="username" placeholder="username" />
                        </div>
                        <div class="form-group">
                            <input type="password" name="password" placeholder="password" />
                        </div>
                        <button id="login" type="submit" form="loginForm">Login</button>
                        <button id="goRight" class="off">Sign Up</button>
                    </form>
                </div>
            </div>

        </div>
    </div>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
    <script src="${pageContext.request.contextPath}/resources/js/login.js"></script>
</body>
</html>
