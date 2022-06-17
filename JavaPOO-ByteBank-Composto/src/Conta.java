public class Conta {
    int conta;
    double saldo;
    int agencia;
    Cliente titular;

    void deposita(double valor) {
        this.saldo += valor;
    }

    String saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return "Saque realizado com sucesso no valor de R$ " + valor;
        } else {
            return "O valor solicitado para saque excede o valor do saldo atual! ";
        }
    }

    String transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            destino.deposita(valor);
            this.saca(valor);
            return "Transferência realizada com sucesso.";
        }
        return "Falha na transferência.";
    }

    public double getSaldo() {
        return this.saldo;
    }

}
