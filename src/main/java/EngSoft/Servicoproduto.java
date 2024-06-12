package EngSoft;

import java.util.List;
import java.util.ArrayList;

public class Servicoproduto {
    private List<Produto> produtos;
    private Inventario inventario;

    public Servicoproduto() {
        this.produtos = new ArrayList<>();
        this.inventario = new Inventario();
    }

    public Produto criarProduto(String nome, double preco, int quantidade) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do produto não pode estar vazio.");
        }
        if (preco <= 0) {
            throw new IllegalArgumentException("O preço do produto deve ser maior que zero.");
        }
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade do produto não pode ser negativa.");
        }
    
        String idProduto = gerarIdProduto();
        Produto novoProduto = new Produto(idProduto, nome, preco, quantidade);
        produtos.add(novoProduto);
        inventario.adicionarProduto(novoProduto);
        return novoProduto;
    }

    private String gerarIdProduto() {
        int tamanhoLista = produtos.size() + 1;
        return "PROD-" + tamanhoLista;
    }

    public void atualizarProduto(Produto produto) {
        for (Produto p : produtos) {
            if (p.getIdProduto().equals(produto.getIdProduto())) {
                p.setNome(produto.getNome());
                p.setPreco(produto.getPreco());
                p.setQuantidade(produto.getQuantidade());
                break;
            }
        }
    }

    public void deletarProduto(String idProduto) {
        produtos.removeIf(p -> p.getIdProduto().equals(idProduto));
        inventario.removerProduto(idProduto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Produto getProdutoPorId(String idProduto) {
        for (Produto produto : produtos) {
            if (produto.getIdProduto().equals(idProduto)) {
                return produto; // Retorna o produto encontrado
            }
        }
        return null; 
    }
}
    
