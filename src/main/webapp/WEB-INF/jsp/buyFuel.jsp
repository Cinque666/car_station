<%--
  Created by IntelliJ IDEA.
  User: romaz
  Date: 09.12.2019
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="header.jsp"/>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<div class="refuel-container">
    <div class="buyFuel-h1"><h1>Refuel information</h1></div>

    <form action="${pageContext.request.contextPath}/buyFuel" method="POST">
        <div class="form-group">
            <select name="gasStations" id="gasStations" class="form-control">
                <option disabled selected>Choose gas station</option>
                <c:forEach var="gasStation" items="${gasStations}">
                    <option>${gasStation.name}</option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group">
        <select name="dispenser" id="dispensers" class="form-control">
            <option disabled selected>Choose dispenser</option>
                <c:forEach var="dispenser" items="${dispensers}">
                    <option>${dispenser.dispenserId}</option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group">
            <select name="fuel-type" id="fuel-type" class="form-control">
                <option disabled selected>Choose fuel</option>
                <c:forEach var="fuel" items="${fuels}">
                    <option>${fuel.name}</option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group">
            <label for="liters">Liters</label>
            <input type="text" name="liters" class="form-control" id="liters" placeholder="Enter number of liters">
        </div>
        <button type="submit" class="btn btn-primary reg-btn">Submit</button>
    </form>
</div>



<jsp:include page="footer.jsp"/>