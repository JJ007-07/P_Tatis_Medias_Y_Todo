<%-- 
    Document   : EliminarCliente
    Created on : 16/08/2022, 07:31:07 PM
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
                            <img src="https://reymon.com.co/wp-content/uploads/2022/04/DSC3663-1350x900.jpg" class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;" alt="Sample photo">
                            <div class="card-body p-4 p-md-5">
                                <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Eliminar Categoría</h3>
                                <form method="post" action="Categoria">
                                    <div class="form-outline mb-4">
                                        <label class="form-label" for="form3Example1q">Id De La Categoría</label>
                                         <input max="100000" type="number" name="txtid" class="form-control" required>
                                        
                                    </div>
        
              
                        <button type="submit" class="btn btn-success btn-lg mb-1" class="btn float-right login_btn" onclick="return confirm('¿Estas seguro de eliminar está categoria?')" >Eliminar</button>
                        <input type="hidden"value="4"  name="opcion">
                    </th>
               
                 
             
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
