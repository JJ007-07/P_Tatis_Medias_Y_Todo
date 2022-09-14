<%-- 
    Document   : registrarEmpleado
    Created on : 12/08/2022, 11:58:32 PM
    Author     : User
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Empleado</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
        <script src="js/validarE.js" type="text/javascript"></script>
    </head>
    <body>
</head>
  
<center>
<body>
 <section class=    "h-100 h-custom" style="background-color: #999999;">
  <div class="container py-5 h-100">
  <div class="row d-flex justify-content-center align-items-center h-100">
  <div class="col-lg-8 col-xl-6">
  <div class="card rounded-3">
  <img src="https://www.trecebits.com/wp-content/uploads/2020/09/Catalogos-digitales.jpg"
  class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
   alt="Sample photo">
   <div class="card-body p-4 p-md-5">
   <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Información de Registro</h3>

    <div class="contenedor">      

        <center>
            
         <form class="px-md-2"method=" post" action="Empleado">
            <table>
                
                <tr>
                <div class="form-outline mb-4">     
                <input type="text" id="NombreEmpleado" name="textNombre" class="form-control"/>
                <label class="form-label" for="form3Example1q">Nombre Empleado</label>
                </div>
                
                <div class="form-outline mb-4">
                    <input type="text" id="ApellidoEmpleado" name="textApellido" class="form-control"/>
                <label class="form-label" for="form3Example1q">Apellido Empleado</label>
                </div>
                
                <div>
                <div class="form-group">
                    <select class="form-control" id="TipoDocEmpleado"name="textTipo">
               <option value="1" disabled>Seleccionar una opción disponible</option>
                        <option value="2">Seleccione una opción</option>
                        <option value="3">CC</option>
                        <option value="4">CE</option>
                    </select>         
                    <label class="form-label" for="form3Examole1q">Tipo DoC</label>
                </div>
                     
                    <div class="form-outline mb-4"> 
                        <input type="number"id="NumeroDocEmpleado" name="textNumDoc" class="form-control"/>
                    <label class="form-label" form="form3Example1q">Numero Documento</label>
                    </div>
                    
                    <div class="form-outline mb-4"> 
                    <input type="number" id="TelefonoCelularEmpleado"name="textTelefono" class="form-control"/>
                     <label class="form-label" form="form3Example1q">Telefono Empleado</label>
                    </div>
                    
                    <div class="form-outline mb-4"> 
                     <input type="text" id="DireccionEmpleado"name="textDireccion" class="form-control"/>
                     <label class="form-label" form="form3Example1q">Direccion Empleado</label>
                    </div>
                    
                    <div class="form-outline mb-4"> 
                        <input type="email" id="CorreoEmpleado" name="textCorreo" class="form-control"/>
                      <label class="form-label" form="form3Example1q">Correo Empleado</label>
                    </div>
                    
                    <div class="form-outline mb-4"> 
                        <input type="text" id="EstadoEmpleado"name="textEstado" class="form-control"/>
                      <label class="form-label" form="form3Example1q">Estado Empleado</label>
                    </div>
                    
                    <div class="form-group">
                        <select class="form-control" id="IdUsuarioFK" name="textUsuario">
               <option value="1" disabled>Seleccionar una opción disponible</option>
                        <option value="2">Seleccione usuario</option>
                        <%
                        UsuarioDAO usuDAO = new UsuarioDAO();
                        for(UsuarioVO usuVO: usuDAO.listar()){
                    %> 
                    <option value="<%=usuVO.getIdUsuario()%>"><%=usuVO.getNombreUsuario()%></option>
                   <%}%>
                    </select>         
                    <label class="form-label" for="form3Examole1q">Seleccionar Usuario </label>
                </div>
                   
                </tr>
                
                 </div>
                    
                
            </table><br>
           
      
        
             <input type="hidden" value="1" name="opcion">
        <button type="submit" class="btn btn-success btn-lg mb-1"onclick="return confirm('¿Estas seguro de  hacer este registro?')" > Registrar Empleado</button>
         <button type="submit" class="btn btn-primary btn-lg" style="margin-bottom: 4px;"><a href="ConsultarEmpleado.jsp" style="color: #FFFFFF; text-decoration: none;">Ver empleados registrados</a></button>
        </div>
        </form>
                   
        </center>
      
        </div>
      
          <div class="tres"> 
                         
                                         <% 
                                         if  (request.getAttribute("mensajeError") !=null) {%>
                                         ${mensajeError}           
               
                                         <%}else {%>
                                        ${mensajeExito}  
                                        <%}%>
                                        
                    </div>
    </body>
    </center>
</html>
