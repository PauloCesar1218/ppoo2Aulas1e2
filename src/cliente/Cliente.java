package cliente;

public class Cliente {
    String nome;
    String rg;
    String cpf;
    String data_nascimento;

    public Cliente(String nome, String rg, String cpf, String data_nascimento) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
    }

    public Cliente(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}
