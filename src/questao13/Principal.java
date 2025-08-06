package questao13;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        int i;

        
        System.out.println("1 - Soma\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n5 - Sair");
        System.out.print("Selecione a opção correspondente: ");
        i = entrada.nextInt();
        while(i != 5){
            System.out.print("Digite o primeiro número: ");
            num1 = entrada.nextInt();
            System.out.print("Digite o segundo número: ");
            num2 = entrada.nextInt();

            if(i==1){
                System.out.println(num1+" + "+num2+" = "+(num1+num2));
            } else if(i==2){
                System.out.println(num1+" - "+num2+" = "+(num1-num2));
            } else if (i==3){
                System.out.println(num1+" * "+num2+" = "+(num1*num2));
            } else if(i==4){
                System.out.println(num1+" / "+num2+" = "+(num1/num2));
            }
            
            System.out.println("1 - Soma\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n5 - Sair");
            System.out.print("Selecione a opção correspondente: ");
            i = entrada.nextInt();
        }
        System.out.println("Fim!");
        entrada.close();
    }
}
