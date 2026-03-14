
import java.util.Scanner;
public class Tabuada {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("DIGITE O NUMERO QUE QUER SABER A TABUADA: ");
        int num1 = input.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(num1+ " x " + i +  " = " + (num1*i));
        }

    }
}
