package Jre_Jdk;

public class TipoDouble {
    // O tipo double aceita número com ponto flutuante, ou seja, números REAIS.
    // A separação dos números é feito com ponto e não com vírgula
    /* Detalhe: O tipo double aceita números sem ponto flutuante, embora não seja indicado a utilização, tendo em vista
       que já existe um tipo primitivo para isso o INT;
    */
    public static void main(String[] args) {
        double peso = 122.3;
        double salario = 1497.64;

        /* Nesse caso da divisão, o JAVA entende que ambos os números são inteiros, com isso, ele vai fazer com que
           o resultado da divisão seja o mais próximo de um inteiro. Para ele entender que estamos dividindo um valor
           do tipo double, precisamos que no mínimo um dos valores possua o ponto uma casa decimal.
        */

        double divisao = 5 / 2;
        System.out.println(divisao);

        /* Agora com o 5 sendo 5.0, o java entende que, a divisão está sendo realizada com um tipo double */

        double divisao2 = 5.0 / 2;
        System.out.println(divisao2);
    }
}
