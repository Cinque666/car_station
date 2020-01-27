<%--
  Created by IntelliJ IDEA.
  User: romaz
  Date: 14.12.2019
  Time: 0:31
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="header.jsp"/>

<div class="washPrices-container" style="padding-top: 5;">
    <div class="col-md-offset-1 col-md-10 col-lg-offset-1 col-lg-10 container text-center">
        <div class="text-center bg-light">
            <div class="text-left" style="margin: 20px; padding: 20px 0;">
    <table class="table table-dark" id="pricesTable">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Vehicle</th>
            <th scope="col">Price, $</th>
            <sec:authorize access="hasRole('ADMIN')">
                <th scope="col">Delete</th>
            </sec:authorize>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="washPrice" items="${washPrices}">
            <tr>
                <th scope="row">${washPrice.washPricesId}</th>
                <td>${washPrice.vehicleType}</td>
                <td>${washPrice.cost}</td>
                <sec:authorize access="hasRole('ADMIN')">
                    <td><a href="${pageContext.request.contextPath}/deleteWashPrices/${vehicle.vehicleId}">Удалить</a></td>
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
                "lengthMenu": "Отображать _MENU_ записей на странице",
                "zeroRecords": "Zero records",
                "info": "Отображаемая страница _PAGE_ из _PAGES_",
                "infoEmpty": "Zero records",
                "paginate": {
                    "first": "First",
                    "last": "Last",
                    "next": "Next",
                    "previous": "Previous"
                },
                "search": "Search:",
                "infoFiltered": "(отфильтровано из _MAX_ записей)",
            }
        });
    });
</script>