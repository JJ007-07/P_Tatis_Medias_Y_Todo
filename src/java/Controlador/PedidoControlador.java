/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import ModeloDAO.EmpresaProveedoraDAO;
import ModeloDAO.ProductoDAO;
import ModeloDAO.PedidoDAO;
import ModeloVO.EmpresaProveedoraVO;
import ModeloVO.PedidoVO;
import ModeloVO.ProductoVO;
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
 * @author Alexis
 */
@WebServlet(name = "PedidoControlador", urlPatterns = {"/Pedido"})
public class PedidoControlador extends HttpServlet {

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
    private List<PedidoVO> listaPedido = new ArrayList<>();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String IdProducto = request.getParameter("txtid");
        String CodigoDeBarrasProducto = request.getParameter("txtcodigoB");
        String ReferenciaProducto = request.getParameter("txtreferencia");
        String DescripcionProducto = request.getParameter("txtdescripcion");
        String StockProducto = request.getParameter("txtstock");
        String PrecioCosto =request.getParameter("txtcosto");
        String PrecioUnitario = request.getParameter("txtprecio");
        String EstadoProducto = request.getParameter("txtestado");
        String IdCategoriaFK = request.getParameter("txtcategoria");
        String IdEmpresaProveedoraFK = request.getParameter("txtempresa");
        

     
        //2¿ Quién tien elos datos de forma segura ? VO
        ProductoVO proVO = new ProductoVO(IdProducto, CodigoDeBarrasProducto, ReferenciaProducto, DescripcionProducto, StockProducto, PrecioCosto, PrecioUnitario, EstadoProducto, IdCategoriaFK, IdEmpresaProveedoraFK);

        //3¿Quién hace las operaciones? DAO
        ProductoDAO proDAO = new ProductoDAO(proVO);
        
        
        String IdEmpresaProveedora=request.getParameter("txtid");
        String NitEmpresaProveedora=request.getParameter("txtNit");
        String RazonSocialEmpresaProveedora=request.getParameter("txtRazon");
        String NombreComercialEmpresaProveedora=request.getParameter("txtNombreC");
        String DireccionEmpresaProveedora=request.getParameter("txtDireccion");
        String TelefonoEmpresaProveedora=request.getParameter("txtTelefono");
        String Numeropago=request.getParameter("txtNumero");
        String EstadoEmpresaProveedora=request.getParameter("txtEstado");
       
        
     
        //2¿ Quién tien elos datos de forma segura ? VO
        EmpresaProveedoraVO epVO= new EmpresaProveedoraVO(IdEmpresaProveedora, NitEmpresaProveedora, RazonSocialEmpresaProveedora, NombreComercialEmpresaProveedora, DireccionEmpresaProveedora, TelefonoEmpresaProveedora, Numeropago,EstadoEmpresaProveedora);
        
        //3¿Quién hace las operaciones? DAO
                
         EmpresaProveedoraDAO epDAO = new EmpresaProveedoraDAO(epVO);
         
         
        String NumeroFacturaPedido = request.getParameter("textnumpe");
        String FechaPedido = request.getParameter("textFechap");
        String FechaRecibido = request.getParameter("textFechare");
        String FechaVencimientoPago = request.getParameter("textFechaven");
        String NitEmpresaProveedoraFK = request.getParameter("textnitempro");
      

        PedidoVO PedidoVO = new PedidoVO();

        int item = 0;

        double PrecioPorUnidad;
        int Cantidad;
        double Subtotal;
        double Totalbruto = 0;
        double IVA=0;
        double totalpagar = 0;

      
        PedidoDAO PedidoDAO = new PedidoDAO(PedidoVO);
        

        int opcion = Integer.parseInt(request.getParameter("opcion"));

