package pacoteTeste;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import aplicacao.Comparador;

public class ComparadorTest {
	
	Comparador comp = new Comparador();
	
	@Test
    @DisplayName("Numero A e maior dos valores")
    public void testeComparacaoDeValoresA(){
        boolean resultado = comp.comparaNumeros(5, 2);
        Assert.assertEquals(true, resultado);
    }
    
    @Test
    @DisplayName("Numero B e maior dos valores")
    public void testeComparacaoDeValoresB(){
        boolean resultado = comp.comparaNumeros(1, 2);
        Assert.assertTrue(resultado);
    }
    
    @Test
    @DisplayName("Numeros iguais")
    public void testeEquiparidadeDeValores(){
        boolean resultado = comp.comparaNumeros(5, 5);
        Assert.assertFalse(resultado);
    }
    
    //--------------------------------------------
    
    //Uso de Tabela de Decisão ou Teste de Decisão de Condição Modificada(MC/DC)
    /*
     * /*Uso de Tabela de Decisão, identificando as entradas e analisando as saídas
	 * http://www.juliodelima.com.br/xdecision/
	 * O resultado montou 256 testes
	 * 
     * 
     * 
     */
    
    //VV = V    
    @Test
    @DisplayName("A maior que B e X menor que Y")
    public void testeAmaiorBeXmenorY(){
        boolean resultado = comp.comparaNumeros(6, 5, 1, 2);
        Assert.assertTrue(resultado);
    }
    
    //VF = F
    @Test
    @DisplayName("A maior que B e X maior que Y")
    public void testeAmaiorBeXmaiorY(){
        boolean resultado = comp.comparaNumeros(6, 5, 3, 2);
        Assert.assertFalse(resultado);
    }
    
    //FV = F
    @Test
    @DisplayName("A menor que B e X menor que Y")
    public void testeAmenorBeXmenorY(){
        boolean resultado = comp.comparaNumeros(1, 5, 1, 2);
        Assert.assertFalse(resultado);
    }
    
    //FF = F
    @Test
    @DisplayName("A menor que B e X maior que Y")
    public void testeAmenorBeXmaiorY(){
        boolean resultado = comp.comparaNumeros(1, 5, 7, 2);
        Assert.assertFalse(resultado);
    }
    
    //Instrução e Branch dizia que estava 100% coberto, mas o Mutantes disse que não
    //Então acrescentei mais testes para cobrir os meus unitários, conforme abaixo:
    @Test
    @DisplayName("A igual B e X igual Y")
    public void testeAigualBeXigualY(){
        boolean resultado = comp.comparaNumeros(1, 1, 1, 1);
        Assert.assertFalse(resultado);
    }
    
    @Test
    @DisplayName("A igual B e X maior Y")
    public void testeAigualBeXmaiorY(){
        boolean resultado = comp.comparaNumeros(1, 1, 2, 1);
        Assert.assertFalse(resultado);
    }
    
    @Test
    @DisplayName("A igual B e X menor Y")
    public void testeAigualBeXmenorY(){
        boolean resultado = comp.comparaNumeros(1, 1, 1, 2);
        Assert.assertFalse(resultado);
    }
    //Até aqui, está cobrindo 92% das Mutações
    @Test
    @DisplayName("A menor B e X igual Y")
    public void testeAmenorBeXigualY(){
        boolean resultado = comp.comparaNumeros(1, 2, 3, 3);
        Assert.assertFalse(resultado);
    }
    
    @Test
    @DisplayName("A maior B e X igual Y")
    public void testeAmaiorBeXigualY(){
        boolean resultado = comp.comparaNumeros(2, 1, 5, 5);
        Assert.assertFalse(resultado);
    }
}
