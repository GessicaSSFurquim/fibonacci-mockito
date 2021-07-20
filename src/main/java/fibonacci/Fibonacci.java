package fibonacci;

public class Fibonacci {
    public long calcular(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n deve ser maior ou igual a dois");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
            return (n < 2) ? n : calcular(n - 1) + calcular(n - 2);


    }
}
