<%-- 
    Document   : ModalPedido
    Created on : 11/09/2022, 02:07:53 PM
    Author     : Alexis
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Util.ConexionDB"%>
<%@page import="Util.ConexionDB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                      <%
    ConexionDB con = new ConexionDB();
    Statement smt;
    ResultSet rs;
    smt = con.obtenerConexion().createStatement();
    rs = smt.executeQuery("select IdPedido from pedido");
%>
        <h1>Id Disponibles</h1>
          <%
                while(rs.next()){
            %>
            <tr>
                <td><%= rs.getString("IdPedido")%></td>
            </tr>
            <%}%>
    </body>
</html>
