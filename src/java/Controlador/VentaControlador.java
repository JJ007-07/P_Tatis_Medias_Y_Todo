/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.ClienteDAO;
import ModeloDAO.EmpleadoDAO;
import ModeloDAO.ProductoDAO;
import ModeloDAO.VentaDAO;
import ModeloVO.ClienteVO;
import ModeloVO.EmpleadoVO;
import ModeloVO.ProductoVO;
import ModeloVO.Venta;
import Util.ObtenerNumeroDeFactura;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jtgt2
 */
@WebServlet(name = "VentaControlador", urlPatterns = {"/Venta"})
public class VentaControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private HttpSession sesion = null;
    private List<Venta> listaVentas = new ArrayList<>();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String IdCliente = request.getParameter("TextId");
        String NombreCliente = request.getParameter("TextNombre");
        String ApellidoCliente = request.getParameter("TextApellido");
        String TipoDocCliente = request.getParameter("TextTipo");
        String NumeroDocCliente = request.getParameter("TextNumDoc");
        String TelefonoCliente = request.getParameter("TextTelefono");
        String DireccionCliente = request.getParameter("TextDir");
        String CorreoCliente = request.getParameter("TextCorreo");
        String EstadoCliente = request.getParameter("TextEstado");

        ClienteVO ClVO = new ClienteVO(IdCliente, NombreCliente, ApellidoCliente, TipoDocCliente, NumeroDocCliente, TelefonoCliente, DireccionCliente, CorreoCliente, EstadoCliente);

        ClienteDAO ClDAO = new ClienteDAO(ClVO);

        String IdEmpleado = request.getParameter("textId");
        String NombreEmpleado = request.getParameter("textNombre");
        String ApellidoEmpleado = request.getParameter("textApellido");
        String TipoDocEmpleado = request.getParameter("textTipo");
        String NumeroDocEmpleado = request.getParameter("textNumDoc");
        String TelefonoCelularEmpleado = request.getParameter("textTelefono");
        String DirecionEmpleado = request.getParameter("textDireccion");
        String CorreoEmpleado = request.getParameter("textCorreo");
        String EstadoEmpleado = request.getParameter("textEstado");
        String IdUsuarioFK = request.getParameter("textUsuario");

        //2. ¿Quién tiene los datos de forma segura? VO
        EmpleadoVO empVO = new EmpleadoVO(IdEmpleado, NombreEmpleado, ApellidoEmpleado, TipoDocEmpleado, NumeroDocEmpleado, TelefonoCelularEmpleado, DirecionEmpleado, CorreoEmpleado, EstadoEmpleado, IdUsuarioFK);

        //3. ¿Quién hace las operaciones? DAO
        EmpleadoDAO empDAO = new EmpleadoDAO(empVO);

        String IdProducto = request.getParameter("txtid");
        String CodigoDeBarrasProducto = request.getParameter("txtcodigoB");
        String ReferenciaProducto = request.getParameter("txtreferencia");
        String DescripcionProducto = request.getParameter("txtdescripcion");
        String StockProducto = request.getParameter("txtstock");
        String PrecioCosto= request.getParameter("txtcosto");
        String PrecioUnitario = request.getParameter("txtprecio");
        String EstadoProducto = request.getParameter("txtestado");
        String IdCategoriaFK = request.getParameter("txtcategoria");
        String IdEmpresaProveedoraFK = request.getParameter("txtempresa");

        //2¿ Quién tien elos datos de forma segura ? VO
        ProductoVO proVO = new ProductoVO(IdProducto, CodigoDeBarrasProducto, ReferenciaProducto, DescripcionProducto, StockProducto, PrecioCosto, PrecioUnitario, EstadoProducto, IdCategoriaFK, IdEmpresaProveedoraFK);

        //3¿Quién hace las operaciones? DAO
        ProductoDAO proDAO = new ProductoDAO(proVO);

        String FechaventaMostrador = request.getParameter("textFecha");
        String FormaventaMostrador = request.getParameter("textformaventa");
        String EstadoVentaMostrador = request.getParameter("textestadoventa");
        String IdVentaMostradorFK = request.getParameter("texidventaFK");

        Venta venta = new Venta();

        int item = 0;

        float PrecioPorUnidad;
        int Cantidad;
        double Subtotal;

        double totalpagar = 0;

        String Numerodeventafacturaventa = request.getParameter("textnumven");
        VentaDAO ventaDAO = new VentaDAO(venta);

        int opcion = Integer.parseInt(request.getParameter("opcion"));

        switch (opcion) {
            case 1:
                sesion = request.getSession();
                ClVO.setNumeroDocCliente(NumeroDocCliente);
                ClVO = ClDAO.consultarDocumento(NumeroDocCliente);
                System.out.println("Cliente VO" + ClVO.getNumeroDocCliente());
                sesion.setAttribute("ClVO", ClVO);
                //sesion.setAttribute("proVO", proVO);
                //sesion.setAttribute("listaVentas", listaVentas);
                //sesion.setAttribute("totalpagar", totalpagar);
                request.getRequestDispatcher("RegistrarVentas.jsp").forward(request, response);

                break;

            case 2: // Consultarproducto
                sesion = request.getSession();
                proVO.setCodigoDeBarrasProducto(CodigoDeBarrasProducto);
                proVO = proDAO.consultarCodigodeBarras(CodigoDeBarrasProducto);
                //sesion.setAttribute("ClVO", ClVO);
                sesion.setAttribute("proVO", proVO);
                //sesion.setAttribute("listaVentas", listaVentas);
                //sesion.setAttribute("totalpagar", totalpagar);

                request.getRequestDispatcher("RegistrarVentas.jsp").forward(request, response);
                break;

            case 3:
                sesion = request.getSession();
                //request.setAttribute("ClVO", ClVO);
                totalpagar = 0.0;
                item = item + 1;
                //CodigoDeBarrasProductofk=proVO.getCodigoDeBarrasProducto();
                CodigoDeBarrasProducto = proVO.getCodigoDeBarrasProducto();
                DescripcionProducto = request.getParameter("txtdescripcion");
                PrecioPorUnidad = Float.parseFloat(request.getParameter("txtprecio"));
                Cantidad = Integer.parseInt(request.getParameter("texcantidad"));
                Subtotal = PrecioPorUnidad * Cantidad;
                venta = new Venta();
                venta.setItem(item);
                //venta.setCodigoDeBarrasProductofk(CodigoDeBarrasProducto);
                venta.setCodigoDeBarrasProducto(CodigoDeBarrasProducto);
                venta.setDescripcionProducto(DescripcionProducto);
                venta.setPrecioPorUnidad(PrecioPorUnidad);
                venta.setCantidad(Cantidad);
                venta.setSubtotal(Subtotal);

                listaVentas.add(venta);
                for (int i = 0; i < listaVentas.size(); i++) {
                    totalpagar = totalpagar + listaVentas.get(i).getSubtotal();
                }

                sesion.setAttribute("totalpagar", totalpagar);
                sesion.setAttribute("listaVentas", listaVentas);
                request.getRequestDispatcher("RegistrarVentas.jsp").forward(request, response);
                break;

            case 4:
                sesion = request.getSession();
                empVO.setIdEmpleado(IdEmpleado);
                empVO = empDAO.consultarCodigo(IdEmpleado);
                sesion.setAttribute("empVO", empVO);
                //sesion.setAttribute("proVO", proVO);
                //sesion.setAttribute("listaVentas", listaVentas);
                //sesion.setAttribute("totalpagar", totalpagar);
                request.getRequestDispatcher("RegistrarVentas.jsp").forward(request, response);

                break;

            case 5:
                //Actuallización de stock(error en el tipo de dato) 
                //for (int i = 0; i < listaVentas.size(); i++) {
                    //ProductoVO ProVO = new ProductoVO();
                    //int  cantidad=listaVentas.get(i).getCantidad();
                    //String Codigobarras=listaVentas.get(i).getCodigoDeBarrasProducto();
                    //proDAO.consultarCodigodeBarras(Codigobarras);
                    //int sac=ProVO.getStockProducto=Integer.parseInt(request.getParameter("txtstock"))-cantidad;
                    //proDAO.actualizarstock(CodigoDeBarrasProducto, StockProducto);
                    
                   
                    
                //}
                //GUARDAR VENTA 
                sesion = request.getSession();
                ProductoVO prov = (ProductoVO)sesion.getAttribute("proVO") ;
                ClienteVO Cli = (ClienteVO)sesion.getAttribute("ClVO");
                venta.setNumerodeventafacturaventa(Numerodeventafacturaventa);
                venta.setFechaventaMostrador("textFecha");
                venta.setIdEmpleadoFK(1);
                System.out.println("Numero Cliente: " + Cli.getNumeroDocCliente());
                venta.setNumDocClienteFK(Cli.getNumeroDocCliente());
                venta.setFormaventaMostrador(request.getParameter("textformaventa"));
                System.out.println(request.getParameter("txttotalapagar"));
                venta.setTotalventaMostrador(Double.parseDouble(request.getParameter("txtTotalAPagar")));
                venta.setEstadoVentaMostrador("Activo");
                ventaDAO.RegistrarVenta(venta);

                //GUARDAR DETALLE VENTA 
                ventaDAO.ObtenerNumeroDeFactura();
                for (int i = 0; i < listaVentas.size(); i++) {
                    venta = new Venta();
                    venta.setNumerodeventafacturaventa(request.getParameter("textnumven"));
                    venta.setCodigoDeBarrasProducto(prov.getCodigoDeBarrasProducto());
                    venta.setPrecioPorUnidad(listaVentas.get(i).getPrecioPorUnidad());
                    venta.setCantidad(listaVentas.get(i).getCantidad());
                    venta.setSubtotal(listaVentas.get(i).getSubtotal());
                    ventaDAO.GuardarDetalleVenta(venta);
                }
                request.getRequestDispatcher("RegistrarVentas.jsp").forward(request, response);
                break;


        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
