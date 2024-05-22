public final class Vestuario extends Produto {
    private String tamanho;

    public Vestuario (int codigo, int quantidade, String descricao, String tamanho){
        super(codigo, quantidade, descricao);
        this.tamanho=tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public void vender(){

    }
    public void baixarEstoque(){

    }

    public void mostrar(){
        System.out.println("Produtos vestuarios");
    }
}
