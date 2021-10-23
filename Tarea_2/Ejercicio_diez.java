import java.util.Scanner;

class Ejercicio_diez{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){

    int x, n, salones, edad, alumnos;
    double total, suma;
    
    salones = 0;
    total = 0;
    alumnos = 0;

    System.out.println("Ingrese el numero de salones: ");
    salones = sc.nextInt();

    while (salones > 0)
    {
      System.out.println("Ingrese el numero de alumnos: ");
      n = sc.nextInt();
      suma = 0;
      for (x = 1; x <= n; x++)
      {
        System.out.println("Ingrese la edad del alumno " + x + ": ");
        edad = sc.nextInt();
        suma = suma + edad;
      }
      System.out.println ("El promedio del salon "+salones+" es: " + (suma /n) + " años");
      alumnos = alumnos + n;
      total = total + suma;
      salones--;
    }
    System.out.println("El promedio de toda la escuela es: " + (total / alumnos) + " años");    
  }
}