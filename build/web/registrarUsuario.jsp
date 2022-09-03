<%-- 
    Document   : registrarUsuario
    Created on : 11/08/2022, 09:06:37 PM
    Author     : User
--%>

<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloVO.RolVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro usuario</title>
    </head>
    <body>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="js/CheckPassword.js" type="text/javascript"></script>
    <link href="css/CheckPassword.css" rel="stylesheet" type="text/css"/>
    
</head>
  

<body>
    <form id="form1" method="post" action="Usuario">
        <div class="container py-3">
            <div class="row">
                <div class="col-md-12">            
                    <div class="row">
                        <div class="col-md-6 mx-auto">
                            <div class="card border-secondary">
                                <div class="card-header">
                                    <h3 class="mb-0 my-2">Registrarse</h3>
                                </div>
                                <div class="card-body">
                                    <div class="form-group">
                                        <label>Correo</label>
                                        <div class="input-group">
                                            <div class="input-group-prepend">
                                                <span class="input-group-text"><i class="fa fa-user"></i></span>
                                            </div>
                                            <input ID="txtFirstName"  name="textUsuario" Class="form-control" type="Email"/>
                                        </div>
                                    </div>
                                    
                                   
                                    <div class="form-group">
                                        <label>Contraseña</label>
                                        <div class="input-group">
                                            <div class="input-group-prepend">
                                                <span class="input-group-text"><i class="fa fa-lock"></i></span>
                                            </div>
                                            <input ID="txtPassword" name="textClave" type="Password" Class="form-control"/>
                                        </div>
                                        <div id="strengthMessage"></div>
                                    </div>
                                    <div class="form-group">
                                        <label>Estado</label>
                                        <div class="input-group">
                                            <div class="input-group-prepend">
                                                <span class="input-group-text"><i class=" fa fa-user"></i></span>
                                            </div>
                                            <input ID="txtEstado" name="textEstado" type="text" Class="form-control"/>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <input type="hidden" value="1" name="opcion" >
                                        <button type="submit" class="btn btn-success float-right rounded-0" >Registrarse</button>
                                    </div>
                                     <% 
                                         if(request.getAttribute("MensajeError") !=null) {%>
                                         ${MensajeError}           
               
                                         <%}else {%>
                                        ${MensajeExito}  
                                        <%}%>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </form>
</body>
</html>
                         
                                        
