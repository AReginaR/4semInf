<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="../static/css/style.css" type="text/css">
    <link rel="stylesheet" href="../static/css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
    <script src="/js/reg.js"></script>
    <style>
        .elementRate._compact > * {
            width: 21px;
            height: 21px;
            background: url(../static/img/sprite_rate_compact.png) no-repeat -37px -37px;
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

    <h1>Новые серии</h1>

        <h2>
            <a href="#">Шерлок</a>


            <div class="seasonBlockBody" style="display: block;">
                <table>
                    <tbody>
                    <tr>
                        <td class="bss_seri">4x02</td>
                        <td><a href="#">The Lying Detective</a></td>
                        <td>08.01.2017</td>
                        <td>
                            <input type="button" name="btn" value="Посмотрел">
                        </td>
                        <td>
                            <input type="button" value="Отменить просмотр" >
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </h2>
</div>

</div>
</body>
</html>