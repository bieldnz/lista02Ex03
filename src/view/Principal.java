package view;

import java.util.Random;

import controller.ControllerPar;


public class Principal {
	public static void main(String[] args) {
		int[] vetor = new int[10];
		Random gerador = new Random();
		ControllerPar controller = new ControllerPar();
		
		for(int x = 0; x < 10; x++) {
			vetor[x] = gerador.nextInt(99);
			System.out.println(vetor[x]);
		}
		
		System.out.println("\n \n");
		
		int result = controller.checkPar(vetor, vetor.length, 0);
		System.out.println(result);
	}
}
