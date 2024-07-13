import java.util.UUID;

public class Conta {

    private int numeroDaConta;
    private String nomeTitular;

    public Conta() {
    }

    public Conta(int numeroDaConta, String nomeTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
    }

    private double saldo;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroDaConta=" + numeroDaConta +
                ", nomeTitular='" + nomeTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
