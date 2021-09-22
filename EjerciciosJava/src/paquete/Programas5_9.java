package paquete;
import java.util.Scanner;

public class Programas5_9 {
	
	//5. Programa que nos informa si un número introducido es primo o no.
	public void esPrimo(int num) {
		boolean primo = true;
		String mensaje;
		
		if (num<2) {primo = false;}
		
		for(int i = 2; i < num && primo; i ++) {
			if(num%i == 0) {
				primo = false;
			}
		}
		
		mensaje = (primo)?"Es primo":"No es primo";
		System.out.println(mensaje);
	}
	
	/*6.Programa que lee 9 número, y en el caso en el que el primero introducido sea igual al
		último, nos muestra la media. En caso contrario, no se mostrará nada.
	*/
	public void MediaQuizas(Scanner sc) {
		int primero = 0, ult = 0, suma=0;
		double media;
		
		System.out.println("Introduce un nuevo número");
		primero = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i<=8; i ++) {
			System.out.println("Introduce un nuevo número");
			suma += Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("Introduce un nuevo número");
		ult = Integer.parseInt(sc.nextLine());
		
		if(primero == ult) {
			media = suma/9;
			System.out.println("La media de los números es de " + media);
		} else {
			System.out.println("El primer y �ltimo número no son iguales por lo tanto no se hace la media");
		}
	}
	
	/*7.Programa que pide el número de calificaciones a introducir, y una nota de corte. A
		continuación se introducirán las calificaciones, para finalmente indicar cuántas
		calificaciones han igualado o superado la nota de corte.
	 */
	public void Calificaciones(Scanner sc) {
		int numnotas, contsuperada = 0;
		float corte, nota;
		
		System.out.println("Introduce una nota de corte");
		corte = Float.parseFloat(sc.nextLine());
		System.out.println("¿Cuántas notas vas a introducir?");
		numnotas = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i<numnotas; i++) {
			System.out.println("Introduce una nueva nota");
			nota = Float.parseFloat(sc.nextLine());
			if (nota >= corte) {
				contsuperada ++;
			}
		}
		
		System.out.println(contsuperada + " calificaciones han superado la nota de corte.");
	}
	
	//8. Programa que lee 10 números. Al finalizar mostrará el máximo introducido, y cuántas veces se repite dicho máximo.
	public void MaxYRepeticiones(Scanner sc) {
		int mayor = Integer.MIN_VALUE, num, contmax = 0;
		//sin arrays:
		for (int i = 0; i < 10; i ++) {
			System.out.println("Introduce un nuevo número");
			num = Integer.parseInt(sc.nextLine());
			if (num > mayor) {
				mayor = num;
				contmax = 0;
			}
			if(num == mayor) {
				contmax ++;
			}
		}
		/*Con Arrays:
		int arrnumeros[];
		arrnumeros = new int[10];
		for (int i = 0; i < 10; i ++) {
			System.out.println("Introduce un nuevo n�mero");
			num = Integer.parseInt(sc.nextLine());
			arrnumeros[i] = num;
			if (num > mayor) {
				mayor = num;
			}
		}
		
		for (int i = 0; i < arrnumeros.length; i ++) {
			if(arrnumeros[i] == mayor) {
				contmax+=1;
			}
		}*/
		System.out.println("El número mayor es el " + mayor + " y se ha repetido " + contmax + " veces");
	}
	
	/*9.Programa consistente en un juego en el que el Jugador1 introduce un número entre el 1 y
		el 100 y el Jugador2 tendrá que adivinarlo en un máximo de 10 intentos. Por cada intento
		del Jugador2, y en el caso de no acertar, se mostrará el mensaje "Te pasaste", o "No
		llegaste", según corresponda. De la misma manera, y al terminar el programa, se
		mostrarán los mensajes "Acertaste" o bien "Intentos agotados".
	 */
	public void JuegoMayorMenor(Scanner sc) {
		int x, intentos = 10, num;
		boolean ganar = false;
		
		do {
			System.out.println("Introduce el número a adivinar, del 1 al 100");
			x = Integer.parseInt(sc.nextLine());
		}while(x<1 || x > 100);
		
		for(int i = 0; i < intentos; i ++) {
			System.out.println("Introduce que número crees que han introducido");
			num = Integer.parseInt(sc.nextLine());
			if (num > x) {
				System.out.println("Te has pasado :(");
			} else if(num < x) {
				System.out.println("No has llegado :(");
			} else {
				System.out.println("Es el número correcto! :D");
				i = 10;
				ganar = true;
			}
		}
		
		if(!ganar) {
			System.out.println("Intentos agotados");
		}
	}
}
