$(document).ready(function () {

    $("#loginUsuarios").submit(function (event) {

        event.preventDefault();
        autenticarUsuario();
    });



});

function autenticarUsuario() {

    let username = $("#usuario").val();
    let contrasena = $("#clave").val();

    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioLogin",
        data: $.param({
            username: username,
            contrasena: contrasena
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);
            if (parsedResult != false) {
                $("#ingreso-mal").addClass("d-none");
                let username = parsedResult['username'];
                document.location.href = "home.html?username=" + username;
            } else {
                $("#ingreso-mal").removeClass("d-none");
            }
        }
    });
}
