package questao16;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  
        int num1;

        System.out.println("Digite um número: ");
        num1=entrada.nextInt();

        System.out.println("A Tabuada de multiplicação do número "+num1+"é: ");
        for(int i = 1; i <=10; i++){
            System.out.println(num1+" x "+i+" = "+(num1*i));
        }

        System.out.println("A Tabuada de divisão do número "+num1+"é: ");
        for(int i = 1; i <=10; i++){
            System.out.println(num1+" / "+i+" = "+(num1/i));
        }

        entrada.close();
    }
}
