package questao12;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int acres = 0;
        int contd= 0;

        do{
            System.out.println("Digite um número: ");
            num1 = entrada.nextInt();
            if(num1%2==0){
                acres += num1;
                if (num1 != 0){
                    contd += 1;
                }
            }
        } while(num1 != 0);



        System.out.println("A média de todos os número pares anteriores a '0' é de: "+(acres/contd));
        System.out.println("A quantidade de números pares (exceto o '0') é de: "+contd);

        entrada.close();
    }
}
