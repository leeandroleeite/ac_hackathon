$(document).ready(
$('#registerbtn').click(ajaxRequest))

function ajaxRequest(event) {
    var couple = {
        coupleName: $("#coupleName").val(),
        yinEmail: $("#yinEmail").val(),
        yinLocation: $("#yinLocation").val(),
        yangEmail: $("#yangEmail").val(),
        yangLocation: $("#yangLocation").val(),
        password: $("#password").val(),
        beginning: $("#beginning").val(),
        farewell: $("#farewell").val()
    }

    $.ajax({
        url: window.location.hostname + "/api/register",
        type: 'POST',
        data: couple,
        async: true,
        contentType: 'application/json',
        success: successCallback,
        error: errorCallback

    })

    function successCallback(response) {
        $(".limiter").replace("<h1>response.coupleName</h1>");
    }

    function errorCallback(request, status, error) {
        $(".limiter").replace("<h1>error callback</h1>");
    }

}