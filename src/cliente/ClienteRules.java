package cliente;

import java.util.Date;

public class ClienteRules {
    Cliente cliente;

    public ClienteRules(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    private boolean validarCPF(){
        return this.getCliente().getCpf() != null;
    }

    private boolean calculaIdade(){
        return this.getCliente().getData_nascimento() != null;
    }

    private boolean enviarEmail(){
        return true;
    }

    public boolean valida(){
        return this.validarCPF() && this.calculaIdade() && this.enviarEmail();
    }
}
