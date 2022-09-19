$(document).ready(function () {

    $("#form-login").submit(function (event) {

        event.preventDefault();
        autenticarUsuario();
    });

   

});

function autenticarUsuario() {

    let email = $("#Correo").val();
    let contrasena = $("#Nombre").val();

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
            if (parsedResult !== false) {
                $("#login-error").addClass("d-none");
                let email = parsedResult['email'];
                document.location.href = "home.html?username=" + email;
            } else {
                $("#login-error").removeClass("d-none");
            }
        }
    });
}
