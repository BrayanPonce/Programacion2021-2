import java.util.Scanner;

class Ejercicio4{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){
    
    int horas, total;

    System.out.println("Ingrese las horas: ");
    horas = sc.nextInt();

    if(horas <= 2){
      total = horas * 5;
    } else if (horas <= 5){
      total = ((horas-2)*4)+10;
    } else if (horas<= 10){
      total = ((horas-5)*3)+22;
    } else {
      total = ((horas-10)*2)+37;
    }

    System.out.println ("El total a pagar es: $" + total);
  }
}