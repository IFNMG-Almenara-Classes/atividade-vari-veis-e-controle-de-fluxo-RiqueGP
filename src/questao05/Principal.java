package questao05;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double laranjas;

        do{
            System.out.println("Digite o número de laranjas: ");
            laranjas = entrada.nextDouble();

            if(laranjas <= 0){
                System.out.println("Valor inválido, digite um valor maior que '0'.");
                continue;
            }

            if(laranjas < 12){
            System.out.println("O preço total ficará: R$"+0.5*laranjas);
            } else{
            System.out.println("O preço total ficará: R$"+0.3*laranjas);
            }
        } while (laranjas <= 0);


        entrada.close();
    }
}
