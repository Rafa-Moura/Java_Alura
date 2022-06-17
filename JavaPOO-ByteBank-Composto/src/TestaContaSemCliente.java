public class TestaContaSemCliente {
    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.deposita(100);

        conta.titular = new Cliente();
        conta.titular.nome = "Rafael Moura";
        System.out.println("Titular: " + conta.titular.nome);
        System.out.println("Saldo R$ " + conta.saldo);

    }
}
