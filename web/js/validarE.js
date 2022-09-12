/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function validarE()
{
    var NombreEmpleado, ApellidoEmpleado,TipoDocEmpleado,NumeroDocEmpleado,TelefonoCelularEmpleado,DireccionEmpleado,CorreoEmpleado,EstadoEmpleado,IdUsuarioFK;

    
    NombreEmpleado = document.getElementById("NombreEmpleado").value;
    ApellidoEmpleado = document.getElementById("ApellidoEmpleado").value;
    TipoDocEmpleado = document.getElementById("TipoDocEmpleado").value;
    NumeroDocEmpleado = document.getElementById("NumeroDocEmpleado").value;
    TelefonoCelularEmpleado = document.getElementById("TelefonoCelularEmpleado").value;
    DireccionEmpleado = document.getElementById("DireccionEmpleado").value;
    CorreoEmpleado = document.getElementById("CorreoEmpleado").value;
    EstadoEmpleado = document.getElementById("EstadoEmpleado").value;
    IdUsuarioFK = document.getElementById("IdUsuarioFK").value;
 
 
    if (NombreEmpleado===""){
        alert("El campo Nombre Empleado está vacio");
        return false;
    }
    else  if (ApellidoEmpleado===""){
        alert("El campo Apellido Empleado está vacio");
        return false;
    }
  else  if(TipoDocEmpleado===""){
         alert("El campo Tipo Doc Empleado está vacio");
        return false;
    }
    else  if (NumeroDocEmpleado===""){
        alert("El campo Numero Doc Empleado está vacio");
        return false;
    }
    else  if (TelefonoCelularEmpleado===""){
        alert("El campo Telefono Celular Empleado está vacio");
        return false;
    }
    
    else if (DireccionEmpleado===""){
        alert("El campo Direccion Empleado está vacio");
        return false;
    }
      else  if (CorreoEmpleado===""){
        alert("El campo Correo Empleado está vacio");
        return false;
    }
    else  if (EstadoEmpleado===""){
        alert("El campo Estado Empleado está vacio");
        return false;
    }
    else  if (IdUsuarioFK===""){
        alert("El campo codigo de Usuario está vacio");
        return false;
    }
    
    
    }      



