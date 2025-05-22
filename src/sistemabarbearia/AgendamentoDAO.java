
package sistemabarbearia;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class AgendamentoDAO {
    
   public static boolean excluir(int id){
        try{
            ConexaoJDBC conexao = new ConexaoJDBC();
            conexao.conectar();
            
            String sql = "DELETE FROM agendamentos WHERE agendamento_id=?";
            PreparedStatement agendar = conexao.getConexao().prepareStatement(sql);
            
            agendar.setInt(1, id);
            
            agendar.execute();
            
            conexao.desconectar();
            return true;
            
        }catch(SQLException s){
            System.out.println("ERRO AO DELETAR REGISTRO DO BANCO"  + s);
            return false;
        }
    }


    public static boolean cadastrar (agendamentos age) {
         String sql = "INSERT INTO agendamentos( agendamento_id, Nome, Dia_semana, Telefone, Data, Hora ) VALUES (?, ? , ?, ?, ?, ?)";
         
       try{  
        ConexaoJDBC conn = new ConexaoJDBC();
        conn.conectar();
        
        PreparedStatement ps = conn.getConexao().prepareStatement(sql);
        
        ps.setInt(1, age.getAgendamento_id());
        ps.setString(2, age.getNome());
        ps.setString(3, age.getDia_semana());
        ps.setString(4, age.getTelefone());
        ps.setString(5, age.getData());
        ps.setString(6, age.getHora());
       
       
        ps.executeQuery();
       System.out.println("AGENDAMENTO FEITO COM SUCESSO!");
       conn.desconectar();
       return true;
       
    }catch (SQLException se){
    
    System.err.println("ERRO AO FAZER O AGENDAMENTO: " + se.getMessage());
    return false;
    }
    }
    

    

    
    public static List<agendamentos> listarTodos(){
        List<agendamentos> ag = new ArrayList();
        
        try{
            ConexaoJDBC conexao = new ConexaoJDBC();
            conexao.conectar(); 
            
            String sql = "SELECT clientes_id, Nome, Dia_semana, Telefone, Data, Hora FROM agendamentos";
            
            
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
            
               agendamentos age = new agendamentos();
               
             
               age.setNome(rs.getString("Nome"));
               age.setDia_semana(rs.getString("Dia_semana"));
               age.setTelefone(rs.getString("Telefone"));
               age.setData(rs.getString("Data"));    
               age.setHora(rs.getString("Hora"));
               
                
                
                ag.add(age);
            }
            
         }catch (SQLException se) {
             System.out.println("erro ao listar o agendamento: " + se.getMessage());
         }
        return ag;
    }
    
    
    
}


