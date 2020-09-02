package conexao;

public class ConexaoFactor {
    public static ConexaoInter Conexaos(Conexao database) throws Exception{
        return switch (database.getDatanase()){
            case ORACLE -> new Oracle(database.datanase, database.host, database.porta, database.user, database.senha);
            case MYSQL -> new Mysql(database.datanase, database.host, database.porta, database.user, database.senha);
        };
    }
}
