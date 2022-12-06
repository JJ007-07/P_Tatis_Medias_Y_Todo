<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="./Estilos/bootstrap.min.css" rel="stylesheet">
        <link href="./Estilos/floating-labels.css" rel="stylesheet">
      
           <link href="Estilos/CheckPassword.css" rel="stylesheet" type="text/css"/>
        <title>Iniciar Sesion</title>
    </head>
    <body>
        <form class="form-signin" method="post" action="Usuario">
            <div class="text-center mb-4">
                <img class="mb-4" src="./IMG/Log.svg" alt="" width="200" height="200">
                <h1 class="h3 mb-3 font-weight-normal">Iniciar Sesión</h1>
            </div>

            <div class="form-label-group">
                <input type="email" name="textUsuario" id="inputEmail" class="form-control" placeholder="Email address" required>
                <label for="inputEmail">Correo Electronico</label>
            </div>

            <div class="form-label-group">
          
                <input type="password" name="textClave" id="inputPassword" class="form-control password1" placeholder="Password" required >
               
                <label for="inputPassword">Contraseña</label>
                       <span class="fa fa-fw fa-eye password-icon show-password"></span>
            </div>

            <div class="checkbox mb-3">
                <label>
                    <input type="checkbox" value="remember-me"> Recordarme
                </label>
            </div>
            <button type="submit" class="btn btn-lg btn-primary btn-block">INGRESAR</button>
            <input type="hidden" value="4" name="opcion">
            <p style="float: left;"><a href=registrarUsuario.jsp class="Texto1">Registrarse</a></p>
            <p style="float: right;"><a href="#" class="Texto2">¿Clave olvidada?</a></p>
            <p class="mt-5 mb-3 text-muted text-center">&copy; Tatis Medias & Todo</p>
        </form>
        
        
        <%if (request.getAttribute("mensajeError") != null) {%>
        ${mensajeError}
        <% } else {%>
        ${mensajeExito}
        <%}%>
               <script>
  window.addEventListener("load", function() {
 
    // icono para poder interaccionar con el elemento
    showPassword = document.querySelector('.show-password');
    showPassword.addEventListener('click', () => {
 
      // elementos input de tipo password
      password1 = document.querySelector('.password1');
  
 
      if ( password1.type === "text" ) {
        password1.type = "password"
        
        showPassword.classList.remove('fa-eye-slash');
      } else {
        password1.type = "text"
       
        showPassword.classList.toggle("fa-eye-slash");
      }
  })
});
</script> 
<script src="https://kit.fontawesome.com/2c36e9b7b1.js" crossorigin="anonymous"></script>
    </body>
</html>