package paquete;

import java.util.Random;
import java.util.Scanner;

public class Programas28_31 {
	
	/*28. Realiza un programa que cargue una tabla de 5 filas y 7 columnas con los siguientes
	números, para finalmente mostrarla:*/
	
	public void CargarTabla() {

		int filas=5, columnas=7;
		int numero = filas*columnas;
		int tabla[][]=new int[filas][columnas];
		boolean resta=true;

		
		for(int j=0; j<columnas; j++)
		{
			for(int i=0; i<filas; i++)
			{
				tabla[i][j]=numero;
				if(i<filas-1)
				{
					if(resta)
					{
						numero--;	
					}
					else
					{
						numero++;
					}					
				}
			}
			numero -= filas;
			resta = !resta;
		}
		

		for(int i=0; i<filas; i++)
		{
			for(int j=0; j<columnas; j++)
			{
				System.out.print(tabla[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("FIN");
	}
	
	/*29. Realiza un programa que muestre 10 números aleatorios enteros sin repetir de entre el 1 y
	el 100, ambos inclusive.*/
	
	public void numsAleatorios() {
		int num;
		int numeros[] = new int[10];
		boolean repetido;
		
		Random r = new Random();
		
		for(int i = 0; i < 10; i++) {
			repetido = false;
			num = r.nextInt(100)+1;
			
			for(int j = 0; j <= i && !repetido; j++) {
				
				if(num == numeros[j]) {
					repetido = true;
				}
			}
			
			if(repetido) {
				i--;
			} else {
				numeros[i] = num;
				System.out.println(num);
			}
		}
	}
	
	/*30. Realiza un programa que lea desde teclado 20 puntuaciones numéricas enteras que han
	de estar comprendidas entre el 0 y el 5, ambos inclusive. Al finalizar se mostrará por cada
	una de las puntuaciones, su frecuencia.*/
	
	public void FrecuenciaNums(Scanner sc) {
		int numeros[] = new int[20];
		int cont[] = new int[6];
		int num;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un número entre el 0 y el 5");
			num = Integer.parseInt(sc.nextLine());
			
			if(num < 0 || num > 5) {
				System.out.println("Número introducido incorrecto");
				i--;
			}else {
				numeros[i] = num;
			}
		}
		
		for(int i = 0; i < numeros.length; i++) {
			cont[numeros[i]]+=1;
		}
		
		for(int i = 0; i < cont.length; i++) {
			System.out.println("Frecuencia del número " + i + ": " + cont[i]);
		}
	}
	
	/*
	31. Realiza un programa que gestione una tabla ordenada ascendentemente y con un máximo
	de 18 elementos. No se permitirán repetidos:
	
	Menú:
	1.- Introducir número entero.
	2.- Listar números.
	3.- Eliminar número.
	4.- Eliminar todos los números.
	5.- Salir
	*/
	
	public void MenuOPcionesArray() {
		Scanner sc = new Scanner(System.in);
		String menu;
		
		int[] numeros = new int[18];
		int opcion, num, i = 0, j = 0;
		int contIntercambios, aux;
		boolean repetido;
		
		menu = "Menú:\r\n"
				+ "	1.- Introducir número entero.\r\n"
				+ "	2.- Listar números.\r\n"
				+ "	3.- Eliminar número.\r\n"
				+ "	4.- Eliminar todos los números.\r\n"
				+ "	5.- Salir";
		
		do {
			
			System.out.println(menu);
			System.out.println("Introduzca la opción deseada:");
			opcion = Integer.parseInt(sc.nextLine());
			
			switch(opcion) {
			case 1:
				if(i == 18) {
					System.out.println("Array lleno. No se ha guardado");
				} else {
					System.out.println("Introduzca el número:");
					num = Integer.parseInt(sc.nextLine());
					for(j = 0; j<i && numeros[j]!=num; j++);
					
					if(i==j) {
						numeros[i] = num;
						i++;
						
						//ordenamos utilizando el algoritmo de la burbuja
						do {
							contIntercambios = 0;
							
							for(j = 0; j < i-1; j++) {
								if(numeros[j] > numeros[j+1]) {
									aux = numeros[j];
									numeros[j] = numeros[j+1];
									numeros[j+1] = aux;
									
									contIntercambios++;
								}
							}
							
						}while(contIntercambios > 0);
						
					} else {
						System.out.println("Número repetido, no se ha guardado.");
					}
				}
				
				break;
			case 2:
				if(i == 0) {
					System.out.println("Sin Datos");
				}else {
					for(j = 0; j < i; j++) {
						System.out.println(numeros[j]);
					}
				}
				
				break;
			case 3:
				System.out.println("Introduzca el número a eliminar");
				num = Integer.parseInt(sc.nextLine());
				
				for(j = 0; j < i && numeros[j]!=num; j++);
				
				if(i == j) {
					System.out.println("No encontrado, no se ha eliminado");
				}else {
					for(int x = j; x < i-1; x++) {
						numeros[x] = numeros[x+1];
					}
					i --;
					System.out.println("Número eliminado");
				}
				break;
			case 4:
				i = 0;
				break;
			case 5: 
				break;
			default:
				System.out.println("El número introducido no se encuentra en el menú, introduce otro.");
				break;
			}
			
		}while(opcion!=5);
	}
}
