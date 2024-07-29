public class Carro extends Veiculo {
    private int ano; 
  
    public Carro(String marca, int ano) { 
        super(marca); 
        this.ano = ano; 
    } 
  
    public void acelerar(boolean ligarFarol) { 
        if (ligarFarol) { 
            System.out.println("O carro da marca " + marca + " está acelerando com o farol ligado."); 
        } else { 
            System.out.println("O carro da marca " + marca + " está acelerando com o farol desligado."); 
        } 
    } 
} 

 //Sobrescrita: Onde uma subclasse fornece uma implementação específica para um método que já está definido em sua superclasse.
 
