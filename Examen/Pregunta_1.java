//Diseñe un algoritmo para determinar el promedio que obtendrá un alumno considerando que realiza tres exámenes de los cuales el primero y el segundo tienen una ponderación de 25% Mientras que el tercero de 50%.
import java.util.Scanner;

class Pregunta_1{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){
    //Declaracion de variables e inicializacion
    int nota1 = 0;
    int nota2 = 0;
    int nota3 = 0;
    double promedio = 0;
    //Datos de entrada
    System.out.println ("Ingrese la nota del primer examen: ");
    nota1 = sc.nextInt();
    System.out.println ("Ingrese la nota del segundo examen: ");
    nota2 = sc.nextInt();
    System.out.println ("Ingrese la nota del tercer examen: ");
    nota3 = sc.nextInt();
    //Proceso
    promedio = (nota1 * 0.25) + (nota2 * 0.25) + (nota3 * 0.50);
    //Datos de salida
    System.out.println ("El promedio es: " + promedio);
  }
}