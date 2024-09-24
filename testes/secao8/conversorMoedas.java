package testes.secao8;
import java.util.Scanner;

public class conversorMoedas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a cotação atual do Dollar: ");
        double precoDollar = sc.nextDouble();
        System.out.println("Quantos dollars gostaria de adiquirir? ");
        double valorConverter = sc.nextDouble();

        conversaoMoeda.valorConvertido(precoDollar, valorConverter);

        sc.close();



    }
}
