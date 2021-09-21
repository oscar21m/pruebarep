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
		
		System.out.println("�Qu� metodo quieres ejecutar? Del 1 al 18, pulsa 0 para acabar.");
		opcion = Integer.parseInt(sc.nextLine());
		do{
			switch(opcion) {
			case 1:
				System.out.println("Introduce el n�mero A");
				int a = Integer.parseInt(sc.nextLine());
				System.out.println("Introduce el n�mero B");
				int b = Integer.parseInt(sc.nextLine());
				p1.divisor(a, b);
				break;
				
			case 2:
				System.out.println("Debes escribir 11 n�meros que esten entre 20 y 40, ambos inclusive");
				p1.Nums20al40(sc);
				break;
				
			case 3:
				System.out.println("Introduce n�meros hasta que escribas dos iguales seguidos");
				p1.DosIguales(sc);
				break;
				
			case 4:
				System.out.println("Introduce un n�mero, de el se mostraran todos los divisores");
				p1.TodosDivisores(Integer.parseInt(sc.nextLine()));
				break;
				
			case 5:
				System.out.println("Introduce un n�mero para comprobar si es primo");
				if(p2.esPrimo(sc.nextInt())) {
					System.out.println("El n�mero es primo");
				}else {
					System.out.println("El n�mero no es primo");
				}
				break;
			
			case 6:
				System.out.println("Introduce 9 n�meros, si el primero y el �ltimo son iguales se har� la media");
				p2.MediaQuizas(sc);
				break;
			
			case 7:
				p2.Calificaciones(sc);
				break;
			
			case 8:
				System.out.println("Deberas introducir 10 n�meros, luego se mostrara el m�s grande y cu�ntas veces se ha repetido");
				p2.MaxYRepeticiones(sc);
				break;
				
			case 9:
				System.out.println("El jugador1 escribir� un n�mero del 1 al 100 y el jugador2 intentar� adivinarlo, tiene 10 intentos");
				p2.JuegoMayorMenor(sc);
				break;
			
			case 10:
				System.out.println("Introduce 5 n�meros, se comprobaran si todos son iguales o no");
				if(p3.SonIguales(sc)) {
					System.out.println("Todos los n�meros son iguales");
				}else {
					System.out.println("Los n�meros son diferentes");
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
				System.out.println("Introduce un n�mero para hacer la suma de todos los divisores menos del mismo.");
				p4.SumaDivisores(Integer.parseInt(sc.nextLine()));
				break;
				
			case 16:
				System.out.println("Introduce un n�mero hasta el que mostrar la seria de fibonacci");
				p4.Fibonacci(Integer.parseInt(sc.nextLine()));
				break;
				
			}
			
			System.out.println("�Qu� m�todo quieres ejecutar? Del 1 al 18, pulsa 0 para acabar.");
			opcion = Integer.parseInt(sc.nextLine());
			
		} while(opcion!=0);
		sc.close();
	}

}
