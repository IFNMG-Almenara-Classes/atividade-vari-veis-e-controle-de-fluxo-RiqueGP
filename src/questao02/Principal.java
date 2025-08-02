package questao02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peso;
        double altura;

        System.out.println("Digite o seu peso: ");
        peso = entrada.nextDouble();

        System.out.println("Digite a sua altura: ");
        altura = entrada.nextDouble();

        double imc = peso/(altura*altura);

        System.out.printf("O seu IMC é de: %.2f \n",imc);

        if (imc < 18.5) {
            System.out.println("Seu IMC indica Magreza.");
        } else if (18.5 <= imc && imc <= 24.9) {
            System.out.println("Seu IMC indica Saudável.");
        } else if (25.0 <= imc && imc <= 29.9) {
            System.out.println("Seu IMC indica Sobrepeso.");
        } else if (30.0 <= imc && imc <= 34.9) {
            System.out.println("Seu IMC indica Obesidade Grau I.");
        } else if (35.0 <= imc && imc <= 39.9) {
            System.out.println("Seu IMC indica Obesidade Grau II (Severa).");
        } else {
            System.out.println("Seu IMC indica Obesidade Grau III (mórbida).");
        }


        entrada.close();
    }
}
