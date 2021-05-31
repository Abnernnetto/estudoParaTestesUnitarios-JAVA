package pacoteTeste;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;



import aplicacao.Calculadora;

/* 
 * Teste que tem apenas instruções para executar - Coverage Instructions 
 * Ou seja, é testado cada linha de codigo, sem tomada de decisões.
 *
 * */

public class CalculadoraTest {
    Calculadora calc = new Calculadora();
    
    @Test
    @DisplayName("Soma de valores")
    public void testeSomaDeValores(){
        int resultado = calc.somaDeValores(1, 2);
        Assert.assertEquals(3, resultado);
    }

    @Test
    @DisplayName("Subtracao de valores")
    public void testeSubtracaoDeValores(){
        int resultado = calc.subtracaoDeValores(5, 2);
        Assert.assertEquals(3, resultado);
    }

    @Test
    @DisplayName("Multiplicao de valores")
    public void testeMultiplicaoDeValores(){
        int resultado = calc.multiplicacaoDeValores(4, 2);
        Assert.assertEquals(8, resultado);
    }

    @Test
    @DisplayName("Divisao de valores")
    public void testeDivisaoDeValores(){
        int resultado = calc.divisaoDeValores(10, 2);
        Assert.assertEquals(5, resultado);
    }
	
    
}
