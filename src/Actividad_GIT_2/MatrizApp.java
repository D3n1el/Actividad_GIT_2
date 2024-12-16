package Actividad_GIT_2;

import java.util.Random;

public class MatrizApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//matriz-inicial: Para generar y mostrar la matriz de números aleatorios.
		Random r = new Random();
		
		int[][] matriz = new int[5][5]; //Declaración de la matriz junto con la cantidad de fila y columnas
		
		for (int i = 0; i < matriz.length; i++) { //Recorre cada fila
			for (int j = 0; j < matriz[i].length; j++) { //Recorre cada columna de cada fila
				matriz[i][j] = r.nextInt(100) + 1; //Genera un numero aleatorio en la posición seleccionada
			}
		}
		
		System.out.println("Matriz que contiene numeros generados aleatoriamente:");
		for (int i = 0; i < matriz.length; i++) { //Recorre cada fila
			for (int j = 0; j < matriz[i].length; j++) { //Recorre cada columna de cada fila
				System.out.print(matriz[i][j] + " "); //Genera un numero aleatorio en la posición seleccionada
			}
			System.out.println();
		}
		
	}
}
