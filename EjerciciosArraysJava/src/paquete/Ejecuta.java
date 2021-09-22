package paquete;
import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 1;
		
		Programas19_23 p1 = new Programas19_23();
		
		do {
			System.out.println("¿Qué método quieres ejecutar?, del 19 al 31, pulsa 0 para acabar.");
			opcion = Integer.parseInt(sc.nextLine());
			
			switch(opcion) {
			case 19:
				System.out.println("Introduce números, de ellos se cogeran los pares");
				p1.Pares(sc);
				break;
				
			case 20:
				System.out.println("Introduce números, después buscarás uno para ver si está");
				p1.EncontrarNum(sc);
				break;
				
			case 21:
				System.out.println("Los números introducidos se cambiaran de orden al inverso");
				p1.CambiarOrden(sc);
				break;
			
			case 22:
				System.out.println("Introduce números sin introducir repetidos");
				p1.NumeroErroneo(sc);
				break;
				
			case 23:
				System.out.println("Debes introducir números, después se mostrarán sin duplicarse aunque hayas repetido.");
				p1.QuitarDuplicados(sc);
				break;
				
			}
			
		}while(opcion != 0);
	}

}
