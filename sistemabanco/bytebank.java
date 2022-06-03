package sistemabanco;

import java.util.concurrent.TimeUnit;

//Program start
public class bytebank {
    public static void main(String[] args) {

        // Abertura do Programa Bytebank
        System.out.println("=========================================================");
        System.out.println("          Bem-Vindo ao Banco Bytebank (Fictício)!        ");
        System.out.println("=========================================================");

        // Adicionando as contas ao sistema
        Cliente informacoes = new Cliente();
        Conta primeiraConta = new Conta();
        Conta investimentosConta = new Conta();

        // Adicionando 2 segundos de delay para a próxima mensagem....
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Dados bancários do usuário
        System.out.println("Agência: " + informacoes.getAgencia() + " Brasil");
        System.out.println("Conta: " + informacoes.getNumero() + " - BR");
        System.out.println("Seja Bem-Vindo " + informacoes.getTitular() + "!");
        System.out.println("Idade: " + informacoes.getIdade() + " anos");
        System.out.println("CPF: " + informacoes.getCpf());
        System.out.println("Profissao: " + informacoes.getProfissao());
        System.out.print("\n");

        // Adicionando 2 segundos de delay para a próxima mensagem....
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Informações sobre o saldo
        primeiraConta.depositar(200);
        System.out.println("O saldo da sua conta bancária é de: " + primeiraConta.pegaSaldo() + " reais brasileiros");

        // Adicionando o bônus de nova conta ao usuário
        primeiraConta.depositar(50);
        System.out.println("Bônus de Nova Conta Adicionado!");
        System.out.println("Seu novo saldo é de: " + primeiraConta.pegaSaldo() + " reais brasileiros");
        System.out.print("\n");

        // Conta de Investimentos do Usuário
        investimentosConta.pegaSaldo();
        investimentosConta.depositar(50);
        System.out.println("Bônus de Nova Conta adicionado!");
        System.out
                .println("Sua Conta de Investimentos agora possui: " + investimentosConta.pegaSaldo()
                        + " reais brasileiros");
        System.out.print("\n");

        // Adicionando 1 segundo de delay para a próxima mensagem....
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Depositar dinheiro na conta principal
        primeiraConta.depositar(10);
        System.out.println("O novo saldo da conta é: " + primeiraConta.pegaSaldo() + " reais brasileiros");
        System.out.println("=========================================================");
        System.out.print("\n");

        // Sacar dinheiro da conta principal
        primeiraConta.sacar(10);
        System.out.println("O novo saldo da conta é: " + primeiraConta.pegaSaldo() + " reais brasileiros");
        System.out.println("=========================================================");
        System.out.print("\n");

        // Adicionando 1 segundo de delay para a próxima mensagem....
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Transferir dinheiro de uma conta para outra
        primeiraConta.transfere(50, investimentosConta);
        System.out.println(
                "O novo valor em sua conta bancária é de: " + primeiraConta.pegaSaldo() + " reais brasileiros");
        System.out.println(
                "O novo valor em sua conta de investimentos é de: " + investimentosConta.pegaSaldo()
                        + " reais brasileiros");
        System.out.println("=========================================================");
        System.out.print("\n");

        // Adicionando 1 segundo de delay para a próxima mensagem....
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Convertendo o dinheiro do usuário
        primeiraConta.converte(primeiraConta);
        System.out.println("=========================================================");
        System.out.print("\n");

        // Adicionando 1 segundo de delay para a próxima mensagem....
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Encerrando o Programa
        System.out.println("Encerrando a sua sessao...");
        System.out.println("Até a próxima, " + informacoes.getTitular() + "!");
        System.out.print("\n");
        System.out.println("=========================================================");
        System.out.println("               Banco Bytebank (Fictício)!                ");
        System.out.println("=========================================================");
        return;
    }
}