package compras;

import modelo.Compras;

public class CreditoCompra extends Compras implements ComprasInterface {
    private String numeroCartao;
    private int codigo;

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public void pagar(Compras compras) {
        System.out.println("Pagamento no credito...");
        System.out.println(compras.toString());
    }
}
