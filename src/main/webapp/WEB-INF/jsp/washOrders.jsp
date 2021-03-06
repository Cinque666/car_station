<%--
  Created by IntelliJ IDEA.
  User: romaz
  Date: 13.12.2019
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="header.jsp"/>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="washOrders-container">
    <div class="col-md-offset-1 col-md-10 col-lg-offset-1 col-lg-10 container text-center">
        <div class="text-center bg-light">
            <div class="text-left" style="margin: 20px; padding: 20px 0;">
    <table class="table table-dark" id="ordersTable">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Автомойка</th>
            <th scope="col">Клиент</th>
            <th scope="col">Мастер</th>
            <th scope="col">Тип транспортного средства</th>
            <sec:authorize access="hasRole('ADMIN')">
                <th scope="col">Удалить</th>
            </sec:authorize>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="order" items="${orders}">
            <tr>
                <th scope="row">${order.washOrderId}</th>
                <td>${order.carWashName}</td>
                <td>${order.clientName}</td>
                <td>${order.masterName}</td>
                <td>${order.vehicleName}</td>
                <sec:authorize access="hasRole('ADMIN')">
                    <td><a href="${pageContext.request.contextPath}/deleteOrder/${order.washOrderId}">Удалить</a></td>
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
        $('#ordersTable').DataTable({
            "language": {
                "lengthMenu": "Отображать _MENU_ записей на странице",
                "zeroRecords": "Нет записей",
                "info": "Отображаемая страница _PAGE_ из _PAGES_",
                "infoEmpty": "Нет записей",
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
