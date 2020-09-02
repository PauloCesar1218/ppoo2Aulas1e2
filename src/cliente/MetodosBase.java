package cliente;

import java.sql.SQLException;

public interface MetodosBase{
    boolean cadastrar (Cliente cliente) throws SQLException;
    boolean editar (Cliente cliente);
    boolean excluir (Cliente cliente);
    boolean consultar (Cliente cliente);
}
