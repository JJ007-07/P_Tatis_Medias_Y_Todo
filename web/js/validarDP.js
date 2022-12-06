/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validarDP()
{
    var IdPedidoFK,IdProductoFK,PrecioUnitario,Cantidad;

    IdPedidoFK = document.getElementById("IdPedidoFK").value;
    IdProductoFK= document.getElementById("IdProductoFK").value;
    PrecioUnitario = document.getElementById("PrecioUnitario").value;
    Cantidad= document.getElementById("Cantidad").value;


 
    if (IdPedidoFK==="" ){
        alert("El campo Id Pedido FK está vacio");
        return false;
    }
    else  if (IdProductoFK===""){
        alert("El campo Id Producto FK está vacio");
        return false;
    }
    else  if (PrecioUnitario===""){
        alert("El campo Precio Unitario está vacio");
        return false;
    }
    else  if (Cantidad===""){
        alert("El campo Cantidad está vacio");
        return false;
    }

}