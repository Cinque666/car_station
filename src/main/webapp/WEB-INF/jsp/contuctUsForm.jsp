<jsp:include page="header.jsp"/>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<div class="contactsUs-container" style="height: 100%;
    text-align: center;
    width: 100%;
    background-size: 100% auto;
    background-position: center;
    background-image: url(https://s1.1zoom.ru/b5050/444/BMW_M4_Coupe_F82_by_436312_1920x1200.jpg);
    color: white">

    <h1>Форма обратной связи</h1>
    <form action="${pageContext.request.contextPath}/contactUs" method="POST">
        <div class="form-group">
            <label for="name">Введите имя</label>
            <input type="text" name="name" class="form-control" id="name" placeholder="Введите, пожалуйста, Ваше имя" style="width:40%;
    margin-left: 30%;">
        </div>
        <div class="form-group">
            <label for="email">Введите email</label>
            <input type="text" name="email" class="form-control" id="email" placeholder="Введите, пожалуйста, Ваш email" style="width:40%;
    margin-left: 30%;">
        </div>
        <div class="form-group">
            <label for="description">Введите Ваш вопрос</label>
            <input type="text" name="description" class="form-control" id="description" placeholder="Введите Ваш вопрос" style="width:100%;
    height: 20%;text-align: center;">
        </div>

        <button type="submit" class="btn btn-primary reg-btn">Отправить</button>
    </form>
</div>

<jsp:include page="footer.jsp"/>