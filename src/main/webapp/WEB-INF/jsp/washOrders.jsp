<%--
  Created by IntelliJ IDEA.
  User: romaz
  Date: 13.12.2019
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="header.jsp"/>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="washOrders-container">
    <table class="table table-dark">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Car Wash</th>
            <th scope="col">Client</th>
            <th scope="col">Master</th>
            <th scope="col">Vehicle</th>
            <sec:authorize access="hasRole('ADMIN')">
                <th scope="col">Delete</th>
            </sec:authorize>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="order" items="${orders}">
            <tr>
                <th scope="row">${order.washOrderId}</th>
                <td>${order.carWashName}</td>
                <td>${order.clientName}</td>
                <td>${order.masterName}</td>
                <td>${order.vehicleName}</td>
                <sec:authorize access="hasRole('ADMIN')">
                    <td><a href="${pageContext.request.contextPath}/deleteOrder/${order.washOrderId}">Delete</a></td>
                </sec:authorize>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<jsp:include page="footer.jsp"/>
