package questao22;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numero;

        System.out.println("Digite um número entre 1 e 12 para selecionar um mês: ");
        numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Você selecionou Janeiro!");
                break;
            case 2:
                System.out.println("Você selecionou Fevereiro!");
                break;
            case 3:
                System.out.println("Você selecionou Março!");
                break;
            case 4:
                System.out.println("Você selecionou Abril!");
                break;
            case 5:
                System.out.println("Você selecionou Maio!");
                break;
            case 6:
                System.out.println("Você selecionou Junho!");
                break;
            case 7:
                System.out.println("Você selecionou Julho!");
                break;
            case 8:
                System.out.println("Você selecionou Agosto!");
                break;
            case 9:
                System.out.println("Você selecionou Setembro!");
                break;
            case 10:
                System.out.println("Você selecionou Outubro!");
                break;
            case 11:
                System.out.println("Você selecionou Novembro!");
                break;
            case 12:
                System.out.println("Você selecionou Dezembro!");
                break;
            default:
            System.out.println("Você digitou um número fora do intervalo de 1 à 12!");
                break;
        }
        scanner.close();
    }
}
