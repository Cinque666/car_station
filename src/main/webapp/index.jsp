<jsp:include page="WEB-INF/jsp/header.jsp"/>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>

<%--<%--%>
    <%--response.sendRedirect("http://localhost:8082/carStApp_war/home");--%>
<%--%>--%>

<div class="index-container">
    <div class="gasStation">
        <form action="${pageContext.request.contextPath}/gasStation" method="get">
            <button type="submit" class="btn btn-dark main-buttons">Заправка</button>
        </form>
    </div>

    <div class="carWashing">
        <form action="${pageContext.request.contextPath}/carWashing" method="get">
            <button type="submit" class="btn btn-dark main-buttons">Мойка авто</button>
        </form>
    </div>
</div>

<jsp:include page="WEB-INF/jsp/footer.jsp"/>
