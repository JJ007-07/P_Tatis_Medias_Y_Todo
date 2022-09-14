<%-- 
    Document   : registrarCliente
    Created on : 16/08/2022, 06:08:59 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cliente</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
          <script src="js/validarCl.js" type="text/javascript"></script>
    </head>

    <body style="background: #999999;">

        <section class="h-100 h-custom">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-8 col-xl-6">
        <div class="card rounded-3">
          <img src="https://concepto.de/wp-content/uploads/2013/08/cliente-e1551799486636.jpg"
            class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
            alt="Sample photo">
            <div class="card-body p-4 p-md-5">
                <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Información de Registro Clientes</h3>

        <form class="px-md-2" method="post" action="Cliente" onsubmit="return validarCl();">

            <div class="form-outline mb-4">
                <input type="text" id="Nombrecliente" name="TextNombre" class="form-control" />
                <label class="form-label" for="form3Example1q">Nombres</label>
            </div>

            <div class="form-outline mb-4">
                <input type="text" id="ApellidoCliente" name="TextApellido" class="form-control" />
                <label class="form-label" for="form3Example1q">Apellidos</label>
            </div>
            
            <div class="form-group">
                <select class="form-control" name="TextTipo" id="TipoDocCliente">
                        <option>Seleccione una opción</option>
                       <option>CC</option>
                       <option>CE</option>
                    </select>
                <label class="form-label" for="form3Example1q">Tipo Documento</label>
            </div>
             <div class="form-outline mb-4">
                 <input type="number"  id="NumeroDocCliente" name="TextNumDoc" class="form-control" />
                <label class="form-label" for="form3Example1q">Numero Documento</label>
            </div>
            <div class="form-outline mb-4">
                 <input type="number" id="TelefonoCliente" name="TextTelefono" class="form-control" />
                <label class="form-label" for="form3Example1q">Telefono</label>
            </div>
             <div class="form-outline mb-4">
                 <input type="text" id="Direccioncliente" name="TextDir" class="form-control" />
                <label class="form-label" for="form3Example1q">Direccion </label>
            </div>
              <div class="form-outline mb-4">
                 <input type="email" id="CorreoCliente" name="TextCorreo" class="form-control" />
                <label class="form-label" for="form3Example1q">Correo Electronico </label>
            </div>
             <div class="form-outline mb-4">
                 <input type="text" id="EstadoCliente" name="TextEstado" class="form-control" />
                <label class="form-label" for="form3Example1q">Estado Cliente </label>
            </div>
            <br>
            <div>   
                <input type="hidden" value="1" name="opcion">

                <button type="submit" class="btn btn-success btn-lg mb-1" onclick="return confirm('¿Estas seguro de  registrar el cliente')"> Registrarse</button>
        
                <button type="submit" class="btn btn-primary btn-lg" style="margin-bottom: 4px;"><a href="ConsultarCliente.jsp" style="color: #FFFFFF; text-decoration: none;">Ver Clientes registrados</a></button>

            </div>

        </form>
            </div>
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