import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome="", sexo="", curso="" , periodo="";
        int ra,idade;
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.println("Digite seu Ra: ");
            ra = teclado.nextInt();
            System.out.println("Digite seu nome completo: ");
            nome = teclado.next();
            System.out.println("Informe a sua idade");
            idade = teclado.nextInt();
            System.out.println("Informe seu sexo: M(masculino) ou F(Feminino)");
            sexo = teclado.next();
            System.out.println("Informe o curso: I(Informática para negócios) A(Agronegócio) D(Analise e Desenvolvimento de Sistemas)");
            curso = teclado.next();
            System.out.println("Informe o seu período: M(Manhã), T(Tarde) ou N(noturno)");
            periodo = teclado.next();
        }while(ra != 0 && ra > 0);
        
    }
}
