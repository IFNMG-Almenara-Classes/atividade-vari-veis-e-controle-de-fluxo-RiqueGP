package questao11;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;

        do {
            System.out.println("Digite um número inteiro e positivo: ");
            num1 = entrada.nextInt();
            if(num1<0){
                System.out.println("O número precisa ser positivo!");
            }
        } while(num1<0);

        for(int i = 0; i <=num1; i++){

            if(i%2==0){
                System.out.println("Número: "+i);
            }

        }

        entrada.close();
    }
}
