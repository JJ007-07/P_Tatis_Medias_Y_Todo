/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

window.addEventListener('load', ()=> {
        const form = document.querySelector('#formulario')
    
     const FechaRecibido= document.getElementById("FechaRecibido").value;
   const FechaVencimientoPago=document.getElementById("FechaVencimientoPago").value;
   const NitEmpresaProveedoraFK = document.getElementById("NitEmpresaProveedoraFK").value;
   
    
 form.addEventListener('submit', (e) => {
        e.preventDefault()
        sumarfechas()
    })
    
     const sumarfechas = ()=> {
        //capturar los valores ingresados por el usuario
        const FechaPedidoValor = FechaPedido.value.trim()
        const FechaRecibidoValor = FechaRecibido.value.trim()
        const FechaVencimientoPagoValor = FechaVencimientoPago.value.trim();
        
         const NitEmpresaProveedoraFK = IdEmpresaProveedoraFK.value.trim()
        

        
    if (!NumeroFacturaPedidoValor=){
        validaFalla(NumeroFacturaPedido,'Campo Vacio');
        
    }else{
        ValidaOk(NumeroFacturaPedido)
    }
    if (!FechaPedidoValor){
        validaFalla(FechaPedido,'Campo Vacio');
        
    }else{
        ValidaOk(FechaPedido)
    }
    
    if (!FechaRecibidoValor){
        validaFalla(FechaRecibido,'Campo Vacio');
        
    }else{
        ValidaOk(FechaRecibido)
    }
    
    if (!FechaVencimientoPagoValor){
        validaFalla(FechaVencimientoPago,'Campo Vacio');
        
    }else{
        ValidaOk(FechaVencimientoPago)
    }
   if (!IdEmpresaProveedoraFKValor){
        validaFalla(IdEmpresaProveedoraFK,'Campo Vacio');
        
    }else{
        ValidaOk(IdEmpresaProveedoraFK)
    }
    
   if (!IVAValor){
        validaFalla(IVA,'Campo Vacio');
        
    }else{
        ValidaOk(IVA)
    }
    if (!DescuentoValor){
        validaFalla(Descuento,'Campo Vacio');
        
    }else{
        ValidaOk(Descuento)
    }
    if (!EstadoPedidoValor){
        validaFalla(EstadoPedido,'Campo Vacio');
       
    }else{
        ValidaOk(EstadoPedido)
    }
    }
      

    }
