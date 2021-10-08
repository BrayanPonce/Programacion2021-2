import java.util.Scanner;

class Ejercicio_5{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){
    //Declarar variables
String nomA, nomB, nomC, nomM = "";
int edadA, edadB, edadC, edadM = 0;
    //Datos de entrada
System.out.println("Ingrese el nombre de la 1era persona: ");
nomA = sc.next();
System.out.println("Ingrese la edad de la 1era persona: ");
edadA = sc.nextInt();
System.out.println("Ingrese el nombre de la 2da persona: ");
nomB = sc.next();
System.out.println("Ingrese la edad de la 2da persona: ");
edadB = sc.nextInt();
System.out.println("Ingrese el nombre de la 3era persona: ");
nomC = sc.next();
System.out.println("Ingrese la edad de la 3era persona: ");
edadC = sc.nextInt();
    //Proceso
if (edadA < edadB && edadA < edadC){
    edadM = edadA;
    nomM = nomA;
} 
if (edadB < edadA && edadB < edadC){
    edadM = edadB;
    nomM = nomB;
} 
if (edadC < edadA && edadC < edadB){
    edadM = edadC;
    nomM = nomC;
} 
    //Datos de salida
    System.out.println("La persona menor es: " + nomM + " y su edad es " + edadM);
  }
}