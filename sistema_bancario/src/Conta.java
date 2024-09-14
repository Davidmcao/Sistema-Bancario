import java.util.Scanner;

public class Conta extends Pessoa {
    private int numConta;
    private double saldo, valor, saldoAtual, valorSaque;
    private String deposito, saque;

    // Construtor
    public Conta(String nome, String cpf, int idade, int numConta, double saldo) {
        super(nome, cpf, idade); // Chama o construtor da classe mãe (Pessoa)
        this.numConta = numConta;
        this.saldo = saldo;
        this.saldoAtual = saldo; // Inicialmente, o saldo atual é igual ao saldo inicial
    }

    // Getters e Setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public String getDeposito() {
        return deposito;
    }

    public void setDeposito(String deposito) {
        this.deposito = deposito;
    }

    public double getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(double valorSaque) {
        this.valorSaque = valorSaque;
    }

    public String getSaque() {
        return saque;
    }

    public void setSaque(String saque) {
        this.saque = saque;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Deseja realizar um depósito? (Sim/Não)");
        deposito = ler.next();

        if (deposito.equalsIgnoreCase("Sim")) {
            System.out.println("Informe o valor do depósito: R$");
            valor = ler.nextDouble();

            saldoAtual += valor; 
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
            System.out.println("Valor após depósito: " + saldoAtual);
        }
    }

    public void sacar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Deseja realizar um saque? (Sim/Não)");
        saque = ler.next();

        if (saque.equalsIgnoreCase("Sim")) {
            System.out.println("Informe o valor do saque: R$ ");
            valorSaque = ler.nextDouble();

            if (valorSaque <= saldoAtual) {
                saldoAtual -= valorSaque; 
                System.out.println("Saque de R$ " + valorSaque + " realizado com sucesso.");
                System.out.println("Valor após saque: " + saldoAtual);
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        }
    }
    public void exibirDadosConta() {
        System.out.println("Número da conta: " + numConta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("Saldo atual: R$ " + saldoAtual);
    }
}
