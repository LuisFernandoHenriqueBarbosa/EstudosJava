import java.util.Scanner;

public class Mamiferos extends Animal {
    int qtdaPatas;
    float peso;

    public Mamiferos(){

    }
    public Mamiferos(int qtdaPatas, float peso){
        this.qtdaPatas = qtdaPatas;
        this.peso = peso;
    }
    public int getQtdaPatas() {
        return qtdaPatas;
    }
    public void setQtdaPatas(int qtdaPatas) {
        this.qtdaPatas = qtdaPatas;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString(){
        return "Quantidade de patas: " + qtdaPatas + "Peso: " + peso;
    }
}
