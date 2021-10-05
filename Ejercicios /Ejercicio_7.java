import java.util.Scanner;

public class Ejercicio_7 {
  static Scanner sc = new Scanner(System.in);

  static void becapresEst(){
    //Declaracion de variables e inicializacion
    int edad = 0;
    double promedio = 0, montobeca = 0;
    //Datos de entrada
    System.out.println("Ingrese su edad: ");
    edad = sc.nextInt();
    System.out.println("Ingrese su promedio de nota: ");
    promedio = sc.nextDouble();
    //Proceso
    if(edad > 18){
      if(promedio >= 9){
        montobeca = 2000;
      } else if(promedio >= 7.5 && promedio < 9){
        montobeca = 1000;
      } else if(promedio >= 6 && promedio < 7.5){
        montobeca = 500;
      }else {
        montobeca = 0;
      }
    }else {
      if(promedio >= 9){
       montobeca = 3000;
      } else if(promedio >= 8 && promedio < 9){
      montobeca = 2000;
      } else if(promedio >= 6 && promedio < 8){
      montobeca = 100;
      }else {
      montobeca = 0;
      }
    }
    //Datos de salida
    if (montobeca == 0){
      System.out.println("Esforzarse mas para el proximo ciclo");
    } else{
      System.out.println("Felicidades, Ud es acreedor de una beca por el monto de: $" + montobeca);
    }
  }

  public static void main(String[] args) {
    becapresEst();
  }

}