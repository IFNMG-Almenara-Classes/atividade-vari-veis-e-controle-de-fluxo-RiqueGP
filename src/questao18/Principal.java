package questao18;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        int cont = 0;
        int primo = 0;

        
        System.out.println("Digite o primeiro (o menor) número inteiro.");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo número inteiro.");
        num2 = entrada.nextInt();
        System.out.println("Os números são: ");

        if (num1<num2){
            for(int i = num1; i<=num2; i++) {
                System.out.print(i+" ");
                for(int x = 1; x <=num2; x++){
                    if(i%x==0){
                        cont+=1;
                    }
                }
                if(cont ==2){
                    primo+=1;
                    cont-=2;
                }else if(cont != 2){
                    cont-=cont;
                }
            }
        }

        if (num2<num1){
            for(int i = num2; i<=num1; i++) {
                System.out.print(i+" ");
                for(int x = 1; x <=num1; x++){
                    if(i%x==0){
                        cont+=1;
                    }
                }
                if(cont ==2){
                    primo+=1;
                    cont-=2;
                }else if(cont != 2){
                    cont-=cont;
                }
            }
        }
        System.out.println("\nE nesse intervalo possuí "+primo+" números primos.");

        entrada.close();
    }
}
