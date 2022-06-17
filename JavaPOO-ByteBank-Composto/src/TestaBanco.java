public class TestaBanco {
    public static void main(String[] args) {
        Cliente rafael = new Cliente();
        rafael.nome = "Rafael Moura";
        rafael.cpf = "105.128.834-75";
        rafael.profissao = "Desenvolvedor Java Jr";

        Conta conta = new Conta();
        conta.deposita(100);
        conta.titular = rafael;

        System.out.println("Titular: " + conta.titular.nome);
        System.out.println("Saldo R$ " + conta.saldo);


    }
}
