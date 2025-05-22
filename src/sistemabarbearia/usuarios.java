
package sistemabarbearia;

public class usuarios {
   private int id;
    private String Nome_usuario;
    private String Senha;
    private String Funcao;
    private int clientes_id;

    public usuarios() {
    }

    public usuarios(int id, String Nome_usuario, String Senha, String Funcao, int clientes_id) {
        this.id = id;
        this.Nome_usuario = Nome_usuario;
        this.Senha = Senha;
        this.Funcao = Funcao;
        this.clientes_id = clientes_id;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_usuario() {
        return Nome_usuario;
    }

    public void setNome_usuario(String Nome_usuario) {
        this.Nome_usuario = Nome_usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getFuncao() {
        return Funcao;
    }

    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }

    public int getClientes_id() {
        return clientes_id;
    }

    public void setClientes_id(int clientes_id) {
        this.clientes_id = clientes_id;
    }
    

}

  