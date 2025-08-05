package questao07;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado1;
        double lado2;
        double lado3;

        do{
            System.out.println("Digite o primeiro lado do triângulo: ");
            lado1 = entrada.nextDouble();
            System.out.println("Digite o segundo lado do triângulo: ");
            lado2 = entrada.nextDouble();
            System.out.println("Digite o terceiro lado do triângulo: ");
            lado3 = entrada.nextDouble();

            if(lado1>lado2+lado3 || lado2>lado1+lado3 ||lado3>lado2+lado1){
                System.out.println("Os números digitados não formam um triângulo!\nPor favor digite os valores novamente.");
            }
        } while (lado1>lado2+lado3 || lado2>lado1+lado3 ||lado3>lado2+lado1);

        if(lado1 == lado2 & lado2 == lado3){
            System.out.println("O trinângulo digitado é um triângulo equilátero.");
        } else if(lado1 != lado2 &  lado2 != lado3 & lado3 != lado1){
            System.out.println("O trinângulo digitado é um triângulo escaleno.");
        } else if (lado1 == lado2 & lado1 != lado3 || lado1 == lado3 & lado1 !=lado2 || lado2 == lado3 & lado2 != lado1){
            System.out.println("O trinângulo digitado é um triângulo isóceles.");
        }

        entrada.close();
    }
}
