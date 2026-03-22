
import java.util.Scanner;

public class EntradaDeDados {

    static void main(String[] args) {

        float valorTotal = 0;
        int carrosTotal = 0;
        int motosTotal = 0;
        int caminhoneteTotal = 0;
        int caminhaoTotal = 0;
        String tipo = "";
        float valor = 0;

        Scanner input = new Scanner(System.in);

        while (valorTotal < 200) {



            System.out.println("-----BEM VINDO AO ESTACIONAMENTO-----");

            System.out.print("Digite o seu nome: ");
            String nome = input.nextLine();

            System.out.println("Olá " + nome + "!, escolha o tipo do seu veículo:");

            System.out.println("""
                    [0] -> ENCERRAR
                    [1] -> CARRO
                    [2] -> MOTO
                    [3] -> CAMINHONETE
                    [4] -> CAMINHÃO
                    """);

            System.out.print("Digite o seu veículo: ");
            int veiculo = input.nextInt();
            input.nextLine();

            if (veiculo == 0) {
                break;
            }

            System.out.print("Digite o tempo, em horas :");
            float tempo = input.nextFloat();
            input.nextLine();

            switch (veiculo) {
                case 1:
                    tipo = "carro";
                    valor = tempo * 5;
                    carrosTotal++;
                    break;
                case 2:
                    tipo = "moto";
                    valor = tempo * 3;
                    motosTotal++;
                    break;
                case 3:
                    tipo = "caminhonete";
                    valor = tempo * 8;
                    caminhoneteTotal++;
                    break;
                case 4:
                    tipo = "caminhao";
                    valor = tempo * 15;
                    caminhaoTotal++;
                    break;
                default:
                    tipo = "INVALIDO";
                    valor = 0;
                    break;

            }

            valorTotal += valor;



        }
        System.out.print( tipo+ "adicionado, Valor a pagar: R$" + valor);
        System.out.println("Encerrando sistema...");
        System.out.println("Valor total arrecadado: " + valorTotal);
        System.out.println("Carros totais:" + carrosTotal + ".");
        System.out.println("Motos totais:" + motosTotal + ".");
        System.out.println("Caminhonetes totais:" + caminhoneteTotal + ".");
        System.out.println("Caminhões totais:" + caminhaoTotal + ".");
    }
}