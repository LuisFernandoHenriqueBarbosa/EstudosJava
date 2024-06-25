import java.util.Scanner;

public class Aves extends Animal {
    String tipoPena;
    
    public Aves (){

    }
    public Aves (String tipoPena){
        this.tipoPena = tipoPena;
    }
    public String getTipoPena() {
        return tipoPena;
    }
    public void setTipoPena(String tipoPena) {
        this.tipoPena = tipoPena;
    }

    @Override
    public String toString(){
        return "Tipo de Pena: " + tipoPena;
    }
}
