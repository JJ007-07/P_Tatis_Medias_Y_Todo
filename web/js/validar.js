    /* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    
    window.addEventListener('load', ()=> {
        const form = document.querySelector('#formulario')
    
    const NumeroFacturaPedido = document.getElementById("NumeroFacturaPedido").value;
   const FechaPedido = document.getElementById("FechaPedido").value;
   const FechaRecibido= document.getElementById("FechaRecibido").value;
   const FechaVencimientoPago=document.getElementById("FechaVencimientoPago").value;
   const IdEmpresaProveedoraFK = document.getElementById("IdEmpresaProveedoraFK").value;
   const IVA = document.getElementById("IVA").value;
   const Descuento = document.getElementById("Descuento").value;
   const EstadoPedido = document.getElementById("EstadoPedido").value;
    
 form.addEventListener('submit', (e) => {
        e.preventDefault()
        validaCampos()
    })
    
     const validaCampos = ()=> {
        //capturar los valores ingresados por el usuario
        const NumeroFacturaPedidoValor = NumeroFacturaPedido.value.trim()
        const FechaPedidoValor = FechaPedido.value.trim()
        const FechaRecibidoValor = FechaRecibido.value.trim()
        const FechaVencimientoPagoValor = FechaVencimientoPago.value.trim();
        
         const IdEmpresaProveedoraFKValor = IdEmpresaProveedoraFK.value.trim()
        const IVAValor = IVA.value.trim()
        const DescuentoValor = Descuento.value.trim()
        const EstadoPedidoValor = EstadoPedido.value.trim();

        
    if (!NumeroFacturaPedidoValor){
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
}


