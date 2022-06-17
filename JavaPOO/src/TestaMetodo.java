public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaMarcelo = new Conta();

        contaMarcelo.saldo = 200;
        System.out.println("Antes do depósito: R$" + contaMarcelo.saldo);
        contaMarcelo.deposita(200);
        System.out.println("Depois do depósito: R$" + contaMarcelo.saldo);
        System.out.println(contaMarcelo.saca(175.99));
        System.out.println("Saldo total em conta: R$ " + contaMarcelo.saldo);

        Conta contaRafaela = new Conta();
        contaRafaela.deposita(2000.00);
        System.out.println("Depois do depósito: R$" + contaRafaela.saldo);
        System.out.println(contaRafaela.transfere(1998.00, contaMarcelo));

        System.out.println("Saldo atual da conta da Rafaela R$ " + contaRafaela.saldo);
        System.out.println("Saldo atual da conta do Marcelo R$ " + contaMarcelo.saldo);
    }
}
