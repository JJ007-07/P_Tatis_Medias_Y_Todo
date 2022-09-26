<%-- 
    Document   : EliminarEmpleado
    Created on : 16/08/2022, 07:34:39 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
        <title>Eliminar</title>
    </head>
     <body>
    <section class=    "h-100 h-custom" style="background-color: #999999;">
  <div class="container py-5 h-100">
  <div class="row d-flex justify-content-center align-items-center h-100">
  <div class="col-lg-8 col-xl-6">
  <div class="card rounded-3">
  <img src="https://blog.debmedia.com/wp-content/uploads/2020/02/Atenci%C3%B3n-al-cliente-1.jpg"
  class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
   alt="Sample photo">
   <div class="card-body p-4 p-md-5">
   <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Eliminar empleado</h3>
                
        
        <form method="post" action="Empleado">
            <table>
               <div class="form-outline mb-4">     
                 <label class="form-label" for="form3Example1q">No.Documento</label>
                  
                 <input type="text" name="textNumDoc" class="form-control">
               </div>
                        <button type="submit" class="btn btn-success btn-lg mb-1"  onclick="return confirm('¿Estas seguro de eliminar el empleado?')" >Eliminar</button>
                        <input type="hidden"value="4"  name="opcion">
                    
                
                 
             
            </table><br><br>
            
            
            
            
            
        </form><br><br>
               <%
        if (request.getAttribute("mensajeError")  !=null) {%>
         ${mensajeError} 
           <%  }  else {%>
                   ${mensajeExito}
                   <%}%><br><br>
    </body>
</html>

