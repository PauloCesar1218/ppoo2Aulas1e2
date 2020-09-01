package compras;
import modelo.Compras;
public class CompraFactory {
    public static ComprasInterface create (Compras compra) throws Exception {
        return switch (compra.getMetodoCompras()) {
            case BOLETO -> new BoletoCompra();
            case CREDITO -> new CreditoCompra();
            default -> throw new Exception("Deu pau!");
        };
    }
}
