import java.util.Scanner;

public class Mamiferos extends Animal {
    int qtdaPatas;
    float peso;

    public void CadastraMamirfero(){
        super.CadastraAnimal();
        Scanner leia = new Scanner(System.in);
        do{
            try {
                System.out.println("Digite a quantidade de patas do Animal: ");
                qtdaPatas = leia.nextInt();
            } catch (Exception erro) {
                System.out.println("Erro:" + erro.getMessage());
                leia.next();
            }
        }while(qtdaPatas<0);
        do{
            try {
                System.out.println("Digite o peso do Animal: ");
                peso = leia.nextFloat();
            } catch (Exception erro) {
                System.out.println("Erro:" + erro.getMessage());
                leia.next();
            }
        }while(peso<0);
    }
}
