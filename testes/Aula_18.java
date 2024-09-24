package testes;

import java.util.Scanner;

public class Aula_18 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String dia = "";
        int x;

        System.out.println("Digite um valor: ");
        x = sc.nextInt();

        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sábado.";
                break;
        
            default:
                System.out.println("Valor inválido");
                break;
        }

        System.out.println("Dia da semana"+ dia);  
        sc.close();
    }

}
