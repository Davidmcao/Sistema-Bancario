
abstract class Pessoa {
    protected int idade;
    protected String nome, cpf;

    public Pessoa(String nome, String cpf, int idade){
     this.nome = nome;
     this.idade = idade;
     this.cpf = cpf;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void exibirDadosPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}