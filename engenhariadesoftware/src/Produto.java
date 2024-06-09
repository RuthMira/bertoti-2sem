

public class Produto {
    private String idProduto;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String idProduto, String nome, double preco, int quantidade) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String detalhesProduto() {
        return "ID do Produto: " + idProduto + "\nNome: " + nome + "\nPreço: R$" + preco + "\nQuantidade: " + quantidade;
    }

    // Getters e setters
    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
