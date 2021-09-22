package paquete;
import java.util.Scanner;

public class Programas19_23 {

	//19.Realiza un programa que lea desde teclado 10 números y posteriormente muestre solamente los que sean pares.
	
	public void Pares(Scanner sc) {
		
		int num;
		int arrnums[] = new int[10];
		
		for(int i = 0; i < arrnums.length; i++) {
			System.out.println("Introduce un número");
			num = Integer.parseInt(sc.nextLine());
			arrnums[i] = num;
		}
		
		System.out.print("Pares: ");
		for(int i = 0; i < arrnums.length; i++) {
			if(arrnums[i]%2 == 0) {
				System.out.print(arrnums[i] + " ");
			}
		}
		System.out.println();
	}
	
	/*20. Realiza un programa que lea desde teclado 9 números. A continuación nos pedirá que
	busquemos un número entre los introducidos, y nos dirá si ha sido encontrado o no. En el
	caso en el que haya sido encontrado, nos indicará cuántas veces se ha introducido. El
	programa nos preguntará si queremos seguir buscando más números o no: “¿Desea
	seguir buscando?(s/n)”*/
	
	public void EncontrarNum(Scanner sc) {
		int arrnums[] = new int[9];
		int num, cont;
		boolean encontrado;
		char buscar = 's';
		String mensaje;
		
		do {
			
			encontrado = false;
			cont = 0;
			
			for(int i=0; i < arrnums.length; i++) {
				System.out.println("Introduce un número");
				arrnums[i] = Integer.parseInt(sc.nextLine());
			}
			System.out.println("Introduce el número que quieres buscar");
			num = Integer.parseInt(sc.nextLine());
			
			for (int i : arrnums) {
				
	            if (i == num) {
	            	encontrado = true;
	            	cont ++;
	            }
			}
			
			mensaje = encontrado?"Se ha encontrado, se repite " + cont + " veces":"No se ha encontrado ninguna vez";
			System.out.println(mensaje);
			
			System.out.println("¿Quieres seguir buscando?(s/n)");
			buscar = sc.nextLine().charAt(0);
			
		}while(buscar == 's');
	}
	
	//21.Realiza un programa que lea desde teclado 11 números enteros, para posteriormente mostrarlos en el orden inverso al que fueron introducidos
	
	public void CambiarOrden(Scanner sc) {
		int numeros[] = new int[11];
		
		for(int i = 0; i < numeros.length ; i ++) {
			System.out.println("Introduce un número");
			numeros[i] = Integer.parseInt(sc.nextLine());
		}
		
		for(int i = numeros.length - 1; i >= 0; i--) {
			System.out.print(numeros[i] + " ");
		}
	}
	
	/*22.Realiza un programa que lea desde teclado 10 números sin repetir. Si el usuario introduce 
		 algún número repetido se le debe notificar, y no ha de ser contabilizado.*/
	
	public void NumeroErroneo(Scanner sc) {
		int numeros[] = new int[10];
		int num;
		boolean repetido;
		
		for(int i = 0; i < numeros.length ; i ++) {
			repetido = false;
			System.out.println("Introduce un número");
			num = Integer.parseInt(sc.nextLine());
			
			for(int j = 0; j <= i && !repetido; j++) {
				
				if(num == numeros[j]) {
					repetido = true;
				}
			}
			
			if(repetido) {
				System.out.println("El número " + num + " ya está introducido, introduce otro por favor");
				i--;
			} else {
				numeros[i] = num;
			}
		}
	}
	
	/*23. Realiza un programa que lea desde teclado 8 números y posteriormente los muestre. 
	Los números que estuvieran repetidos solo se deben mostrar una vez*/
	
	public void QuitarDuplicados(Scanner sc) {
		int numeros[] = new int[8];
		int arraux[] = new int[8];
		int cont = 0;
		boolean repetido;
		
		for(int i = 0; i < numeros.length ; i ++) {
			System.out.println("Introduce un número");
			numeros[i] = Integer.parseInt(sc.nextLine());
		}
		
		for(int i = 0; i < numeros.length; i++) {
			repetido = false;
			
			for(int j = 0; j < arraux.length && !repetido; j++) {
				
				if(numeros[i] == arraux[j]) {		
					repetido = true;
				}
			}
			
			if (!repetido) {
				arraux[cont] = numeros[i];
				cont++;
			}
		}
		
		for(int i = 0; i < cont ; i ++) {
			System.out.println(arraux[i] + " ");
		}
	}

}
