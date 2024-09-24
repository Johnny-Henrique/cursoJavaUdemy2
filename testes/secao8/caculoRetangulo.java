package testes.secao8;
import java.util.Scanner;

public class caculoRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Digite a altura do retângulo: ");
        retangulo.altura = sc.nextDouble();
        System.out.println("Digite a largura do retângulo: ");
        retangulo.largura = sc.nextDouble();

        retangulo.area();
        retangulo.diagonal();
        retangulo.perimetro();

        System.out.println(retangulo);

        sc.close();

    }
}
