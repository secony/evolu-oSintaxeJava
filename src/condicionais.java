
import java.util.Scanner;

public class condicionais {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // PERGUNTA PARA VER SE É ESTUDANTE

        System.out.print("Você é estudante? (S/N): ");
        String estuda = input.nextLine();

        // VARIAVEIS FORA DO LAÇO

        boolean estudante = false;
        boolean maiorIdade = false;

        // VERIFICAÇÃO PARA VER SE É ESTUDANTE

        if (estuda.equals("S")) {
            estudante = true;

        } else if (estuda.equals("N")) {
            estudante = false;
        } else {
            System.out.println("inválido");
        }

        // PERGUNTA PARA VER SE É MAIOR DE IDADE

        System.out.print("Qual sua idade? ");
        int idade = input.nextInt();

        // VERIFICAÇÃO PARA VER SE É MAIOR DE IDADE

        if (idade >= 0 && idade <= 18) {
            maiorIdade = true;
        } else {
            maiorIdade = false;
        }

        // MEIA SE UMA DAS CONDIÇÕES FOREM ATENDIDAS

        if (estudante || maiorIdade) {

            System.out.println("Meia entrada");

        } else {
            System.out.println("Inteira");
        }

    }
}
