<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>${serialsId.name}</title>
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
    <h2>${serialsId.name}</h2>
    <p>
        <span>Дата выхода</span>
    ${serialsId.realiseDate.dayOfMonth}.${serialsId.realiseDate.monthValue}.${serialsId.realiseDate.year}
    </p>
    <p>
        <span>Жанр</span>
    ${serialsId.genre}
    </p>
    <#--<p>-->
        <#--<span>Рейтинг</span>${serialId.rating} из 5-->
    <#--</p>-->
    <p><span>Описание</span></p>
    <div class="presentBlockButtons">
        <form action="/serials/" method="post">
        <input type="submit" name="watch" data-show-id="2" class="button _big _rect toggle-show-status _light" value="Смотрю">
        <#--<a href="#" data-status="later" data-show-id="2" class="button _big _rect toggle-show-status _light">Буду смотреть</a>-->
        <#--<a href="#" data-status="cancelled" data-show-id="2" class="button _big _rect toggle-show-status _light">Перестала</a>-->
        <input type="submit" name="remove" data-show-id="2" class="button _big _rect toggle-show-status" value="Не смотрю">
        </form>
    </div>
</div>
</body>
</html>