package Actividad_GIT_2;

import java.util.Random;
import java.util.Scanner;

public class MatrizApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Buscar un número y mostrar su posición.
		Scanner x = new Scanner(System.in);
		System.out.print("¿Que numero desea buscar? ");
		int numAbuscar = x.nextInt();
		
		boolean encontrado = false;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == numAbuscar) {
					System.out.println("el num " + numAbuscar);
					System.out.println("Fila " + (i+1));
					System.out.println("columna " + (j+1));
					System.out.println("__________________");
					System.out.println();
					encontrado = true;
				}
			}
		}
		if(!encontrado) {
			System.out.print("Este numero no esta en la matriz");
		}
		
		
	}

}
