package questao19;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;

        do{
            System.out.println("Digite um número inteiro entre 1 e 7 (para escolher as semanas): ");
            num1 = entrada.nextInt();

            switch (num1) {
                case 1:
                System.out.println("Você selecionou a Domingo.");
                    break;
                case 2:
                System.out.println("Você selecionou a Segunda-Feira.");
                    break;
                case 3:
                System.out.println("Você selecionou a Terça-Feira.");
                    break;
                case 4:
                System.out.println("Você selecionou a Quarta-Feira.");
                    break;
                case 5:
                System.out.println("Você selecionou a Quinta-Feira.");
                    break;
                case 6:
                System.out.println("Você selecionou a Sexta-Feira.");
                    break;
                case 7:
                System.out.println("Você selecionou a Sábado.");
                    break;
            }

            if(num1 < 1 || num1 > 7){
                System.out.println("Número inválido.");
            }

        }while (num1 < 1 || num1 > 7);

        entrada.close();
    } 
}
