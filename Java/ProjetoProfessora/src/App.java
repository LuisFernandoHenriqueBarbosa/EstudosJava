import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String cpf="", cep="", telefone="", email="", cnpj="";
        Scanner ler = new Scanner(System.in);

    }
    public static boolean validaCPF(String cpf){
        if(cpf.length()==17 && cpf.charAt(3) == '.' && cpf.charAt(7) == '.' && cpf.charAt(11) == '-'){
        return true;
        }else{
            return false;
        }    
    }
    public static boolean validaCEP(String cep){
        return true;    
    }
    public static boolean validaCNPJ(String cnpj){
        return true;    
    }
    public static boolean validaTelefone(String telefone){
        return true;    
    }
    public static boolean validaEmail(String email){
        return true;    
    }
}
