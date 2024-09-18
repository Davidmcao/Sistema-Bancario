import java.util.Scanner;

public class testeConta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do titular: ");
        String nome = ler.nextLine();

        Conta conta = new Conta(nome, "", 0, 0, 0);

        conta.Conta(); 

        conta.exibirDadosConta(); 

        conta.depositar(); 

        conta.sacar(); 

        conta.transferencia();

        conta.exibirDadosConta(); 
    }
}