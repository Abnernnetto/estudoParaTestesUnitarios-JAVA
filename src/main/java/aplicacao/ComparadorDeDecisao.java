package aplicacao;

public class ComparadorDeDecisao {
	//Classe para tomada de decis�o
	public boolean compararDecisao(int numero){		
        if(numero > 5) {
        	numero = numero * 3;
        	return true;
        }
        return false;
    }
}
