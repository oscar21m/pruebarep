package paquete;

import java.util.Scanner;

public class Programas24_27 {
	
	//24. Realiza un programa que lea 7 números para posteriormente mostrarlos en orden ascendente.
	
	public void OrdenAscendente(Scanner sc) {
		int aux, contIntercambios;
		
		int arrnums[] = new int[5];
		for(int i = 0; i < arrnums.length; i++) {
			System.out.println("Introduce un número");
			arrnums[i] = Integer.parseInt(sc.nextLine());
		}
		
		do {
			
			contIntercambios = 0;
		
			for(int i = 0; i < arrnums.length - 1; i++) {
				
				if(arrnums[i] > arrnums[i+1]) {
					aux = arrnums[i];
					arrnums[i] = arrnums[i+1];
					arrnums[i + 1] = aux;
					contIntercambios ++;
				}
			}
		}while(contIntercambios>0);
		
		for(int i = 0; i < arrnums.length; i++) {
			System.out.println(arrnums[i]);
		}
	}
	
	/*25. Realiza un programa que cargue desde teclado una tabla bidimensional de 2x3 de números
	enteros. Posteriormente el programa pedirá un número a buscar, y en caso de encontrarlo
	indicará el número de fila y columna donde se ha encontrado por primera vez. El programa
	ofrecerá al usuario la opción de seguir buscando más números: “¿Desea seguir
	buscando?(s/n)”.*/
	
	public void TablaBidimensional(Scanner sc) {
		int numeros[][] = new int[2][3];
		int num, fila = 0, columna = 0;
		char resp;
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[0].length; j++) {
				System.out.println("Introduce un número");
				numeros[i][j] = Integer.parseInt(sc.nextLine());
			}
		}
		
		do {
			System.out.println("Introduce un número a buscar:");
			num = Integer.parseInt(sc.nextLine());
			
			for(int i = 0; i < numeros.length; i++) {
				for(int j = 0; j < numeros[0].length; j++) {
					if(num == numeros[i][j]) {
						fila = i + 1;
						columna = j + 1;
						System.out.println("El número está en la fila " + fila + " y en la columna " + columna);
					}
				}
			}
			
			System.out.println("¿Quieres buscar otro número?");
			resp = sc.nextLine().charAt(0);
		} while(resp == 's');
	}
	
	/*26. Realiza un programa que dibuje un cuadrado mágico de orden impar introducido por el
	usuario. Un cuadrado mágico es aquel en el que sin repetir ningún número, todas las filas,
	columnas, y las dos diagonales suman lo mismo.*/
	
	public void CuadradoMagico() {
		System.out.println("Método 26 a implementar");
	}
	
	
	/*27. Realiza un programa que cargue desde teclado una tabla de enteros de dimensión 3x3. El
	programa mostrará la columna en la que la suma de sus elementos sea menor.*/
	
	
	public void MenorColumna(Scanner sc) {
		int numeros[][] = new int[3][3];
		int suma;
		int menor = Integer.MAX_VALUE;
		int columna = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[0].length; j++) {
				System.out.println("Introduce un número");
				numeros[i][j] = Integer.parseInt(sc.nextLine());
			}
		}
		
		for(int j = 0; j < numeros[0].length; j++) {
			
			suma = 0;
			
			for (int i = 0; i < numeros.length; i++) {
				
				suma += numeros[j][i];
				if(suma < menor) {
					columna = 0;
					menor = suma;
					columna = j + 1;
				}
			}
		}
		
		System.out.println("La columna más pequeña es la " + columna);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
