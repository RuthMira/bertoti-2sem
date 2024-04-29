package engenhariadesoftware;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Inventario inventory = new Inventario();
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que cadastre os produtos
        System.out.println("Cadastro de Produtos:");

        // Cadastro do Produto 1
        System.out.println("Produto 1:");
        System.out.print("ID: ");
        String idProduto1 = scanner.nextLine();
        System.out.print("Nome: ");
        String nomeProduto1 = scanner.nextLine();
        System.out.print("Preço: ");
        double precoProduto1 = scanner.nextDouble();
        System.out.print("Quantidade: ");
        int quantidadeProduto1 = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        Produto produto1 = new Produto(idProduto1, nomeProduto1, precoProduto1, quantidadeProduto1);

        // Cadastro do Produto 2
        System.out.println("Produto 2:");
        System.out.print("ID: ");
        String idProduto2 = scanner.nextLine();
        System.out.print("Nome: ");
        String nomeProduto2 = scanner.nextLine();
        System.out.print("Preço: ");
        double precoProduto2 = scanner.nextDouble();
        System.out.print("Quantidade: ");
        int quantidadeProduto2 = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        Produto produto2 = new Produto(idProduto2, nomeProduto2, precoProduto2, quantidadeProduto2);

        // Adicionar produtos ao inventário
        inventory.adicionarProduto(produto1);
        inventory.adicionarProduto(produto2);

        // Fechar o scanner
        scanner.close();

        // // Criar alguns produtos para teste
        // Produto produto1 = new Produto("1", "Produto 1", 10.0, 5);
        // Produto produto2 = new Produto("2", "Produto 2", 15.0, 10);

        // // Adicionar produtos ao inventário
        // inventory.adicionarProduto(produto1);
        // inventory.adicionarProduto(produto2);

        System.out.println("Produtos no inventário:");
        // Listar produtos do inventário
        for (Produto produto : inventory.listarProdutos()) {
            System.out.println(produto.detalhesProduto());
        }

        // // Atualizar um produto
        // produto1.setNome("Novo Nome");
        // produto1.setPreco(20.0);

        // // Listar produtos do inventário após atualização
        // System.out.println("\nProdutos no inventário após atualização:");
        // for (Produto produto : inventory.listarProdutos()) {
        //     System.out.println(produto.detalhesProduto());
        // }

        // // Remover um produto
        // inventory.removerProduto("2");

        // // Listar produtos do inventário após remoção
        // System.out.println("\nProdutos no inventário após remoção:");
        // for (Produto produto : inventory.listarProdutos()) {
        //     System.out.println(produto.detalhesProduto());
        // }

        // // Exemplo de obtenção de um produto por ID
        // String idProdutoBusca = "1";
        // Produto produtoBusca = inventory.getProdutoPorId(idProdutoBusca);
        // if (produtoBusca != null) {
        //     System.out.println("\nProduto encontrado por ID:");
        //     System.out.println(produtoBusca.detalhesProduto());
        // } else {
        //     System.out.println("\nProduto não encontrado.");
        // }
    }
}
