
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float[][] notasAlunos = new float[5][4];
        String[] nomes = new String[5];
        double[] medias = new double[5];

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do alunos: ");
            nomes[i] = teclado.next();
            for(int n = 0; n < 4; n ++){
                System.out.println("Digite as notas do aluno " + nomes[i] + ":");
                notasAlunos[i][n] = teclado.nextFloat();
            }
        }
        for (int i = 0; i < 5; i++){
            double media = 0;
            for(int n = 0; n < 4; n++){
                media += notasAlunos[i][n];
            }
            medias[i] = media / 4;
        }
        System.out.println("Medias: ");
        for(int i = 0; i < 5; i++){
            System.out.println(nomes[i] + ": " + medias[i]);
        }

        float menorNota = notasAlunos[0][0];
        String nomeMenorNota = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (notasAlunos[i][j] < menorNota) {
                      menorNota = notasAlunos[i][j];
                      nomeMenorNota = nomes[i];
                     }
                    }
                }
        
        for (int i = 0; i < medias.length - 1; i++) {
            for (int j = 0; j < medias.length - 1 - i; j++) {
                if (medias[j] > medias[j + 1]) {
                    double tempMedia = medias[j];
                    medias[j] = medias[j + 1];
                    medias[j + 1] = tempMedia;
                    String tempNome = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = tempNome;
                }
            }
        }
        System.out.println("A maior media: " + medias[4] + " do aluno: " + nomes[4]);
        System.out.println("Aluno com a menor nota: " + nomeMenorNota + " Nota: " + menorNota);

    }
}
