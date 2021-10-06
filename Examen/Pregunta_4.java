import java.util.Scanner;
import java.util.*;

class Pregunta_4{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){
    //Declaracion de variables e inicializacion
    double num1, num2;
    double total = 0;
    char signo;
    //Datos de entrada
    System.out.println("Ingrese el primer valor: ");
    num1 = sc.nextDouble();
    System.out.println("Ingrese el segundo valor: ");
    num2 = sc.nextDouble();
    System.out.println("Ingrese el signo: ");
    signo = sc.next().charAt(0);
    //Proceso
    if (signo == '+'){
      total = num1 + num2;
    } else if (signo == '-'){
      total = num1 - num2;
    } else if (signo == '*'){
      total = num1 * num2;
    } else if (signo == '/'){
      total = num1 / num2;
    } else if (signo == '^'){
      total = Math.pow(num1,num2);
    }
    //Datos de salida
    System.out.println ("El resultado es: " + total);
  }
}