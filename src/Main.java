import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = "Jeferson Freire";
        String tipoConta = "Corrente";
        double saldoConta = 2300.00;
        double valor = 0.0;
        int opcao = 0;
        String menu = """
                Menu de opções
                
                1. Consultar saldo
                2. Receber valor
                3. Transferir valor
                4. Sair                
                """;

        System.out.printf("""
                ----------------------------------------------------
                        
                Informações do titular da conta:
                        
                Nome: %s
                Tipo de conta: %s
                Saldo atual: %.2f
                        
                ----------------------------------------------------
                %n""", nome,tipoConta,saldoConta);

        while (opcao != 4) {
            System.out.println(menu);
            System.out.println("Escolha qual operação deseja efetuar:");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n----------------------------------------------------\n");
                    System.out.printf("Saldo atual: R$ %.2f", saldoConta);
                    System.out.println("\n\n----------------------------------------------------\n");

                    break;
                case 2:
                    System.out.println("\n----------------------------------------------------\n");
                    System.out.println("Receber valor: R$ ");
                    valor = sc.nextDouble();
                    if(valor>0) {
                        saldoConta += valor;
                        System.out.println("\nOperação realizada com sucesso!\n");
                    }else{
                        System.out.println("Informe um valor mínimo R$ 0.01!\n");
                    }
                    System.out.printf("Saldo atual: R$ %.2f", saldoConta );
                    System.out.println("\n\n----------------------------------------------------\n");
                    break;
                case 3:
                    System.out.println("\n----------------------------------------------------\n");
                    System.out.println("Transferir valor: R$ ");
                    valor = sc.nextDouble();
                    if (saldoConta >= valor) {
                        saldoConta -= valor;
                        System.out.println("\nOperação realizada com sucesso!\n");
                        System.out.printf("Saldo atual: R$ %.2f", saldoConta);
                        System.out.println("\n\n----------------------------------------------------\n");
                        break;
                    } else {
                        System.out.println("\nSaldo insuficiente!");
                    }
                    System.out.println("\n----------------------------------------------------\n");
                case 4:
                    System.out.println("Sair");
                    opcao = 4;
                    break;
                default:
                    if (opcao < 0  || opcao > 4) {
                        System.out.println("\nEscolha uma opção válida!\n");
                    }
            }
        }
    }
}