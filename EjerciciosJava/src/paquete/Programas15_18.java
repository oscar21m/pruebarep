package paquete;
import java.util.Scanner;

public class Programas15_18 {
	
	/*15.Programa que lee un número y muestra la suma de sus divisores, sin incluir el propio
		 número entre sus divisores*/
	
	public void SumaDivisores(int num) {
		int suma = 0;
		for (int i = 1; i < num; i++) {
			
			if(num%i == 0) {
				suma += i;
			}
		}
		System.out.println("La suma es " + suma);
	}
	
	/*16.Programa que genera los N primeros n�meros de la serie de Fibonacci. El valor N deberá
		 ser leído por el teclado. NOTA: Los dos primeros números son 1, y el resto se obtiene
		 sumando los dos anteriores: 1,1,2,3,5,8,13,21�*/
	
	public void Fibonacci(int num) {
		int aux1 = 0, aux2=0, suma = 1;
		for(int i = 1; i <= num; i++) {
			System.out.print(suma + " ");
			aux2 = aux1;
			aux1 = suma;
			suma = aux1 + aux2;
		}
		System.out.println();
	}
	
	/*17.Programa que lee cantidades y precios de productos, para al final indicar el total de la 
		 factura. Si el importe supera los 1000€ se aplicar� un descuento del 5%. El programa 
		 finaliza al introducir una cantidad 0.*/
	
	public void Factura(Scanner sc) {
		int cant = 0;
		double precio = 0, resultado, suma = 0;
		
		do {
			resultado = 0;
			System.out.println("Introduce la cantidad de productos que vas a comprar");
			cant = Integer.parseInt(sc.nextLine());
			
			if(cant!=0) {
				System.out.println("Introduce el precio del producto, (la unidad)");
				precio = Double.parseDouble(sc.nextLine());
				
				resultado = cant * precio;
				
				if(resultado > 1000) {
					resultado -= (resultado * 0.05);
					System.out.println("Como el importe ha superado los 1000€ se le ha aplicado un descuento del 5%");
				}
				
				System.out.println("IMPORTE DEL PRODUCTO: " + resultado + "�");
				suma += resultado;
			}
			
		}while(cant!=0);
		
		System.out.println("IMPORTE TOTAL: " + suma + "�");
	}
	
	/*18. Programa que lee 3 números y los muestra ordenados de manera descendente*/
	public void Ordenar(int num1, int num2, int num3) {
		int aux;
		if(num1 < num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		if (num1 < num3) {
			aux = num1;
			num1 = num3;
			num3 = aux;
		}
		System.out.print(num1 + ", ");
		
		if(num2 >= num3) {
			System.out.println(num2 + ", " + num3);
		} else {
			System.out.println(num3 + ", " + num2);
		}
	}
	
}
