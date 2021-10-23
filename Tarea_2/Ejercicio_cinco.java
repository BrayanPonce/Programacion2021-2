import java.util.Scanner;
import java.lang.Math;

class Ejercicio_cinco{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){
    
    long dinero, contador; 
    double suma = 0;
    dinero = 3;

    for ( contador = 1; contador <= 365; contador++)
    {
      suma = suma + Math.pow(dinero, contador);
      System.out.println("El ahorro en el dia " + contador + " es: S/" + Math.pow(dinero, contador));
    }
    System.out.println("La cantidad total que va a ahorrar en todo el año es: S/" + suma);
  }
}