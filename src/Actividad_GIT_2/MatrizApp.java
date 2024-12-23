package Actividad_GIT_2;

import java.util.Random;
import java.util.Scanner;

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
		

		//Buscar un número y mostrar su posición.
		Scanner x = new Scanner(System.in); //ENTRADA INFO
		System.out.print("¿Que numero desea buscar? "); //PRINT MENSAGE EN PANTALLA
		int numAbuscar = x.nextInt(); //ENTERO CREADO PARA GUARDA LA INFO 
		
		boolean encontrado = false; //BOOLEAN QUE DICE QUE DE MOMENTO NO SE HA ENCONTRADO EL NUM
		
		for (int i = 0; i < matriz.length; i++) { //VER FILAS
			for (int j = 0; j < matriz[i].length; j++) { //VER COLUMNAS
				if(matriz[i][j] == numAbuscar) { //SI ALGUN NUMERO DE LA MATRIZ RECORRIDA POR EL BUCLE ES IGUAL AL NUMERO INSERTADO POR EL USUARIO PASA LO SIG
					System.out.println("el num " + numAbuscar); //NUM ELEGIDO POR EL USUARIO
					System.out.println("Fila " + (i+1)); //FILA EN LA QUE SE ENCUENTRA ESE NUMERO
					System.out.println("columna " + (j+1)); //COLUMNA EN LA QUE SE ENCUENTRA ESE NUMERO
					System.out.println("__________________");
					System.out.println();
					encontrado = true; //SE HA ENCONTRADO EL NUM
				}
			}
		}
		if(!encontrado) { //POR SI NO SE HA ENCONTRADO EL NUM
			System.out.print("Este numero no esta en la matriz"); //MOSTRAR MENSAGE SI NO SE HA ENCONTRADO EL NUM
		}
		
		
	}
}
