import java.util.Scanner;

class Ejercicio11{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){
    
    int antiguedad, bono;
    System.out.println("Ingrese su antiguedad del empleado: ");
    antiguedad = sc.nextInt();

    if(antiguedad == 1){
      bono = 100;
    } else if (antiguedad == 2){
      bono = 200;
    } else if (antiguedad == 3){
      bono = 300;
    } else if (antiguedad == 4){
      bono = 400;
    } else if (antiguedad == 5){
      bono = 500;
    } else {
      bono = 1000;
    }
    System.out.println("Usted tiene un bono de: $" + bono);
  }
}