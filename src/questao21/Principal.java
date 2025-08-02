package questao21;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade;
        double tempoS;

        System.out.println("Digite a sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Digite o seu tempo de serviço (em anos): ");
        tempoS = entrada.nextDouble();

        if(idade >= 65){
            System.out.println("Você pode se aposentar.");
        } else if ( tempoS >= 30){
            System.out.println("Você pode se aposentar.");
        } else if (idade >=60 && tempoS >= 25){
            System.out.println("Você pode se aposentar.");
        } else{
            System.out.println("Você não pode ser aposentar.");
        }

        entrada.close();
    }
}
