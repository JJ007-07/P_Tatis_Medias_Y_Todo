<%-- 
    Document   : consultarEmpleado
    Created on : 15/08/2022, 06:25:15 PM
    Author     : User
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.EmpleadoDAO"%>
<%@page import="ModeloVO.EmpleadoVO"%>
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
        <form method="post" action="Empleado">
            <table>
                <tr>
                    <th> Numero de documento
                        <input type="text" name="textNumDoc" >
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
                               <th>IdEmpleado</th>
                               <th>NombreEmpleado</th>
                               <th>ApellidoEmpleado</th>
                                <th>TipoDocumento</th>
                                <th>NumeroDocumento</th>
                                <th>Telefono</th>
                                <th>Direccion</th>
                                <th>Correo Electronico</th>
                                <th>Estado</th>
                                <th>IdUsuarioFK</th>
                                 
                          
                             
                           </tr>
                           <%
                                EmpleadoVO empVO= new EmpleadoVO();
                               EmpleadoDAO empDAO = new EmpleadoDAO();
                               ArrayList<EmpleadoVO> listaEmpleado=empDAO.listar();
                               for (int i = 0; i < listaEmpleado .size(); i++) {
                                       empVO =listaEmpleado.get(i);
                                   
                           %>
                           <tr>
                               <td><%=empVO.getIdEmpleado()%></td>
                               <td><%=empVO.getNombreEmpleado()%></td>
                               <td><%=empVO.getApellidoEmpleado()%></td>
                               <td><%=empVO.getTipoDocEmpleado()%></td>
                               <td><%=empVO.getNumeroDocEmpleado()%></td>
                               <td><%=empVO.getTelefonoCelularEmpleado()%></td>
                               <td><%=empVO.getDirrecionEmpleado()%></td>
                               <td><%=empVO.getCorreoEmpleado()%></td>
                               <td><%=empVO.getEstadoEmpleado()%></td>
                               <td><%=empVO.getIdUsuarioFK()%></td>
                            
                               
                               
                           </tr>
                           <%}%>
                       </table>
                   </form>
          </center>
    </body>
</html>
