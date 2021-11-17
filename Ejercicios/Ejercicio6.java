import java.util.Scanner;

public class Ejercicio6 {
  static Scanner sc = new Scanner(System.in);

  static void CostDesc(){
    //Declaracion de variables e inicializacion
    int costo = 0;
    double descuento = 0, total = 0;
     //Datos de entrada
     System.out.println("Ingrese el precio del producto: ");
    costo = sc.nextInt();
    //Proceso
    if (costo >= 200){
      descuento = costo * 0.15;
      total = costo - descuento;
    }else if (costo >= 100 && costo < 200){
      descuento = costo * 0.12;
      total = costo - descuento;
    }else {
      descuento = costo * 0.10;
      total = costo - descuento;
    }
    //Datos de salida
    System.out.println("Felicidades, Ud tiene un descuento de: $" + descuento);
    System.out.println("El monto total es de: $" + total);
  }

  public static void main(String[] args) {
    CostDesc();
  }
}