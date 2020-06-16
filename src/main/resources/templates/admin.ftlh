<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin</title>
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
                <a class="nav-link" href="/userSerials">Сериалы <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link navbar-rifht" href="/serials">Профиль</a>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-primary my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>

<div class="container container-page">
    <div class="row">

            <div class="col-sm-4">
                <h3>Пользователи</h3>
                <table>
                    <thead>
                    <tr>
                        <td>Name</td>
                        <td>Email</td>
                    </tr>
                <tbody>
                    <#if users??>
                        <#list users as user>
                            <tr>
                                <td>${user.name}</td>
                                <td>${user.email}</td>
                                <td><a href="/user/${user.id}">delite</a></td>
                            </tr>
                        </#list>

                    </#if>
                </tbody>
                </table>
            </div>
            <div class="col-sm-4">
                <form method="post" action="/admin/addSerial">
                    <h3>Добавить сериал</h3>
                    <label for="name" class="sr-only"></label>
                    <input type="text" id="name" name="name" class="form-control" placeholder="Название" required autofocus>
                <#--<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">-->
                    <input type="text" class="form-control" placeholder="Жанр">
                    <input type="date" class="form-control" placeholder="Дата выхода">
                    <input type="text" class="form-control" placeholder="Описание">

                    <button class="btn btn-lg btn-primary btn-block" type="submit">Добавить</button>
                </form>
            </div>
        <div class="col-sm-4">
            <form method="post" action="/admin/addEpisode">
                <h3>Добавить серию</h3>
                <label for="name" class="sr-only"></label>
                <input type="text" id="name" name="name" class="form-control" placeholder="Название" required autofocus>
                <input type="text" id="name" name="name" class="form-control" placeholder="Название сериала">            <#--<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">-->
                <input type="text" class="form-control" placeholder="№ Сезона">
                <input type="text" class="form-control" placeholder="№ Серии">
                <input type="text" class="form-control" placeholder="Описание">
                <input type="date" class="form-control" placeholder="Дата выхода">

                <button class="btn btn-lg btn-primary btn-block" type="submit">Добавить</button>
            </form>
        </div>

</div>
</div>
</body>
</html>