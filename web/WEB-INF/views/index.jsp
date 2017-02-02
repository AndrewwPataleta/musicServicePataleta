<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
  <title>Index Page</title>
  <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <link type="text/css" rel="stylesheet" href="../resources/css/materialize.min.css" media="screen,projection"/>

  <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
  <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.teal-green.min.css" />
  <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>


</head>

<body>

${userJSP.name}

<div class="container">
<div class="  demo-card-wide mdl-card mdl-shadow--4dp" style="margin-left: 40%; margin-top: 100px;">
  <spring:form method="post"  modelAttribute="userJSP" action="/">
  <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
    <spring:input class="mdl-textfield__input"  id="sample3" path="name"/>
    <label class="mdl-textfield__label" for="sample3">Введите ваше имя.</label>
  </div>
  <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
    <spring:input class="mdl-textfield__input"  id="sample3" path="password"/>
    <label class="mdl-textfield__label" for="sample3">Введите ваш пароль</label>
  </div>
  <spring:button class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect purple darken-2 "  >Войти</spring:button>

  </spring:form>
</div>

</div>
</body>

</html>