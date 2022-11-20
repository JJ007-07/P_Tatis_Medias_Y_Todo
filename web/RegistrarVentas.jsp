<%@page import="ModeloVO.ClienteVO"%>
<%@include file="Sesiones.jsp"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%HttpSession Sesion = request.getSession();
    ClienteVO Cliente = new ClienteVO();
    if (Sesion.getAttribute("ClVO") != null) {
        Cliente = (ClienteVO) Sesion.getAttribute("ClVO");
    }
%>
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <script src="js/miFecha.js" type="text/javascript"></script>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

        <title>Sistema de ventas</title>
        <style>
            @media print{
                .seccion1, .btn, .columna{
                    display:none;
                }
            }
        </style>
    </head>
    <body>
       
        <div class="row">
            <div class="col-md-5 seccion1">
                <div class="card">
                    <h5 class="card-header">Datos cliente</h5>
                    <div class="card-body">
                        <form action="Venta" method="post">
                            <div class="row">
                                <div class="col-md-4 d-flex">
                                    <input type="number" name="TextNumDoc" class="form-control" placeholder="documento cliente" value="<%=Cliente.getNumeroDocCliente()%>">
                                    <input type="hidden" name="opcion" value="1">
                                    <input type="submit" value="Consultar" class="btn btn-outline-dark">
                                </div>
                                <div class="col-md-8 d-flex">
                                    <input type="text" name="TextNombre" class="form-control" placeholder="Nombre cliente" value="<%=Cliente.getNombreCliente()%>">
                                </div>
                            </div>
                            <div class="row"></div>

                        </form>
                    </div>
                </div>
                                
                                
                <div class="card">
                    <h5 class="card-header">Datos producto</h5>
                    <div class="card-body">
                        <form action="Venta" method="post">
                            <div class="row">
                                <div class="col-md-4 d-flex flex-column form-group">
                                    <input type="number" name="txtcodigoB" class="form-control" placeholder="Codigo Producto"  value="${proVO.getCodigoDeBarrasProducto()}">
                                    <input type="hidden" name="opcion" value="2">
                                    <input type="submit" value="Consultar" class="btn btn-outline-dark">
                                </div>
                        </form>
                        <form action="Venta" method="post">
                            <div class="col-md-12 d-flex form-group">
                                <input type="text" name="txtdescripcion" class="form-control" placeholder="Nombre Producto" value="${proVO.getDescripcionProducto()}">
                            </div>
                            <div class="col-md-8 d-flex form-group">
                                <input type="text" name="txtprecio" class="form-control" placeholder="$ 0000.00" value="${proVO.getPrecioUnitario()}">
                            </div>
                            <div class="col-md-8 d-flex form-group">
                                <input type="text" name="txtstock" class="form-control" placeholder="Disponible" readonly="" value="${proVO.getStockProducto()}">
                            </div>
                            
                            <div class="col-md-10 d-flex form-group">
                                <input type="number" value="1" name="texcantidad" class="form-control" placeholder="Cantidad">
                            </div>
                            
                    </div>

                    <input type="hidden" name="opcion" value="3">
                    <input type="submit" value="Registrar" class="btn btn-outline-primary col text-center">
                    <div class="row"></div>
                    </form>

                </div>
            </div>
        </div>
        <div class="col-md-7">

            <div class="card-header">
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">FECHA</label>
                    <input class="form-control col-md-4" type="date" name="textFecha" id="fechaActual" readonly>
                </div>



                <div class="card">
                    <div class="card-header">
                        <div class="form-group row">
                            <label class="col-sm-2 col-form-label">Numero de factura</label>
                            <input class="form-control col-md-4" type="text" name="textnumven" value="${Numerodeventafacturaventa}">
                        </div>

                    </div>


                    <div class="card-body">
                        <table class="table">
                            <thead class="thead-dark">
                                <tr>
                                    <th scope="col">#</th>
                                    <th scope="col">Codigo</th>
                                    <th scope="col">Descripción</th>
                                    <th scope="col">Precio</th>
                                    <th scope="col">Cantidad</th>
                                    <th scope="col">Subtotal</th>
                                    <th scope="col">Acciones</th>
                                </tr>
                            </thead>
                            <tbody>

                                <c:forEach var="list" items="${listaVentas}" varStatus="Status">
                                    <tr>
                                        <td>${Status.count}</td>
                                        <td>${list.getCodigoDeBarrasProducto()}</td>
                                        <td>${list.getDescripcionProducto()}</td>
                                        <td>${list.getPrecioPorUnidad()}</td>
                                        <td>${list.getCantidad()}</td>
                                        <td>${list.getSubtotal()}</td>
                                        <td class="d-flex">
                                            <a class="btn btn-danger">Eliminar</a>
                                            <a class="btn btn-warning" style="margin-left:10px">Editar</a>
                                        </td>
                                    </tr>
                                </c:forEach>

                            </tbody>
                        </table>
                    </div>
                        
                        <form action="Venta" method="post">
                            <div class="card">
                        <div class="card-header">
                        <div class="form-group row">
                            <label class="col-sm-2 col-form-label">Metodo de Pago</label>             
                       <select class="form-control col-md-4" name="textformaventa">
                        <option>Seleccione una opción</option>
                       <option>Efectivo</option>
                       <option>Tarjeta Visa</option>
                       <option>Tarjeta Mastercard</option>
                        <option>Tarjeta Dinner Club</option>
                        <option>Tarjeta American express</option>
                       <option>Bonos sodexo</option>
                       </select>
                           
                        </div>
                            
                             
                        
                        </form>
                    <div class="card-footer d-flex">
                        <div class="col-md-8 text-center">
                            <a class="btn btn-success"  href="Venta">Generar Venta</a>
                            <a class="btn btn-danger" href="Venta">Nueva Venta</a>

                        </div>
                        <div class="col-md-4">
                            <input type=text" name="txttotalapagar" class="form-control" placeholder="$ 00.000.00" disabled="disabled" value="$/. ${totalpagar}0">
                        </div>
                    </div>

                </div>

            </div>
        </div>
                        

        <!-- Optional JavaScript; choose one of the two! -->

        <!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>

        <!-- Option 2: jQuery, Popper.js, and Bootstrap JS
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
        -->
    </body>
</html>
