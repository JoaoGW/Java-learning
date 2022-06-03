package sistemabanco;

public class Cliente {
    private String titular = "Joao Pedro";
    private long cpf = 1234567890;
    private String profissao = "Programador";
    private int idade = 18;
    private int agencia = 9090;
    private int conta = 3287128;

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int novoAgencia) {
        if (agencia <= 0) {
            System.out.println("A Agência contém um número inválido, tente novamente!");
            return;
        } else {
            this.conta = novoAgencia;
        }
    }

    public int getNumero() {
        return this.conta;
    }

    public void setNumero(int novoNumero) {
        if (conta <= 0) {
            System.out.println("A conta contém um número inválido, tente novamente!");
            return;
        } else {
            this.conta = novoNumero;
        }
    }

    public String getTitular() {
        return this.titular;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int novoIdade) {
        this.conta = novoIdade;
    }

    public long getCpf() {
        return this.cpf;
    }

    public String getProfissao() {
        return this.profissao;
    }
}