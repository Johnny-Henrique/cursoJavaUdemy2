package testes;
import java.util.Scanner;

public class Aula_7_teste {  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hora;
        
        System.out.println("Qual a hora?");
        hora = sc.nextInt();

        if (hora < 12){
            System.out.println("bom dia");
        }
        else {
            if (hora <18){
                System.out.println("Boa tarde");
            }
            else {
                System.out.println("Boa noite"); 
            }
            
            sc.close();

            
        }
        }



    
}
    
