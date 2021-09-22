package paquete;

public class Ejecuta {

	public static void main(String[] args) {
		int resultado, suma;
		
		for(int i = 1; i <= 10; i++) {
			suma = 0;
			System.out.println("    TABLA DEL " + i);
			for(int j = 1; j <= 10; j++) {
				resultado = i*j;
			System.out.println(i + "	X	" + j + "   =   " + resultado);
				suma += resultado;
			}
			System.out.println("-------------------" + "\n La suma vale: " + suma);
		}

	}

}
