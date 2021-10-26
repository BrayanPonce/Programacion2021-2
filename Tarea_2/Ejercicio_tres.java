import java.util.Scanner;

class Ejercicio_tres{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){
    int x, n, total, igual, menores, mayores;
    igual = menores = mayores = 0;

    System.out.println ("Ingrese el total de numeros: ");
    total = sc.nextInt();
    for (x = 1; x <= total; x++)
    {
      System.out.println("Ingrese un numero: ");
      n = sc.nextInt();

      if (n == 0)
      {
        igual++;
      } if (n < 0)
      {
        menores++;
      } if (n > 0)
      {
        mayores++;
      }
    }

      System.out.println("El total de numeros iguales a cero es: " + igual);
      System.out.println("El total de numeros menores a cero es: " + menores);
      System.out.println("El total de numeros mayores a cero es: " + mayores);
  }
}