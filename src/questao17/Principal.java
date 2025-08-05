package questao17;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int multi = 1;

        System.out.println("Digite um número: ");
        num1 = entrada.nextInt();

        for(int i = num1; i>=1; i--){
            multi*=i;
        }
        System.out.println("!"+num1+" é igual a: "+multi);

        entrada.close();
    }
}
