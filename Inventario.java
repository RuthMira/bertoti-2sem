import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Produto> produtos;

    public Inventario() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(String idProduto) {
        produtos.removeIf(p -> p.getIdProduto().equals(idProduto));
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }

    public Produto getProdutoPorId(String idProduto) {
        for (Produto produto : produtos) {
            if (produto.getIdProduto().equals(idProduto)) {
                return produto;
            }
        }
        return null;
    }
}
