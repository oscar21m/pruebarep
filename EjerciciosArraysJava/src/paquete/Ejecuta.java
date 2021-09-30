package paquete;
import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 1;
		
		Programas19_23 p1 = new Programas19_23();
		Programas24_27 p2 = new Programas24_27();
		Programas28_31 p3 = new Programas28_31();
		
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
				
			case 24:
				System.out.println("Iras introduciendo números que después se mostrarán de forma ascendiente");
				p2.OrdenAscendente(sc);
				break;
			
			case 25:
				p2.TablaBidimensional(sc);
				break;
			
			case 26:
				p2.CuadradoMagico();
				break;
				
			case 27:
				p2.MenorColumna(sc);
				break;
				
			case 28:
				p3.CargarTabla();
				break;
				
			case 29:
				p3.numsAleatorios();
				break;
				
			case 30:
				p3.FrecuenciaNums(sc);
				break;
				
			case 31:
				p3.MenuOPcionesArray();
				break;
			}
			
		}while(opcion != 0);
	}

}
