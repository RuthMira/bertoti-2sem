package engenhariadesoftware.src;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        testAdicionarProduto();
        testRemoverProduto();
        testListarProdutos();
        testGetProdutoPorId();
        testDetalhesProduto();
        testAtualizarProduto();
        
    }

    public static void testAdicionarProduto() {
        Inventario inventario = new Inventario();
        Produto produto = new Produto("1", "Produto 1", 10.0, 5);
        
        inventario.adicionarProduto(produto);
        List<Produto> produtos = inventario.listarProdutos();
        
        if (produtos.size() == 1 && produtos.get(0).equals(produto)) {
            System.out.println("Teste adicionarProduto: SUCESSO");
        } else {
            System.out.println("Teste adicionarProduto: FALHA");
        }
    }

    public static void testRemoverProduto() {
        Inventario inventario = new Inventario();
        Produto produto = new Produto("1", "Produto 1", 10.0, 5);
        inventario.adicionarProduto(produto);
        
        inventario.removerProduto("1");
        List<Produto> produtos = inventario.listarProdutos();
        
        if (produtos.isEmpty()) {
            System.out.println("Teste removerProduto: SUCESSO");
        } else {
            System.out.println("Teste removerProduto: FALHA");
        }
    }

    public static void testListarProdutos() {
        Inventario inventario = new Inventario();
        Produto produto1 = new Produto("1", "Produto 1", 10.0, 5);
        Produto produto2 = new Produto("2", "Produto 2", 15.0, 10);
        inventario.adicionarProduto(produto1);
        inventario.adicionarProduto(produto2);
        
        List<Produto> produtos = inventario.listarProdutos();
        
        if (produtos.size() == 2 && produtos.contains(produto1) && produtos.contains(produto2)) {
            System.out.println("Teste listarProdutos: SUCESSO");
        } else {
            System.out.println("Teste listarProdutos: FALHA");
        }
    }

    public static void testGetProdutoPorId() {
        Inventario inventario = new Inventario();
        Produto produto1 = new Produto("1", "Produto 1", 10.0, 5);
        Produto produto2 = new Produto("2", "Produto 2", 15.0, 10);
        inventario.adicionarProduto(produto1);
        inventario.adicionarProduto(produto2);
        
        Produto produtoEncontrado = inventario.getProdutoPorId("1");
        
        if (produtoEncontrado != null && produtoEncontrado.equals(produto1)) {
            System.out.println("Teste getProdutoPorId: SUCESSO");
        } else {
            System.out.println("Teste getProdutoPorId: FALHA");
        }
    }

    public static void testDetalhesProduto() {
        Produto produto = new Produto("1", "Produto 1", 10.0, 5);
        
        String detalhesEsperados = "ID do Produto: 1\nNome: Produto 1\nPreço: R$10.0\nQuantidade: 5";
        String detalhesProduto = produto.detalhesProduto();
        
        if (detalhesProduto.equals(detalhesEsperados)) {
            System.out.println("Teste detalhesProduto: SUCESSO");
        } else {
            System.out.println("Teste detalhesProduto: FALHA");
            System.out.println("Detalhes Esperados:\n" + detalhesEsperados);
            System.out.println("Detalhes do Produto:\n" + detalhesProduto);
        }
    }

    public static void testAtualizarProduto() {
        Inventario inventario = new Inventario();
        Produto produto = new Produto("1", "Produto 1", 10.0, 5);
        inventario.adicionarProduto(produto);
        
        Produto produtoAtualizado = new Produto("1", "Novo Nome", 20.0, 10);
        inventario.atualizarProduto(produtoAtualizado);
        
        Produto produtoObtido = inventario.getProdutoPorId("1");
        if (produtoObtido != null && produtoObtido.equals(produtoAtualizado)) {
            System.out.println("Teste atualizarProduto: SUCESSO");
        } else {
            System.out.println("Teste atualizarProduto: FALHA");
        }
    }
}

