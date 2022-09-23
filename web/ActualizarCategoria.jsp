<%@page import="ModeloVO.CategoriaVO"%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
        <title>Actualizar</title>
    </head>
    <body>
   
        <%
        if(request.getAttribute("CategoriaConsultada") != null)
{
   CategoriaVO CVO=(CategoriaVO)request.getAttribute("CategoriaConsultada");
    

%>

        <section class="h-100 h-custom" style="background-color: #999999;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-8 col-xl-6">
        <div class="card rounded-3">
          <img src="https://reymon.com.co/wp-content/uploads/2022/04/DSC3663-1350x900.jpg"
            class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
            alt="Sample photo">
            <div class="card-body p-4 p-md-5">
                <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Información de Actualizar Categoria</h3>

<form class="px-md-2" mmethod="post" action="Categoria">
            <table>
                <tr>
                    <th>
                         <div class="form-outline mb-4">
                         <label class="form-label" for="form3Example1q">Id Categoría</label>
                         <input type="number" readonly read name="txtid" value="<%= CVO.getIdCategoria()%>" class="form-control">
                         </div>
                         
                         <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example1q">Nombre Categoría</label>
                        <input type="text" readonly read name="txtNombre" value="<%= CVO.getNombreCategoria()%>" class="form-control">
                         </div>
         
                    
                    
                
                
                </th>
                </tr>
            </table><br>
             <button  type="submit" class="btn btn-success btn-lg mb-1" onclick="return confirm('¿Estas seguro de actualizar esta categoria?')">Actualizar</button>
            <input type="hidden" value="2" name="opcion">
</form><br><br></center>



       <%
         if (request.getAttribute("MensajeError") != null) {%>
                ${MensajeError}
           <% }else{ %>
           ${MensajeExito}
           <%}%>
           
     
        <% } %>
</body>
</html>

