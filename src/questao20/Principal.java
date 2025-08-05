package questao20;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;

        System.out.println("Digite um número: ");
        num1 = entrada.nextInt();

        if(num1%3==0 & num1%5==0){
            System.out.printf("O número %d é disível por 3 e por 5.", num1);
        } else if (num1%3==0 & num1%5!=0){
            System.out.printf("O número %d é disível apenas por 3.",num1);
        } else if (num1%5==0 & num1%3!=0){
            System.out.printf("O número %d é disível apenas por 5.",num1);
        } else if (num1%5!=0 & num1%3!=0){
            System.out.printf("O número %d não é divisível nem por 3 nem por 5.",num1);
        }
        entrada.close();
    }
}
