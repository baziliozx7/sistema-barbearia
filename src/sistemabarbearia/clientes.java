
package sistemabarbearia;

public class clientes {
     private int id;
    private String Nome;
    private String Senha;
    private String Telefone;

    public clientes() {
    }

    public clientes(int id, String Nome, String Senha, String Telefone) {
        this.id = id;
        this.Nome = Nome;
        this.Senha = Senha;
        this.Telefone = Telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

}