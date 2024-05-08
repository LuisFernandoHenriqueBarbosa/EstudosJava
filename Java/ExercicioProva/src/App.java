import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        char continua;
        int id;
        String descricao, turno;
        Scanner leia = new Scanner(System.in);
        ArrayList<Curso> cursos = new ArrayList<>();


        do{
            Curso curso = new Curso();
            System.out.println("Digite o id do curso: ");
            curso.setId(leia.nextInt());
            System.out.println("Digite a descrição do curso: ");
            curso.setDescricao(leia.next());
            System.out.println("Digite o turno do curso: ");
            curso.setTurno(leia.next());;

            System.out.println("Deseja cadastrar um novo curso? [S-Sim] [N-Não]");
            continua = leia.next().charAt(0);
        }while(continua == 'S');
    }
}
