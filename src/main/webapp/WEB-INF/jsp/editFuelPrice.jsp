<%--
  Created by IntelliJ IDEA.
  User: romaz
  Date: 12.12.2019
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="header.jsp"/>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<div class="editFuelPrice-container">

    <div class="edit-fuelPrice-h1"><h1>Редактирование цен на бензин</h1></div>

    <form action="${pageContext.request.contextPath}/editFuelPrice" method="POST">

        <div class="form-group">
            <label for="fuelId">Идентификатор</label>
            <input type="text" name="fuelId" class="form-control" id="fuelId" value="${fuel.fuelId}">
        </div>

        <div class="form-group">
            <label for="name">Название</label>
            <input type="text" name="name" class="form-control" id="name" value="${fuel.name}">
        </div>

        <div class="form-group">
            <label for="price">Цена, $</label>
            <input type="text" name="price" class="form-control" id="price" value="${fuel.price}">
        </div>

        <button type="submit" class="btn btn-primary reg-btn">Submit</button>
    </form>
</div>



<jsp:include page="footer.jsp"/>