package questao14;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cliente;
        int pizza;
        int valor;

        System.out.print("Bem-vindo! Informe se você é:\n1 - Comum; \n2 - ClienteVip\n3 - Funcionário\nDigite o seu número correspondente: ");
        cliente = entrada.nextInt();

        System.out.println("Digite sua opção de pizza: ");
        System.out.println(" 1 - Calabresa (R$100,00).");
        System.out.println(" 2 - Mussarela (R$160,00).");
        System.out.println(" 3 - Carne Seca (R$200,00).");
        System.out.println("Digite o número correspondente: ");
        pizza = entrada.nextInt();

        if(cliente == 1){
            if(pizza == 1){
                System.out.println("O valor total da compra ficará: R$100,00");
                do{
                    valor = entrada.nextInt();
                    if (valor!=100){
                        System.out.println("Valor inválido.");
                    }
                } while(valor!=100);
            } else if(pizza == 2){
                System.out.println("O valor total da compra ficará: R$160,00");
                do{
                    valor = entrada.nextInt();
                    if (valor!=150){
                        System.out.println("Valor inválido.");
                    }
                } while(valor!=150);
            } else if(pizza == 3){
                System.out.println("O valor total da compra ficará: R$200,00");
                do{
                    valor = entrada.nextInt();
                    if (valor!=200){
                        System.out.println("Valor inválido.");
                    }
                } while(valor!=200);
            }
        }

        if(cliente == 2){
            if(pizza == 1){
                System.out.println("O valor total da compra ficará: R$95,00");
                do{
                    valor = entrada.nextInt();
                    if (valor!=95){
                        System.out.println("Valor inválido.");
                    }
                } while(valor!=95);
            } else if(pizza == 2){
                System.out.println("O valor total da compra ficará: R$152,00");
                do{
                    valor = entrada.nextInt();
                    if (valor!=152){
                        System.out.println("Valor inválido.");
                    }
                } while(valor!=152);
            } else if(pizza == 3){
                System.out.println("O valor total da compra ficará: R$190,00");
                do{
                    valor = entrada.nextInt();
                    if (valor!=190){
                        System.out.println("Valor inválido.");
                    }
                } while(valor!=190);
            }
        }

        if(cliente == 3){
            if(pizza == 1){
                System.out.println("O valor total da compra ficará: R$90,00");
                do{
                    valor = entrada.nextInt();
                    if (valor!=90){
                        System.out.println("Valor inválido.");
                    }
                } while(valor!=90);
            } else if(pizza == 2){
                System.out.println("O valor total da compra ficará: R$144,00");
                do{
                    valor = entrada.nextInt();
                    if (valor!=144){
                        System.out.println("Valor inválido.");
                    }
                } while(valor!=144);
            } else if(pizza == 3){
                System.out.println("O valor total da compra ficará: R$180,00");
                do{
                    valor = entrada.nextInt();
                    if (valor!=180){
                        System.out.println("Valor inválido.");
                    }
                } while(valor!=180);
            }
            System.out.println("Transação aprovada!");
        }

        entrada.close();
    }

}
