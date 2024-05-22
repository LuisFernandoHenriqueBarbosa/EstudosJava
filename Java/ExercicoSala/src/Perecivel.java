public final class Perecivel extends Produto {
    private String validade;

    public Perecivel (int codigo, int quantidade, String descricao, String validade){
        super(codigo, quantidade, descricao);
        this.validade=validade;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
    
    public void vender(){

    }
    public void baixarEstoque(){
        
    }
    public void mostrar(){
        System.out.println("Produtos Perecível");
    }
}
