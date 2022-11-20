<%-- 
    Document   : ReporteVenta Diaria
    Created on : 24/09/2022, 04:59:22 PM
    Author     : 57314
--%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.*" %>
<%@page import="java.io.File"%>
<%@page import="java.sql.*"%>
<%@page import="Util.ConexionDB"%>
<%@page import="net.sf.jasperreports.engine.JasperRunManager" %>
<%@page import="net.sf.jasperreports.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        //Variablasa utilizar
          Connection cn;
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tatis_media_y_todo", "root", "");
	
            File reportFile = new File(application.getRealPath("Reportes/ReporteMensual.jasper"));
            Map parameters = new HashMap();
              

            //parameters.put("nombre_del_parametro_jasper", "valor que se manda");
   
                byte[] bytes = JasperRunManager.runReportToPdf(reportFile.getPath(), parameters, cn);
            response.setContentType("application/pdf");
            response.setContentLength(bytes.length);
            ServletOutputStream outputStream = response.getOutputStream();
            outputStream.write(bytes, 0, bytes.length);
            outputStream.flush();
            outputStream.close();
  
  

    %>
        
    </body>
</html>
