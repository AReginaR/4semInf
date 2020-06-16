<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Serials</title>
    <#include "header.ftlh">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="#">Myshows</a>

    <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
        <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
            <li class="nav-item">
                <a class="nav-link active" href="/serials">Сериалы <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link navbar-rifht" href="/userSerials">Мои Сериалы</a>
            </li>
            <li class="nav-item">
                <a class="nav-link navbar-rifht" href="/profile">Профиль</a>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-primary my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>
<div class="container-page container">
    <h2>Сериалы</h2>
    <table class="catalogTable">
        <tbody>
        <tr>
            <th><span>Название</span></th>
           <!-- <th><span>Рейтинг</span> </th>-->
            <!--<th><span>Смотрящих</span> <i class="arrowUp"></i></th>-->
            <th><span>Сезонов</span> </th>
            <th><span>Дата выхода</span> </th>
            <th></th>
        </tr>
        <#list serials as serial>
            <tr>
                <td><a href="/serials/${serial.id}">${serial.name}</a></td>
                <!--<td><span class="stars _5"></span></td>-->
                <!--<td class="alignRight">341 731</td>-->
                <td>${serial.numberOfSeason}</td>
                <td>${serial.realiseDate.year}</td>
                <#--<td><span title="" class="iconEye"></span></td>-->
                </tr>
        </#list>
        </tbody>
    </table>
</div>
</body>
</html>