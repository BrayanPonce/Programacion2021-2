import java.util.Scanner;

class Ejercicio_nueve{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){
    
    int n, años, x;
    double ahorro, total, interes, fin;
    ahorro = total = interes = fin = 0;

      System.out.println("Ingrese los años de ahorro: ");
    años = sc.nextInt();   

    while (años > 0)
    {
      for (x = 1; x <= 12;x++)
      {
        System.out.println("Ingrese el ahorro del mes " + x + ": ");
        ahorro = sc.nextDouble();
        total = total + ahorro;
      }
      interes = interes + (total * 0.10);
      fin = total + interes;
      System.out.println("El interes anual es: S/" + interes);
      System.out.println("La inversion final es: S/" + fin);
      años--;
    }
    
  }
}