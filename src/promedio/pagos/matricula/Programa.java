package promedio.pagos.matricula;

import java.util.Scanner;

public class Programa {
	

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nombre;
		float vlrMatricula;
		int numeroEstudiantes;

		System.out.print("Digite la cantidad de estudiantes ");
		numeroEstudiantes = entrada.nextInt();
		
		Estudiante estudiantes[] = new Estudiante[numeroEstudiantes];
		for(int i=0; i<numeroEstudiantes; i++) {
			entrada.nextLine();
			System.out.print("\nDigite los datos del estudiante " +(i+1) +":");
			System.out.print("\nIntroduzca el nombre");
			nombre = entrada.nextLine();
			System.out.print("Introduzca el precio de la matricula");
			vlrMatricula = entrada.nextFloat();
			
			estudiantes[i] = new Estudiante(nombre, vlrMatricula);
			
		}
		
		
		
		float suma = 0;
		float mayorMatricula = 0;
		int indiceMayorMatricula = 0;
		
		
			
		for(int i=0; i<numeroEstudiantes; i++) {
			suma = suma + estudiantes[i].vlrMatricula;
			if(estudiantes[i].vlrMatricula > mayorMatricula) {
				mayorMatricula = estudiantes[i].vlrMatricula;
				indiceMayorMatricula = i;
				
			}
			
		
			
		}
		float promedio = suma / numeroEstudiantes;
		
		System.out.print("\nEl promedio de la matricula es: $" +promedio);
		System.out.print("\n"+estudiantes[indiceMayorMatricula].nombre+ " paga la mayor matricula, que es de valor: $"  +mayorMatricula);
		System.out.print("\nLa diferencia entre el promedio y el estudiante con mayor valor de pago es de: $: "+(mayorMatricula - promedio));
		
		}
	
	

}
