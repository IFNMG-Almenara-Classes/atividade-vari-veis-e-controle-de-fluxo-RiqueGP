package questao06;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.println("Digite o primeiro número inteiro: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        num2 = entrada.nextInt();
        System.out.println("Digite o terceiro número inteiro: ");
        num3 = entrada.nextInt();

        if(num1<num2 & num1<num3){
            System.out.println("O menor entre os três é o número: "+num1);
        }else if(num2<num1 & num2<num3){
            System.out.println("O menor entre os três é o número: "+num2);
        } else if(num3<num2 & num3<num1){
            System.out.println("O menor entre os três é o número: "+num3);
        }
        entrada.close();
    }
}
