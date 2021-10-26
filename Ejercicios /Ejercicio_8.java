import java.util.Scanner;

public class Ejercicio_8 {
  static Scanner sc = new Scanner(System.in);

  static void antiguedad(){
    //Declaracion de variables e inicializacion
    int antiguedad;
    double sueldo, descuento, total = 0;
     //Datos de entrada
     System.out.println("Ingrese su antiguedad en la empresa: ");
    antiguedad = sc.nextInt();
    System.out.println("Ingrese su sueldo: ");
    sueldo = sc.nextDouble();
    //Proceso
    if (antiguedad >= 2 && antiguedad < 5){
     descuento = sueldo * 0.20;
     total = sueldo + descuento;
    }else {
      descuento = sueldo * 0.5;
      total = sueldo + descuento;
    }
    //Datos de salida
    System.out.println("Felicidades, Ud tiene un bono de: $" + descuento);
    System.out.println("El monto total es de: $" + total);
  }
  static void dinero(){
    //Declaracion de variables e inicializacion
    double dinero, total, bono = 0;
    //Datos de entrada
    System.out.println("Ingrese la cantidad de su sueldo: ");
   dinero = sc.nextDouble();
    //Proceso
    if (dinero <= 1000){
      bono  = dinero * 0.25;
      total = dinero + bono;
    } else if (dinero > 1000 && dinero <= 3500){
      bono = dinero * 0.15;
      total = dinero + bono;
    } else {
      bono= dinero * 0.10;
      total = dinero + bono;
    }
    //Datos de salida
    System.out.println("Felicidades, Ud tiene un bono de: $" + bono);
    System.out.println("El monto total es de: $" + total);
  }
static void menuOpciones(){ 
    int opcionesA=0;
    System.out.println("-------------------------------");
    String msg="\nIngrese el Algoritmo que desea Probar 1 = por antiguedad o 2 = por dinero: ";
    System.out.println(msg);
    opcionesA=sc.nextInt();  
    while(opcionesA!=0){
        switch(opcionesA) {
          case 1: antiguedad();break;
          case 2: dinero();break;
          default:
            System.out.println("El Algoritmo no existe!");
        }   
      System.out.println("------------------------------");  
      System.out.println(msg);
      opcionesA=sc.nextInt();        
    }
  }
public static void main(String[] args) {
    menuOpciones();
  }
}