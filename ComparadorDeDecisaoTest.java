package pacoteTeste;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import aplicacao.ComparadorDeDecisao;

public class ComparadorDeDecisaoTest {
	
	ComparadorDeDecisao comp = new ComparadorDeDecisao();
	
	//Partic�o de Equivalencia
	/*			>5
	 * |---2----|---6---|
	 * |  Uso   |  Uso  |
	 * Uso de 2 entradas para testes.
	 * 
	 */
	
	//Teste que cobre 50% da Decis�o
	@Test
    @DisplayName("Numero e menor")
    public void testeDecisaoNumeroMenor(){
        boolean resultado = comp.compararDecisao(2);
        Assert.assertEquals(false, resultado);
    }
	
	//Teste que cobre 50% da Decis�o
	@Test
    @DisplayName("Numero e maior")
    public void testeDecisaoNumeroMaior(){
		boolean resultado = comp.compararDecisao(6);
        Assert.assertEquals(true, resultado);
    }
	//100% Coberto pelo "Covered Instructions" e 100% de "Covered Branch".
	//Analise de valor limite
		/*			>=5
		 * |---2----|---6---|
		 * | Uso  Uso  Uso  |
		 * Uso de 3 entradas para testes.
		 */
	
	//Estou testando o resultado do limite
	
	@Test
    @DisplayName("Numero igual")
    public void testeDecisaoNumeroIgual(){
		boolean resultado = comp.compararDecisao(5);
        Assert.assertEquals(false, resultado);
    }
	
	/*
	 * Mesmo com a aplica��o destas t�cnicas no tipo de teste de Decis�o, o Teste de Mutantes n�o
	 * deixa 100% a cobertura do c�digo, devido sugerir a troca do operador '*' por '/', ou seja,
	 * alterar a opera��o do m�todo da classe de multiplica��o para divis�o, atingindo 96% de cobertura
	 * de testes unit�rios.
	 * */
	
}
