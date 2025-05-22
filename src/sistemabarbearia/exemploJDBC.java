
package sistemabarbearia;

import java.sql.SQLException;

public class exemploJDBC {
    
    public static void main(String[] args) throws SQLException {
        ConexaoJDBC jdbc = new ConexaoJDBC();
        jdbc.conectar();
        jdbc.desconectar();
    }
    
}
