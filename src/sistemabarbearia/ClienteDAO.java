
package sistemabarbearia;


import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
     
        


public class ClienteDAO {
    
    
    
    public static List<clientes> listarTodos(){
        List<clientes> cli = new ArrayList();
        
        try{
            ConexaoJDBC conexao = new ConexaoJDBC();
            conexao.conectar(); 
            
            String sql = "SELECT clientes_id, Nome, Senha, Telefone FROM clientes";
            
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                clientes clie = new clientes();
                clie.setNome(rs.getString("Nome"));
                clie.setSenha(rs.getString("Senha"));
                clie.setTelefone(rs.getString("Telefone"));
                
                cli.add(clie);
            }
            
         }catch (SQLException se) {
             System.out.println("erro ao listar clientes: " + se.getMessage());
         }
        return cli;
    }
    
    
    
}
