import java.util.Scanner;

public class Aves extends Animal {
    String tipoPena;
    public void CadastraAves(){
    super.CadastraAnimal();
    Scanner leia = new Scanner(System.in);
    do{
        try {
            System.out.println("Digite o tipo de pena da ave: ");
            tipoPena = leia.next();
        } catch (Exception erro) {
            System.out.println("Erro:" + erro.getMessage());
            leia.next();
        }
    }while(tipoPena.equals(""));
}
}
