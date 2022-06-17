public class Conta {
    private int conta;
    private double saldo;
    private int agencia;
    private Cliente titular;

    private static int total;

    public Conta() {
    }

    public Conta(int conta, int agencia, Cliente titular) {
        total++;
        if (conta <= 0 || agencia <= 0) {
            System.out.println("Agência ou conta não podem ser igual ou menor que 0");
            return;
        }
        this.conta = conta;
        this.agencia = agencia;
        this.titular = titular;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Agência não pode ser menor que ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public int getConta() {
        return this.conta;
    }

    public void setConta(int conta) {
        if (conta <= 0) {
            System.out.println("Conta não pode ser menor que ou igual a 0");
            return;
        }
        this.conta = conta;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente cliente) {
        this.titular = cliente;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public static int getTotal() {
        return Conta.total;
    }

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

}
