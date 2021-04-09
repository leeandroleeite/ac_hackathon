
window.onload = (event) => {
    var element = document.getElementById('loginForm');
    element.addEventListener('submit', ajaxRequestLogin);
}

var couple;

function ajaxRequestLogin(event) {

    event.preventDefault();

    couple = {
        username: $("#username").val(),
        password: $("#password").val()
    };


    $.ajax({
        url: "http://zecupidapi.herokuapp.com/api/login",
        type: 'POST',
        data: JSON.stringify(couple),
        async: true,
        contentType: 'application/json',
        success: successCallback,
        error: errorCallback

    })

    function successCallback(response) {
        window.location.href = "profile.html";
    }

    function errorCallback(request, status, error) {
        console.log(status);
        alert("Wrong credentials, please try again or register.");
    }


}