<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloVO.RolVO"%>
<!doctype html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="js/CheckPassword.js" type="text/javascript"></script>
    <link href="Estilos/estilos2.css" rel="stylesheet" type="text/css"/>
    <link href="Estilos/2.css" rel="stylesheet" type="text/css"/>
    <link href="Estilos/CheckPassword.css" rel="stylesheet" type="text/css"/>
        <title>Registrarse</title>
    </head>
 <script>
// Defining a function to display error message
function printError(elemId, hintMsg) {
    document.getElementById(elemId).innerHTML = hintMsg;
}

// Defining a function to validate form 
function validateForm() {
    // Retrieving the values of form elements 
 
    var textUsuario = document.contactForm.email.value;
  
    
	// Defining error variables with a default value
    var nameErr = emailErr = mobileErr = countryErr = genderErr = true;
    
  
    // Validate email address
    if(textUsuario == "") {
        printError("emailErr", "Por favor digte un correo");
    } else {
        // Regular expression for basic email validation
        var regex = /^\S+@\S+\.\S+$/;
        if(regex.test(textUsuario) === false) {
            printError("emailErr", "El correo no es valido");
        } else{
            printError("emailErr", "");
            emailErr = false;
        }
    }
 
};
</script>   
 <script type="text/javascript">
         var alertBox = document.querySelector('.alertBox');
            function getPassword(){
                var chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+?><:{}[]";
                var passwordLength = 16;
                var password = "";

                for (var i=0; i<passwordLength; i++){
                    var randomNumber = Math.floor(Math.random() * chars.length);
                    password += chars.substring(randomNumber, randomNumber+1);
                }
                document.getElementById("txtPassword").value = password;
                alertBox.innerHTML = "New Passaword Copied: <br>" + password;
            }

            function copyPassword(){
                var copyPassText = document.getElementById("txtPassword");
                copyPassText.select();
                copyPassText.setSelectionRange(0,9999);
                document.execCommand("copy");
                alertBox.classList.toggle('active');
                setTimeout(function(){
                    alertBox.classList.toggle('active')
                }, 900)
            }
        </script>
    <body>
     <a href="Login.jsp"> <img src="IMG/backward_arrow_4020.png" alt="" width="50px"/></a> 
    
        <section class="vh-100" style="background-color: #eee;">
            <div class="container h-100">
                <div class="row d-flex justify-content-center align-items-center h-100">
                    <div class="col-lg-12 col-xl-11">
                        <div class="card text-black" style="border-radius: 25px;">
                            <div class="card-body p-md-5">
                                <div class="row justify-content-center">
                                    <div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">

                                        <p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Registrarme</p>

                                        <form class="mx-1 mx-md-4" method="post" name="contactForm" action="Usuario">

                                            <div class="d-flex flex-row align-items-center mb-4">
                                                <div class="form-outline flex-fill mb-0">
                                                    <label class="form-label" for="form3Example3c" >Tú Correo Electronico</label>
                                                    <input type="text" name="textUsuario" id="mail" class="form-control" >
                                                </div>
                                                  <div class="error2" id="emailErr"></div>
                                            </div>
                                           
                                      <div class="d-flex flex-row align-items-center mb-4 row">
                    <div class="form-outline flex-fill mb-0">
                      <label class="form-label" for="form3Example4c">Tú Contraseña</label>
                      <input type="password" name="textClave" id="txtPassword" class="form-control password1" >
                      <span class="fa fa-fw fa-eye password-icon show-password"></span>
                  
                       
                      <div id="strengthMessage"></div>    <span class="fas fa-random icono " onclick="getPassword();"></span> 
                    </div>
                                      
                
                  </div>

                                            <input type="hidden" readonly read value="Activo" name="textEstado">
                                             

                                            <div class="form-check d-flex justify-content-center mb-5">
                                                <input class="form-check-input me-2" type="checkbox" value="" id="form2Example3c" />
                                                <label class="form-check-label" for="form2Example3">
                                                    Estoy De Acuerdo Con Los <a href="#!">Terminos Y Condiciones</a>
                                                </label>
                                            </div>

                                            <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
                                                <button type="submit" class="btn btn-primary btn-lg"  >Registrarme</button>
                                                <input type="hidden"  value="1" name="opcion" >

                                            </div>

                                        </form>

                                    </div>
                                    <div class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2">

                                        <img src="./IMG/Log.svg" style="padding-left: 25%; padding-right: 25%;" class="img-fluid" alt="Logo">

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
                                                    window.addEventListener("load", function () {

                                                        // icono para poder interaccionar con el elemento
                                                        showPassword = document.querySelector('.show-password');
                                                        showPassword.addEventListener('click', () => {

                                                            // elementos input de tipo password
                                                            password1 = document.querySelector('.password1');


                                                            if (password1.type === "text") {
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
        <script>
            function validarfor() {

                var correo = document.getElementById("mail").value;

                var expr = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

                if (!expr.test(correo)) {                                                            //COMPRUEBA MAIL
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
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
    </body>
</html>