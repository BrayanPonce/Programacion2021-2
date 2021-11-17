import java.util.Scanner;

class Ejercicio2{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){
    
    double pago, total, doble;
    int horas;

    System.out.println("Ingrese las horas trabajadas: ");
    horas = sc.nextInt();

    System.out.println("Ingrese el pago por hora: ");
    pago = sc.nextDouble();

    if(horas <= 40){
      total = pago * horas;
    } else {
      doble = horas - 40;
      total = (pago * 40) + (doble * pago * 2);
    }

    System.out.println ("El monto total es: " + total);
  }
}