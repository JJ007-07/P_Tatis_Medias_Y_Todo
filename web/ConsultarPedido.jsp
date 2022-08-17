<%-- 
    Document   : ConsultarPedido
    Created on : 6/08/2022, 07:02:53 PM
    Author     : Alexis
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.PedidoVO"%>
<%@page import="ModeloDAO.PedidoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pedido</title>
    </head>
    <body>
          <center>
        <h1>Pedido</h1>
        <form method="post" action="Pedido">
            <table>
                <tr>
                    <th> Id Pedido
                        <input type="number" name="txtPedido" >
                        <button>Consultar Pedido</button>
                    </th>
                </tr>
                 
             
            </table><br><br>
            <input type="hidden"value="4"  name="opcion">
            
            
            
            
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
                               <th>IdPedido</th>
                               <th>NumeroFacturaPedido</th>
                               <th>FechaPedido</th>
                                <th>FechaRecibido</th>
                                 <th>FechaVencimientoPago</th>
                                  <th>IdEmpresaProveedoraFK</th>
                                    <th>IVA</th>
                                      <th>Descuento</th>
                                       <th>EstadoPedido</th>
                          
                             
                           </tr>
                           <%
                                PedidoVO PVO= new PedidoVO();
                               PedidoDAO PDAO= new PedidoDAO();
                               ArrayList<PedidoVO> listaPedido=PDAO.listar();
                               for (int i = 0; i < listaPedido .size(); i++) {
                                       PVO =listaPedido.get(i);
                                   
                           %>
                           <tr>
                               <td><%=PVO.getIdpedido()%></td>
                               <td><%=PVO.getNumeroFacturaPedido()%></td>
                               <td><%=PVO.getFechaPedido()%></td>
                               <td><%=PVO.getFechaRecibido()%></td>
                               <td><%=PVO.getFechaVencimientoPago()%></td>
                               <td><%=PVO.getIdEmpresaProveedoraFK()%></td>
                               <td><%=PVO.getIVA()%></td>
                               <td><%=PVO.getDescuento()%></td>
                               <td><%=PVO.getEstadoPedido()%></td>
                               
                               
                           </tr>
                           <%}%>
                       </table>
                   </form>
          </center>
    </body>
          
</html>
