package uce.edu.pa2.api.bodega;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorCompraService  {
    //Va a ser un coleccion de las implementaciones de la siguiente interfaz
    //agregue mas funcionalidad no deba cambiar mi codigo existente
    @Inject //deteccta todas la implementaciones de mi intefaz y me da una lista de esas implementaciones y yo itero sobre esa lista
    private Instance<Descuento> descuentos;

    public void procesar(Compra compra){
        double total = compra.getSubTotal();
        for(Descuento des: descuentos){
           total = des.aplicar(total);
        }
        compra.setTotal(total);
        System.out.println("Su valor a pagar es: " + compra.getTotal());

    }

}
