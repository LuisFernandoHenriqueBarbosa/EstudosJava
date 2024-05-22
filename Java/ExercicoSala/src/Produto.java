public abstract class Produto implements Vendas {
    private int id, quantidade;
    private String descricao;

    public abstract void mostrar();
    
    @Override
    public String toString() {
        return "ID: " + id + ", Quantidade: " + quantidade + ", Descrição: " + descricao;
    }

    public Produto(int id, int quantidade, String descricao) {
        this.id=id;
        this.quantidade=quantidade;
        this.descricao=descricao;
    }
    public Produto(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
}