        switch (opcion) {
            case 1:
                sesion = request.getSession();
                epVO.setNitEmpresaProveedora(NitEmpresaProveedora);
                epVO = epDAO.consultarNitEmpresa(NitEmpresaProveedora);
                //System.out.println("Empresa Proveedora VO" + epVO.getNitEmpresaProveedora());
                sesion.setAttribute("epVO", epVO);
                //sesion.setAttribute("proVO", proVO);
                //sesion.setAttribute("listaVentas", listaVentas);
                //sesion.setAttribute("totalpagar", totalpagar);
                request.getRequestDispatcher("IngresarPedidos.jsp").forward(request, response);

                break;

            case 2: // Consultarproducto
                sesion = request.getSession();
                proVO.setCodigoDeBarrasProducto(CodigoDeBarrasProducto);
                proVO = proDAO.consultarCodigodeBarras(CodigoDeBarrasProducto);
               
                sesion.setAttribute("proVO", proVO);
                

                request.getRequestDispatcher("IngresarPedidos.jsp").forward(request, response);
                break;

            case 3:
                sesion = request.getSession();
                Totalbruto=0.0;
                totalpagar = 0.0;
                item = item + 1;
                CodigoDeBarrasProducto = proVO.getCodigoDeBarrasProducto();
                DescripcionProducto = request.getParameter("txtdescripcion");
                PrecioPorUnidad = Float.parseFloat(request.getParameter("txtcosto"));
                Cantidad = Integer.parseInt(request.getParameter("texcantidad"));
                Subtotal = PrecioPorUnidad * Cantidad;
                PedidoVO = new PedidoVO();
                PedidoVO.setItem(item);
                //venta.setCodigoDeBarrasProductofk(CodigoDeBarrasProducto);
                PedidoVO.setCodigoDeBarrasProducto(CodigoDeBarrasProducto);
                PedidoVO.setDescripcionProducto(DescripcionProducto);
                PedidoVO.setPrecioPorUnidad(PrecioPorUnidad);
                PedidoVO.setCantidad(Cantidad);
                PedidoVO.setSubtotal(Subtotal);
                

                listaPedido.add(PedidoVO);
                for (int i = 0; i < listaPedido.size(); i++) {
                    Totalbruto = Totalbruto + listaPedido.get(i).getSubtotal();
                
             }
                IVA=Totalbruto*0.19;
                totalpagar=Totalbruto+IVA;
                
                
                sesion.setAttribute("Totalbruto", Totalbruto);
                sesion.setAttribute("IVA",IVA);
                sesion.setAttribute("totalpagar",totalpagar);
                sesion.setAttribute("listaPedido", listaPedido);
                request.getRequestDispatcher("IngresarPedidos.jsp").forward(request, response);
                break;

            
            case 4:
                //GUARDAR pedido
                sesion = request.getSession();
                ProductoVO prov= (ProductoVO)sesion.getAttribute("proVO") ;
                EmpresaProveedoraVO ep = (EmpresaProveedoraVO)sesion.getAttribute("epVO");
                PedidoVO.setNumeroFacturaPedido("textnumpe");
                PedidoVO.setFechaPedido("textFechap");
                PedidoVO.setFechaRecibido("textFechare");
                PedidoVO.setFechaVencimientoPago("textFechaven");
                //System.out.println("Nit empresa: " + ep.getNitEmpresaProveedora());
                PedidoVO.setNitEmpresaProveedoraFK(ep.getNitEmpresaProveedora());
               // System.out.println(request.getParameter("txtTotalbruto"));
                PedidoVO.setTotalBruto(Double.parseDouble(request.getParameter("txtTotalbruto")));
               // System.out.println(request.getParameter("IVA"));
                PedidoVO.setIVA(Double.parseDouble(request.getParameter("IVA")));
                PedidoVO.setDescuento("txtdescuento");
                //System.out.println(request.getParameter("txttotalapagar"));
                PedidoVO.setTotalPedido(Double.parseDouble(request.getParameter("txtTotalAPagar")));
                PedidoVO.setEstadoPedido("Recibido");
                PedidoDAO.RegistrarPedido(PedidoVO);

                //GUARDAR DETALLE pedido
               
                for (int i = 0; i < listaPedido.size(); i++) {
                    PedidoVO = new PedidoVO();
                    PedidoVO.setNumeroFacturaPedido(request.getParameter("textnumpe"));
                    //venta.setNumerodeventafacturaventa(Numerodeventafacturaventa);
                    // PedidoVO.setCodigoDeBarrasProducto(listaPedido.get(i).getCodigoDeBarrasProducto());
                    PedidoVO.setCodigoDeBarrasProducto(prov.getCodigoDeBarrasProducto());
                    PedidoVO.setPrecioPorUnidad(listaPedido.get(i).getPrecioPorUnidad());
                    PedidoVO.setCantidad(listaPedido.get(i).getCantidad());
                    PedidoVO.setSubtotal(listaPedido.get(i).getSubtotal());
                    PedidoDAO.GuardarDetallePedido(PedidoVO);
                }

                request.getRequestDispatcher("IngresarPedidos.jsp").forward(request, response);
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

 

