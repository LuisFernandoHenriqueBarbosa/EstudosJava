import java.util.ArrayList;
import java.util.Scanner;

public class CadastraAnimal {
    public static void main(String[] args) throws Exception {
        ArrayList<Mamiferos> Mamifero = new ArrayList<>();
        ArrayList<Aves> Ave = new ArrayList<>();
        Scanner leia = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Escolha uma opção: \n");
            System.out.println("1 -- Cadastra Mamíferos");
            System.out.println("2 -- Cadastra Aves");
            System.out.println("3 -- Lista Animais");
            System.out.println("4 -- Sair\n");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastro de Mamíferos: ");
                    Mamiferos objmamiferos = new Mamiferos();

                    do {
                        System.out.println("Digite o id do animal: ");
                        objmamiferos.setId(leia.nextInt());
                    } while (objmamiferos.getId() <= 0);

                    do {
                        System.out.println("Digite o nome do animal: ");
                        objmamiferos.setNome(leia.next());
                    } while (objmamiferos.getNome().length() <= 0);

                    do {
                        System.out.println("Digite o sexo do animal: ");
                        objmamiferos.setSexo(leia.next());
                    } while (objmamiferos.getSexo().length() <= 0);

                    do {
                        System.out.println("Digite a raça do animal: ");
                        objmamiferos.setRaca(leia.next());
                    } while (objmamiferos.getRaca().length() <= 0);

                    do {
                        System.out.println("Digite a cor do animal: ");
                        objmamiferos.setCor(leia.next());
                    } while (objmamiferos.getCor().length() <= 0);

                    do {
                        System.out.println("Digite a quantidade de pata do animal");
                        objmamiferos.setQtdaPatas(leia.nextInt());
                    } while (objmamiferos.getQtdaPatas() <= 0);

                    do {
                        System.out.println("Digite o peso do animal");
                        objmamiferos.setPeso(leia.nextFloat());
                    } while (objmamiferos.getPeso() <= 0.0);

                    System.out.println("Animal Cadastrado com sucesso: ");

                    Mamifero.add(objmamiferos);
                    break;

                case 2:
                    System.out.println("Cadastro de Aves: ");
                    Aves objAves = new Aves();

                    do {
                        System.out.println("Digite o id do animal: ");
                        objAves.setId(leia.nextInt());
                    } while (objAves.getId() <= 0);

                    do {
                        System.out.println("Digite o nome do animal: ");
                        objAves.setNome(leia.next());
                    } while (objAves.getNome().length() <= 0);

                    do {
                        System.out.println("Digite o sexo do animal: ");
                        objAves.setSexo(leia.next());
                    } while (objAves.getSexo().length() <= 0);

                    do {
                        System.out.println("Digite a raça do animal: ");
                        objAves.setRaca(leia.next());
                    } while (objAves.getRaca().length() <= 0);

                    do {
                        System.out.println("Digite a cor do animal: ");
                        objAves.setCor(leia.next());
                    } while (objAves.getCor().length() <= 0);
                    do {
                        System.out.println("Digite o tipo de pena: ");
                        objAves.setTipoPena(leia.next());
                    } while (objAves.getTipoPena().length() <= 0);

                    System.out.println("Animal Cadastrado com sucesso: ");

                    Ave.add(objAves);
                    break;

                case 3:
                    System.out.println("Mamíferos Cadastrado");
                    for (Mamiferos listaMamifero : Mamifero) {
                        System.out.println("Id: " + listaMamifero.getId());
                        System.out.println("Nome: " + listaMamifero.getNome());
                        System.out.println("Sexo: " + listaMamifero.getSexo());
                        System.out.println("Raça: " + listaMamifero.getRaca());
                        System.out.println("Cor: " + listaMamifero.getCor());
                        System.out.println("Quantidade de patas: " + listaMamifero.getQtdaPatas());
                        System.out.println("Peso: " + listaMamifero.getPeso());
                    }

                    System.out.println("Aves Cadastrado");
                    for (Aves listaAves : Ave) {
                        System.out.println("Id: " + listaAves.getId());
                        System.out.println("Nome: " + listaAves.getNome());
                        System.out.println("Sexo: " + listaAves.getSexo());
                        System.out.println("Raça: " + listaAves.getRaca());
                        System.out.println("Cor: " + listaAves.getCor());
                        System.out.println("Quantidade de patas: " + listaAves.getTipoPena());
                    }
                    break;

                case 4:
                    System.out.println("Programa encerrado!!");
                    break;

                default:
                    System.out.println("Opção Inválida:");
                    break;
            }

        } while (opcao != 4);

    }

}
