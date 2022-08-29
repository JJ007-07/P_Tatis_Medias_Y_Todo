<%
    if (rol.equals="1"){
            request.getRequestDispatcher("menu.jsp").forward(request, response) ;
        }
    if(rol.equals="2"){
            request.getRequestDispatcher("Vendedor.jsp").forward(request, response) ;
    }
    if(rol.equals="3"){
            request.getRequestDispatcher("Comprador.jsp").forward(request, response) ;
    }
%>

