import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        char continua;
        int matutino = 0;
        int vespertino = 0;
        int noturno = 0;
        String turno;
        Scanner leia = new Scanner(System.in);
        ArrayList<Curso> cursos = new ArrayList<>();


        do{
            Curso curso = new Curso();
            do{
                System.out.println("Digite o id do curso: ");
                curso.setId(leia.nextInt());
            }while (curso.getId() <= 0) ;
            
            do{
                System.out.println("Digite a descrição do curso: ");
                curso.setDescricao(leia.next());
            }while (curso.getDescricao().trim().length() <= 10);
            boolean validaTurno = false;
            do{
                System.out.println("Digite o turno do curso: [Matutino] [Vespertino] [Noturno]");
                curso.setTurno(leia.next());
                if(curso.getTurno().equals("Matutino") || curso.getTurno().equals("Vespertino")|| curso.getTurno().equals("Noturno")){
                validaTurno = true;                    
                }
            }while (validaTurno !=true); 
            
            cursos.add(curso);


            System.out.println("Deseja cadastrar um novo curso? [S-Sim] [N-Não]");
            continua = leia.next().charAt(0);
        }while(continua == 'S');

            for (Curso curso : cursos) {
                turno = curso.getTurno();
                if (turno.equals("Matutino")) {
                    matutino++;
                } else if (turno.equals("Vespertino")) {
                    vespertino++;
                } else if (turno.equals("Noturno")) {
                    noturno++;
                }
                }
                System.out.println("Quantidade de cursos por turno:");
                System.out.println("Matutino: " + matutino);
                System.out.println("Vespertino: " + vespertino);
                System.out.println("Noturno: " + noturno);
            }
    }

