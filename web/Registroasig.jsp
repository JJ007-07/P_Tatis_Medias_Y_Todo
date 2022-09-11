<%-- 
    Document   : Registroasig
    Created on : 11/09/2022, 02:16:57 PM
    Author     : User
--%>


<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloVO.RolVO"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Asignar</title>
          <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
    </head>
    <body>
        <section class="h-100 h-custom" style="background-color: #8fc4b7;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-8 col-xl-6">
        <div class="card rounded-3">
          <img src="https://www.trecebits.com/wp-content/uploads/2020/09/Catalogos-digitales.jpg"
            class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
            alt="Sample photo">
            <div class="card-body p-4 p-md-5">
                <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Asignacion de roles </h3>
                <form class="px-md-2" method="post" action="UsuRol" >
                    
       <div class="form-group">
                <select class="form-control" name="IdUsuario" id="Idusuario">
                  <option value="1" disabled>Seleccionar una opción disponible</option>
                  <option value="2">Selecciona una opción</option>
                  <%
                    UsuarioDAO usuDAO = new UsuarioDAO();
                     for (UsuarioVO usuVO : usuDAO.listar()) {
                  %>
                  <option value="<%=usuVO.getIdUsuario()%>"><%=usuVO.getNombreUsuario()%></option>
                   <%}%>  
                </select>
                <label class="form-label" for="form3Example1q">Usuario</label>
            </div>
                <div class="form-group">
                <select class="form-control" name="IdRol" id="IdRol">
                  <option value="1" disabled>Seleccionar una opción disponible</option>
                  <option value="2">Selecciona una opción</option>
                  <%
                    RolDAO rolDAO = new RolDAO();
                    for (RolVO rolVO : rolDAO.listar()) {
                  %>
                  <option value="<%=rolVO.getIdRol()%>"><%=rolVO.getTipoRol()%></option>
                   <%}%>  
                </select>
                <label class="form-label" for="form3Example1q">Rol</label>
            </div>
                
                <div>   
                <input type="hidden" value="1" name="opcion">
                <button type="submit" class="btn btn-success btn-lg mb-1">Asignar</button>
                <button type="submit" class="btn btn-primary btn-lg" style="margin-bottom: 4px;"><a href="ConsultarRoles.jsp" style="color: #FFFFFF; text-decoration: none;">Ver Productos Registrados</a></button>
            </div>
                    </div>
                </form> 
        </div>
      </div>
    </div>
  </div>
   <%
            if (request.getAttribute("MensajeError") != null) {%>
        ${MensajeError}           

        <%} else {%>
        ${MensajeExito}  
        <%}%>
</section>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>
    </body>
</html>