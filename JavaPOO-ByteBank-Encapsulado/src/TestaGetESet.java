public class TestaGetESet {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rafael", "10512883475", "Desenvolvedor");
        Conta conta = new Conta(0, 0, cliente);
        conta.deposita(3000.99);
        System.out.println(conta.getTitular().getCpf());
        System.out.println(conta.getSaldo());
    }
}
