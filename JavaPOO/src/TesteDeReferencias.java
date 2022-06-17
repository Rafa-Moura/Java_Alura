public class TesteDeReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        /* Quando criamos uma instância de uma classe, o nome utilizado para instanciar é uma referência
         *  para um objeto do tipo daquela Classe. Nesse caso, primeiraConta é uma referência para um objeto do tipo Conta.
         * */
        Conta segundaConta = primeiraConta;
        /* Quando fazemos esse tipo de atribuição, não estamos instanciando uma nova conta, estamos apenas criando uma
           nova referência para o mesmo objeto */
    }
}
