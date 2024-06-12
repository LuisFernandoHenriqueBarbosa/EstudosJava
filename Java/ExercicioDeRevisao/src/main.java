import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList <String> Vendidos = new ArrayList<>();
        ArrayList<Alimento> Alimentos = new ArrayList<>();
        ArrayList<Vestuario> Vestuarios = new ArrayList<>();

        Scanner leia = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("1- Cadastra Vestuários");
            System.out.println("2- Cadastra Alimentos");
            System.out.println("3- Listar Produtos");
            System.out.println("4- Realizar Venda");
            System.out.println("5- Mostra Produtos Vendidos");
            System.out.println("6- Sair");
            System.out.print("Digite a opção que deseja: ");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastra Vestuarios: ");
                    Vestuario objVestuario = new Vestuario();
                    do {
                        System.out.println("Digite o código do vestuário: ");
                        objVestuario.setCodigo(leia.nextInt());
                    } while (objVestuario.getCodigo() <= 0);
                    do {
                        System.out.println("Digite a descrição: ");
                        objVestuario.setDescricao(leia.next());
                    } while (objVestuario.getDescricao().length() <= 3);
                    do {
                        System.out.println("Digite a quantidade: ");
                        objVestuario.setQuantidade(leia.nextInt());
                    } while (objVestuario.getQuantidade() <= 0);
                    boolean validaTamanho = false;
                    do {
                        System.out.println("Digite o tamanho: ");
                        objVestuario.setTamanho(leia.next());
                        if (objVestuario.getTamanho().equals("P") || objVestuario.getTamanho().equals("M")
                                || objVestuario.getTamanho().equals("G") || objVestuario.getTamanho().equals("GG"))
                            validaTamanho = true;
                        else
                            validaTamanho = false;

                    } while (validaTamanho != true);
                    Vestuarios.add(objVestuario);

                    System.out.println("Vestuario cadastrado com sucesso:");
                    break;

                case 2:
                    System.out.println("Cadastra Alimento: ");
                    Alimento objAlimento = new Alimento();
                    do {
                        System.out.println("Digite o código do Alimento: ");
                        objAlimento.setCodigo(leia.nextInt());
                    } while (objAlimento.getCodigo() <= 0);
                    do {
                        System.out.println("Digite a descrição: ");
                        objAlimento.setDescricao(leia.next());
                    } while (objAlimento.getDescricao().length() <= 3);
                    do {
                        System.out.println("Digite a quantidade: ");
                        objAlimento.setQuantidade(leia.nextInt());
                    } while (objAlimento.getQuantidade() <= 0);
                    boolean validaData = false;
                    do {
                        System.out.print("Digite a validade: ");
                        objAlimento.setDataValidade(leia.next());
                        if (objAlimento.getDataValidade().isEmpty())
                            validaData = false;
                        else
                            validaData = true;
                    } while (!validaData);
                    Alimentos.add(objAlimento);

                    System.out.println("Alimento cadastrado com sucesso:");
                    break;

                case 3:
                    System.out.println("Listar produtos: ");
                    if (Alimentos.isEmpty() && Vestuarios.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("Vestuário cadastrados:");
                        for (Vestuario vestuario : Vestuarios) {
                            System.out.println("Código: " + vestuario.getCodigo());
                            System.out.println("Descrição: " + vestuario.getDescricao());
                            System.out.println("Quantidade: " + vestuario.getQuantidade());
                            System.out.println("Tamanho: " + vestuario.getTamanho());
                        }
                        System.out.println("Alimento cadastrados:");
                        for (Alimento alimento : Alimentos) {
                            System.out.println("Código: " + alimento.getCodigo());
                            System.out.println("Descrição: " + alimento.getDescricao());
                            System.out.println("Quantidade: " + alimento.getQuantidade());
                            System.out.println("Data de Validade: " + alimento.getDataValidade());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Realizar Venda");
                    System.out.print("Digite o código do produto para venda: ");
                    int codigoProduto = leia.nextInt();
                    System.out.print("Digite a quantidade vendida: ");
                    int quantidadeVendida = leia.nextInt();
                    for (Alimento alimento : Alimentos) {
                        if (alimento.getCodigo() == codigoProduto) {
                            if (alimento.getQuantidade() >= quantidadeVendida) {
                                alimento.setQuantidade(alimento.getQuantidade() - quantidadeVendida);
                                Vendidos.add(alimento.getDescricao());
                                System.out.println("Venda realizada com sucesso!");
                            } else {
                                System.out.println("Quantidade insuficiente em estoque para realizar a venda.");
                            }
                        }
                    }
                    for (Vestuario vestuario : Vestuarios) {
                        if (vestuario.getCodigo() == codigoProduto) {
                            if (vestuario.getQuantidade() >= quantidadeVendida) {
                                vestuario.setQuantidade(vestuario.getQuantidade() - quantidadeVendida);
                                System.out.println("Venda realizada com sucesso!");
                                Vendidos.add(vestuario.getDescricao());
                            } else {
                                System.out.println("Quantidade insuficiente em estoque para realizar a venda.");
                            }
                        }
                    }
                    System.out.println("Produto não encontrado.");
                    break;

                case 5:
                System.out.println("Produtos vendidos:");
                for (String item : Vendidos) {
                    System.out.println(item);
                }
                default:
                System.out.println("Opção invalida: ");
                break;
            }
        } while (opcao != 6);

    }
}
