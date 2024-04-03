import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Cliente objCliente = new Cliente();
        
        System.out.println("Digite o seu nome: ");
        objCliente.nome = ler.next();
        boolean cpfValido;
        do {
            System.out.println("Digite o seu CPF: ");
            String cpf = ler.next();
            cpfValido = validaCPF(cpf);
            if (cpfValido) {
                objCliente.cpf = cpf;
            } else {
                System.out.println("CPF inválido. Digite novamente.");
            }
        } while (!cpfValido);

        boolean rgValido;
        do {
            System.out.println("Digite o seu RG: ");
            String rg = ler.next();
            rgValido = validaRg(rg);
            if (rgValido) {
                objCliente.rg = rg;
            } else {
                System.out.println("Rg inválido. Digite novamente.");
            }
        } while (!rgValido);

        boolean emailValido;
        do {
            System.out.println("Digite o seu Email: ");
            String email = ler.next();
            emailValido = validaEmail(email);
            if (emailValido) {
                objCliente.email = email;
            } else {
                System.out.println("Email inválido. Digite novamente.");
            }
        } while (!emailValido);

        boolean telefoneValido;

        do {
            System.out.println("Digite o seu Telefone: ");
            String telefone = ler.next();
            telefoneValido = validaTelefone(telefone);
            if (telefoneValido) {
                objCliente.telefone = telefone;
            } else {
                System.out.println("Telefone inválido. Digite novamente.");
            }
        } while (!telefoneValido);

        System.out.println(objCliente.mostrar());
        
        Cliente obj2 = new Cliente();
        obj2.cadastrar();


        ler.close();
    }
    
    public static boolean validaCPF (String cpf) {
        if(cpf.length() != 14){
            return false;
        } else if(cpf.charAt(3) != '.' && cpf.charAt(7) != '.' && cpf.charAt(11) != '-'){
            return false;
        } else {
            return true;
        }
    }

    public static boolean validaRg (String rg) {
        if(rg.length() != 12){
            return false;
        } else if(rg.charAt(2) != '.' && rg.charAt(6) != '.' && rg.charAt(10) != '-'){
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean validaEmail (String email) {
        if(email.length() < 10){
            return false;
        } 
        return email.contains("@") && email.contains(".com");
    }

    public static boolean validaTelefone (String telefone) {
        if(telefone.length() != 14){
            return false;
        } else if(telefone.charAt(0) != '(' && telefone.charAt(3) != ')' && telefone.charAt(9) != '-'){
            return false;
        } else {
            return true;
        }
    }
}