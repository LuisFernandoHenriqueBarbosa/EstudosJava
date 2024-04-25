import java.util.Scanner;

public class Animal {
    int id;
    char sexo;
    String nome, raca, cor; 

    public void CadastraAnimal(){
        Scanner leia = new Scanner(System.in);
        //Insere id
        do{
            try{
                System.out.println("Digite o id do Animal: ");
                id = leia.nextInt();
            }catch(Exception erro){
                System.out.println("Erro:" + erro.getMessage());
                leia.next();
            }
        }while(id<0);
        //Insere nome
        do{
            try {
                System.out.println("Digite o nome do Animal: ");
                nome = leia.next();
            } catch (Exception erro) {
                System.out.println("Erro:" + erro.getMessage());
                leia.next();
            }
        }while (nome.trim().length()<3);
        //Insere sexo
        do{
            try {
                System.out.println("Digite o sexo do Animal: [F] - Fêmea / [M] - Macho  ");
                sexo = leia.next().charAt(0);
            } catch (Exception erro) {
                System.out.println("Erro:" + erro.getMessage());
                leia.next();
            }
        }while (sexo != 'F' && sexo != 'f' && sexo != 'M' && sexo != 'm');
        //Insere raça
        do{
            try {
                System.out.println("Digite a raça do Animal: ");
                raca = leia.next();
            } catch (Exception erro) {
                System.out.println("Erro:" + erro.getMessage());
                leia.next();
            }
        }while (raca.trim().length()<3);
                //Insere cor
                do{
                    try {
                        System.out.println("Digite a cor do Animal: ");
                        cor = leia.next();
                    } catch (Exception erro) {
                        System.out.println("Erro:" + erro.getMessage());
                        leia.next();
                    }
                }while (cor.trim().length()<3);
    }
}
