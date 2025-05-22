
package sistemabarbearia;

import java.text.SimpleDateFormat;
import java.util.Date;


public class agendamentos {
    private int id;
    private int agendamento_id;
    private String Dia_semana;
    private String Telefone;
    private String Data;
    private String Hora;
    private String Nome;

    public agendamentos() {
    }

    public agendamentos(int id, int agendamento_id, String Dia_semana, String Telefone, String Data, String Hora, String Nome) {
        this.id = id;
        this.agendamento_id = agendamento_id;
        this.Dia_semana = Dia_semana;
        this.Telefone = Telefone;
        this.Data = Data;
        this.Hora = Hora;
        this.Nome = Nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAgendamento_id() {
        return agendamento_id;
    }

    public void setAgendamento_id(int agendamento_id) {
        this.agendamento_id = agendamento_id;
    }

    public String getDia_semana() {
        return Dia_semana;
    }

    public void setDia_semana(String Dia_semana) {
        this.Dia_semana = Dia_semana;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

  
}