import java.util.Scanner;

class Ejercicio_cuatro{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){
    
    int n, color, verde, blanco, rojo;
    verde = blanco = rojo = 0;

    do
    {
      System.out.println ("Ingrese la cantidad de focos: ");
    n = sc.nextInt();
    } while (n < 0);

    for (n = n; n > 0; n--)
    {
      do{
        System.out.println ("Seleccione un color ");
        System.out.println ("1 = verde ");
        System.out.println ("2 = blanco ");
        System.out.println ("3 = rojo ");
        color = sc.nextInt();
      } while (n <= 0 || n > 3);      

      if (color == 1)
      {
        verde++;
      } if (color == 2)
      {
        blanco++;
      } if (color == 3)
      {
        rojo++;
      }
    }
    System.out.println ("El total de focos verdes es: " + verde);
    System.out.println ("El total de focos blancos es: " + blanco);
    System.out.println ("El total de focos rojos es: " + rojo);
  }
}