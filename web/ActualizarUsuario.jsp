<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloVO.RolVO"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!------ Include the above in your HEAD tag ---------->

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Jsp Page</title>
   <body style="background-color: #999999;">
             <section class="h-100 h-custom" >
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-8 col-xl-6">
        <div class="card rounded-3">
            <img src="https://i0.wp.com/www.nachomadrid.com/wp-content/uploads/2020/03/perfiles_usuario.jpg?fit=1024%2C478&ssl=1 "
            class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
            alt="Sample photo">
            <div class="card-body p-4 p-md-5">
                <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Actualizar Usuario</h3>
    </head>

    <%
        if (request.getAttribute("usuarioConsultado") != null) {
            UsuarioVO usuVO = (UsuarioVO) request.getAttribute("usuarioConsultado");
<<<<<<< HEAD
           
=======
          
>>>>>>> origin/Jessika

    %>
    <center>
        <body>
            
            <form method="post" action="Usuario">
                <table>

                    <tr>
                <div class="form-outline mb-4"> 
                <label class="form-label" for="form3Example1q">Id Usuario</label>
                <input type="text" readonly name="textId" value="<%=usuVO.getIdUsuario()%>" class="form-control">
                </div>


                <div class="form-outline mb-4"> 
                <label class="form-label" for="form3Example1q">Nombre Usuario</label>
                <input type="text" name="textUsuario" value="<%=usuVO.getNombreUsuario()%>"class="form-control"></div>


                   
                <div class="form-outline mb-4"> 
                <label class="form-label" for="form3Example1q">Contraseña</label>
                <input type="password" name="textClave" value="<%=usuVO.getPasswordUsuario()%>" class="form-control">
                </div>

                   
                   <div class="form-outline mb-4"> 
                <label class="form-label" for="form3Example1q">Estado Usuario</label>
                <input type="Text" name="textEstado" value="<%=usuVO.getEstadoUsuario()%>" class="form-control">
                   </div>
                    
                     <div class="form-group">
                     <label class="form-label" for="form3Example1q">Rol</label>
                    <select name="txtrol" class="form-control"  >
                        <option>Seleccione una opción</option>
                        <%
                            RolDAO roDAO = new RolDAO();
                            for(RolVO rolVO : roDAO.listar()) {
                         %>
                         <option value="<%=rolVO.getIdRol()%>"><%=rolVO.getTipoRol()%></option>
                   
                    
                                 
                                 
                          <%}%>       
                    </select> <br> <br>
                   
                    </select><br><br> </div>
                    </tr>


                </table><br>
                <button type="submit" class="btn btn-success btn-lg mb-1"  onclick="return confirm('¿Estas seguro de actualizar el usuario?')"> Actualizar Usuario</button>
                <input type="hidden" value="2" name="opcion">



            </form>
           
       <%
         if (request.getAttribute("MensajeError") != null) {%>
                ${MensajeError}
           <% }else{ %>
           ${MensajeExito}
           <%}%>
        <% } %>

            </div>
    </center>
</body>
</html>