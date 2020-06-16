<#import "/spring.ftl" as spring/>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Profile</title>
    <#include "header.ftlh">
    <style>
        .container-profile{
            padding-top: 10px;
            padding-bottom: 10px;
            max-width: 500px;
            margin: 0 auto;
            -moz-outline-radius: 100px;
        }
    </style>
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
                <a class="nav-link" href="/serials">Сериалы <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
            <a class="nav-link navbar-rifht" href="/userSerilas">Мои Сериалы</a>
            </li>
            <li class="nav-item">
                <a class="nav-link navbar-rifht active" href="/profile">Профиль</a>
            </li>

        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-primary my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>
<div class="container container-page">
    <div class="container-profile">
        <h2>Редактирование профиля</h2>
        <form  method="post" action="/profile">
            <label for="email" class="sr-only">E-mail</label>
            <input type="email" id="email" name="email" class="form-control" placeholder="E-mail" value="${user.email}" required autofocus>
            <span id="checkLogin" aria-required="true"></span>

            <label for="name" class="sr-only"></label>
            <input type="text" id="name" name="name" class="form-control" placeholder="Имя" value="${user.name}" required autofocus>
            <#--<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">-->
            <button class="btn btn-lg btn-primary btn-block" type="submit">Изменить</button>
        </form>
    </div>
    <div class="container-profile">
        <h2>Изменить пароль</h2>
        <form method="post" action="/pass">
            <label for="passwordOld" class="sr-only">Пароль</label>
            <input type="password" id="passwordOld" name="passwordOld" class="form-control" placeholder="Старый пароль" required>
            <span id="checkPasswordOld" aria-required="true"></span>

            <label for="password" class="sr-only">Пароль</label>
            <input type="password" id="password" name="password" class="form-control" placeholder="Новый пароль" required>
            <span id="checkPassword" aria-required="true"></span>

            <input type="password" id="passwordConfirm" name="passwordConfirm" class="form-control" placeholder="Повторите пароль" required>
            <span id="checkPasswordConfirm" aria-required="true"></span>

            <button class="btn btn-lg btn-primary btn-block" type="submit">Изменить</button>

        </form>
    </div>
    <div class="container-profile">
        <form action="/logout" method="post">
            <#--<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">-->
                <button class="btn btn-lg btn-primary btn-block" type="submit">Выйти</button>
        </form>
    </div>

</div>
</body>
</html>