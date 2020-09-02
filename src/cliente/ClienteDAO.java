package cliente;

import modelo.Conexao;

import java.sql.SQLException;

public class ClienteDAO implements MetodosBase{

    @Override
    public boolean cadastrar(Cliente cliente) throws SQLException {
        ClienteRules rules = new ClienteRules(cliente);
        Conexao conexao = new Conexao();
        if(rules.valida()){
            conexao.Query("inset into clientes values ('" + cliente.getNome() + "')");
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean editar(Cliente cliente) {
        ClienteRules rules = new ClienteRules(cliente);
        Conexao conexao = new Conexao();
        if(rules.valida()){
            try {
                conexao.Query("update clientes set ='" + cliente.getNome() + "' where cpf =" + cliente.getCpf());
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean excluir(Cliente cliente) {
        return false;
    }

    @Override
    public boolean consultar(Cliente cliente) {
        return false;
    }
}
