import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int quantidadeDeNotas = 0;

        while (nota != -1) {
            System.out.println("Informe a nota : ");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                quantidadeDeNotas++;
            }
        }

        System.out.println(String.format("Media: %.1f", (mediaAvaliacao / quantidadeDeNotas)));

    }
}
