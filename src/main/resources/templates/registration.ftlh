<#import "/spring.ftl" as spring/>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Registration</title>
    <#include 'header.ftlh'>
</head>
<body>

<div class="container">
    <@spring.bind "userReg" />

    <form class="form-signin" method="post" action="/registration" name="registration" onsubmit="return validation()">
        <h2 class="form-signin-heading">Регистрация</h2>

        <label for="email" class="sr-only">E-mail</label>
        <input type="email" id="email" name="email" class="form-control" placeholder="E-mail" oninput="return validation()" required autofocus>
        <span id="checkEmail" aria-required="true" style="color: white"><#if emailError??>${emailError}</#if></span>

        <label for="name" class="sr-only"></label>
        <input type="text" id="name" name="name" class="form-control" placeholder="Имя" oninput="return validation()" required autofocus>
        <span id="check2" aria-required="true" style="color: white"></span>

        <label for="password" class="sr-only">Пароль</label>
        <input type="password" id="password" name="password" class="form-control" oninput="return validation()" placeholder="Пароль" required>
        <span id="checkPassword" aria-required="true" style="color: white"></span>

        <label for="passwordConfirm" class="sr-only">Повторите пароль</label>
        <input type="password" id="passwordConfirm" name="passwordConfirm" class="form-control" oninput="return validation()" placeholder="Повторите пароль" required>
        <span id="checkPasswordConfirm" aria-required="true" style="color: white"></span>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Зарегистрироваться</button>
        <span class="help-block loading" style="color: white"></span>
        <a href="/signIn" style="align-content: center!important; color: white!important;">Уже есть аккаунт?</a>
    </form>

    <#--<form class="form-google" action="/oauth2/authorization/google">-->
        <#--<button class="btn btn-lg btn-primary btn-block" type="submit">Зарегистрироваться с помощью Google</button>-->
    <#--</form>-->
</div>
<script>
    function validation() {
        let email = document.registration.email;
        let name = document.registration.name;
        let pass = document.registration.password;
        let pass2 = document.registration.passwordConfirm;

        if (validEmail(email)) {
            if(validName(name, 2, 30))
            if (validPassword(pass, 8, 30)) {
                if (validPassword2(pass, pass2)) {
                    return true;

                }
            }
        }
        return false;
    }
    function validEmail(email) {
        let m = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
        // let m = /.+@.+\..+/;
        if (!email.value.match(m)) {
            document.getElementById('checkEmail').innerHTML = 'Пожалуйста, введите корректный адрес почты';
            return false;
        }
        document.getElementById('checkEmail').innerHTML = "";
        return true;
    }

    function validName(uName, min, max) {
        let len = uName.value.length;
        let letters = /^[A-Za-zА-Яа-я]+$/;
        if (len < min) {
            document.getElementById('check2').innerHTML = 'Пожалуйста, введите данные';
            return false;
        } else if (len > max) {
            document.getElementById('check2').innerHTML = 'Число символов не должен быть больше ' + max;
            return false;
        } else if (!uName.value.match(letters)){
            document.getElementById('check2').innerHTML = 'Имя должно содержать только буквы';
        }
        document.getElementById('check2').innerHTML = '';
        return true;
    }

    function validPassword(pass, min, max) {
        let len = pass.value.length;
        if (len > max) {
            document.getElementById('checkPassword').innerHTML = 'Количество символов в строке не должно превышать ' + max;
            return false;
        } else if (len < min) {
            document.getElementById('checkPassword').innerHTML = 'Количество символов должно превышать ' + min;
            return false;
        } else if (!pass.value.match(/(?=.*[0-9])(?=.*[A-Za-z])/g)){
            document.getElementById('checkPassword').innerHTML = 'Пароль должен содержать минимум 1 цифру и 1 латинскую букву ';
            return false;
        }
        document.getElementById('checkPassword').innerHTML = '';
        return true;
    }
    function validPassword2(pass, pass2) {
        if (pass.value !== pass2.value){
            document.getElementById('checkPasswordConfirm').innerHTML = 'Пароли не совпадают';
            return false;
        }
        document.getElementById('checkPasswordConfirm').innerHTML = '';
        return true;
    }

</script>
</body>
</html>


