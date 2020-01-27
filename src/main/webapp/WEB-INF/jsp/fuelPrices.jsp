<%--
  Created by IntelliJ IDEA.
  User: romaz
  Date: 09.12.2019
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="header.jsp"/>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="fuel-prices-container" style="padding-top: 5;">
    <div class="col-md-offset-1 col-md-10 col-lg-offset-1 col-lg-10 container text-center">
        <div class="text-center bg-light">
            <div class="text-left" style="margin: 20px; padding: 20px 0;">
    <table id="pricesTable" class="table table-dark">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Навзание</th>
            <th scope="col">Цена, $</th>
            <sec:authorize access="hasRole('ADMIN')">
                <th scope="col">Редактировать</th>
                <th scope="col">Удалить</th>
            </sec:authorize>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="fuel" items="${fuels}">
            <tr>
                <th scope="row">${fuel.fuelId}</th>
                <td>${fuel.name}</td>
                <td>${fuel.price}</td>
                <sec:authorize access="hasRole('ADMIN')">
                    <td><a href="${pageContext.request.contextPath}/editFuelPrice/${fuel.fuelId}">Редактировать</a></td>
                    <td><a href="${pageContext.request.contextPath}/deleteFuelPrice/${fuel.fuelId}">Удалить</a></td>
                </sec:authorize>
            </tr>
        </c:forEach>
        </tbody>
    </table>
            </div>
        </div>
    </div>
</div>

<jsp:include page="footer.jsp"/>

<script type="text/javascript">
    $(document).ready(function () {
        $('#pricesTable').DataTable({
            "language": {
                "lengthMenu": "Отображать _MENU_ записей",
                "zeroRecords": "Извините - поиск не дал результатов",
                "info": "Отображаемая страница _PAGE_ из _PAGES_",
                "infoEmpty": "0 записей",
                "paginate": {
                    "first": "Первая",
                    "last": "Последняя",
                    "next": "Следующая",
                    "previous": "Предыдущая"
                },
                "search": "Поиск:",
                "infoFiltered": "(отфильтровано из _MAX_ записей)",
            }
        });
    });
</script>
