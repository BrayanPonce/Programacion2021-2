import java.util.Scanner;

class Ejercicio_uno{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){
  
    double salario;
    int i;
    salario = 1500;
    for (i = 1; i <= 6; i++)
    {
      salario = salario + (salario * 0.10);
      System.out.println("El salario en el año "+ i + " es: S/" + salario);
    }

      System.out.println("El salario en 6 años es = $" +salario);
  }
}