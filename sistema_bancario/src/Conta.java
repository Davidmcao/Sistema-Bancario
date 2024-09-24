import java.util.Scanner;

public class Conta extends Pessoa {
    private int numConta;
    private double saldo, saldoAtual, valorSaque, valorTransf;
    private String deposito, saque, transferencia;

    public Conta(String nome, String cpf, int idade, int numConta, double saldo) {
        super(nome, cpf, idade);
        this.numConta = numConta;
        this.saldo = saldo;
        this.saldoAtual = saldo;
    }

    public void Conta() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe sua idade:");
        this.idade = ler.nextInt();
        if (idade < 18) {
            System.out.println("Você não possui idade suficiente para abrir uma conta.");
            return;
        }

        boolean cpfValido = false;
        while (cpfValido) {
            System.out.println("Informe seu CPF: ");
            this.cpf = ler.next();
            if (cpf.length() != 11 || !cpf.matches("\\d{11}")) {
                System.out.println("CPF inválido. Tente novamente.");
            } else {
                System.out.println("CPF válido.");
                cpfValido = true; 
            }
        }

        System.out.println("Informe o número da conta: ");
        this.numConta = ler.nextInt();

        System.out.println("Informe o saldo inicial: R$");
        this.saldo = ler.nextDouble();
        this.saldoAtual = this.saldo;

        System.out.println("Conta criada com sucesso!");
    }

    public void depositar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Deseja realizar um depósito? (Sim/Não)");
        deposito = ler.next();

        if (deposito.equalsIgnoreCase("Sim")) {
            System.out.println("Informe o valor do depósito: R$");
            double valorDeposito = ler.nextDouble();

            saldoAtual += valorDeposito;
            System.out.println("Depósito de R$ " + valorDeposito + " realizado com sucesso.");
            System.out.println("Saldo atual: R$ " + saldoAtual);
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
                System.out.println("Saldo atual: R$ " + saldoAtual);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        }
    }

    public void transferencia() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Deseja realizar uma transferência? (Sim/Não)");
        transferencia = ler.next();

        if (transferencia.equalsIgnoreCase("Sim")) {
            System.out.println("Informe o valor da transferência: R$ ");
            valorTransf = ler.nextDouble();

            if (valorTransf <= saldoAtual) {
                saldoAtual -= valorTransf;
                System.out.println("Transferência de R$ " + valorTransf + " realizada com sucesso.");
                System.out.println("Saldo atual: R$ " + saldoAtual);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        }
    }

    public void exibirDadosConta() {
        System.out.println("Número da conta: " + numConta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("Saldo atual: R$ " + saldoAtual);
    }
}
