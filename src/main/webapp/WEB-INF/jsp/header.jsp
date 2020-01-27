<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="eu">
<head>
    <style>
        <%@include file="/WEB-INF/css/index.css"%>
    </style>
    <style>
        <%@include file="/WEB-INF/css/signUp.css"%>
    </style>
    <style>
        <%@include file="/WEB-INF/css/gasStation.css"%>
    </style>
    <style>
        <%@include file="/WEB-INF/css/buyFuel.css"%>
    </style>
    <style>
        <%@include file="/WEB-INF/css/fuelPrices.css"%>
    </style>
    <style>
        <%@include file="/WEB-INF/css/editFuelPrice.css"%>
    </style>
    <style>
        <%@include file="/WEB-INF/css/carWashing.css"%>
    </style>
    <style>
        <%@include file="/WEB-INF/css/washOrders.css"%>
    </style>
    <style>
        <%@include file="/WEB-INF/css/washRegistration.css"%>
    </style>
    <style>
        <%@include file="/WEB-INF/css/washPrices.css"%>
    </style>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Station</title>
</head>
<body>
    <c:choose>
    <c:when test="${version.equals('gas')}">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="${pageContext.request.contextPath}/">Главная</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="${pageContext.request.contextPath}/information">Информация <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/fuelPrices">Цены</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/buyFuel">Купить топливо</a>
                </li>
                <sec:authorize access="hasRole('ADMIN')">
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/signUp">Регистрация</a>
                    </li>
                </sec:authorize>

                <sec:authorize access="!isAuthenticated()">
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/login">Авторизироваться</a>
                    </li>
                </sec:authorize>
                <sec:authorize access="isAuthenticated()">
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/logout">Выход</a>
                    </li>
                </sec:authorize>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/contactUs">Форма обратной связи</a>
                </li>
            </ul>

        </div>
    </nav>
    </c:when>
    <c:when test="${version.equals('wash')}">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="${pageContext.request.contextPath}/">Главная</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="${pageContext.request.contextPath}/information">Информация <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/washPrices">Цены на мойку авто</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/washCar">Заказать мойку</a>
                </li>

                <sec:authorize access="hasAnyRole('ADMIN', 'WORKER')">
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/washOrders">Список заказов</a>
                    </li>
                </sec:authorize>

                <sec:authorize access="hasRole('ADMIN')">
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/signUp">Регистрация</a>
                    </li>
                </sec:authorize>

                <sec:authorize access="!isAuthenticated()">
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/login">Авторизироваться</a>
                    </li>
                </sec:authorize>
                <sec:authorize access="isAuthenticated()">
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/logout">Выход</a>
                    </li>
                </sec:authorize>
            </ul>

        </div>
    </nav>
    </c:when>
    <c:when test="${version.equals('balanced')}">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="${pageContext.request.contextPath}/">Главная</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="${pageContext.request.contextPath}/information">Информация <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/fuelPrices">Цены</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/buyFuel">Купить топливо</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/washCar">Заказать мойку</a>
                </li>

                <sec:authorize access="hasRole('ADMIN')">
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/signUp">Регистрация</a>
                    </li>
                </sec:authorize>

                <sec:authorize access="!isAuthenticated()">
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/login">Авторизироваться</a>
                    </li>
                </sec:authorize>
                <sec:authorize access="isAuthenticated()">
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/logout">Выход</a>
                    </li>
                </sec:authorize>
            </ul>

        </div>
    </c:when>
    </c:choose>


