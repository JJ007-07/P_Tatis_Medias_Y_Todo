<%@page import="ModeloVO.EmpleadoVO"%>
<%@page import="ModeloDAO.EmpleadoDAO"%>
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

<center>
    <body>
        <%
            if (request.getAttribute("empleadoConsultado") != null) {
                EmpleadoVO empVO = (EmpleadoVO) request.getAttribute("empleadoConsultado");


        %>
        <div class="contenedor">    
         <section class="h-100 h-custom" style="background-color: #999999;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-8 col-xl-6">
        <div class="card rounded-3">
          <img src="https://blog.debmedia.com/wp-content/uploads/2020/02/Atenci%C3%B3n-al-cliente-1.jpg"
            class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
            alt="Sample photo">
            <div class="card-body p-4 p-md-5">
                <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Actualizar informacion del empleado</h3>

         
                <form method="post" action="Empleado">
                    <table>

                        <tr>

                    <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example1q">Codigo Empleado</label>
                        <input type="text"  name="textId" value="<%=empVO.getIdEmpleado()%>"class="form-control">
                    </div>

                    <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example1q">Nombre Empleado</label>
                        <input type="text"  name="textNombre" value="<%=empVO.getNombreEmpleado()%>"class="form-control">
                    </div>
                        
                    <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example1q">Apellido Empleado</label>
                        <input type="text" name="textApellido" value="<%=empVO.getApellidoEmpleado()%>"class="form-control">
                    </div>

                    <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example1q">Tipo Empleado</label>
                        <input type="text" name="textTipo" value="<%=empVO.getTipoDocEmpleado()%>"class="form-control">
                    </div>

                    <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example1q">Numero Documento</label>
                        <input type="number" name="textNumDoc" readonly="" value="<%=empVO.getNumeroDocEmpleado()%>"class="form-control">
                    </div>
                     
                   <div class="form-outline mb-4">
                       <label class="form-label" for="form3Example1q"> Telefono Empleado</label>
                       <input type="number" name="textTelefono" value="<%=empVO.getTelefonoCelularEmpleado()%>"class="form-control">
                   </div>
            
                    <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example1q">Direccion Empleado</label>
                        <input type="text" name="textDireccion" value="<%=empVO.getDirecionEmpleado()%>"class="form-control">
                    </div>
                 
                    <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example1q">Correo Empleado</label>
                        <input type="email" name="textCorreo" value="<%=empVO.getCorreoEmpleado()%>"class="form-control">
                    </div>
                        
                    <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example1q">Estado Empleado</label>
                        <input type="text" name="textEstado" value="<%=empVO.getEstadoEmpleado()%>"class="form-control">
                    </div>

                    <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example1q">Id Usuario FK</label>
                        <input type="text" name="textUsuario" readonly="" value="<%=empVO.getIdUsuarioFK()%>"class="form-control">
                    </div>

                        </tr>

                        </div>


                    </table><br>


                    <div class="form-group">	
                        <input type="hidden" value="2" name="opcion" class="btn float-right login_btn">
                        <button type="submit" class="btn btn-success btn-lg mb-1" class="btn float-right login_btn"  onclick="return confirm('¿Estas seguro de actualizar el empleado')"> Actualizar</button>
                    </div>
                </form>

            </center>

        </div>



            <%
                                             if (request.getAttribute("mensajeExito") != null) {%>
            ${mensajeExito}           

            <%} else {%>
            ${mensajeError}  
            <%}%>
            <%}%>
        </div>
    </body>
</center>
</html>
