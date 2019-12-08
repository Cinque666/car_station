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
    <div class="signUp-h1"><h1>SignUp new User</h1></div>

    <form action="${pageContext.request.contextPath}/register" method="POST">
        <div class="form-group">
            <label for="userName">Login</label>
            <input type="text" name="userName" class="form-control" id="userName" placeholder="Enter login">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" name="password" class="form-control" id="password" placeholder="Password">
        </div>
        <div class="form-group">
            <select name="role" id="role" class="form-control">
                <c:forEach var="role" items="${roles}">
                    <option>${role.name}</option>
                </c:forEach>
            </select>
        </div>

        <button type="submit" class="btn btn-primary reg-btn">Submit</button>
    </form>
</div>




<jsp:include page="footer.jsp"/>
