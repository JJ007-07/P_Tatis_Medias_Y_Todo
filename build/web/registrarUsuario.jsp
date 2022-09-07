<%-- 
    Document   : registrarUsuario
    Created on : 11/08/2022, 09:06:37 PM
    Author     : User
--%>

<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloVO.RolVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Usuario</title>
	<link rel="stylesheet" href="https://necolas.github.io/normalize.css/8.0.1/normalize.css">
	<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet"> 
        <link href="Estilos/estilos.css" rel="stylesheet" type="text/css"/>

        <link href="css/default.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="js/CheckPassword.js" type="text/javascript"></script>
        <link href="Estilos/CheckPassword.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <main>
		 <h1 class="titulo">Registrar Usuario</h1>
                 
                
           <form class="formulario" id="formulario" name="fmrUsuarios" method="post" action="Usuario" onSubmit="return validarfor(); checkForm(this); return false;"   >
            
            <!-- Grupo: Correo Electronico -->
			<div class="formulario__grupo" id="grupo__correo">
				<label for="correo" class="formulario__label">Usuario</label>
				<div class="formulario__grupo-input">
					<input type="email" class="formulario__input" name="textUsuario" id="mail" placeholder="correo@correo.com">
					<i class="formulario__validacion-estado fas fa-times-circle"></i>
				</div>
				
			</div>

			<!-- Grupo: Contraseña -->
                        
			<div class="formulario__grupo" id="grupo__password" Onkeypress="enterEnviar(event);">
				<label for="password" class="formulario__label">Contraseña</label>
				<div class="formulario__grupo-input">
                                     <input type="password" class="formulario__input password1"  name="textClave" id="txtPassword" placeholder=""/>
					
                                        <span class="fa fa-fw fa-eye password-icon show-password"></span>
                                        <div id="strengthMessage"></div>
				</div>
				 
                                       
			</div>
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
<script> 
function checkPassword(valor){
    var myregex = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$/; 
   if(myregex.test(valor)){
       alert(valor+" es valido :-) !");
       return true;        
   }else{
      alert(valor+" NO es valido!");
       return false;        
   }   
}
function checkForm(form){
if(form.textClave.length == 0 ) {
      if(!checkPassword(form.textClave.value)) {
        alert("La contraseña no es valida!");
        form.textClave.focus();
        return false;
      }
    } 
    return true;
  }
</script>
</script>
                        <!-- Grupo: Estado oculto -->
                         <input type="hidden" readonly read value="Activo" name="textEstado"><br><br>
                         

                
		<!-- Grupo: Terminos y Condiciones -->
			<div class="formulario__grupo" id="grupo__terminos">
				<label class="formulario__label">
					<input class="formulario__checkbox" type="checkbox" name="terminos" id="terminos">
					Acepto los Terminos y Condiciones
				</label>
			</div>

			<div class="formulario__mensaje" id="formulario__mensaje">
				<p><i class="fas fa-exclamation-triangle"></i> <b>Error:</b> Por favor rellena el formulario correctamente. </p>
			</div>

			<div class="formulario__grupo formulario__grupo-btn-enviar">
                              <input type="hidden" value="1" name="opcion" class="btn float-right login_btn">
                  		<button type="submit" class="formulario__btn"onclick="validarContraseña()" >Registrar</button>
                                <p class="formulario__mensaje-exito" id="formulario__mensaje-exito">Formulario enviado exitosamente!</p>
                	</div>
		
 </main>
    </form>
     
      
        </div>
      
          <div class="tres"> 
                         
                                         <% 
                                         if(request.getAttribute("MensajeError") !=null) {%>
                                         ${MensajeError}           
               
                                         <%}else {%>
                                        ${MensajeExito}  
                                        <%}%>
                                        
     </div>
                                        

     <script src="https://kit.fontawesome.com/2c36e9b7b1.js" crossorigin="anonymous"></script>
    <script>
    function validarfor(){

var correo = document.getElementById("mail").value; 

var expr = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

if ( !expr.test(correo) ){                                                            //COMPRUEBA MAIL
    alert("Error: La dirección de correo " + correo + " es incorrecta.");
    return false;
}
    }
    function validar() {
        //obteniendo el valor que se puso en campo text del formulario
        correo = document.getElementById("mail").value;
       
        //la condición
        if (correo.length == 0) {
            return false;
        }
        
         if (correo.length == 0 || /^\s+$/.test(correo)) {
     alert('El Correo esta vacio!');
     return false;
 }
 
        return true;
    }
 
    </script>                            
    </body>
    </center>
</html>