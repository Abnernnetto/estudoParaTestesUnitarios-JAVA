package aplicacao;

public class ComparadorDeDecisao {
	//Classe para tomada de decisão
	public boolean compararDecisao(int numero){		
        if(numero > 5) {
        	numero = numero * 3;
        	return true;
        }
        return false;
    }
}
