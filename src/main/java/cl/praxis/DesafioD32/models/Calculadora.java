package cl.praxis.DesafioD32.models;
import lombok.*;

@Data
public class Calculadora {

    public int suma(int a, int b){
        int resultado = a + b;
        return resultado;
    }
    public int resta(int a, int b){
        int resultado = a - b;
        return resultado;
    }
    public int multiplicar(int a, int b){
        int resultado = a*b;
        return resultado;
    }
    public float division(int a, int b){
        if(b==0){
            throw new ArithmeticException("No se puede dividir por 0");
        }
        float resultado = (float) a/b;
        return resultado;
    }
}
