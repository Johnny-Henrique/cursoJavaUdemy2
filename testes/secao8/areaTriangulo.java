package testes.secao8;

import java.util.Scanner;

public class areaTriangulo {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        triangulo x, y;
        x = new triangulo(); // instanciar a variável
        y = new triangulo(); // isntanciar a variável

        System.out.println("Digite os vertices do triângulo x : ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite os vertices do triângulo y : ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();     
        double areaY = y.area();

        System.out.printf("Area do Triângulo x: %.2f%n ", areaX);
        System.out.printf("Area do Triângulo y: %.2f%n ", areaY);

        if (areaX > areaY){
            System.out.println("Maior aréa: " + areaX );
        }
        else{
            System.out.println("Maior aréa: " + areaY );
        }

        sc.close();
    }

}