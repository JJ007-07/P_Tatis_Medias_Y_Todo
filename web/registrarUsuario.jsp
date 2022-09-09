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

                
<section class="vh-100" style="background-color: #eee;">
  <div class="container h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-12 col-xl-11">
        <div class="card text-black" style="border-radius: 25px;">
          <div class="card-body p-md-5">
            <div class="row justify-content-center"> 
              <div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">

                <p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Registrarse </p>

                <form class="mx-1 mx-md-4"method="post" action="Usuario"  onSubmit="return validarfor(); checkForm(this); return false;"   >

                  <div class="d-flex flex-row align-items-center mb-4">
                    <div class="form-outline flex-fill mb-0">
                        <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                        <label class="form-label correo" for="form3Example3c">Correo</label>
                      <input type="email"  class="formulario__input" name="textUsuario" id="mail"placeholder="Correo@correo.com" />
                      
                    </div>
                  </div>

                  <div class="d-flex flex-row align-items-center mb-4">
                    
                    <div class="form-outline flex-fill mb-0">
                        <i class="fas fa-lock fa-lg me-3 fa-fw"></i>
                        <label class="form-label" for="form3Example4c">Contraseña</label>
                      <input type="password"  class="formulario__input password1"name="textClave" id="txtPassword" />
                       <span class="fa fa-fw fa-eye password-icon show-password"></span>
                      <div id="strengthMessage"></div>
                      
                      
                                        
                    </div>
                     
                                    
                  </div>
                     
					
                                       
				
                      <!-- Grupo: Estado oculto -->
                         <input type="hidden" readonly read value="Activo" name="textEstado"><br><br>
                         

<input class="form-check-input me-2" type="checkbox" value="" id="form2Example3c" />
                    <label class="form-check-label" for="form2Example3">
                  <div class="form-check d-flex justify-content-center mb-5">
                    
                      I agree all statements in <a href="#!">Terms of service</a>
                    
                  </div></label>



                  <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
                      <input type="hidden" value="1" name="opcion" >
                    <button type="submit" class="btn btn-primary btn-lg">Registrar</button>
                  </div>

                </form>

              </div>
              <div class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2">

                  <img src="IMG/Logo.png"
                  class="img-fluid" alt="Logo">

              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
 <script src="https://kit.fontawesome.com/2c36e9b7b1.js" crossorigin="anonymous"></script>
    
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
    var myregex = /^(?=.\d)(?=.[a-z])(?=.*[A-Z]).{8,}$/; 
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
        if (correo.length === 0) {
            return false;
        }
        
         if (correo.length === 0 || /^\s+$/.test(correo)) {
     alert('El Correo esta vacio!');
     return false;
 }
 
        return true;
    }
 
    </script>            
 <div class="tres"> 
                         
                                         <% 
                                         if(request.getAttribute("MensajeError") !=null) {%>
                                         ${MensajeError}           
               
                                         <%}else {%>
                                        ${MensajeExito}  
                                        <%}%>
                                        
     </div>
</body>
</html>

    