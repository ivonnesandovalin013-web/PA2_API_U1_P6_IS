package uce.edu.pa2.api.deber4;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import uce.edu.pa2.api.bodega.Compra;

@ApplicationScoped
public class ProcesadorImpuestoService {
    @Inject
    private Instance<Impuesto> impuestos;

    public void procesarImpuestos(Compra compra){
        double total = compra.getSubTotal();
        for(Impuesto impuesto : impuestos){
            total = impuesto.calcular(total);
        }
        compra.setTotal(total);
        System.out.println("Su valor a pagar con impuestos es : " + compra.getTotal());

    }

}
