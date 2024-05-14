import java.util.Scanner;

public class Pessoa {
    int id;
    String nome;
    public void mostrar(){
        System.out.println(nome);
    }
    public void cadastrar(){
        Scanner ler = new Scanner(System.in);
        do {
            try {
                System.out.println("Digite o id:");
                id = ler.nextInt();
            } catch (Exception e) {
                System.out.println("Erro:"+e.getMessage());
                ler.next();
            }
        } while (id<=0);
        
        do {
            try {
                System.out.println("Digite o nome:");
                nome = ler.next();
            } catch (Exception e) {
                System.out.println("Erro:"+e.getMessage());
                ler.next();
            }
        } while (nome.trim().length()<3);
        
    }
}
