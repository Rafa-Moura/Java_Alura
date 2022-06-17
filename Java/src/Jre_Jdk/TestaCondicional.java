package Jre_Jdk;

public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("Testando Condicionais");

        String usuario = "locorafa";
        String senha = "12343";
        String token = "";

        if (usuario == "locorafa" && senha == "12343") {
            System.out.println("Usuário logado com sucesso");
            token = "11s8s4d4a6sd84ew8we4a6sf";
        } else {
            System.out.println("Credenciais inválidas");
        }
    }
}
