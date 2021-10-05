import java.util.Scanner;

public class Ejercicio_15 {
  static Scanner sc = new Scanner(System.in);

  static void mostrarDia(){
    //Declaracion de variables e inicializacion
    int dia = 0;
    String nombredia = "";
    //Datos de entrada
    System.out.println("Igrese un dia de la semana (1-7): ");
    dia = sc.nextInt();
    //Proceso
    switch(dia) {
      case 1:
      nombredia = "Domingo";
      break;
      case 2:
     nombredia = "Lunes";
      break;
     case 3:
     nombredia = "Martes";
     break;
      case 4:
      nombredia = "Miercoles";
      break;
      case 5:
      nombredia = "Jueves";
      break;
      case 6: 
      nombredia = "Viernes";
      break;
      case 7:
      nombredia = "Sabado";
      break;

      default:
      nombredia = "No existe";
      }
    //Datos de salida
    System.out.println("El dia es: " + nombredia);
  }

  public static void main(String[] args) {
    mostrarDia();
  }
}
