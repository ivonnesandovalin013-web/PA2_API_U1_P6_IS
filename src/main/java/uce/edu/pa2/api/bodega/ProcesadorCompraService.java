package uce.edu.pa2.api.bodega;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import uce.edu.pa2.api.tarea5.Cupones;

@ApplicationScoped
public class ProcesadorCompraService  {
    //Va a ser un coleccion de las implementaciones de la siguiente interfaz
    //agregue mas funcionalidad no deba cambiar mi codigo existente
    @Inject //deteccta todas la implementaciones de mi intefaz y me da una lista de esas implementaciones y yo itero sobre esa lista
    private Instance<Descuento> descuentos;
    @Inject
    private Instance<Cupones> cupones;

    public void procesar(Compra compra){
        double total = compra.getSubTotal();
        for(Descuento des: descuentos){
           total = des.aplicar(total);
        }
        compra.setTotal(total);
        System.out.println("Su valor a pagar es: " + compra.getTotal());

    }

    public void procesarCupon(Compra compra){
        double total = compra.getSubTotal();
        for(Cupones cup: cupones){
            total = cup.validarCupon(total);
        }
        compra.setTotal(total);
        System.out.println("Su valor a pagar con cupon es: " + compra.getTotal());
    }

}
