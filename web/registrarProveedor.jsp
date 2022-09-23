<%-- 
    Document   : registrarProducto
    Created on : 3/08/2022, 04:35:47 PM
    Author     : jtgt2
--%>

<%@page import="ModeloVO.EmpresaProveedoraVO"%>
<%@page import="ModeloDAO.EmpresaProveedoraDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Proveedor</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
       <script src="js/validarPR.js" type="text/javascript"></script>
       <link href="Estilos/2.css" rel="stylesheet" type="text/css"/>
      
</head>
  
<center>
<body>
    
     <section class="h-100 h-custom" style="background-color: #999999;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-8 col-xl-6">
        <div class="card rounded-3">
            <img src="https://www.emagister.com/blog/wp-content/uploads/2020/01/proveedor-empresa-kraken.jpg "
            class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
            alt="Sample photo">
            <div class="card-body p-4 p-md-5">
                <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Información de Registro Proveedor</h3>

    <div class="contenedor">      

        <center>
           
            <form class="px-md-2" method="post" action="EmpresaProveedora" onsubmit="return validarPR();">
            <table>
                
                <tr>
               <div class="form-label-group"> 
                <label class="form-label" for="NitEmpresaProveedora">Nit Empresa</label>
                <input type="number"  id="NitEmpresaProveedora" name="txtNit" class="form-control"/>
                
                </div>        
                
                <div class="form-label-group">
                    <label class="form-label" for="RazonSocialEmpresaProveedora">Razon social Empresa</label>
                    <input type="text" id="RazonSocialEmpresaProveedora" name="txtRazon" class="form-control"/>
                     
                </div>
                
                <div class="form-label-group">
                    <label class="form-label" for="form3Example1q">Nombre Comercial</label>
                    <input type="text" id="NombreComercialEmpresaProveedora" name="txtNombreC" class="form-control"/>
                    
                </div>
                
                <div class="form-label-group">
                    <label class="form-label" for="form3Example1q">Direccion De empresa</label>
                    <input type="text" id="DireccionEmpresaProveedora" name="txtDireccion" class="form-control"/>
                    
                </div>
               
                <div class="form-outline mb-4">
                     <label class="form-label" for="TelefonoEmpresaProveedora">Telefono empresa</label>
                    <input type="number" id="TelefonoEmpresaProveedora" name="txtTelefono" class="form-control">
                   
                </div>
                
              <div class="form-label-group">
                     <label class="form-label" for="Numeropago">Numero de pago</label>
                <input type="text" id="Numeropago" name="txtNumero" class="form-control">
               
                </div>
                
                <div class="form-label-group">
                     <label class="form-label" for="EstadoEmpresaProveedora">Estado del Proveedor</label>
               <select  name="txtEstado" id="EstadoEmpresaProveedora" class="form-control">
                        <option value="1" disabled>Seleccionar una opción disponible</option>
                        <option value="2">Activo</option>
                        <option value="3">Inactivo</option>
                    </select> 
                   
                </div>
                <br>
                </tr>
                  </table><br>
                 
        </form>
                     <div>
                                         <input type="hidden" value="1" name="opcion">
                                         <button type="submit" class="btn btn-success btn-lg mb-1" onclick="return confirm('¿Estas seguro de registrar este proveedor?')"  > Registrar Proveedor</button>
                                         <button type="submit" class="btn btn-primary btn-lg" style="margin-bottom: 4px;"><a href="ConsultarProveedor.jsp" style="color: #FFFFFF; text-decoration: none;">Ver proveedores registrados</a></button>
                                         
                                        
                                        
                                        </div>
                         
                                         <% 
                                         if  (request.getAttribute("MensajeError") !=null) {%>
                                         ${MensajeError}           
               
                                         <%}else {%>
                                        ${MensajeExito}  
                                        <%}%>
                                        
                    </div>
      
        </center>
      
        </div>
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>
    </body>
    </center>
</html>