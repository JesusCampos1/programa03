package programa03;

import java.util.Scanner;

public class programa03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		int edad;
		double altura;
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese su nombre: ");
		nombre = leer.nextLine();
		System.out.print("Ingrese su edad: ");
		edad = leer.nextInt();
		System.out.print("Ingrese su altura: ");
		altura = leer.nextDouble();
		
		System.out.println("Su nombre es: "+nombre);
		System.out.println("Su edad es: "+edad);
		System.out.println("Su altura es: "+altura);

	}

}
