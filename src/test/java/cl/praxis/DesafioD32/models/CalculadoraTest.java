package cl.praxis.DesafioD32.models;

import cl.praxis.DesafioD32.models.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {
    private Calculadora calculadora;

    @BeforeEach
    public void setUp(){
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Prueba del metodo suma")
    public void testSuma(){
        int resultado = calculadora.suma(2,4);
        assertEquals(6,resultado,"El resultado de 2+4 es 6");
    }
    @Test
    @DisplayName("Prueba del metodo resta")
    public void testResta(){
        int resultado = calculadora.resta(6,4);
        assertEquals(2,resultado,"El resultado de 6-4 es 2");
    }
    @Test
    @DisplayName("Prueba del metodo multiplicar")
    public void testMultiplicar(){
        int resultado = calculadora.multiplicar(3,7);
        assertEquals(21,resultado,"El resultado de 3*7 es 21");
    }
    @Test
    @DisplayName("Prueba del metodo división")
    public void testDiv(){
        float resultado = calculadora.division(8,2);
        assertEquals(4, resultado,"El resultado de 8/2 es 4");
    }

    @Test
    @DisplayName("Prueba metodo división,por 0")
    public void testDiv0(){
       /* float resultado = calculadora.division(4,0);*/
        assertThrows(ArithmeticException.class,()-> calculadora.division(4,0), "El resultado no se puede realizar");
    }
}
