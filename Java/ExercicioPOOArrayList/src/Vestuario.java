public class Vestuario extends Produto {
    String tamanho;

    public Vestuario(){

    }

    public Vestuario(int codigo, String descricao, int quantidade, String tamanho){
        super(codigo, descricao, quantidade);
        this.tamanho=tamanho;
    }
    
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String toString(){
        return super.toString() + " Tamanho: " + tamanho;
    }
}