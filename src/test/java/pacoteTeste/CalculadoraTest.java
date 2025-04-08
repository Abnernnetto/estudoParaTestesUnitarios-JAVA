package pacoteTeste;

import aplicacao.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 * Teste que tem apenas instru��es para executar - Coverage Instructions
 * Ou seja, � testado cada linha de codigo, sem tomada de decis�es.
 *
 * */

public class CalculadoraTest {
    Calculadora calc = new Calculadora();

    @Test
    @DisplayName("Soma de valores")
    public void testeSomaDeValores(){
        int resultado = calc.somaDeValores(1, 2);
        Assertions.assertEquals(3, resultado);
    }

    @Test
    @DisplayName("Subtracao de valores")
    public void testeSubtracaoDeValores(){
        int resultado = calc.subtracaoDeValores(5, 2);
        Assertions.assertEquals(3, resultado);
    }

    @Test
    @DisplayName("Multiplicao de valores")
    public void testeMultiplicaoDeValores(){
        int resultado = calc.multiplicacaoDeValores(4, 2);
        Assertions.assertEquals(8, resultado);
    }

    @Test
    @DisplayName("Divisao de valores")
    public void testeDivisaoDeValores(){
        int resultado = calc.divisaoDeValores(10, 2);
        Assertions.assertEquals(5, resultado);
    }


}
