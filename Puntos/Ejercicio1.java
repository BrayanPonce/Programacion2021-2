import java.util.Scanner;

class Ejercicio1{

  public static void main(String [] arg){
    Scanner sc = new Scanner(System.in);

    int a, b, suma;
    suma = 0;

    System.out.println("Ingrese el valor de A: ");
    a = sc.nextInt();

    System.out.println("Ingrese el valor de B: ");
    b = sc.nextInt();

    for (a = a; a <= b; a++)
    {
      if (a % 2 == 0)
      {
        suma = suma + a;
      }
    }
    System.out.println ("Suma = " + suma);
  }
}