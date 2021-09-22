package paquete;
import java.util.Calendar;
import java.util.Scanner;

public class Programas10_14 {
	
	//10. Programa que lee 5 números e indica si todos los números son iguales o no.
	public boolean SonIguales(Scanner sc) {
		int num, aux;
		boolean iguales = true;
		System.out.println("Introduce un número");
		num = Integer.parseInt(sc.nextLine());
		for(int i = 0; i<4; i ++) {
			aux = num;
			System.out.println("Introduce un número");
			num = Integer.parseInt(sc.nextLine());
			if(aux != num) {
				iguales = false;
			}
		}
		return iguales;
	}
	
	/*11.Programa que lee nombre y año de nacimiento de una serie de alumnos hasta introducir
		 como nombre de alumno “fin”. En ese momento mostrará la edad media de los alumnos y
		 el nombre del alumno menor. NOTA: Al introducir como nombre “fin”, no nos ha de pedir el
		 año de nacimiento*/
	public void Alumnos(Scanner sc) {
		String nombre, nombremenor = "";
		int ano = 0, menor = Integer.MAX_VALUE, edad = 0, suma = 0, cont = 0;
		float media;
		int year = Calendar.getInstance().get(Calendar.YEAR);
		
		do {
			System.out.println("Escribe el nombre del alumno, escribe fin si no quieres escribir más");
			nombre = sc.nextLine();
			
			if(!nombre.equalsIgnoreCase("fin")) {
				System.out.println("Escribe su año de nacimiento");
				ano = Integer.parseInt(sc.nextLine());
				edad = year - ano;
				
				if(edad < menor) {
					menor = edad;
					nombremenor = nombre;
				}
				suma += edad;
				cont++;
			} 

		}while(!nombre.equalsIgnoreCase("fin"));
		
		//FORMA CON WHILE (mejor):
		
		System.out.println("Escribe el nombre del alumno, escribe fin si no quieres escribir más");
		nombre = sc.nextLine();
		
		while(!nombre.equalsIgnoreCase("fin")){
			
			System.out.println("Escribe su año de nacimiento");
			ano = Integer.parseInt(sc.nextLine());
			edad = year - ano;
			
			if(edad < menor) {
				menor = edad;
				nombremenor = nombre;
			}
			suma += edad;
			cont++;
			
			System.out.println("Escribe el nombre del alumno, escribe fin si no quieres escribir más");
			nombre = sc.nextLine();
		}
		
		if(cont > 0) {
			media = (float)suma/cont;
			System.out.println("La media de edades de los alumnos es de " + media + "\nEl alumno más pequeño es " + nombremenor + " y tiene " + menor + " años");
		}
		
	}
	
	/*12.Programa que muestra los números primos existentes entre el 1 y el 100. NOTA: Un
		 número es primo si tiene dos únicos divisores que son el 1 y él mismo.*/
	public void Primos1al100() {
		System.out.println("Estos son los números primos del 1 al 100:");
		boolean primo = true;
		for(int i = 1; i <= 100; i++) {
			primo = true;
			for(int j = 2; j < i; j ++) {
				if(i%j == 0) {
					primo = false;
				}
			}
			if(primo) {
				System.out.println(i);
			}
		}
	}
	
	/*14.Programa que lee una secuencia de 10 números y muestra el mayor de los múltiplos de 5,
		 y el menor de los múltiplos de 3. Si no hubiera ningún múltiplo, el programa lo indicaría.*/

	public void SecuenciaMult(Scanner sc) {
		int num = 0, mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
		boolean mult3 = false, mult5 = false;
		for(int i = 0; i < 10; i++) {
			System.out.println("Introduce un número");
			num = Integer.parseInt(sc.nextLine());
			
			if(num%5 == 0) {
				mult5 = true;
				if(num > mayor) {
					mayor = num;
				}
			} 
			if(num%3 == 0) {
				mult3 = true;
				if(num < menor) {
					menor = num;
				}
			}
		}
		
		if(mult5) {
			System.out.println("El múltiplo de 5 más grande que has introducido es el " + mayor);
		} else {
			System.out.println("No has introducido ningun múltiplo de 5");
		}
		if(mult3) {
			System.out.println("El múltiplo de 3 más pequño introducido es el " + menor);
		} else {
			System.out.println("No has introducido ningún múltiplo de 3"); 
		}
	}
	

}
