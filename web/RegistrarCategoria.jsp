<%-- 
    Document   : RegistrarCategoria
    Created on : 9/08/2022, 05:00:53 PM
    Author     : jtgt2
--%>

<%@page import="ModeloVO.EmpresaProveedoraVO"%>
<%@page import="ModeloDAO.EmpresaProveedoraDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Categoria</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
        <script src="js/validarC.js" type="text/javascript"></script>
       
    </head>
<section class="h-100 h-custom" >
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-8 col-xl-6">
        <div class="card rounded-3">
          <img src="https://reymon.com.co/wp-content/uploads/2022/04/DSC3663-1350x900.jpg"
            class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
            alt="Sample photo">
            <div class="card-body p-4 p-md-5">
                <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Información de Registrar Categoria</h3>
    <center>
        <body style="background-color: #999999;">

            <div class="contenedor">      

                <center>
                    
                    <form class="px-md-2" method="post" action="Categoria" onsubmit="return validarC();">
                        <table>

                            <tr>
                           <div class="form-outline mb-4">
                               <label class="form-label" for="form3Example1q">Nombre categoría</label>
                            <input type="text" id="NombreCategoria" name="txtNombre" class="form-control"/>
                            
                                </tr>

                            </div>


                        </table><br>
                        
                    </form>
                    <div class="form-group">	
                            <input type="hidden" value="1" name="opcion" >
                            <button type="submit" class="btn btn-success btn-lg mb-1" onclick="return confirm('¿Estas seguro de registrar esta categoría?')"  > Registrar Categoría</button>
                            <button type="submit" class="btn btn-primary btn-lg" style="margin-bottom: 4px;"><a href="ConsultarCategoria.jsp" style="color: #FFFFFF; text-decoration: none;">Ver categorias registradas</a></button>
                            


                            
                        </div>
                    <div class="tres"> 

                        <%
                                             if (request.getAttribute("MensajeError") != null) {%>
                        ${MensajeError}           

                        <%}else {%>
                        ${MensajeExito}  
                        <%}%>
                    </div>
                </center>
            </div>
        </body>
    </center>
</html>