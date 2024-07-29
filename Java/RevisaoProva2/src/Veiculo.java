public class Veiculo {
    protected String marca; 
  
    public Veiculo(String marca) { 
        this.marca = marca;    } 
  
    public void acelerar() { 
        System.out.println("O veículo da marca " + marca + " está acelerando.");    } 
  
 
 
 
public void acelerar(int velocidade) { 
        System.out.println("O veículo da marca " + marca + " está acelerando a " + velocidade + " km/h."); 
    } 
}

//Sobrecarga: A mesma classe tem métodos com o mesmo nome, mas diferentes assinaturas de parâmetros.
