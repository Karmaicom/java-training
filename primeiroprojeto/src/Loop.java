import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int quantidadeDeNotas = 0;

        System.out.print("Informe a quantidade de notas: ");
        quantidadeDeNotas = leitura.nextInt();

        for (int i=1; i <= quantidadeDeNotas; i++) {
            System.out.println("Informe a nota " + i + ": ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println(String.format("Media: %.1f"  ,(mediaAvaliacao / quantidadeDeNotas)));

    }

}
