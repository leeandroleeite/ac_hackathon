var couple;


function ajaxRequest() {

    couple = {
        coupleName: $("#coupleName").val(),
        yinMail: $("#yinEmail").val(),
        yinLocation: $("#yinLocation").val(),
        yangMail: $("#yangEmail").val(),
        yangLocation: $("#yangLocation").val(),
        password: $("#password").val(),
        theBeginning: $("#beginning").val(),
        lastFarewell: $("#farewell").val()
    };

    console.log(couple);

    $.ajax({
        url: "http://localhost:8080/farewell/api/register",
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
        
        $("#yinEmail").val(couple.yinMail),
        $("#yinLocation").val(couple.yinLocation),
        $("#yangEmail").val(couple.yangMail),
        $("#yangLocation").val(couple.yangLocation),
        $("#password").val(couple.password),
        $("#beginning").val(couple.theBeginning),
        $("#farewell").val(couple.lastFarewell)

        alert("Username already exists, choose a new one.");
    }


}

  function shit(event) {
        console.log("on click");
    }