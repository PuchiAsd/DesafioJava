package cl.praxis.DesafioD32.models;

import cl.praxis.DesafioD32.models.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
