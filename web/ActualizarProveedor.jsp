<%-- 
    Document   : ActualizarProducto
    Created on : 3/08/2022, 09:26:19 PM
    Author     : jtgt2
--%>

<%@page import="ModeloDAO.EmpresaProveedoraDAO"%>
<%@page import="ModeloVO.EmpresaProveedoraVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!------ Include the above in your HEAD tag ---------->

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
        <title>Actualizar </title>
        

    </head>
    <a href="ConsultarProveedor.jsp"> <img src="IMG/backward_arrow_4020.png" alt="" width="50px"/></a>  
       

    <%
        if (request.getAttribute("EmpresaConsultada") != null) {
            EmpresaProveedoraVO epVO = (EmpresaProveedoraVO) request.getAttribute("EmpresaConsultada");


    %>
    <center>
        <body style="background-color: #999999;">
             <section class="h-100 h-custom" >
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-8 col-xl-6">
        <div class="card rounded-3">
            <img src="https://www.emagister.com/blog/wp-content/uploads/2020/01/proveedor-empresa-kraken.jpg "
            class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
            alt="Sample photo">
            <div class="card-body p-4 p-md-5">
                <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Actualizar Proveedor</h3>
            
            <form method="post" action="EmpresaProveedora">
                <table>
                    
                    <input type="hidden" readonly read name="txtid" value="<%=epVO.getIdEmpresaProveedora()%>"class="form-control">

                    
                    <div class="form-outline mb-4"> 
                     <label class="form-label" for="form3Example1q">Nit Empresa</label>
                    <input type="text" readonly read name="txtNit" value="<%=epVO.getNitEmpresaProveedora()%>"class="form-control">
                    </div>


                    <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example1q">Razon social Empresa</label>
                    <input type="text" readonly read name="txtRazon" value="<%=epVO.getRazonSocialEmpresaProveedora()%>"class="form-control">
                    </div>


                   
                    <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example1q">Nombre Comercial</label>
                    <input type="text"  name="txtNombreC" value="<%=epVO.getNombreComercialEmpresaProveedora()%>"class="form-control">
                    </div>

                    
                      <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example1q">Direccion De empresa</label>
                    <input type="text" name="txtDireccion" value="<%=epVO.getDireccionEmpresaProveedora()%>"class="form-control">
                      </div>

                    <div class="form-outline mb-4">
                     <label class="form-label" for="form3Example1q">Telefono empresa</label>
                    <input type="number" name="txtTelefono" value="<%=epVO.getTelefonoEmpresaProveedora()%>"class="form-control">
                    </div>

                     <div class="form-outline mb-4">
                     <label class="form-label" for="form3Example1q">Numero de pago</label>
                    <input type="text" name="txtNumero" value="<%=epVO.getNumeropago()%>"class="form-control">
                     </div>
                   
                    
                    
                    <div class="form-group">
                     <label class="form-label" for="form3Example1q">Estado del Proveedor</label>
                    <input type="text" name="txtEstado" value="<%=epVO.getEstadoEmpresaProveedora()%>" class="form-control">
                    </div>
                   

                    </tr>


                </table><br>
                <button type="submit" class="btn btn-success btn-lg mb-1"onclick="return confirm('¿Estas seguro de actualizar este proveedor?')"> Actualizar Infomrmación</button>
                <input type="hidden" value="2" name="opcion">



            </form>

            <%
           if (request.getAttribute("MensajeError") != null) {%>
            ${MensajeError}
            <% } else { %>
            ${MensajeExito}
            <%}%>


            <% }%>

            </div>
    </center>
</body>
</html>