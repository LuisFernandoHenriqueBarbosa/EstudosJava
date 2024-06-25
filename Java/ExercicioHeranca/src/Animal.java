import java.util.Scanner;

public class Animal {
    int id;
    String nome, sexo, raca, cor; 

    public Animal (){

    }
    public Animal(int id, String nome, String sexo, String raca, String cor ){
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.raca = raca;
        this.cor = cor;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    @Override
    public String toString(){
        return "Id: " + id + "Nome: " + nome + "Sexo: " + sexo + "Raça: " + raca + "Cor: " + cor;
    }
}
