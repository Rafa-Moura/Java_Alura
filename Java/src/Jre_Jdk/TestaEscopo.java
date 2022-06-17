package Jre_Jdk;

public class TestaEscopo {
    public static void main(String[] args) {

        System.out.println("Testando Condicionais");

        int idade = 18;
        int quantidadePessoas = 0;
        boolean acompanhado = quantidadePessoas > 0;

        if (idade >= 18 && acompanhado) {
            System.out.println("Seja Bem-Vindo");
        } else {
            System.out.println("Desculpe, você não pode entrar");
        }

        System.out.println(acompanhado);
    }
}
