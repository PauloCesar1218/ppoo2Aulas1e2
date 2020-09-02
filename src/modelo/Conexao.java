package modelo;
import java.sql.*;

public class Conexao {

    public Connection conecta () throws SQLException {
        String url = "jdbc:postgresql://127.0.0.1:5432/test?user=postgres&password=123456";
        return DriverManager.getConnection(url);
    }

    public void Query (String sql) throws SQLException {
        Connection con = this.conecta();
        con.prepareStatement(sql);
        con.commit();
    }
}