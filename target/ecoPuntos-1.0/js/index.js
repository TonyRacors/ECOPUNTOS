$(document).ready(function () {

    $("#loginUsuarios").submit(function (event) {

        event.preventDefault();
        autenticarUsuario();
    });
    $("#Registro_usuarios").submit(function (event) {

        event.preventDefault();
        registrarUsuario();
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
function registrarUsuario() {
    
    let tipo_usuario = $("#Tipo_Usuario.value").val();         // Captura de datos por inpur para almacenar en base de datos
    let nombre = $("#nombre").val();
    let apellido = $("#apellido").val();
    let username =$("#username").val();
    let email = $("#correo").val();
    let contrasena = $("#clave1").val();
    let confirmacion_contrasena = $("#clave2").val();
    let direccion = $("#direccion").val();
    let telefono = $("#telefono").val();
    let total_ecopuntos = 0;
    let saldo_ecopuntos = 0;
    

    

        $.ajax({
            type: "GET",
            dataType: "html",
            url: "./ServletUsuarioRegister",
            data: $.param({
                username: username,
                email: email,
                contrasena: contrasena,
                nombre: nombre,
                apellidos: apellido,
                direccion: direccion,
                telefono: telefono,
                tipo_usuario: tipo_usuario,
                total_ecopuntos:total_ecopuntos,
                saldo_ecopuntos:saldo_ecopuntos
                
                
            }),
            success: function (result) {
                let parsedResult = JSON.parse(result);

                if (parsedResult != false) {
                    $("#ingreso-mal").addClass("d-none");
                    let username = parsedResult['username'];
                    document.location.href = "home.html?username=" + username;
                } else {
                    $("#ingreso-mal").removeClass("d-none");
                    $("#ingreso-mal").html("Error en el registro del usuario");
                }
            }
        });
    
}