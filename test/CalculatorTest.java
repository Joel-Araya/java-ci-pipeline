import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void sumaTest1(){
        int valor = Calculator.suma(3,5);
        int esperado = 8;
        assertEquals(esperado,valor);
    }
    @Test
    public void sumaTest2(){
        int valor = Calculator.suma(2,-45);
        int esperado = -43;
        assertEquals(esperado,valor);
    }

    @Test
    public void restaTest1(){
        int valor = Calculator.resta(2,5);
        int esperado = -3;
        assertEquals(esperado,valor);
    }
    @Test
    public void restaTest2(){
        int valor = Calculator.resta(2,-5);
        int esperado = 7;
        assertEquals(esperado,valor);
    }

    @Test
    public void multiplicacionTest1(){
        int valor = Calculator.multiplicar(3,10);
        int esperado = 30;
        assertEquals(esperado,valor);
    }
    @Test
    public void multiplicacionTest2(){
        int valor = Calculator.multiplicar(-4,3);
        int esperado = -12;
        assertEquals(esperado,valor);
    }

    @Test
    public void divisionTest1(){
        float valor = Calculator.dividir(20,5);
        float esperado = 4;
        assertEquals(esperado,valor);
    }
    @Test
    public void divisionTest2(){
        float valor = Calculator.dividir(-5,2);
        float esperado = -2.5f;
        assertEquals(esperado,valor);
    }



}