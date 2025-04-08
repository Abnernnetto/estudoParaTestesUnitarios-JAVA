package pacoteTeste;

import aplicacao.Comparador;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class ComparadorTest {
	
	Comparador comp = new Comparador();
	
	@Test
    @DisplayName("Numero A e maior dos valores")
    public void testeComparacaoDeValoresA(){
        boolean resultado = comp.comparaNumeros(5, 2);
        Assertions.assertEquals(true, resultado);
    }
    
    @Test
    @DisplayName("Numero B e maior dos valores")
    public void testeComparacaoDeValoresB(){
        boolean resultado = comp.comparaNumeros(1, 2);
        Assertions.assertTrue(resultado);
    }
    
    @Test
    @DisplayName("Numeros iguais")
    public void testeEquiparidadeDeValores(){
        boolean resultado = comp.comparaNumeros(5, 5);
        Assertions.assertFalse(resultado);
    }
    
    //--------------------------------------------
    
    //Uso de Tabela de Decis�o ou Teste de Decis�o de Condi��o Modificada(MC/DC)
    /*
     * /*Uso de Tabela de Decis�o, identificando as entradas e analisando as sa�das
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
        Assertions.assertTrue(resultado);
    }
    
    //VF = F
    @Test
    @DisplayName("A maior que B e X maior que Y")
    public void testeAmaiorBeXmaiorY(){
        boolean resultado = comp.comparaNumeros(6, 5, 3, 2);
        Assertions.assertFalse(resultado);
    }
    
    //FV = F
    @Test
    @DisplayName("A menor que B e X menor que Y")
    public void testeAmenorBeXmenorY(){
        boolean resultado = comp.comparaNumeros(1, 5, 1, 2);
        Assertions.assertFalse(resultado);
    }
    
    //FF = F
    @Test
    @DisplayName("A menor que B e X maior que Y")
    public void testeAmenorBeXmaiorY(){
        boolean resultado = comp.comparaNumeros(1, 5, 7, 2);
        Assertions.assertFalse(resultado);
    }
    
    //Instru��o e Branch dizia que estava 100% coberto, mas o Mutantes disse que n�o
    //Ent�o acrescentei mais testes para cobrir os meus unit�rios, conforme abaixo:
    @Test
    @DisplayName("A igual B e X igual Y")
    public void testeAigualBeXigualY(){
        boolean resultado = comp.comparaNumeros(1, 1, 1, 1);
        Assertions.assertFalse(resultado);
    }
    
    @Test
    @DisplayName("A igual B e X maior Y")
    public void testeAigualBeXmaiorY(){
        boolean resultado = comp.comparaNumeros(1, 1, 2, 1);
        Assertions.assertFalse(resultado);
    }
    
    @Test
    @DisplayName("A igual B e X menor Y")
    public void testeAigualBeXmenorY(){
        boolean resultado = comp.comparaNumeros(1, 1, 1, 2);
        Assertions.assertFalse(resultado);
    }
    //At� aqui, est� cobrindo 92% das Muta��es
    @Test
    @DisplayName("A menor B e X igual Y")
    public void testeAmenorBeXigualY(){
        boolean resultado = comp.comparaNumeros(1, 2, 3, 3);
        Assertions.assertFalse(resultado);
    }
    
    @Test
    @DisplayName("A maior B e X igual Y")
    public void testeAmaiorBeXigualY(){
        boolean resultado = comp.comparaNumeros(2, 1, 5, 5);
        Assertions.assertFalse(resultado);
    }
}
