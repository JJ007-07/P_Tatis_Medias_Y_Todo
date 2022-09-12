<%-- 
    Document   : registrarPedido
    Created on : 6/08/2022, 06:41:53 PM
    Author     : Alexis
--%>

<%@page import="ModeloVO.EmpresaProveedoraVO"%>
<%@page import="ModeloDAO.EmpresaProveedoraDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <script src="js/validar.js" type="text/javascript"></script>
    </head>
    <body>
    <center>
        <h1>Registrar Pedido</h1>
        <form method="post" action="Pedido"  onsubmit="return validar();">
            <table>
               
                <tr> No.Factura<br>
                <input type="text"  id="NumeroFacturaPedido" name="txtNumeroFacturaPedido" ><br>
                </tr>
                <tr>Fecha Pedido<br>
                <input type="date"  id="FechaPedido" name="txtFechaPedido"><br>
                </tr>
                <tr>Fecha Recibido<br>
                <input type="date" id="FechaRecibido" name="txtFechaRecibido"><br>
                </tr>
                <tr>Fecha Vencimiento pago<br>
                <input type="date" id="FechaVencimientoPago" name="txtFechaVencimientoPago"><br>
                </tr>
                <tr>Id Empresa Proveedora<br>
                <select name="txtIdEmpresaProveedora" id="IdEmpresaProveedoraFK">
                    <option>Seleccione una opción</option>
                    <%
                        EmpresaProveedoraDAO epDAO = new EmpresaProveedoraDAO();
                        for (EmpresaProveedoraVO epVO : epDAO.Listar()) {
                    %>
                    <option value="<%=epVO.getIdEmpresaProveedora()%>"><%=epVO.getRazonSocialEmpresaProveedora()%></option>


                    <%}%>       </select>
                    </tr><br>
                    <tr>IVA<br>
                    <input type="number" id="IVA" name="txtIVA"><br>
                    </tr>
                    <tr>Descuento <br>
                    <input type="number" Id="Descuento" name="txtDescuento"><br>
                    </tr>
                    <tr>Estado Pedido<br>
                    <select Id="EstadoPedido" name="txtEstadoPedido" >
                        <option>Seleccione una opción</option>
                        <option>Entregado</option>
                        <option>Pago</option>
                    </select> <br> <br>
                    </tr>
                    </table><br>
                    <button>Registrar pedido</button>
                    <input type="hidden"value="1"  name="opcion">

                    <button type="submit"  class="btn float-right login_btn"> <a href="ConsultarPedido.jsp"> Ver Pedidos registrados </a> </button>


                    </form><BR>
                    <%
                                if (request.getAttribute("MensajeError") != null) {%>
                    ${mensajeError} 
                    <%  } else {%>
                    ${MensajeExito}
                    <%}%>



                    </center>
                    </body>
                    </html>
