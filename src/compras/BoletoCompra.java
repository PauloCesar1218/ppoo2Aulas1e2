package compras;
import modelo.Compras;

public class BoletoCompra extends Compras implements ComprasInterface{
    private double desconto;
    private String validade;
    @Override
    public void pagar(Compras compras) {
        System.out.println("Pagamento no boleto...");
        System.out.println(compras.toString());
    }
}
