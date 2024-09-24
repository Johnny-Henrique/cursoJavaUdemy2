package testes.secao8;

public class Empregado {
    public String nome;
    public double salarioBruto;
    public double taxas;

    public double salarioLiquido(){
        return (salarioBruto - taxas);
    }

    public void aumento(double salarioBruto){
        double aux = this.salarioBruto*(salarioBruto/100);
        this.salarioBruto += aux;
    }

    public String toString(){
        return "Nome = "
            + nome
            + " Salário líquido = "
            + salarioLiquido();

    }
}
