<%@page import="ModeloVO.CategoriaVO"%>
<%@include file="Sesiones.jsp"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar</title>
    </head>
    <body>
   
        <%
        if(request.getAttribute("CategoriaConsultada") != null)
{
   CategoriaVO CVO=(CategoriaVO)request.getAttribute("CategoriaConsultada");
    

%>
   <center>
<form method="post" action="Categoria">
            <table>
                <tr>
                    <th>
                        
                    Id Categoria<br>
                    <input type="number" readonly read name="txtid" value="<%= CVO.getIdCategoria()%>"><br><br>
                      Nombre Categoria<br>
                    <input type="text" readonly read name="txtNombre" value="<%= CVO.getNombreCategoria()%>"><br><br>
         
                    
                    
                
                
                </th>
                </tr>
            </table><br>
             <button onclick="return confirm('¿Estas seguro de actualizar esta categoria?')">Actualizar</button>
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

