import java.util.Scanner;
import java.util.*;

public class Pregunta_5 {
  static Scanner sc = new Scanner(System.in);

 static void problema1(){
    //Declaracion de variables e inicializacion
    int nota1 = 0;
    int nota2 = 0;
    int nota3 = 0;
    double promedio = 0;
    //Datos de entrada
    System.out.println ("Ingrese la nota del primer examen: ");
    nota1 = sc.nextInt();
    System.out.println ("Ingrese la nota del segundo examen: ");
    nota2 = sc.nextInt();
    System.out.println ("Ingrese la nota del tercer examen: ");
    nota3 = sc.nextInt();
    //Proceso
    promedio = (nota1 * 0.25) + (nota2 * 0.25) + (nota3 * 0.50);
    //Datos de salida
    System.out.println ("El promedio es: " + promedio);
  }
 static void problema2(){
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

 static void problema3(){
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

 static void problema4(){
   //Declaracion de variables e inicializacion
    double num1, num2;
    double total = 0;
    char signo;
    //Datos de entrada
    System.out.println("Ingrese el primer valor: ");
    num1 = sc.nextInt();
    System.out.println("Ingrese el segundo valor: ");
    num2 = sc.nextInt();
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

 static void menuOpciones(){ 
    int opcionesA=0;
    System.out.println("-------------------------------");
    System.out.println("Ingrese el Algoritmo que desea probar");
    System.out.println("1 = Determinar el promedio que obtendrá un alumno");
    System.out.println("2 = Determinar el monto de bono que percibirá un profesor");
    System.out.println("3 = Determinar que tipo de vacuna (A, B o C) contra el Covid 19 se debe aplicar a una persona");
    System.out.println("4 = Calcular una operación aritmética entre 2 valores introducidos y el signo correspondiente por teclado");
    System.out.println("Ingrese la opcion: ");
    opcionesA=sc.nextInt();  
    while(opcionesA!=0){
        switch(opcionesA) {
          case 1: problema1();break;
          case 2: problema2();break;
          case 3: problema3();break;
          case 4: problema4();break;
          default:
            System.out.println("El Algoritmo no existe!");
        }   
      System.out.println("------------------------------");  
      System.out.println("Ingrese el Algoritmo que desea probar");
      System.out.println("1 = Determinar el promedio que obtendrá un alumno");
      System.out.println("2 = Determinar el monto de bono que percibirá un profesor");
      System.out.println("3 = Determinar que tipo de vacuna (A, B o C) contra el Covid 19 se debe aplicar a una persona");
      System.out.println("4 = Calcular una operación aritmética entre 2 valores introducidos y el signo correspondiente por teclado");
      opcionesA=sc.nextInt();        
    }
  }
 public static void main(String[] args){
 menuOpciones();
 }
}

