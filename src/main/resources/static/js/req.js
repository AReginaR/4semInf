function validation() {
    let email = $("#email").val();
    let pass = $("#password").val();
    let pass2 = $("#passwordConfirm").val();

    console.log(pass);

    if (validEmail(email)) {
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

function validPassword(pass, min, max) {
    let len = pass.value.length;
    if (len > max) {
        document.getElementById('checkPassword').style.color = 'red';
        document.getElementById('checkPassword').innerHTML = 'Количество символов в строке не должно превышать ' + max;
        return false;
    } else if (len < min) {
        document.getElementById('checkPassword').style.color = 'red';
        document.getElementById('checkPassword').innerHTML = 'Количество символов должно превышать ' + min;
        return false;
    }
    return true;
}
function validPassword2(pass, pass2) {
    if (pass.value !== pass2.value){
        document.getElementById('checkPasswordConfirm').style.color = 'red';
        document.getElementById('checkPasswordConfirm').innerHTML = 'Пароли не совпадают';
        return false;
    }
    return true;
}

