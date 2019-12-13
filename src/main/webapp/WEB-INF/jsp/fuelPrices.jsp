<%--
  Created by IntelliJ IDEA.
  User: romaz
  Date: 09.12.2019
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="header.jsp"/>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="fuel-prices-container">
    <table class="table table-dark">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Price, $</th>
            <sec:authorize access="hasRole('ADMIN')">
                <th scope="col">Edit</th>
                <th scope="col">Delete</th>
            </sec:authorize>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="fuel" items="${fuels}">
            <tr>
                <th scope="row">${fuel.fuelId}</th>
                <td>${fuel.name}</td>
                <td>${fuel.price}</td>
                <sec:authorize access="hasRole('ADMIN')">
                    <td><a href="${pageContext.request.contextPath}/editFuelPrice/${fuel.fuelId}">Edit</a></td>
                    <td><a href="${pageContext.request.contextPath}/deleteFuelPrice/${fuel.fuelId}">Delete</a></td>
                </sec:authorize>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<jsp:include page="footer.jsp"/>
