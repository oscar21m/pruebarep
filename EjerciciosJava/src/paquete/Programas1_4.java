package paquete;
import java.util.Scanner;

public class Programas1_4 {
	
	//1. Programa que lee dos n�meros A y B, y nos informa si B es divisor de A o no.
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
	  2.Programa que lee 11 n�meros comprendidos entre el 20 y 40, ambos inclusive. En el caso
		en el que alg�n n�mero introducido no se encontrara dentro del rango permitido, se
		mostrar� un mensaje de error y seguir� pidiendo n�meros. El programa finalizar� cuando
		se hayan introducido 11 n�meros v�lidos y mostrar� el n�mero m�ximo introducido de los
		11 v�lidos. Adem�s indicar� cu�ntos n�meros de los introducidos no han sido v�lidos.
	*/
	public void Nums20al40 (Scanner sc) {
		int num;
		int mayor = 0;
		int novalidos = 0;
		for(int i = 0; i<=10;) {
			System.out.println("Introduce un nuevo n�mero");
			num = Integer.parseInt(sc.nextLine());
			if(num>=20 && num<=40) {
				if(num > mayor) {
					mayor = num;
				}
				i++;
			} else {
				System.out.println("El n�mero introducido es incorrecto");
				novalidos++;
			}
		}
		
		System.out.println("El n�mero m�ximo introducido es " + mayor);
		System.out.println("Has escrito " + novalidos + " n�meros incorrectos.");
	}
	
	 //3. Programa que lee de manera consecutiva n�meros hasta que se introducen dos n�meros iguales seguidos.
	
	public void DosIguales(Scanner sc) {
		int num1, aux;
		boolean continuar = true;
		System.out.println("Introduce un n�mero");
		aux = Integer.parseInt(sc.nextLine());
		do {
			System.out.println("Introduce un n�mero");
			num1 = Integer.parseInt(sc.nextLine());
			
			if (num1 == aux) {
				continuar = false;
			}
			aux = num1;
		} while(continuar);
		System.out.println("Has introducido 2 n�meros iguales");
	}
	
	//4. Programa que muestra todos los divisores de un n�mero introducido. Entre los divisores no se incluir� el propio n�mero.
	
	public void TodosDivisores(int num) {
		for(int i = 1; i<=num - 1; i ++) {
			if(num%i == 0) {
				System.out.println(i);
			}
		}
	}
	
}
