import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    int codProduto=0, qntdSf=0, qntdPf=0, qntdBebida=0, qntdAgua=0, qntdDoce=0;
    double valorSF = 0, valorAgua = 0, valorBebida = 0, valorDoce = 0, valorPF = 0, total = 0;
    Scanner teclado = new Scanner(System.in);
    do{
    System.out.println("\nNosso cardápio: \n 1- Almoço Self Service(R$25,00) \n 2- Prato Feito(R$20,00) \n 3- Bebida Lata(R$8,00) \n 4- Água(R$3,00) \n 5- Doces(R$2,50)\n 20-Fechar conta\n O que você deseja: ");
    codProduto = teclado.nextInt();
    if (codProduto != 1 && codProduto != 2 && codProduto != 3 && codProduto != 4 && codProduto != 5 && codProduto != 20) {
        System.out.println("Código de produto inválido. Por favor, escolha um código válido.");
        continue;
    }
     switch (codProduto) {
        case 1:
            System.out.println("\nDigite a quantidade desejada: ");
            qntdSf = teclado.nextInt();
            valorSF = qntdSf * 25; 
            break;
        case 2:
            System.out.println("\nDigite a quantidade desejada: ");
            qntdPf = teclado.nextInt();
            valorPF = qntdPf * 20;
            break;
        case 3:
            System.out.println("\nDigite a quantidade desejada: ");
            qntdBebida = teclado.nextInt();
            valorBebida = qntdBebida * 8;
            break;
        case 4:
            System.out.println("\nDigite a quantidade desejada: ");
            qntdAgua = teclado.nextInt();
            valorAgua = qntdAgua * 3;
            break;
        case 5:
            System.out.println("\nDigite a quantidade desejada: ");
            qntdAgua = teclado.nextInt();
            valorDoce = qntdDoce * 2.5;
            break;
        default:
            break;
     }
    }while(codProduto != 20);

    total = valorSF + valorAgua + valorBebida + valorDoce + valorPF; 

    System.out.println("\nQuantidade de Self Service: " + qntdSf + ". Total: " + valorSF);
    System.out.println("\nQuantidade de Prato feito: " + qntdPf + ". Total: " + valorPF);
    System.out.println("\nQuantidade de Bebidas: " + qntdBebida + ". Total: " + valorBebida);
    System.out.println("\nQuantidade de Água: " + qntdAgua + ". Total: " + valorAgua);
    System.out.println("\nQuantidade de Doces: " + qntdDoce + ". Total: " + valorDoce);
    System.out.println("\nTotal: R$" + total );
    
    teclado.close();
    }
    
}
