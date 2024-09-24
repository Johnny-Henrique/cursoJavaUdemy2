package testes;
import java.util.*;

public class whille {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha iválida.");
            senha = sc.nextInt();
            
        }

        System.out.println("Acesso Liberado.");
        sc.close();
    }
}
