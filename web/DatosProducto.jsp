<%@page import="Util.ConexionDB"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.ProductoVO"%>
<%@page import="ModeloDAO.ProductoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
            <html lang="es" >
    <head>
        <meta charset="UTF-8">
        <title>Usuario general</title>
        <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>
        <link rel='stylesheet' href='https://cdn.datatables.net/1.10.12/css/dataTables.bootstrap.min.css'>
        <link rel='stylesheet' href='https://cdn.datatables.net/buttons/1.2.2/css/buttons.bootstrap.min.css'><link rel="stylesheet" href="./css/DataT.css">

    </head>
    
    <body>  
        <a href="ConsultarProducto.jsp"> <img src="IMG/backward_arrow_4020.png" alt="" width="50px"/></a> 
        
        <%
                ConexionDB con = new ConexionDB();
                Statement smt;
                ResultSet rs;
                smt = con.obtenerConexion().createStatement();
                rs = smt.executeQuery("select * from producto");
            %>
        
        <table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
            <thead>
                <tr>
                   <th >Codigos Disponibles</th>
                                        <th >Referencia</th>
                                        <th >Descripcion</th>
                                        <th >Stock disponible</th>
                                        <th >Precio por unidad</th>
                    
                    <th style="text-align:center;width:100px;">add<button type="button" data-func="dt-add" class="btn btn-success btn-xs dt-add">
                            <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
                        </button></th>
                </tr>
            </thead>
             <%--<%
                                UsuarioVO usuVO = new UsuarioVO();
                                 UsuarioDAO usuDAO = new UsuarioDAO();
                                ArrayList<UsuarioVO> listaUsuarios = usuDAO.listar();
                                for (int i = 0; i < listaUsuarios.size(); i++) {
                                       usuVO = listaUsuarios.get(i);
                            %>  --%>
            <tbody>
             <%
                                    while (rs.next()) {
                                %>
                <tr>
                  <td ><%= rs.getString("CodigoDeBarrasProducto")%></td>
                                    <td ><%= rs.getString("ReferenciaProducto")%></td>
                                    <td ><%= rs.getString("DescripcionProducto")%></td>
                                    <td ><%= rs.getString("StockProducto")%></td>
                                    <td ><%= rs.getString("PrecioUnitario")%></td>
                          
                    <td>
                        <button type="button"  class="btn btn-primary btn-xs dt-edit" style="margin-right:16px; ">
                            <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                            
                        </button>
                        <button type="button" class="btn btn-danger btn-xs dt-delete">
                            <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                        </button>
                    </td>
                      
                 
                </tr>
                <%}%> 
                

            </tbody>
           
        </table>
  
        <!-- Modal -->
        <div id="myModal" class="modal fade" role="dialog">
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Row information</h4>
                    </div>
                    <div class="modal-body">

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div>

            </div>
            
        </div>
        <!-- partial -->
        <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js'></script>
        <script src='https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js'></script>
        <script src='https://cdn.datatables.net/buttons/1.2.2/js/dataTables.buttons.min.js'></script>
        <script src='https://cdn.datatables.net/buttons/1.2.2/js/buttons.colVis.min.js'></script>
        <script src='https://cdn.datatables.net/buttons/1.2.2/js/buttons.html5.min.js'></script>
        <script src='https://cdn.datatables.net/buttons/1.2.2/js/buttons.print.min.js'></script>
        <script src='https://cdn.datatables.net/1.10.12/js/dataTables.bootstrap.min.js'></script>
        <script src='https://cdn.datatables.net/buttons/1.2.2/js/buttons.bootstrap.min.js'></script>
        <script src='https://cdnjs.cloudflare.com/ajax/libs/jszip/2.5.0/jszip.min.js'></script>
        <script src='https://cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/vfs_fonts.js'></script>
        <script src='https://cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/pdfmake.min.js'></script>
        <script src='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js'></script><script  src="./js/DataT.js"></script>

    </body>
    
</html>
