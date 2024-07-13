public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");

        String nomeDoFilme = "Top Gun Maverick";

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        // Média calculada por 3 notas informadas
        double media = (8.1 + 6.3 + 8.0) / 3;
        String avaliacaoGeral = "Muito bom!";

        String sinopse = """ 
                Filme: %s
                Filme de aventura com galã dos anos 80
                Avaliação geral: %s
                Ano de Lançamento: %d
                Nota média: %.2f""".formatted(nomeDoFilme, avaliacaoGeral, anoDeLancamento, media);
        System.out.println(sinopse);
    }
}