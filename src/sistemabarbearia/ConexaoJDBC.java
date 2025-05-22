
package sistemabarbearia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoJDBC {
    
    private Connection conexao;
    
    public void conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/barbearia","root","miguel2008@");
            System.out.println("SUCESSO NA CONEXÃO!");
            
        }catch(ClassNotFoundException cn){
            System.out.println("FALHA AO CONECTAR COM O BANCO" + cn);
        }catch (SQLException sql){
            System.out.println("ERRO DE SQL: " + sql);
        }
    }
   
    public void desconectar(){
        try{
             
            if(conexao != null && !conexao.isClosed()){
                conexao.close();
                System.out.println("DESCONETADO!");
            }
        }catch(SQLException se){
            System.out.println("PROBLEMA AO DESCONECTAR DO BANCO!" + se);
        }
    }
     public Connection getConexao() {
        return conexao;
    }
}
