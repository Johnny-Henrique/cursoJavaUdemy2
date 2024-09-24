package testes.secao8;
import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mediaAluno aluno = new mediaAluno();

        System.out.println("Digite o nome do Aluno: ");
        aluno.nome = sc.nextLine();
        System.out.println("Digite a priemira nota: ");
        aluno.primeiraNota = sc.nextDouble();
        System.out.println("Digite a seguunda nota: ");
        aluno.segundaNota = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        aluno.terceiraNota =  sc.nextDouble();

        aluno.somaNota();
        aluno.verificacao();
 
        sc.close(); 

    }
    
}
