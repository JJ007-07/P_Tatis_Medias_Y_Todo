<%@page import="ModeloVO.UsuarioVO"%>
<%
    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-control", "no-cache, no-store,must-revalidate");
    response.setDateHeader("Expires", 0);


%>


<%         HttpSession sesion = (HttpSession) request.getSession();
    String Usuario = "";
    if (sesion.getAttribute("datosUsuario") == null) {
        request.getRequestDispatcher("Login.jsp").forward(request, response);

    } else {

        UsuarioVO usuVO = (UsuarioVO) sesion.getAttribute("datosUsuario");
        Usuario = usuVO.getNombreUsuario();

    }
%>

