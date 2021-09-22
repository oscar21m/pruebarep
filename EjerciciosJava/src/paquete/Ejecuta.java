package paquete;
import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		Programas1_4 p1 = new Programas1_4();
		Programas5_9 p2 = new Programas5_9();
		Programas10_14 p3 = new Programas10_14();
		Programas15_18 p4 = new Programas15_18();
		
		System.out.println("¿Qué método quieres ejecutar?, del 1 al 18, pulsa 0 para acabar.");
		opcion = Integer.parseInt(sc.nextLine());
		do{
			switch(opcion) {
			case 0: break;
			
			case 1:
				System.out.println("Introduce el número A");
				int a = Integer.parseInt(sc.nextLine());
				System.out.println("Introduce el número B");
				int b = Integer.parseInt(sc.nextLine());
				p1.divisor(a, b);
				break;
				
			case 2:
				System.out.println("Debes escribir 11 números que esten entre 20 y 40, ambos inclusive");
				p1.Nums20al40(sc);
				break;
				
			case 3:
				System.out.println("Introduce números hasta que escribas dos iguales seguidos");
				p1.DosIguales(sc);
				break;
				
			case 4:
				System.out.println("Introduce un número, de el se mostraran todos los divisores");
				p1.TodosDivisores(Integer.parseInt(sc.nextLine()));
				break;
				
			case 5:
				System.out.println("Introduce un número para comprobar si es primo");
				int num = Integer.parseInt(sc.nextLine());
				p2.esPrimo(num);
				break;
			
			case 6:
				System.out.println("Introduce 9 números, si el primero y el último son iguales se hará la media");
				p2.MediaQuizas(sc);
				break;
			
			case 7:
				p2.Calificaciones(sc);
				break;
			
			case 8:
				System.out.println("Deberas introducir 10 números, luego se mostrara el más grande y cuántas veces se ha repetido");
				p2.MaxYRepeticiones(sc);
				break;
				
			case 9:
				System.out.println("El jugador1 escribirá un número del 1 al 100 y el jugador2 intentará adivinarlo, tiene 10 intentos");
				p2.JuegoMayorMenor(sc);
				break;
			
			case 10:
				System.out.println("Introduce 5 números, se comprobaran si todos son iguales o no");
				if(p3.SonIguales(sc)) {
					System.out.println("Todos los números son iguales");
				}else {
					System.out.println("Los números son diferentes");
				}
				break;
				
			case 11:
				p3.Alumnos(sc);
				break;
			
			case 12:
				p3.Primos1al100();
				break;
				
			case 14:
				p3.SecuenciaMult(sc);
				break;
				
			case 15:
				System.out.println("Introduce un número para hacer la suma de todos los divisores menos del mismo.");
				p4.SumaDivisores(Integer.parseInt(sc.nextLine()));
				break;
				
			case 16:
				System.out.println("Introduce un número hasta el que mostrar la seria de fibonacci");
				p4.Fibonacci(Integer.parseInt(sc.nextLine()));
				break;
				
			case 17:
				System.out.println("Factura de productos comprados");
				p4.Factura(sc);
				break;
				
			case 18:
				int num1, num2, num3;
				System.out.println("Debes introducir 3 números, despu�s serán ordenados de forma descendente");
				
				System.out.println("Introduce el primer número");
				num1 = Integer.parseInt(sc.nextLine());
				
				System.out.println("Introduce el segundo número");
				num2 = Integer.parseInt(sc.nextLine());
				
				System.out.println("Introduce el tercer número");
				num3 = Integer.parseInt(sc.nextLine());
				
				p4.Ordenar(num1, num2, num3);
				break;
				
			default: 
				System.out.println("Número inv�lido");
			}
			
			System.out.println("¿Qué quieres ejecutar? Del 1 al 18, pulsa 0 para acabar.");
			opcion = Integer.parseInt(sc.nextLine());
			
		} while(opcion!=0);
		sc.close();
	}

}
