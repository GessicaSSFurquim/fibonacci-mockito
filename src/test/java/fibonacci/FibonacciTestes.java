package fibonacci;

import org.junit.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;

public class FibonacciTestes {

    @Test
    public void calcularValores() {

        Fibonacci mockedFibonacci = mock(Fibonacci.class);

        //usando o mock object
        mockedFibonacci.calcular(15);

        //verificacoes
        verify(mockedFibonacci).calcular(15);
    }
}

