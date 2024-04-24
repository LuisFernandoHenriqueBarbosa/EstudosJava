import java.util.Scanner;

public class CadastraAnimal {
    public static void main(String[] args) throws Exception {
        Mamiferos objMamiferos = new Mamiferos();
        Aves objAves = new Aves();
        int escolha;
        Scanner leia = new Scanner(System.in);

        
        System.out.println("Escolha o tipo de animal que deseja cadastrar: \n");
        System.out.println("1 -- Mamíferos");
        System.out.println("2 -- Aves\n");
        escolha = leia.nextInt();

        switch (escolha) {
            case 1:
            break;

            case 2:
            break;

            default:
            break;
        }
}
}
