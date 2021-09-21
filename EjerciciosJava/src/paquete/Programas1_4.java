package paquete;
import java.util.Scanner;

public class Programas1_4 {
	
	//1. Programa que lee dos números A y B, y nos informa si B es divisor de A o no.
	public void divisor (int a, int b) {
		int resultado = a%b;
		if (resultado == 0) {
			System.out.println(String.format("%d es divisor de %d", b, a));
			//System.out.println(b + "es divisor de" + a);
		} else {
			System.out.println("No es divisor");
		}
	}
	
	/*
	  2.Programa que lee 11 números comprendidos entre el 20 y 40, ambos inclusive. En el caso
		en el que algún número introducido no se encontrara dentro del rango permitido, se
		mostrará un mensaje de error y seguirá pidiendo números. El programa finalizará cuando
		se hayan introducido 11 números válidos y mostrará el número máximo introducido de los
		11 válidos. Además indicará cuántos números de los introducidos no han sido válidos.
	*/
	public void Nums20al40 (Scanner sc) {
		int num;
		int mayor = 0;
		int novalidos = 0;
		for(int i = 0; i<=10;) {
			System.out.println("Introduce un nuevo número");
			num = Integer.parseInt(sc.nextLine());
			if(num>=20 && num<=40) {
				if(num > mayor) {
					mayor = num;
				}
				i++;
			} else {
				System.out.println("El número introducido es incorrecto");
				novalidos++;
			}
		}
		
		System.out.println("El número máximo introducido es " + mayor);
		System.out.println("Has escrito " + novalidos + " números incorrectos.");
	}
	
	 //3. Programa que lee de manera consecutiva números hasta que se introducen dos números iguales seguidos.
	
	public void DosIguales(Scanner sc) {
		int num1, aux;
		boolean continuar = true;
		System.out.println("Introduce un número");
		aux = Integer.parseInt(sc.nextLine());
		do {
			System.out.println("Introduce un número");
			num1 = Integer.parseInt(sc.nextLine());
			
			if (num1 == aux) {
				continuar = false;
			}
			aux = num1;
		} while(continuar);
		System.out.println("Has introducido 2 números iguales");
	}
	
	//4. Programa que muestra todos los divisores de un número introducido. Entre los divisores no se incluirá el propio número.
	
	public void TodosDivisores(int num) {
		for(int i = 1; i<=num - 1; i ++) {
			if(num%i == 0) {
				System.out.println(i);
			}
		}
	}
	
}
