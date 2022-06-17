package Jre_Jdk;

public class TestaLacos {
    public static void main(String[] args) {

        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            System.out.print("Tabuada de " + multiplicador + ": ");
            for (int contador = 1; contador <= 10; contador++) {
                int resultado = contador * multiplicador;
                System.out.print(resultado + " ");
            }
                System.out.println();
        }
    }
}
