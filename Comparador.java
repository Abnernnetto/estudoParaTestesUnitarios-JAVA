package aplicacao;

public class Comparador {
	public boolean comparaNumeros(int numeroA, int numeroB){
        if(numeroA > numeroB){
            return true;
        }else if (numeroB > numeroA){
            return true;
        }else{
            return false;
        }
    }
	
	
	
	
	public boolean comparaNumeros(int numeroA, int numeroB, int numeroX, int numeroY){
        if((numeroA > numeroB) && (numeroX < numeroY)){
            return true;  
        }
        return false;        
    }
}
