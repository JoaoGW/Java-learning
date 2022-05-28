import java.util.concurrent.TimeUnit;
//import java.util.*;

//Java Code
public class programa {
    public static void main(String[] args) {
        /*
         * Variáveis de cabeça
         * Scanner scan = new Scanner(System.in);
         */

        // Exibindo a Introdução do Tema do Arquivo
        System.out.println("Este é o Arquivo de Java");
        System.out.println("Aqui começa o estudo da Linguagem Java");

        System.out.println("-------------------------------------------------------------");

        // Ading a 2 seconds delay
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Apresentação Pessoal
        int idade = 17;
        System.out.println("Seja muito Bem-Vindo!");
        System.out.println("Meu nome é João Pedro do Carmo Ribeiro");
        System.out.println("Eu tenho " + idade + " anos");

        System.out.println("-------------------------------------------------------------");

        // Ading a 2 seconds delay
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Fazendo um cálculo simples com valor tipo int
        int soma;
        soma = 10 + 20;
        System.out.print("A soma dos valores 10 e 20 tem como resultado: ");
        System.out.println(soma);

        // Exibindo o salário com valor tipo double
        double salario = 249.99;
        System.out.println("Meu salário é de: " + salario + " reais");

        // Fazendo um conta maluca com valor tipo float
        float contamaluca = (30 * 51) + (502 / 407) - 104;
        System.out.println("O resultado desta conta maluca é " + contamaluca);

        // Fazendo uma observação com caracteres
        char letra = 'J';
        System.out.println("A letra inicial do nome João é " + letra + "!");
        char valor = 66;
        valor = (char) (valor + 1);
        System.out.println("O Valor de char 66 na Tabela ASCII somado com o valor 1 (mais uma letra) é: " + valor);

        // Fazendo uma observação com strings
        String frase = "Estamos estudando a Linguagem de Programção Java";
        System.out.println(frase + "!!!");

        System.out.println("-------------------------------------------------------------");

        // Ading a 2 seconds delay
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Mexendo com condicionais
        System.out.println("Checando se o usuário é maior de idade...");
        int jonasage = 21;
        if (jonasage >= 18) {
            System.out.println("O Jonas é maior de 18 anos");
            System.out.println("Só não acesse a Deep Web...");
        } else {
            System.out.println("O Jonas é menor de 18 anos");
            System.out.println("Cuidado com o que você navega pela internet");
        }

        System.out.println("-------------------------------------------------------------");

        // Ading a 2 seconds delay
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        /*
         * Checando agora se você é maior de idade
         * System.out.println("Insira sua idade: ");
         * int userage = scan.nextInt();
         * if (userage >= 18) {
         * System.out.println("Você tem permissão para entrar");
         * } else {
         * System.out.println("Você não tem permissão para entrar");
         * }
         */

        // Uso do E e do OU
        if (idade == 17 && jonasage == 21) {
            System.out.println("João tem 17 anos e Jonas 21");
        } else {
            System.out.println("É falso que João tem 17 anos ou Jonas tem 21 anos");
        }
        if (idade > 20 || jonasage > 18) { // Um if sem o else
            System.out.println("Pelo menos uma das duas afirmações é correta");
        }

        boolean joaoacompanhado = false;
        if (idade > 16 && joaoacompanhado == false) {
            System.out.println("Este é o João que você procura");
        } else {
            System.out.println("Este não é o João que você procura");
        }

        System.out.println("-------------------------------------------------------------");

        // Ading a 2 seconds delay
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Laço Condicional While
        int i = 1;
        System.out.println("Laço de Repetição While");
        while (i <= 5) {
            System.out.println(i + "a repetição" + " de 5");
            i++;
        }
        System.out.print("\n");

        // Laços condicionais com escopo
        System.out.println("Laço de Reptição com Escopo");
        int contador = 0;
        while (contador <= 5) {
            int total = 0;
            total = total + contador;
            System.out.println(total);
            contador++;
        }
        System.out.print("\n");

        // Laço Condicional com for
        System.out.println("Laço de Repetição For");
        for (int numero = 1; numero <= 5; numero++) {
            System.out.println(numero + " de 5");
        }
        System.out.print("\n");

        System.out.println("-------------------------------------------------------------");
    }
}
