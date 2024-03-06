import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome = "", sexo = "", periodo = "", nomeVelha="", cursoNova="";
        int tempIdade=0, tempIdade2=0, curso = 0, ra, idade, contInfo = 0, contAgro = 0, contDs = 0, contSexo = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite seu Ra: ");
            ra = teclado.nextInt();
            System.out.println("Digite seu nome completo: ");
            nome = teclado.next();
            System.out.println("Informe a sua idade");
            idade = teclado.nextInt();
            System.out.println("Informe seu sexo: M(masculino) ou F(Feminino)");
            sexo = teclado.next();
            System.out.println(
                    "Informe o curso: 1(Informática para negócios) 2(Agronegócio) 3(Analise e Desenvolvimento de Sistemas)");
            curso = teclado.nextInt();
            System.out.println("Informe o seu período: M(Manhã), T(Tarde) ou N(noturno)");
            periodo = teclado.next();
            if (curso == 1) {
                contInfo++;
            } else if (curso == 2) {
                contAgro++;
            } else if (curso == 3) {
                contDs++;
            } else {
                System.out.println("Curso não identificado");
            }

            if (sexo == "F") {
                contSexo++;
            }

            
        } while (ra != 0 && ra > 0);

    }
}
