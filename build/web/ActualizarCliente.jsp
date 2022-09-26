<%-- 
    Document   : ActualizarCliente
    Created on : 16/08/2022, 06:46:39 PM
    Author     : User
--%>

<%@page import="ModeloVO.ClienteVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">

        <title>JSP Page</title>
    </head>
    <body>
   
</head>
      <%
        if (request.getAttribute("clienteConsultado") != null) {
            ClienteVO ClVO = (ClienteVO) request.getAttribute("clienteConsultado");
      

    %>
<center>
<body>
  <section class="h-100 h-custom" style="background-color: #999999;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-8 col-xl-6">
        <div class="card rounded-3">
          <img src="https://www.microtech.es/hubfs/Fotos%20blog/retener_clientes.jpg"
            class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
            alt="Sample photo">
            <div class="card-body p-4 p-md-5">
                <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2"> Actualizar Información del cliente</h3>
    <div class="contenedor">      

        <center>
           
        <form class="px-md-2" method="post" action="Cliente">
            <table>
                
                <tr>
                   
                <div class="form-outline mb-4">
                <label class="form-label" for="form3Example1q">Id Cliente</label>
                <input type="Number" name="TextId" value="<%=ClVO.getIdCliente()%>" readonly class="form-control"></div>
                
               
                <div class="form-outline mb-4">
                <label class="form-label" for="form3Example1q">Nombre Cliente</label>
                <input type="text" name="TextNombre"value="<%=ClVO.getNombreCliente()%>" class="form-control"></div>
                
                <div class="form-outline mb-4">
                <label class="form-label" for="form3Example1q">Apellido Cliente</label> 
                <input type="text" name="TextApellido"value="<%=ClVO.getApellidoCliente()%>" class="form-control"></div>
                
                <div class="form-outline mb-4">
                <label class="form-label" for="form3Example1q">Tipo Documento</label>
                <input type="text" name="TextTipo"readonly="" value="<%=ClVO.getTipoDocCliente()%>" class="form-control"></div>
                  
                 <div class="form-outline mb-4">
                <label class="form-label" for="form3Example1q">Numero Document</label>
                <input type="number" name="TextNumDoc" readonly=""value="<%=ClVO.getNumeroDocCliente()%>" class="form-control"></div>
                
                <div class="form-outline mb-4">
                <label class="form-label" for="form3Example1q">Telefono Cliente</label>  
                 <input type="number" name="TextTelefono"value="<%=ClVO.getTelefonoCliente()%>"class="form-control"></div>
                    
                <div class="form-outline mb-4">
                <label class="form-label" for="form3Example1q">Direccion Cliente</label>
                <input type="text" name="TextDir"value="<%=ClVO.getDirecionCliente()%>"class="form-control"></div>
                
                <div class="form-outline mb-4">
                <label class="form-label" for="form3Example1q">Correo Cliente</label>
                <input type="email" name="TextCorreo"value="<%=ClVO.getCorreoCliente()%>"class="form-control"></div>
                
                 <div class="form-outline mb-4">
                <label class="form-label" for="form3Example1q"> Estado Cliente</label>
                <input type="text" name="TextEstado"value="<%=ClVO.getEstadoCliente()%>"class="form-control"></div>
                    
                    
                </tr>
                
                 
                    
                
            </table><br>
           
      
        <div class="form-group">	
        <input type="hidden" value="2" name="opcion" class="btn float-right login_btn">

    <button type="submit" class="btn btn-success btn-lg mb-1" class="btn float-right login_btn"  onclick="return confirm('¿Estas seguro de actualizar el cliente?')" >  Actualizar</button>
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
                                        <%}%>
                    </div>

    </body>
    </center>
</html
