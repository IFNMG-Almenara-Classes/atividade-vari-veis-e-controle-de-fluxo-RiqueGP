package questao01;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Digite um número inteiro: ");
        num1 = entrada.nextInt();

        System.out.println("Digite outro número inteiro: ");
        num2 = entrada.nextInt();

        if(num1 > num2){
            System.out.println("O maior número é o número: "+num1);
        } else if(num2 > num1){
            System.out.println("O maior número é o número: "+num2);
        } else{
            System.out.println("Os números "+num1+" e "+num2+" são iguais.");
        }

        entrada.close();
    }
}