<%--
  Created by IntelliJ IDEA.
  User: romaz
  Date: 08.12.2019
  Time: 19:27
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="header.jsp"/>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<div class="registration-page">
    <div class="signUp-h1"><h1>Регистрация нового пользователя</h1></div>

    <form action="${pageContext.request.contextPath}/signUp" method="POST">
        <div class="form-group">
            <label for="login">Логин</label>
            <input type="text" name="login" class="form-control" id="login" placeholder="Введите логин">
        </div>
        <div class="form-group">
            <label for="password">Введите пароль</label>
            <input type="password" name="password" class="form-control" id="password" placeholder="Введите пароль">
        </div>
        <div class="form-group">
            <select name="role" id="roleId" class="form-control">
                <option disabled selected>Выберите роль</option>
                <c:forEach var="role" items="${roles}">
                    <option>${role.name}</option>
                </c:forEach>
            </select>
        </div>

        <button type="submit" class="btn btn-primary reg-btn">Отправить</button>
    </form>
</div>




<jsp:include page="footer.jsp"/>
