public class TestaValores {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rafael Moura", "105.128.834-75", "Desenvolvedor");
        Conta conta = new Conta(1, 234, cliente);
        Conta conta2 = new Conta(2, 345, cliente);

        System.out.println(Conta.getTotal());
    }
}
