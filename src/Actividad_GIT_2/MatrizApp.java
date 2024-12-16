package Actividad_GIT_2;

import java.util.Random;

public class MatrizApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//matriz-inicial: Para generar y mostrar la matriz de números aleatorios.
		Random r = new Random();
		
		int[][] matriz = new int[5][5];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = r.nextInt(100) + 1;
			}
		}	
	}
}
