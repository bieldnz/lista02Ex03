package controller;

public class ControllerPar {
	
	public ControllerPar() {
		super();
	}
	
	public int checkPar(int[] vetor, int tamanho, int n) {;
		
		if(tamanho > 1) {
			if((vetor[tamanho - 1]%2)==0){
				n = n + 1;
			}
			n = checkPar(vetor, tamanho-1, n);
			return n;
			
		}else {
			return n;
		}
		
	}
	
}
