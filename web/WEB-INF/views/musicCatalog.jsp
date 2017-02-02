<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>Second Page</title>

</head>
<body>

<c:forEach items="${collectionAllSongs.collectionOfSong}" var="allSongs">
    ${allSongs.songName}<br>
    ${allSongs.yearPublish}<br>
</c:forEach>

</body>
</html>