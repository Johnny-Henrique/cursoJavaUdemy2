package testes.secao8;
import java.util.Scanner;

public class exAula67 {
    public static void main(String [] argrs){

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrada de Produto: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantEstoque = sc.nextInt();

        produto Produto = new produto(nome, preco, quantEstoque); // construtor com os seus atributos criados
        
        System.out.println();
        System.out.println("Digite o produto: " + Produto);

        System.out.println();
        System.out.println("Digite a quantidade que deseja adicionar ao estoque: ");
        quantEstoque = sc.nextInt();
        Produto.addQuantidade(quantEstoque);

        System.out.println();
        System.out.println("Dados atualizados: " + Produto);

        System.out.println();
        System.out.println("Digite a quantidade que deseja remover do estoque: ");
        int removerestoque = sc.nextInt();
        Produto.removerQuantidade(removerestoque);

        System.out.println();
        System.out.println("Dados atualizados: " + Produto);
        
        sc.close();

    }
}
