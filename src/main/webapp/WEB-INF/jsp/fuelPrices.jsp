<%--
  Created by IntelliJ IDEA.
  User: romaz
  Date: 09.12.2019
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="header.jsp"/>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<div class="fuel-prices-container">
    <table class="table table-dark">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Price, $</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="fuel" items="${fuels}">
            <tr>
                <th scope="row">${fuel.fuelId}</th>
                <td>${fuel.name}</td>
                <td>${fuel.price}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<jsp:include page="footer.jsp"/>
