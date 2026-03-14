
import java.util.Scanner;

public class ContaBancaria {
    static void main() {

            String conta = "";

            Scanner input = new Scanner(System.in);

            System.out.print("Digite seu nome: ");
            String nome = input.nextLine();


            System.out.print("Digite seu tipo de conta, corrente [1] ou poupança [2] ");
            String tipoConta = input.nextLine();

            if (tipoConta.equals("2")) {

                conta = "Conta poupança";
            } else if (tipoConta.equals("1")) {

                conta = "Conta corrente";
            } else {
                conta = "invalido";
            }


            System.out.print("Digite seu saldo: ");
            double saldo = input.nextDouble();
            input.nextLine();

            System.out.println("""
                    
                    -------------------------------------------
                    DADOS DO CLIENTE:
                    
                    
                    Nome:             %s
                    Tipo de conta:    %s
                    Saldo:            R$ %.2f
                    -------------------------------------------
                    """.formatted(nome, conta, saldo));
        while (true) {
            System.out.println("""
                    
                    [1]- Verificar saldo
                    [2]- Receber valor
                    [3]- Transferir valor
                    [4]- Sair
                    
                    """);

            System.out.print("Digite a Operação desejada: ");
            String operacao = input.nextLine();

            switch (operacao) {

                case "1":
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;

                case "2":
                    System.out.print("Qual valor quer adicionar? ");
                    double adicionado = input.nextDouble();
                    input.nextLine();

                    saldo += adicionado;
                    System.out.println("Novo saldo: R$ " + saldo);
                    break;

                case "3":
                    System.out.print("Qual valor quer transferir? ");
                    double transferir = input.nextDouble();
                    input.nextLine();

                    if (transferir > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= transferir;
                        System.out.println("Novo saldo: R$ " + saldo);
                    }
                    break;

                case "4":
                    System.out.println("Encerrando programa...");
                    return;

                default:
                    System.out.println("Operação inválida.");
            }

        }
    }
    }
