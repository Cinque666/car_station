<%--
  Created by IntelliJ IDEA.
  User: romaz
  Date: 22.11.2019
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="header.jsp"/>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<div class="gasStation-container">
    <div class="message" style="color:white">
        ${message}
    </div>

    <div class="news-block">
        <div class="one-new" style="width: 100%; height: 50%; float: left; margin-top:10%">
            <c:forEach var="news" items="${rss}">
                <c:choose>
                    <c:when test="${news.id eq 1}">
                        <div style="float: left; width: 45%; background: white; text-align:center; height:30%">
                            <div class="news-title" style="text-align:center;">
                                <b>${news.title}</b>
                            </div>
                            <div class="news-description">
                                    ${news.description}<br>
                            </div>
                            <div>
                                <a href="${news.link}">Источник</a>
                            </div>
                        </div>
                    </c:when>
                    <c:when test="${news.id mod 3 eq 0}">
                        <div style="float: left; width: 45%; background: white; text-align:center; height:30%">
                            <div class="news-title" style="text-align:center;">
                                <b>${news.title}</b>
                            </div>
                            <div class="news-description">
                                    ${news.description}<br>
                            </div>
                            <div>
                                <a href="${news.link}">Источник</a>
                            </div>
                        </div>
                    </c:when>
                    <c:when test="${news.id mod 2 eq 0}">
                        <div style="float: right; width: 45%; background: white; text-align:center; height:30%">
                            <div class="news-title" style="text-align:center;">
                                <b>${news.title}</b>
                            </div>
                            <div class="news-description">
                                    ${news.description}<br>
                            </div>
                            <div>
                                <a href="${news.link}">Источник</a>
                            </div>
                        </div>
                    </c:when>
                </c:choose>

            </c:forEach>

        </div>
    </div>
</div>

<jsp:include page="footer.jsp"/>
