import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class CadastraPessoas {
    public static void main(String[] args) {
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        char continuar='N';
        do {
            Aluno objAluno = new Aluno();
            objAluno.cadastrar();
            listaAlunos.add(objAluno);//adicionar na lista
            System.out.println("Deseja continuar [S]SIM");
            Scanner ler = new Scanner(System.in);
            continuar=ler.next().charAt(0);
        } while (continuar=='S' || continuar=='s');
        //MOSTRAR TODOS OS ALUNOS CADASTRADOS
        System.out.println("\n----- todos os cadastros ----");
        for (Aluno aluno : listaAlunos) {
            System.out.println("\n"+aluno);
        }
        //mostrar só curso=info
        System.out.println("\n--- só alunos de info ----");
        for (Aluno aluno : listaAlunos) {
            if(aluno.curso.equalsIgnoreCase("info"))
                System.out.println("\n"+aluno);
        }
    }
}
