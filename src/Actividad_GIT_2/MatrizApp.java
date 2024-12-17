package Actividad_GIT_2;

import java.util.Random;
import java.util.Scanner;

public class MatrizApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//MI PARTE
		//Buscar un número y mostrar su posición.
		Scanner x = new Scanner(System.in);
		System.out.print("¿Que numero desea buscar? ");
		int numAbuscar = x.nextInt();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == numAbuscar) {
					System.out.print(numAbuscar);
				}else {
					System.out.print("Este numero no esta en la matriz");
					return;
				}
			}
			
		}
		
	}

}
