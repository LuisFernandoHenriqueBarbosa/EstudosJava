public class Curso {
    int id;
    String descricao, turno;

    public Curso(int id, String descricao, String turno){
        this.id = id;
        this.descricao = descricao;
        this.turno = turno;
    }
    public Curso(){
        
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    
}
