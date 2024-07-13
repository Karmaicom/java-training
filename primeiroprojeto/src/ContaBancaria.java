import java.util.*;

public class ContaBancaria {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Conta> contas = new ArrayList<>();
        int numeroConta = 0;

        System.out.println("***************************");
        System.out.println("****** Banco Virtual ******");
        System.out.println("***************************");
        System.out.println();

        System.out.println("Digite a opção desejada");
        System.out.println("1- Abrir conta");
        System.out.println("2- Consultar saldo");
        System.out.println("3- Sacar");
        System.out.println("4- Depositar");
        System.out.println("5- Sair da Conta");
        int opcao = ler.nextInt();

        while (opcao != 5) {
            switch (opcao) {
                case 1:
                    var conta = new Conta();
                    System.out.println("Informe os dados da conta");
                    System.out.print("Nome do Titular: ");
                    String nome = ler.nextLine();
                    conta.setNomeTitular(nome);
                    conta.setNumeroDaConta(++numeroConta);
                    conta.setSaldo(0);
                    contas.add(conta);
                    break;
                case 2:
                    System.out.println("Informe o numero da conta: ");
                    var numeroContaPesquisada = ler.nextInt();
                    Conta contaEncontrada = contas.stream().filter(x -> x.getNumeroDaConta() == numeroContaPesquisada)
                            .findFirst().orElse(new Conta());
                    if (contaEncontrada.getNumeroDaConta() <= 0) {
                        System.out.println("Conta não encontrada!");
                    } else {
                        contaEncontrada.toString();
                    }
                    break;
                case 3:
                    System.out.println("Informe o numero da conta: ");
                    numeroContaPesquisada = ler.nextInt();
                    System.out.println("Informe o valor para saque: ");
                    var valorSaque = ler.nextDouble();
                    contaEncontrada = contas.stream().filter(x -> x.getNumeroDaConta() == numeroContaPesquisada)
                            .findFirst().orElse(new Conta());
                    if (valorSaque > contaEncontrada.getSaldo()) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        contaEncontrada.setSaldo(contaEncontrada.getSaldo() - valorSaque);
                        System.out.println("Saque realizado com sucesso!");
                    }
                    break;
                case 4:
                    System.out.println("Informe o numero da conta: ");
                    numeroContaPesquisada = ler.nextInt();
                    System.out.println("Informe o valor para saque: ");
                    var valorDeposito = ler.nextDouble();
                    contaEncontrada = contas.stream().filter(x -> x.getNumeroDaConta() == numeroContaPesquisada)
                            .findFirst().orElse(new Conta());

                    contaEncontrada.setSaldo(contaEncontrada.getSaldo() + valorDeposito);
                    System.out.println("Depósito realizado com sucesso!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        }
    }

}
