import java.util.Scanner;

class Ejercicio_diecisiete{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){

    int x, n, resultado;
    System.out.println("Ingrese un numero: ");
    n = sc.nextInt();

    for (x = 1; x <= 10; x++)
    {
      resultado = n * x;
      System.out.println(+ n + " x " + x + " = "+ resultado);
    }
  }
}