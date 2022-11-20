/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validarP()
{
    var CodigoDeBarrasProducto,ReferenciaProducto,DescripcionProducto,StockProducto,PrecioUnitario,EstadoProducto,IdCategoriaFK,IdEmpresaProveedoraFK;
       
    CodigoDeBarrasProducto = document.getElementById("CodigoDeBarrasProducto").value;
    ReferenciaProducto = document.getElementById("ReferenciaProducto").value;
    DescripcionProducto = document.getElementById("DescripcionProducto").value;
    StockProducto= document.getElementById("StockProducto").value;
    PrecioUnitario=document.getElementById("PrecioUnitario").value;
    EstadoProducto = document.getElementById("EstadoProducto").value;
    IdCategoriaFK = document.getElementById("IdCategoriaFK").value;
    IdEmpresaProveedoraFK = document.getElementById("IdEmpresaProveedoraFK").value;
        
       
        if (CodigoDeBarrasProducto===""){
        alert("El campo CodigoDeBarrasProducto está vacio");
        return false;
    }
    
    else if (ReferenciaProducto===""){
        alert("El campo ReferenciaProducto está vacio");
        return false;
    }
    else  if (DescripcionProducto===""){
        alert("El campo DescripcionProducto está vacio");
        return false;
    }
    if(StockProducto===""){
         alert("El campo StockProducto está vacio");
        return false;
    }
    else  if (PrecioUnitario===""){
        alert("El campo PrecioUnitario está vacio");
        return false;
    }

    
    else if (EstadoProducto===""){
        alert("El campo EstadoProducto está vacio");
        return false;
    }
      else  if (IdCategoriaFK===""){
        alert("El campo IdCategoriaFK  está vacio");
        return false;
    }
    
    else  if (IdEmpresaProveedoraFK===""){
        alert("El campo Id Empresa Proveedora FK  está vacio");
        return false;
    }
   
        }
   

