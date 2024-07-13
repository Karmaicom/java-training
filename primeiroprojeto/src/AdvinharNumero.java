import java.util.Random;
import java.util.Scanner;

public class AdvinharNumero {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numeroSecreto = new Random().nextInt(100);
        int tentativa = 1;

        System.out.println("::::::: Game de advinhação de número :::::::\n");

        while (tentativa <= 5) {

            System.out.println("Chute um número entre 0 a 100");
            int numero = scan.nextInt();

            if (numero == numeroSecreto) {
                System.out.println("Você acertou!");
                System.out.println("Número secreto é " + numeroSecreto + ". Você acertou na tentativa " + tentativa);
                return;
            } else if (numero > numeroSecreto) {
                System.out.println("Chute é maior que o número secreto");
            }
            else if (numero < numeroSecreto) {
                System.out.println("Chute é menor que o número secreto");
            }

            tentativa++;
        }

        if (tentativa > 5) System.out.println("Você Perdeu! O número secreto era " + numeroSecreto);
    }

}
