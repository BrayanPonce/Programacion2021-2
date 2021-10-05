import java.util.Scanner;

class Pregunta_2{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){
    //Declaracion de variables e inicializacion
    double salariomin = 0;
    int puntos = 0;
    double descuento, total;
    //Datos de entrada
    System.out.println("Ingrese su salario minimo: ");
    salariomin = sc.nextDouble();
    do{
      System.out.println("Ingrese su puntaje: ");
      puntos = sc.nextInt();
    } while (puntos < 100);
    //Proceso
    if (puntos >= 100 && puntos <= 200){
      descuento = salariomin * 0.10;
      total = salariomin + descuento;
    } else if(puntos > 200 && puntos <= 300){
      descuento = salariomin * 0.40;
      total = salariomin + descuento;
    } else if (puntos > 300 && puntos <= 400){
      descuento = salariomin * 0.70;
      total = salariomin + descuento;
    } else {
      descuento = salariomin * 0.80;
      total = salariomin + descuento;
    }
    //Datos de salida
    System.out.println("Usted tiene un descuendo de: $" + descuento);
    System.out.println ("El salario total es: $" + total);
  }
}