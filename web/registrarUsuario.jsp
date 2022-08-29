<%-- 
    Document   : registrarUsuario
    Created on : 11/08/2022, 09:06:37 PM
    Author     : User
--%>

<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloVO.RolVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro usuario</title>
    </head>
    <body>
    <!--Bootsrap 4 CDN-->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    
    <!--Fontawesome CDN-->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

	<!--Custom styles-->
      
      <link href="Estilos/estilos2.css" rel="stylesheet" type="text/css"/>
</head>
  
<center>
<body>

    <div class="contenedor">      

        <center>
            <h1 class="titulo">Registrar Usuario</h1>
        <form method="post" action="Usuario">
            <table>
                
                <tr>
                   
                <div class="campos">Nombre </div>
                <input type="email" required="" name="textUsuario"><br><br>
                        
                    <div class="campos"> Contraseña </div>
                    
                    <input type="password" name="textClave"><br><br>
                    
                  
                    
                    <div class="campos"> Estado Usuario</div>
                    
                    <input type="text" name="textEstado"><br><br>
                    <select name="textRol">
                    <option>Seleccione Rol</option>
                    <%
                        RolDAO rolDAO = new RolDAO();
                        for(RolVO rolVO: rolDAO.listar()){
                    %> 
                    <option value="<%=rolVO.getIdRol()%>"><%=rolVO.getNombreRol()%></option>
                   <%}%>
                    </select><br><br>
                </tr>
                
                 </div>
                    
                
            </table><br>
           
      
        <div class="form-group">	
        <input type="hidden" value="1" name="opcion" class="btn float-right login_btn">
        <button type="submit" class="btn float-right login_btn" > Registrarse</button>
        </div>
        </form>
                   
        </center>
      
        </div>
      
          <div class="tres"> 
                         
                                         <% 
                                         if  (request.getAttribute("MensajeError") !=null) {%>
                                         ${MensajeError}           
               
                                         <%}else {%>
                                        ${MensajeExito}  
                                        <%}%>
                                        
                    </div>
    </body>
    </center>
</html>