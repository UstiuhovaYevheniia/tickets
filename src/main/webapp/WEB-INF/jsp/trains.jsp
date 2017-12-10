<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>--%>
<html lang="en">
<head>
    <link>
</head>
<body>

<%--<form:form modelAttribute="searchForm">
    <form:input path="searchText" />
    <input type="submit" value="Search" />
</form:form>

<ul>
    <c:forEach items="${results}" var="train">
        <li>${train}</li>
    </c:forEach>
</ul>--%>

SOME LIST OF TRAINS

<form:form modelAttribute="trainsSearchForm">
    <form:input path="fromCity"/>
    <form:input path="destination"/>
    <input type="submit" value="Search"/>
</form:form>
<ul>
    <c:forEach items="${trains}" var="train">
        <li>${train.fromCity} - ${train.destination}</li>
    </c:forEach>
</ul>
<p>AFTER LIST</p>
</body>
</html>
