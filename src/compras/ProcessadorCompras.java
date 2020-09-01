package compras;

import modelo.Compras;
import java.util.List;

public class ProcessadorCompras {
    public void processar (List<Compras> compras) throws Exception {
        for(Compras compra: compras){
            ComprasInterface comprasNegocio = CompraFactory.create(compra);
            comprasNegocio.pagar(compra);
        }
    }
}
