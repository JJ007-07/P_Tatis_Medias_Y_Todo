<%-- 
    Document   : EliminarUsuario
    Created on : 12/08/2022, 10:35:46 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <title>Eliminar</title>
    </head>
     <body>
        <body style="background-color: #999999;">
        <section class="h-100 h-custom">
            <div class="container py-5 h-100">
                <div class="row d-flex justify-content-center align-items-center h-100">
                    <div class="col-lg-8 col-xl-6">
                        <div class="card rounded-3">
                            <img src="https://i0.wp.com/www.nachomadrid.com/wp-content/uploads/2020/03/perfiles_usuario.jpg?fit=1024%2C478&ssl=1" class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;" alt="Sample photo">
                            <div class="card-body p-4 p-md-5">
                                <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Eliminar Usuario</h3>
                <center>
        
        <form method="post" action="Usuario">
            <table>
                <tr>
                    <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example1q">Id Usuario</label>
                    <input type="text" name="textId" class="form-control">
                    </div>
                        <button type="submit" class="btn btn-success btn-lg mb-1" onclick="return confirm('¿Estas seguro de  eliminar este Usuario')">Eliminar</button>
                        <input type="hidden"value="5"  name="opcion">
                    </th>
                </tr>
                 
             
            </table><br><br>
            
            
            
            
            
        </form><br><br>
               <%
        if (request.getAttribute("MensajeError")  !=null) {%>
         ${MensajeError} 
           <%  }  else {%>
                   ${MensajeExito}
                   <%}%><br><br>
    </body>
</html>
