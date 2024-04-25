import java.util.ArrayList;
import java.util.Scanner;

public class CadastraAnimal {
    public static void main(String[] args) throws Exception {
        Mamiferos objMamiferos = new Mamiferos();
        Aves objAves = new Aves();
        int escolha;
        char continua;
        Scanner leia = new Scanner(System.in);

        do{
        System.out.println("Escolha o tipo de animal que deseja cadastrar: \n");
        System.out.println("1 -- Mamíferos");
        System.out.println("2 -- Aves\n");
        escolha = leia.nextInt();

        switch (escolha) {
            case 1:
            ArrayList<Mamiferos> listaMamiferos = new  ArrayList<>();
            objMamiferos.CadastraMamirfero();
            listaMamiferos.add(objMamiferos);
            break;

            case 2:
            ArrayList<Aves> listaAves = new  ArrayList<>();
            break;

            default:
            break;
        }

        System.out.println("Deseja Cadastra um novo animal: [S]-Sim/[N]-Não");
        continua=leia.next().charAt(0);
    }while(continua=='S' || continua=='s');
}
}
