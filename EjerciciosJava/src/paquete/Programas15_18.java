package paquete;

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
	
	/*16.Programa que genera los N primeros números de la serie de Fibonacci. El valor N deberá
		 ser leído por el teclado. NOTA: Los dos primeros números son 1, y el resto se obtiene
		 sumando los dos anteriores: 1,1,2,3,5,8,13,21…*/
	
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
		 factura. Si el importe supera los 1000€ se aplicará un descuento del 5%. El programa 
		 finaliza al introducir una cantidad 0.*/
	
}
