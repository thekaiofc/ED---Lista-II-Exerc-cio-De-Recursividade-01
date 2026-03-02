package Controller;

public class Multiplicador {

    // Construtor
    public Multiplicador() {
        super();
    }

    // Metodo recursivo que realiza a multiplicação por somas sucessivas
    public int multiplicar(int a, int b) {

        /*
         * Quando B for igual a 0, o resultado da multiplicação é 0.
         */
        if (b == 0) {
            return 0;
        }

        /*
         * A + multiplicação(A, B - 1)
         * Ou seja, soma-se A repetidamente até que B chegue a 0.
         */
        return a + multiplicar(a, b - 1);
    }
}