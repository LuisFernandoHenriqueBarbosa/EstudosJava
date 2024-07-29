import java.util.Scanner;

public class Aluno extends Pessoa {
    String curso;

    public String toString(){
        return "Id: " +id + "\nNome:"+nome+
        "\nCurso: "+curso;
    }
    public void mostrar(){
        System.out.println("Id: " +id + "\nNome:"+nome+
        "\nCurso: "+curso);
    }
    public void cadastrar(){
        super.cadastrar();//classe Pessoa
        Scanner ler = new Scanner(System.in);
        do {
            try{
                System.out.println("Digite o curso:");
                curso=ler.next();
            }catch(Exception erro){
                System.out.println("Erro:"+erro.getMessage());
                ler.next();
            }
        } while (curso.equals(""));
    }
}
