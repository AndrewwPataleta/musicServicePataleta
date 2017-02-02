<%@ page import="com.pataleta.musicService.model.Song" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.pataleta.musicService.service.musicCollection" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>Second Page</title>
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="../resources/css/materialize.min.css" media="screen,projection"/>

    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.teal-green.min.css" />
    <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>

</head>
<body>
<div class="container">

    <c:forEach items="${collectionAllSongs.collectionOfSong}" var="songs">
            ${songs.songName}<br>
            ${songs.yearPublish}<br>
    </c:forEach>

</div>
</body>
</html>