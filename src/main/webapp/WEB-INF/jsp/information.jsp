<jsp:include page="header.jsp"/>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<div class="information-container" style="height: 100%;
     width: 100%;
     background-size: 100% auto;
     background-position: center;
     background-image: url(https://i.pinimg.com/originals/f2/69/30/f2693050e8c3559ed8345f868a495a99.jpg);">

    <div class="col-md-offset-2 col-md-8 col-lg-offset-2 col-lg-8 container text-center">
        <div class="text-center bg-light">
            <div class="text-left" style="margin: 20px;">
                <h2>О компании</h2>
                <p style="margin-bottom: 10px;">Обращаясь в наш сервис мойки, вы всегда можете рассчитывать на
                    быстрое проведение мойки авто, поскольку наши сотрудники ценят время наших клиентов. Стремление к
                    быстрому и качественному проведению услуг по мойке машин Минска заставило нас уделить должное
                    внимание квалификации сотрудников, которые прошли необходимую подготовку для проведения на самом
                    высоком уровне всех работ нашей автомойки. Именно поэтому мы можем вам гарантировать качественное
                    обслуживание по всему спектру оказываемых нами услуг.</p>
                <p>В своей работе мы опираемся на отзывы наших клиентов, которые для нас служат лучшим показателям
                    качества оказываемых нами услуг. Именно поэтому мы используем только профессиональные расходные
                    материалы и оборудование, зарекомендовавшее себя в качестве лидера на мировом рынке автокосметики и
                    автохимии.</p>
                <div>
                    <div>
                        <h5>Наш адрес:</h5>
                        <p>Республика Беларусь, г. Минск, пр. Дзержинского, 102</p>
                    </div>
                    <div>
                        <div style="display: inline-block; margin-right: 40px;">
                            <h5>Телефон:</h5>
                            <p>+(375 29) 685-77-41</p>
                        </div>
                        <div style="display: inline-block;">
                            <h5>Факс:</h5>
                            <p>+(375 17) 225-35-19</p>
                        </div>
                    </div>
                    <div>
                        <h5>Почтовый адрес:</h5>
                        <p>roma.zamoiski@gmail.com</p>
                    </div>
                </div>
            </div>
            <div id="map" class="map" style="margin-bottom: 20px;"></div>
        </div>
    </div>

</div>

<jsp:include page="footer.jsp"/>

<script>
    function initMap() {
        var uluru = {lat: -25.344, lng: 131.036};

        var map = new google.maps.Map(document.getElementById('map'), {
            zoom: 4,
            center: uluru
        });

        var marker = new google.maps.Marker({
            position: uluru,
            map: map
        });
    }
</script>
<script async defer
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyB4n0JoWAbPn3EpbHOe22tgbKfzs0YSjVA&callback=initMap">
</script>