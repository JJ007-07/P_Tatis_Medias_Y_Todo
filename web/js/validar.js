/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function validar()
{
    var NumeroFacturaPedido,FechaPedido,FechaRecibido,FechaVencimientoPago,IdEmpresaProveedoraFK,IVA,Descuento,EstadoPedido;

    
    NumeroFacturaPedido = document.getElementById("NumeroFacturaPedido").value;
    FechaPedido = document.getElementById("FechaPedido").value;
    FechaRecibido= document.getElementById("FechaRecibido").value;
    FechaVencimientoPago=document.getElementById("FechaVencimientoPago").value;
    IdEmpresaProveedoraFK = document.getElementById("IdEmpresaProveedoraFK").value;
    IVA = document.getElementById("IVA").value;
    Descuento = document.getElementById("Descuento").value;
    EstadoPedido = document.getElementById("EstadoPedido").value;
    


    if (NumeroFacturaPedido===""){
        alert("El campo No.Factura está vacio");
        return false;
    }
    else  if (FechaPedido===""){
        alert("El campo FechaPedido está vacio");
        return false;
    }
  else  if(FechaRecibido===""){
         alert("El Fecha Recibido está vacio");
        return false;
    }
    else  if (FechaVencimientoPago===""){
        alert("El campo Fecha vencimiento Pago está vacio");
        return false;
    }
    else  if (IdEmpresaProveedoraFK===""){
        alert("El campo Id Empresa Proveedora FK  está vacio");
        return false;
    }
    
    else if (IVA===""){
        alert("El campo IVA está vacio");
        return false;
    }
      else  if (Descuento===""){
        alert("El campo Descuento  está vacio");
        return false;
    }
    
     else  if (EstadoPedido===""){
        alert("El campo Estado  está vacio");
        return false;
    

    
    }
   
    
    }      

    
