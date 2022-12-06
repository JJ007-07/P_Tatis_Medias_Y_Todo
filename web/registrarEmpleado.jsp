<%-- 
    Document   : registrarProducto
    Created on : 3/08/2022, 04:35:47 PM
    Author     : jtgt2
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Empleados</title>
  </head>
  <body>
       <nav>

            <%@include file="Principal.jsp"%>    
        </nav>

    <div class="container">
        <div class="row">
            <div class="col">              
                <div class="shadow-lg p-3 mb-5 mt-4 bg-body rounded">
                <img src="https://blog.debmedia.com/wp-content/uploads/2020/02/Atenci%C3%B3n-al-cliente-1.jpg"
                class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
                alt="Sample photo">

                    <div class="p-3 mb-2 bg-primary bg-gradient fw-bold text-white">Información Registro Empleado</div>
                    <form class="row g-3 needs-validation" method="post" action="Empleado"  novalidate>
                        <center>
                            
                        <div class="col-md-3">
                        <label class="form-label" for="form3Example1q">Nombre Empleado</label>
                        <input type="text" id="NombreEmpleado" name="textNombre" class="form-control" value="" required></td>
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos
                        
                        </div>
                        <div class="col-md-12">
                        <label class="form-label" for="form3Example1q">Apellido Empleado</label>
                        <input type="text" id="ApellidoEmpleado" name="textApellido" class="form-control" value="" required >
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div>
                        
                        <div class="col-md-12">
                        <label for="form3Examole1q" class="form-label">Tipo Documento</label>
                        <select name="textTipo" class="form-select"  required>
                        <option selected disabled value="">Seleccionar una opción disponible</option>
                        <option>CC</option>
                        <option>CE</option>
                        </select>
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div> 
                        
                         <div class="col-md-12">
                        <label class="form-label" form="form3Example1q">Numero Documento</label>
                        <input type="number"id="NumeroDocEmpleado" name="textNumDoc" class="form-control" value="" required >
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div>
                        
                        <div class="col-md-12">
                       <label class="form-label" form="form3Example1q">Telefono Empleado</label>
                       <input type="number" id="TelefonoCelularEmpleado"name="textTelefono" class="form-control" value="" required >
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div>
                        
                        <div class="col-md-12">
                        <label class="form-label" form="form3Example1q">Direccion Empleado</label>
                        <input type="text" id="DireccionEmpleado"name="textDireccion" class="form-control" value="" required >
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div>
                        
                        <div class="col-md-12">
                        <label class="form-label" form="form3Example1q">Correo Empleado</label>
                        <input type="text" id="CorreoEmpleado" name="textCorreo" class="form-control" value="" required >
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div>

                        <div class="col-md-12">
                        <label class="form-label" form="form3Example1q">Estado Empleado</label>
                        <input type="text" id="EstadoEmpleado"name="textEstado" class="form-control" value="" required >
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div>
                        
                        <div class="col-md-12">
                        <label for="form3Examole1q" class="form-label">Seleccionar Usuario</label>
                        <select name="textUsuario" class="form-select"id="IdUsuarioFK"  required>
                        <option selected disabled value="">Seleccionar una opción disponible</option>
                        <option value="">Seleccione usuario</option>
                        <%UsuarioDAO usuDAO = new UsuarioDAO();
                        for (UsuarioVO usuVO : usuDAO.listar()) {
                                        %> 
                        <option value="<%=usuVO.getIdUsuario()%>"><%=usuVO.getNombreUsuario()%></option>
                        <%}%>

                        </select>
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div> 
                        
                      
                        
                        
                       
                                           <input type="hidden" value="1" name="opcion">
                                           <button class="btn btn-primary btn-lg" style="margin-bottom: 4px;" style="color: #FFFFFF; text-decoration: none;" type="submit" onclick="return confirm('¿Estas seguro de registrar este empleado?')"  >Registrar Empleado</button>  
                                           
                        </center> </form>
                    <div><center>
                            <button type="submit" class="btn btn-success btn-lg mb-1"><a href="ConsultarEmpleado.jsp" style="color: #FFFFFF; text-decoration: none;">Ver Empleados registrados</a></button></center>
                                         
                                        
                                        
                                        </div>
                         
                                       <% 
                                         if  (request.getAttribute("mensajeError") !=null) {%>
                                         ${MensajeError}           
               
                                         <%}else {%>
                                        ${mensajeExito}  
                                        <%}%>
                    </div>
                </tr>
                </div>
            </div>
        </div>
    </div>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <script>      
    (function () {
      'use strict'
      // Obtener todos los formularios a los que queremos aplicar estilos de validación de Bootstrap personalizados
      var forms = document.querySelectorAll('.needs-validation')
      //Recorremos los forms y evitamos en envío sin validacion
      Array.prototype.slice.call(forms)
        .forEach(function (form) {
          form.addEventListener('submit', function (event) {            
            if (!form.checkValidity()) {
              event.preventDefault()
              event.stopPropagation()
            }else{
              alert('FORM VALIDADO')
            }
            form.classList.add('was-validated')
          }, false)
        })
    })()
    </script>    
  </body>
</html>