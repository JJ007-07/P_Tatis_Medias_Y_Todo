/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validarCl()
{
    var NombreCliente, ApellidoCliente,TipoDocCliente,NumeroDocCliente,TelefonoCliente,DireccionCliente,CorreoCliente,EstadoCliente;

    
    NombreCliente = document.getElementById("NombreCliente").value;
    ApellidoCliente = document.getElementById("ApellidoCliente").value;
    TipoDocCliente = document.getElementById("TipoDocCliente").value;
    NumeroDocCliente =document.getElementById("NumeroDocCliente").value;
    TelefonoCliente = document.getElementById("TelefonoCliente").value;
    DireccionCliente = document.getElementById("DireccionCliente").value;
    CorreoCliente = document.getElementById("CorreoCliente").value;
    EstadoCliente = document.getElementById("EstadoCliente").value;
    
 
 
    if (NombreCliente===""){
        alert("El campo Nombre  cliente está vacio");
        return false;
    }
    else  if (ApellidoCliente===""){
        alert("El campo Apellido cliente  está vacio");
        return false;
    }
  else  if (TipoDocCliente===""){
         alert("El campo Tipo Doc cliente está vacio");
        return false;
    }
    else  if (NumeroDocCliente===""){
        alert("El campo Numero Doc cliente está vacio");
        return false;
    }
    else  if (TelefonoCliente===""){
        alert("El campo Teléfono cliente está vacio");
        return false;
    }
    
    else if (DireccionCliente===""){
        alert("El campo Direccion cliente  está vacio");
        return false;
    }
      else  if (CorreoCliente===""){
        alert("El campo Correo cliente  está vacio");
        return false;
    }
    else  if (EstadoCliente===""){
        alert("El campo Estado cliente está vacio");
        return false;
    }
   
    }      






