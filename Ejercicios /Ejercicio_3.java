import java.util.Scanner;

class Ejercicio_3{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){
    
    double pago;

    System.out.println("Ingrese el monto que tiene: ");
    pago = sc.nextDouble();

    if(pago <= 10){
      System.out.println("Usted puede darle como regalo una tarjeta");
    } else if (pago > 10 && pago <= 100) {
      System.out.println("Usted puede darle como regalo unos chocolates");
    } else if (pago > 100 && pago <= 250){
      System.out.println("Usted puede darle como regalo unas flores");
    } else {
      System.out.println("Usted puede darle como regalo un anillo");
    }
  }
}