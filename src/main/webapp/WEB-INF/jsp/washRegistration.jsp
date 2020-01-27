<%--
  Created by IntelliJ IDEA.
  User: romaz
  Date: 12.12.2019
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="header.jsp"/>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<div class="wash-registration">

    <div class="wash-registration-h1"><h1>Регистрация заказа на мойку Автомобоиля</h1></div>

    <form action="${pageContext.request.contextPath}/washCar" method="POST">

        <div class="form-group">
            <select name="carWashName" id="carWashName" class="form-control">
                <option disabled selected>Выберите мойку</option>
                <c:forEach var="wash" items="${washes}">
                    <option>${wash.name}</option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group">
            <select name="clientName" id="clientName" class="form-control">
                <option disabled selected>Выберите из списка зарегистрированных клиентов</option>
                <c:forEach var="client" items="${clients}">
                    <option>${client.name}</option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group">
            <select name="masterName" id="masterName" class="form-control">
                <option disabled selected>Выберите мастера</option>
                <c:forEach var="master" items="${masters}">
                    <option>${master.name}</option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group">
            <select name="vehicleName" id="vehicleName" class="form-control">
                <option disabled selected>Выберите тип транспортного средства</option>
                <c:forEach var="vehicle" items="${vehicles}">
                    <option>${vehicle.name}</option>
                </c:forEach>
            </select>
        </div>

        <button type="submit" class="btn btn-primary reg-btn">Отправить</button>
    </form>
</div>



<jsp:include page="footer.jsp"/>
