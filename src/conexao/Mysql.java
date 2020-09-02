package conexao;

public class Mysql extends Conexao implements ConexaoInter{
    public Mysql(Datanase datanase, String host, int porta, String user, String senha) {
        super(datanase, host, porta, user, senha);
    }

    @Override
    public void Conecta() {

    }

    @Override
    public void Query(String str) {

    }
}
