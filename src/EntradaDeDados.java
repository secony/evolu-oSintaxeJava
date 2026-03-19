
import java.util.Scanner;

public class EntradaDeDados {

    static void main(String[] args) {

        float valorTotal = 0;
        int carrosTotal = 0;
        int motosTotal = 0;
        int caminhoneteTotal = 0;
        int caminhaoTotal = 0;

        Scanner input = new Scanner(System.in);

        while (valorTotal < 200) {

            float valor = 0;
            int carro = 0;
            int moto = 0;
            int caminhonete = 0;
            int caminhao = 0;

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

            System.out.print("Digite o tempo, em horas :");
            float tempo = input.nextFloat();


            if (veiculo == 0) {
                break;


            } else if (veiculo == 1) {
                carro ++;
                System.out.println("Veículo adicionado com sucesso!");
                System.out.println("Carros: " + carro + " !");
                valor = tempo * 5;
                System.out.println("Valor a ser pago: " + valor + ".");


            } else if (veiculo == 2) {
                moto += 1;
                System.out.println("Veículo adicionado com sucesso!");
                System.out.println("Motos: " + moto + " !");
                valor = tempo *3;
                System.out.println("Valor a ser pago: " + valor + ".");


            } else if (veiculo == 3) {
                caminhonete += 1;
                System.out.println("Veículo adicionado com sucesso!");
                System.out.println("Caminhonetes: " + caminhonete + " !");
                valor = tempo * 8;
                System.out.println("Valor a ser pago: " + valor + ".");


            } else if (veiculo == 4) {
                caminhao += 1;
                System.out.println("Veículo adicionado com sucesso!");
                System.out.println("Caminhões: " + caminhao + " !");
                valor = tempo * 10;
                System.out.println("Valor a ser pago: " + valor + ".");

            } else {
                System.out.println("Veículo invalido!!!");
            }


            valorTotal += valor;
            carrosTotal += carro;
            motosTotal += moto;
            caminhoneteTotal += caminhonete;
            caminhaoTotal += caminhao;

        }
        System.out.println("Encerrando sistema...");
        System.out.println("Valor total arrecadado: " + valorTotal);
        System.out.println("Carros totais:" + carrosTotal + "." );
        System.out.println("Motos totais:" + motosTotal + "." );
        System.out.println("Caminhonetes totais:" + caminhoneteTotal + "." );
        System.out.println("Caminhões totais:" + caminhaoTotal + "." );
    }
}