package cl.praxis.DesafioD32.models;
import lombok.*;

@Data
public class Calculadora {
    public int suma(int num1, int num2){
        int resultado = num1 + num2;
        return resultado;
    }
    public int resta(int num1, int num2){
        int resultado = num1 - num2;
        return resultado;
    }
    public int multiplicar(int num1, int num2){
        int resultado = num1*num2;
        return resultado;
    }
    /* Método de desafío calculadora 1
    public float division(int num1, int num2){
        if(num2==0){
            throw new ArithmeticException("No se puede dividir por 0");
        }
        float resultado = (float) num1/num2;
        return resultado;
    } */

    public float division(int num1, int num2){
        if(num2==0){
            throw new ArithmeticException("No se puede dividir por 0");
        }
        return (float) num1/num2;
    }
}

