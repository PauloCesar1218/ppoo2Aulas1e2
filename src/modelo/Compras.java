package modelo;

public class Compras {
    private String data;
    private int valor;
    private  MetodoCompras metodoCompras;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public MetodoCompras getMetodoCompras() {
        return metodoCompras;
    }

    public void setMetodoCompras(MetodoCompras metodoCompras) {
        this.metodoCompras = metodoCompras;
    }

    @Override
    public String toString() {
        return "Foi feita uma compra no dia " + this.getData() + " no valor de " + this.getValor();
    }
}