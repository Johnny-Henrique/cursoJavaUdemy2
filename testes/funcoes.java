package testes;
import java.util.Scanner;

//Programa que lê 3 numeros e retorna o maior.

public class funcoes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 números: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double higher = max(a,b,c); 
        showResults(higher);

        sc.close();
    }

    public static double max(double x,double y,double z){
        double aux;
        if (x > y && x > z){
            aux = x;
        }
        else if (y > z) { 
            aux = y;
        }
        else{
            aux = z;
        }
        return aux;
    }

    public static void showResults(double value){
        System.out.println("Higher: " + value);

    }

}
