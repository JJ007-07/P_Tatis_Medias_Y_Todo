<%-- 
    Document   : ConsultarUsuario
    Created on : 12/08/2022, 05:26:13 PM
    Author     : User
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="Estilos/estilos2.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar</title>
    </head>
  <body>
          <center>
        <h1>Usuario</h1>
        <form method="post" action="Usuario">
            <table>
                <tr>
                    <th> Nombre Usuario
                        <input type="text" name="textUsuario" >
                        <button>Consultar </button>
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
                   
                      <form>
                       <table border="1">
                           <tr>
                               <th>IdUsuario</th>
                               <th>NombreUsuario</th>
                               <th>EstadoUsuario</th>
                           
                                 
                          
                             
                           </tr>
                           <%
                                UsuarioVO usuVO= new UsuarioVO();
                               UsuarioDAO usuDAO= new UsuarioDAO();
                               ArrayList<UsuarioVO> listaUsuario=usuDAO.listar();
                               for (int i = 0; i < listaUsuario .size(); i++) {
                                       usuVO =listaUsuario.get(i);
                                   
                           %>
                           <tr>
                               <td><%=usuVO.getIdUsuario()%></td>
                               <td><%=usuVO.getNombreUsuario()%></td>
                               <td><%=usuVO.getEstadoUsuario()%></td>
                              
                            
                               
                               
                           </tr>
                           <%}%>
                       </table>
                   </form>
          </center>
    </body>
</html>
