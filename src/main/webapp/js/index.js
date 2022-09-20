$(document).ready(function () {

    $("#loginUsuarios").submit(function (event) {

        event.preventDefault();
        autenticarUsuario();
    });



});

function autenticarUsuario() {

    let email = $("#correo").val();
    let contrasena = $("#clave").val();

    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioLogin",
        data: $.param({
            email: email,
            contrasena: contrasena
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);
            if (parsedResult != false) {
                $("#ingreso-mal").addClass("d-none");
                let email = parsedResult['email'];
                document.location.href = "home.html?email=" + email;
            } else {
                $("#ingreso-mal").removeClass("d-none");
            }
        }
    });
}
