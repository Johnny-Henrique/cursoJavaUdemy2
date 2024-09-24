package testes.secao8;
import java.util.Scanner;


public class calculoSalario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Empregado empregado = new Empregado();

        System.out.println("Digite o nome do funcionário: ");
        empregado.nome = sc.nextLine();
        System.out.println("Digite o salário bruto do funcionário: ");
        empregado.salarioBruto = sc.nextDouble();
        System.out.println("Digite as taxas mensais do funconário: ");
        empregado.taxas = sc.nextDouble();

        System.out.println(empregado);
      
        System.out.println("Digite o percentual de aumento: ");
        double aumento = sc.nextDouble();
        empregado.aumento(aumento);

        System.out.println(empregado);
        
        sc.close();


    


    }
}
