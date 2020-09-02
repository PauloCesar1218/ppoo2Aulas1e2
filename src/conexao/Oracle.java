package conexao;

public class Oracle extends Conexao implements ConexaoInter{
    public Oracle(Datanase datanase, String host, int porta, String user, String senha) {
        super(datanase, host, porta, user, senha);
    }

    @Override
    public void Conecta() {

    }

    @Override
    public void Query(String str) {

    }
}
