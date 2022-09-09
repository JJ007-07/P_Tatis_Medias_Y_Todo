/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validarPR()
{
    var NitEmpresaProveedora,RazonSocialEmpresaProveedora,NombreComercialEmpresaProveedora,DireccionEmpresaProveedora,TelefonoEmpresaProveedora,Numeropago,EstadoEmpresaProveedora;

    
    NitEmpresaProveedora = document.getElementById("NitEmpresaProveedora").value;
    RazonSocialEmpresaProveedora = document.getElementById("RazonSocialEmpresaProveedora").value;
    NombreComercialEmpresaProveedora= document.getElementById("NombreComercialEmpresaProveedora").value;
    DireccionEmpresaProveedora=document.getElementById("DireccionEmpresaProveedora").value;
    TelefonoEmpresaProveedora = document.getElementById("TelefonoEmpresaProveedora").value;
    Numeropago = document.getElementById("Numeropago").value;
    EstadoEmpresaProveedora = document.getElementById("EstadoEmpresaProveedora").value;
   
    


    if (NitEmpresaProveedora===""){
        alert("El campo Nit Empresa Proveedora está vacio");
        return false;
    }
    else  if (RazonSocialEmpresaProveedora===""){
        alert("El campo Razon Social Empresa Proveedora está vacio");
        return false;
    }
  else  if(NombreComercialEmpresaProveedora===""){
         alert("El campo nombre Comercial del proveedor está vacio");
        return false;
    }
    else  if (DireccionEmpresaProveedora===""){
        alert("El campo Direccion Empresa Proveedora está vacio");
        return false;
    }
    else  if (TelefonoEmpresaProveedora===""){
        alert("El campo Telefono Empresa Proveedora está vacio");
        return false;
    }
    
    else if (Numeropago===""){
        alert("El campo Numero pago está vacio");
        return false;
    }
      else  if (EstadoEmpresaProveedora===""){
        alert("El campo Estado Empresa Proveedora está vacio");
        return false;
    }
    
    
    }      


