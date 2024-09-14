public class testeConta {
    public static void main(String[] args) {
        
        Conta conta = new Conta("David", "86546532565", 20, 32456, 1420.50);

        conta.exibirDadosConta();

        conta.depositar();

        conta.sacar();
        
        conta.exibirDadosConta();
    }
}
