<%@page import="Util.ConexionDB"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.EmpleadoVO"%>
<%@page import="ModeloDAO.EmpleadoDAO"%>
<%
    Connection con;
    String url = "jdbc:mysql://localhost:3306/tatis_media_y_todo";
    String Driver = "com.mysql.jdbc.Driver";
    String user = "root";
    String clave = "";
    Class.forName(Driver);
    con = DriverManager.getConnection(url, user, clave);
    Statement smt;
    ResultSet rs;
    smt = con.createStatement();
    rs = smt.executeQuery("select * from empleado");
%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Consultar empleado</title>
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
    
                        
                        <div class="col-md-4">
                        <label class="form-label" form="form3Example1q">Numero Documento</label>
                        <input type="number"id="NumeroDocEmpleado" name="textNumDoc" class="form-control" value="" required >
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div><br>
                        
                        <div>                
                                        <div class="form-outline mb-4">

                                            <!-- Button trigger modal -->
                                            <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#exampleModal">
                                                Ver Datos
                                            </button>

                                            <!-- Modal -->
                                            <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                                <div class="modal-dialog" role="document">
                                                    <div class="modal-content">
                                                        <div class="modal-header">
                                                            <h5 class="modal-title" id="exampleModalLabel">Información Disponible</h5>
                                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                                <span aria-hidden="true">&times;</span>
                                                            </button>
                                                        </div>
                                                        <div class="modal-body">
                                                            <div class="container">               
                                                                <table class="table table-bordered"  id="tablaDatos">
                                                                    <thead>
                                                                        <tr>
                                                                            <th class="text-center">DOCUMENTO DE EMPLEADOS</th>
                                                                        </tr>
                                                                    </thead>
                                                                    <tbody id="tbodys">


                                                                        <%
                                                                            while (rs.next()) {
                                                                        %>

                                                                        <tr>
                                                                            <td class="text-center"><%= rs.getString("NumeroDocEmpleado")%></td>

                                                                        </tr>
                                                                        <%}%>
                                                                </table>    
                                                            </div>  
                                                        </div>
                                                        <div class="modal-footer">
                                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                        </div>

                        
                      
                        
                        
                       
                                           <input type="hidden" value="3" name="opcion">
                                           <button class="btn btn-primary btn-lg" style="margin-bottom: 4px;" style="color: #FFFFFF; text-decoration: none;" type="submit" onclick="return confirm('¿Estas seguro de registrar este proveedor?')"  >Consultar</button>  
                                           
                        </center> </form>
                    <div><center>
                            <button type="submit" class="btn btn-success btn-lg mb-1"><a href="DatosEmpleado.jsp" style="color: #FFFFFF; text-decoration: none;">Consulta General</a></button></center>
                                         
                                        
                                        
                                        </div>
                         
                                         <% 
                                         if  (request.getAttribute("MensajeError") !=null) {%>
                                         ${MensajeError}           
               
                                         <%}else {%>
                                        ${MensajeExito}  
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
     <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>