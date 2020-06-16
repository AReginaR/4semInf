<#import "/spring.ftl" as spring/>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sign In</title>
     <#include "header.ftlh">
</head>
<body>

<div id="app" class="container">

    <form class="form-signin" method="post" action="/signIn" name="signIn" id="signIn">
        <h2 class="form-signin-heading">Вход</h2>

        <label for="email" class="sr-only">E-mail</label>
        <input type="email" id="email" name="email" class="form-control" placeholder="E-mail" required autofocus>
        <span id="checkLogin" aria-required="true"></span>

        <label for="password" class="sr-only">Пароль</label>
        <input type="password" id="password" name="password" class="form-control" placeholder="Пароль" required>
        <span id="checkPassword" aria-required="true"></span>

        <#--<#if Session.SPRING_SECURITY_LAST_EXCEPTION??-->
        <#--&& Session.SPRING_SECURITY_LAST_EXCEPTION.message?has_content>-->
        <#--Пользователь не найден-->
        <#--</#if>-->
        <#--<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">-->

        <button class="btn btn-lg btn-primary btn-block" type="submit">Войти</button>
        <span class="help-block loading"></span>
        Еще не аккаунта? <a href="/registration"  style="color: white">Зарегистрироваться</a>
    </form>
    <#--<form class="form-google" action="/login">-->
        <#--&lt;#&ndash;<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">&ndash;&gt;-->
        <#--<button class="btn btn-lg btn-primary btn-block" type="submit">Вход с помощью Google</button>-->
    <#--</form>-->
</div>
<script src="/js/main.js"></script>
</body>
</html>