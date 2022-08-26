<%-- 
    Document   : ConsultarCliente
    Created on : 16/08/2022, 06:38:46 PM
    Author     : User
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.ClienteDAO"%>
<%@page import="ModeloVO.ClienteVO"%>
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
        <h1>Cliente</h1>
        <form method="post" action="Cliente">
            <table>
                <tr>
                    <th> No.Documento
                        <input type="Number" name="TextNumDoc" >
                        <button>Consultar </button>
                    </th>
                </tr>
                 
             
            </table><br><br>
            <input type="hidden" value="3"  name="opcion">
            
            
            
            
        </form><br><br>
                   <%
        if (request.getAttribute("mensajeError")  !=null) {%>
         ${mensajeError} 
           <%  }  else {%>
                   ${mensajeExito}
                   <%}%><br><br>
                   
                      <form>
                       <table border="1">
                           <tr>
                               <th>IdCliente</th>
                               <th>NombreCliente</th>
                               <th>ApellidoCliente</th>
                                <th>TipoDocCliente</th>
                                <th>NumeroDocCliente</th>
                                <th>TelefonoCliente</th>
                                <th>DireccionCliente</th>
                                <th>CorreoCliente</th>
                                <th>EstadoCliente</th>
                                 
                          
                             
                           </tr>
                           <%
                                ClienteVO ClVO= new ClienteVO();
                               ClienteDAO ClDAO= new ClienteDAO();
                               ArrayList<ClienteVO> listaCliente=ClDAO.listar();
                               for (int i = 0; i < listaCliente .size(); i++) {
                                       ClVO =listaCliente.get(i);
                                   
                           %>
                           <tr>
                               <td><%=ClVO.getIdCliente()%></td>
                               <td><%=ClVO.getNombreCliente()%></td>
                               <td><%=ClVO.getApellidoCliente()%></td>
                               <td><%=ClVO.getTipoDocCliente()%></td>
                               <td><%=ClVO.getNumeroDocCliente()%></td>
                               <td><%=ClVO.getTelefonoCliente()%></td>
                               <td><%=ClVO.getDirecionCliente()%></td>
                               <td><%=ClVO.getCorreoCliente()%></td>
                               <td><%=ClVO.getEstadoCliente()%></td>
                            
                               
                               
                           </tr>
                           <%}%>
                       </table>
                   </form>
          </center>
    </body>
</html>
