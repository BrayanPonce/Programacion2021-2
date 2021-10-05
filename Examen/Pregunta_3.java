//El ministro de salud requiere un diagrama de flujo que represente el algoritmo que permita determinar que tipo de vacuna (A, B o C) contra el Covid 19 debe aplicar a una persona; considerando que si es mayor de 70 años, sin importar el sexo se le aplica el tipo C; si tiene entre 16 y 69 años, y es mujer se le aplica el Tipo B, y si es hombre, el tipo A; si es menor de 16 años, se le aplica el tipo A, sin importar el sexo.
import java.util.Scanner;

class Pregunta_3{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){
    //Declaracion de variables e inicializacion
    int edad = 0;
    char sexo;
    //Datos de entrada
    System.out.println("Ingrese su edad: ");
    edad = sc.nextInt();
    do{
    System.out.println("Ingrese su sexo, M(Masculino) o F(Femenino): ");
    sexo = sc.next().charAt(0);
    }while(sexo != 'F' && sexo != 'M');
    //Proceso
    if (edad >= 70){
    System.out.println("Usted se debe aplicar la vacuna tipo C");
    } else if (edad >= 16 && edad < 70 && sexo == 'F'){
    System.out.println ("Usted se debe aplicar la vacuna tipo B");
    } else if (edad >= 16 && edad < 70 && sexo == 'M'){
    System.out.println("Usted se debe aplicar la vacuna tipo A");
    } else if (edad < 16){
    System.out.println("Se le aplica la vacuna tipo A");
    }
  }
}