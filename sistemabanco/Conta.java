package sistemabanco;

public class Conta {
    private double saldo = 0;
    Cliente titular;

    void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            System.out.println("Realizando a transaçao. Por favor aguarde...");
            this.saldo = this.saldo - valor;
            return true;
        } else {
            System.out.println("Valor de saque superior ao valor disponível em conta");
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso");
            return true;
        } else {
            System.out.println("Algo deu errado ao transferir o valor, tente novamente mais tarde!");
            return false;
        }
    }

    public void converte(Conta converter) {
        double dolar; // Conversão em dólar
        double euro; // Conversão em euro
        double pesosargentinos; // Conversão em pesos argentinos

        dolar = this.saldo / 4.82;
        System.out.println("O seu saldo é de: " + dolar + " dólares americanos");
        euro = this.saldo / 5.13;
        System.out.println("O seu saldo é de: " + euro + " euros");
        pesosargentinos = this.saldo / 0.04;
        System.out.println("O seu saldo é de: " + pesosargentinos + " pesos argentinos");
    }

    public double pegaSaldo() {
        return this.saldo;
    }
}