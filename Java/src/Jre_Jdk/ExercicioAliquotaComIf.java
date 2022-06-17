package Jre_Jdk;

public class ExercicioAliquotaComIf {
    public static void main(String[] args) {

        double salario = 2800.0;

        if (salario >= 1900.0 && salario <= 2800.0) {
            System.out.println("O IR é de 7,5% e pode ser deduzido o valor de R$ 142,00");
        } else if (salario <= 3751.0) {
            System.out.println("O IR é de 15% e pode ser deduzido o valor de R$ 350,00");
        } else if (salario <= 4664.00) {
            System.out.println("O IR é de 22.5% e pode ser deduzido o valor de R$ 636");
        }
    }
}
