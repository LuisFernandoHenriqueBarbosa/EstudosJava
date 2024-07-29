public class Produto {
    int codigo, quantidade;
    String descricao;

    public Produto(){
        
    }

    public Produto(int codigo, String descricao, int quantidade){
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        return "Codigo: " + codigo + "Descrição: " + descricao + "Quantidade: " + quantidade;
    }
}
