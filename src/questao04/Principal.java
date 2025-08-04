package questao04;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String senha;

        do{
            System.out.println("Digite a senha: ");
            senha = entrada.nextLine();
            
            if(!senha.equals("1234")){                
                System.out.println("Acesso negado!");
            }

        } while(!senha.equals("1234"));
     
        System.out.println("Acesso permitido!");

        entrada.close();
    }   
}
