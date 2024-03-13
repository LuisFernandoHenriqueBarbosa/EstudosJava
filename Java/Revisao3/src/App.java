import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    int codProduto=0, qntdSf=0, qntdPf=0, qntdBebida=0, qntdAgua=0, qntdDoce=0;
    double valorSF = 0, valorAgua = 0, valorBebida = 0, valorDoce = 0, valorPF = 0, total = 0;
    Scanner teclado = new Scanner(System.in);
    do{
    System.out.println(" O que você deseja: \n\n 1- Almoço Self Service(R$25,00) \n 2- Prato Feito(R$20,00) \n 3- Bebida Lata(R$8,00) \n 4- Água(R$3,00) \n 5- Doces(R$2,50) \n\n 20-Fechar conta");
    codProduto = teclado.nextInt();
     switch (codProduto) {
        case 1:
            qntdSf++;
            valorSF = qntdSf * 25;
            break;
        case 2:
            qntdPf++;
            valorPF = qntdPf * 20;
            break;
        case 3:
            qntdBebida++;
            valorBebida = qntdBebida * 8;
            break;
        case 4:
            qntdAgua++;
            valorAgua = qntdAgua * 3;
            break;
        case 5:
            qntdDoce++; 
            valorDoce = qntdDoce * 2.5;
            break;
        default:
        
            break;
     }
    }while(codProduto != 20);

    total = valorSF + valorAgua + valorBebida + valorDoce + valorPF; 

    System.out.println("Quantidade de Self Service: " + qntdSf + ". Total: " + valorSF);
    System.out.println("Quantidade de Prato feito:" + qntdPf + ". Total: " + valorPF);
    System.out.println("Quantidade de Bebidas:" + qntdBebida + ". Total: " + valorBebida);
    System.out.println("Quantidade de Água:" + qntdAgua + ". Total: " + valorAgua);
    System.out.println("Quantidade de Doces:" + qntdDoce + ". Total: " + valorDoce);
    System.out.println("Total: R$" + total );
    
    teclado.close();
    }
    
}
