package pe.edu.upeu.bpg;

import pe.edu.upeu.examen.*;
import pe.edu.upeu.utils.*;


public class App 
{

  public static ResolucionExamen re = new ResolucionExamen();
  static LeerTeclado lt = new LeerTeclado();

  static void menuOpciones(){ 
      //sp=new SubProgramas();
      int opcionesA=0;
      System.out.println("-------------------------------");
      String msg="\nElija la pregunta que desea probar"+ 
      "\nPregunta 2 = El gerente de una compañia automotriz desea determinar el impuesto"+
      "\nPregunta 3 = Tabla de Multiplicación de 1 a 20"+
      "\nPregunta 4 = Numero perfecto"+
      "\nPregunta 5 = x elevado a la n, pero con el metodo de recursividad"+
      "\nSi desea terminar el programa, solo presione la tecla '0'\n";

      opcionesA=lt.leer(0, msg); 
      while(opcionesA!=0){
          switch(opcionesA) {
            case 2: re.Ejercicio2(); break;
            case 3: re.Ejercicio3(); break;
            case 4: re.Ejercicio4(); break;
            case 5: 
            int x = lt.leer(0, "Ingrese el valor de x");
            int n = lt.leer(0, "Ingrese el valor de n");
            System.out.println(re.Ejercicio5(x, n)); break;

            default: System.out.println("LA PREGUNTA NO EXISTE!");
          }   
        System.out.println("------------------------------"); 
        opcionesA=lt.leer(0, msg);        
      }
    }

    public static void main( String[] args )
    {
      System.out.println( "-------Bienvenidos al Sistema-------\n" );
      menuOpciones();
    }
}