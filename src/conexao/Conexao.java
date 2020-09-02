package conexao;

public class Conexao {
    public Datanase datanase;
    public String host;
    public int porta;
    public String user;
    public String senha;

    public Conexao(Datanase datanase, String host, int porta, String user, String senha) {
        this.datanase = datanase;
        this.host = host;
        this.porta = porta;
        this.user = user;
        this.senha = senha;
    }

    public Datanase getDatanase() {
        return datanase;
    }

    public void setDatanase(Datanase datanase) {
        this.datanase = datanase;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
