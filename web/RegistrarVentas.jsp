<%@page import="ModeloDAO.VentaDAO"%>
<%@page import="ModeloVO.ClienteVO"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%HttpSession Sesion = request.getSession();
    ClienteVO Cliente = new ClienteVO();
    if (Sesion.getAttribute("ClVO") != null) {
        Cliente = (ClienteVO) Sesion.getAttribute("ClVO");
    }
    VentaDAO vt = new VentaDAO();
%>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <script src="js/miFecha.js" type="text/javascript"></script>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link rel="stylesheet" href="./Estilos/Detalles.css">
        <script type="text/javascript" src="js/Refrescar.js"></script>
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

        <nav>

            <%@include file="Principal.jsp"%>    
        </nav>
        <div id="Espaciopls2">
            <div class="row" style="padding-left: 15%;">
                <div class="col-md-5 seccion1">
                    <div class="card">
                        <h5 class="card-header">Datos cliente</h5>
                        <div class="card-body">
                            <form action="Venta" method="post">
                                <div class="row">
                                    <div class="col-md-4 d-flex">
                                        <input type="number" name="TextNumDoc" class="form-control" placeholder="Documento cliente" required value="<%=Cliente.getNumeroDocCliente()%>">
                                        <input type="hidden" name="opcion" value="1">
                                    </div>
                                    <div class="col-md-8 d-flex">
                                        <input type="text" name="TextNombre" class="form-control" placeholder="Nombre cliente" required value="<%=Cliente.getNombreCliente()%>">
                                    </div>
                                </div>
                                <br>
                                <input type="submit" value="Consultar" class="btn btn-outline-dark col text-center">

                            </form>
                        </div>
                    </div>


                    <div class="card">
                        <h5 class="card-header">Datos producto</h5>
                        <div class="card-body">
                            <form action="Venta" method="post">
                                <div class="row">
                                    <div class="col-md-4 d-flex flex-column form-group">
                                        <input type="number" name="txtcodigoB" class="form-control" placeholder="Codigo Producto" required value="${proVO.getCodigoDeBarrasProducto()}">
                                        <input type="hidden" name="opcion" value="2">
                                        <input type="submit" value="Consultar" class="btn btn-outline-dark Distanciapls">
                                    </div>
                            </form>
                            <form action="Venta" method="post">
                                <div>

                                </div>
                                <div class="col-md-8 d-flex form-group">
                                    <input type="text" name="txtdescripcion" class="form-control" placeholder="Nombre Producto" required value="${proVO.getDescripcionProducto()}">
                                </div>
                                <div class="col-md-8 d-flex form-group">
                                    <input type="text" name="txtprecio" class="form-control" placeholder="$0000.00" required value="${proVO.getPrecioUnitario()}">
                                </div>
                                <div class="col-md-8 d-flex form-group">
                                    <input type="text" name="txtstock" class="form-control" placeholder="Disponible" readonly="" value="${proVO.getStockProducto()}">
                                </div>

                                <div class="col-md-8 d-flex form-group">
                                    <input type="number" value="1" name="texcantidad" class="form-control Rellenito"required placeholder="Cantidad">
                                </div>

                        </div>
                        <input type="hidden" name="opcion" value="3">
                        <input type="submit" value="Registrar" class="btn btn-outline-primary col text-center">
                        <div class="row"></div>
                        </form>

                    </div>
                </div>
            </div>
        </div>
        <div id="Espaciopls">

            <div class="col-md-7" style="padding-left: 15%; padding-top: 1%">

                <div class="card-header">
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">Fecha</label>
                        <input class="form-control col-md-4" type="date" name="textFecha" id="fechaActual" readonly>
                    </div>



                    <div class="card">
                        <div class="card-header">
                            <div class="form-group row">
                                <label class="col-sm-2 col-form-label">Numero de factura</label>
                                <input class="form-control col-md-4" type="text" name="textnumven" readonly value="0000<%=vt.ObtenerNumeroDeFactura()%>">
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
                                        <select class="form-control col-md-4" name="textformaventa" required="true">
                                            <option>Seleccione una opción</option>
                                            <option value="Efectivo">Efectivo</option>
                                            <option value="Tarjeta Visa">Tarjeta Visa</option>
                                            <option value="Tarjeta Mastercard">Tarjeta Mastercard</option>
                                            <option value="Tarjeta Dinner Club">Tarjeta Dinner Club</option>
                                            <option value="Tarjeta American express">Tarjeta American express</option>
                                            <option value="Bonos sodexo">Bonos sodexo</option>
                                        </select>
                                        <input type="hidden" name="textnumven" readonly value="<%=vt.ObtenerNumeroDeFactura()%>">
                                    </div>
                                    <div class="card-footer d-flex">
                                        <div class="col-md-8 text-center">
                                            <input type=hidden" name="txtTotalAPagar" value="${totalpagar}" style="display: none;">
                                            <input type="hidden" name="opcion" value="5">
                                            <input type="hidden" name="NumeroDocCliente" value="${ClVO.getNumeroDocCliente()}">
                                            <input type="submit" class="btn btn-success" value="Generar Venta" class="btn btn-outline-primary col text-center">
                                            <button class="btn btn-primary" class="btn btn-outline-primary col text-center" id="refresh">Limpiar Venta</button>
                                        </div>
                                        <div class="col-md-4">
                                            <input type=text" name="txtTotalAPagar2" class="form-control" placeholder="$00.000.00" disabled="disabled" value="${totalpagar}">
                                        </div>

                                    </div>

                                </div>
                            </div>
                    </div>
                    </form>
                </div>

                <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>

                <!-- Option 2: jQuery, Popper.js, and Bootstrap JS
                <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
                <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
                -->
                </body>
                </html>
