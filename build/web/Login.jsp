<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="./Estilos/StyleLogin.css">
        <title>Iniciar Sesion</title>
    </head>
    <body>
        <div>
            <img src="IMG/LOGO.jpeg" alt="Logo del local" class="Imagen">
            <div class="FormularioCont">
                <h1 class="H1">INICIAR SESIÓN</h1>
                <form class="Formulario" method="post" action="Usuario">
                    <input class="emailtxt" type="text" name="textUsuario" placeholder="  Correo Electronico" required>
                    <br>
                    <br>
                    <input class="passwordtxt" type="password" name="textClave" placeholder="  Contraseña" required>
                    <br>
                    <br>
                    <br>
                    <button type="submit" class="buttonbtn">INGRESAR</button>
                    <input type="hidden" value="4" name="opcion">
                    <br>
                    <p><a href=registrarUsuario.jsp class="Texto1">Registrarse</a><a href="ConsultarUsuario.jsp" class="Texto2">¿Contraseña olvidada?</a></p>
                    <br>
                    <%if (request.getAttribute("mensajeError") != null) {%>
                    ${mensajeError}
                    <% } else {%>
                    ${mensajeExito}
                    <%}%>
                </form>
            </div>
        </div>
    </body>
</html>
