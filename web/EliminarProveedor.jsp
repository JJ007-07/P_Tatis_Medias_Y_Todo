<%-- 
    Document   : EliminarPedido
    Created on : 6/08/2022, 08:28:44 PM
    Author     : Alexis
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
                            <img src="https://www.emagister.com/blog/wp-content/uploads/2020/01/proveedor-empresa-kraken.jpg" class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;" alt="Sample photo">
                            <div class="card-body p-4 p-md-5">
                                <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Eliminar Proveedor</h3>
                               
        
                <center>
        
        <form method="post" action="EmpresaProveedora">
            <table>
                <tr>
                    <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example1q">Id Empresa</label>
                        <input  name="txtid" class="form-control">
                    </div>
                        
                        
                        <button type="submit" class="btn btn-success btn-lg mb-1"   onclick="return confirm('¿Estas seguro de  eliminar este producto')">Eliminar</button>
                    </th>
                </tr>
                 
             
            </table><br><br>
            <input type="hidden"value="3"  name="opcion">
            
            
            
            
        </form><br><br>
               <%
        if (request.getAttribute("MensajeError")  !=null) {%>
         ${MensajeError} 
           <%  }  else {%>
                   ${MensajeExito}
                   <%}%><br><br>
    </body>
</html>

