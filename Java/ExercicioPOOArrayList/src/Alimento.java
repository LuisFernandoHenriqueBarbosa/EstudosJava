public class Alimento extends Produto{
    String dataValidade;

    public Alimento(){
        
    }

    public Alimento(int codigo, String descricao, int quantidade, String dataValidade){
        super(codigo, descricao, quantidade);
        this.dataValidade=dataValidade;
    }
  
    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    public String toString(){
        return super.toString() + "Validade: " + dataValidade;
    }
}