import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String resp;

        ArrayList<String> produtos = new ArrayList<>();
        ArrayList<Double> precoDeCusto = new ArrayList<>();
        ArrayList<Double> precoDeVenda = new ArrayList<>();
        ArrayList<Integer> quantidadeEstoque = new ArrayList<>();
        
        do{
        System.out.println("Digite os nomes dos produtos");
        String nomeProduto = teclado.next();
        produtos.add(nomeProduto);
        
        System.out.println("Deseja cadastrar um novo produto: (S-Sim/N-Não)");
        resp = teclado.next();
        
        }while(resp.equalsIgnoreCase("S"));
        
        for(int i = 0; i < produtos.size(); i ++){
        System.out.println("Digite o preco de custo do " + produtos.get(i));
        double precoCusto = teclado.nextDouble();
        precoDeCusto.add(precoCusto);
            System.out.println("Digite o preco de venda do " + produtos.get(i));
            double precoVenda = teclado.nextDouble();
            precoDeVenda.add(precoVenda);
            System.out.println("Digite a quantidade do " + produtos.get(i));
            int quantidadeProduto = teclado.nextInt();
            quantidadeEstoque.add(quantidadeProduto);
        }
        int quantidadeGeral = 0;
        for (int Estoque : quantidadeEstoque){
             quantidadeGeral += Estoque; 
        }
        System.out.println("A quantidade geral de produto é: " + quantidadeGeral);

        System.out.println("Lucro de cada produto:");
        for (int i = 0; i < produtos.size(); i++) {
            String nomeProduto = produtos.get(i);
            double lucro = (precoDeVenda.get(i) - precoDeCusto.get(i));// * quantidadeEstoque.get(i);
            System.out.println(nomeProduto + ": " + lucro);
        }
    }
    
}
