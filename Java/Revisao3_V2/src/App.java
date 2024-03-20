import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int codProduto = 0;
        Scanner teclado = new Scanner(System.in);
        double vendas[] = new double[5];
        String produtos[] = { "Almoço Serf Service", "Prato Feito", "Bebida Lata", "Água", "Doces" };
        double valorUnitario[] = new double[5];
        double valor[] = new double[5];
        do {
            System.out.print(
                    "\nNosso cardápio: \n 1- Almoço Self Service(R$25,00) \n 2- Prato Feito(R$20,00) \n 3- Bebida Lata(R$8,00) \n 4- Água(R$3,00) \n 5- Doces(R$2,50)\n 20-Fechar conta\n O que você deseja: ");
            codProduto = teclado.nextInt();
            if (codProduto != 1 && codProduto != 2 && codProduto != 3 && codProduto != 4 && codProduto != 5
                    && codProduto != 20) {
                System.out.println("Código de produto inválido. Por favor, escolha um código válido.");
                continue;
            }
            switch (codProduto) {
                case 1:
                    System.out.println("\nDigite a quantidade desejada: ");
                    vendas[0] = teclado.nextInt();
                    valor[0] += vendas[0] * 25;
                    valorUnitario[0] = vendas[0] * 25.00;
                    break;
                case 2:
                    System.out.println("\nDigite a quantidade desejada: ");
                    vendas[1] = teclado.nextInt();
                    valor[1] += vendas[1] * 23;
                    valorUnitario[1] = vendas[1] * 23.00;
                    break;
                case 3:
                    System.out.println("\nDigite a quantidade desejada: ");
                    vendas[2] = teclado.nextInt();
                    valor[2] += vendas[2] * 8;
                    valorUnitario[2] = vendas[2] * 8.00;
                    break;
                case 4:
                    System.out.println("\nDigite a quantidade desejada: ");
                    vendas[3] = teclado.nextInt();
                    valor[3] += vendas[3] * 3;
                    valorUnitario[3] = vendas[3] * 3.00;
                    break;
                case 5:
                    System.out.println("\nDigite a quantidade desejada: ");
                    vendas[4] = teclado.nextInt();
                    valor[4] += vendas[4] * 2.5;
                    valorUnitario[4] = vendas[4] * 2.5;
                    break;
                default:
                    break;
            }
        } while (codProduto != 20);

        double maiorGasto = valorUnitario[0];
        for (int i = 0; i < valorUnitario.length; i++) {
            if (valorUnitario[i] > maiorGasto) {
                maiorGasto = valorUnitario[i];
            }
        }

        double menorGasto = valorUnitario[0];
        for (int i = 1; i < valorUnitario.length; i++) {
            if (valorUnitario[i] < menorGasto && valorUnitario[i] != 0) {
                menorGasto = valorUnitario[i];
            }
        }
        
        for(int i = 0; i < 5; i++){
            for (int j = 0; j<4; j++){
                if(valorUnitario[j] > valorUnitario[j+1]){
                    double aux = valorUnitario[j];
                    valorUnitario[j] = valorUnitario[j+1];
                    valorUnitario[j+1] = aux;
                }   
            }
        }

        System.out.println("\n Dados da comanda: ");

        for (int i = 0; i < 5; i++) {
            System.out.println(vendas[i] + " - " + produtos[i] + "R$: " + valorUnitario[i]);
        }

        double totalComanda = valor[0] + valor[1] + valor[2] + valor[3] + valor[4];

        System.out.println("O valor total da comanda é: " + totalComanda);
        System.out.println("O maior valor gasto: " + maiorGasto);
        System.out.println("O menor valor gasto: " + menorGasto);
        System.out.println("A lista em ordem crescente: ");
        for (int i = 0; i <5; i++){
            System.out.println(" " +  valorUnitario[i]);
        }

        teclado.close();
    }

}
