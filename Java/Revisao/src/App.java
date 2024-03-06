import java.util.Scanner;

public class App {
    /*
     * Faça um programa que receba uma quantidade indeterminada de valores, calcule
     * e mostre: Quantidade de valores positivos, negativos e % deles
     */
    public static void main(String[] args) throws Exception {
        int valorLido, contPositivos = 0, contNegativos = 0, contZeros = 0, porcentagemPositivos, porcentagemNegativos;
        String resposta = new String();
        String armPos = new String();
        String armNeg = new String();
        String armZero = new String();
        Scanner teclado = new Scanner(System.in);
        int[] intervalo = new int[3];
        do {
            System.out.println("Digite um numero: ");
            valorLido = teclado.nextInt();
            System.out.println("Deseja digitar outro número? S[Sim], N[Não]");
            resposta = teclado.next();
            if (valorLido > 0) {
                armPos += valorLido + " | ";
                contPositivos++;
            } else if (valorLido < 0) {
                armNeg += valorLido + " | ";
                contNegativos++;
            } else {
                armZero += valorLido + " | ";
                contZeros++;
            }
        } while (resposta.equalsIgnoreCase("s"));
        System.out.println("Quantidades números positivos: " + contPositivos);
        System.out.println("Quantidades números negativos: " + contNegativos);
        int totalValores = contPositivos + contNegativos + contZeros;
        porcentagemNegativos = contNegativos * 100 / totalValores;
        porcentagemPositivos = contPositivos * 100 / totalValores;
        System.out.println("Porcentagem dos números positivos: " + porcentagemPositivos + "%");
        System.out.println("Porcentagem dos números negativos: " + porcentagemNegativos + "%");
        System.out.println("Números positivos digitados foram: " +
                armPos);
        System.out.println("Números negativos digitados foram: " +
                armNeg);
        System.out.println("Números zeros digitados foram: " +
                armZero);
    }
}
