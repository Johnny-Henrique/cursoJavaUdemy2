package testes.secao8;

public class produto {
    public String nome;
    public double preco;
    public int quantEstoque;

    public produto(String nome, double preco, int quantEstoque){ // contrutor para receber vairáveis no sistema
        this.nome = nome;                                        // ajuda a garantir a entrada de dados não vazios.
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }

    public double valorTotalEstoque(){
        return preco * quantEstoque;
    }

    public void addQuantidade(int quantEstoque){
        this.quantEstoque += quantEstoque; // soma o argumento da função no atributo da classe
    }

    public void removerQuantidade(int quantEstoque){
        this.quantEstoque -= quantEstoque;
    }

    public String toString(){
        return nome
            + ", R$ "
            + String.format("%.2f",preco)
            + ", "
            + quantEstoque
            + " unidades, Total: R$ "
            + String.format("%.2f",valorTotalEstoque());

    }
}
