import java.util.Scanner;

class Ejercicio_ciclicas{

  public static void main(String [] arg){
    Scanner sc = new Scanner(System.in);

    int asigcod, calf, cred, cantasigcur = 0, cont = 0;
    double prompond = 0, sumcred = 0, temp = 0;
    //Datos de entrada pre-poceso
    System.out.println ("Ingrese el codigo de la asignatura: ");
    asigcod = sc.nextInt();
    while (asigcod != 9999)
    {
      System.out.println ("Ingrese la calificacion del curso " +asigcod + ": ");
      calf = sc.nextInt();
     System.out.println ("Ingrese el numero de creditos del curso " + asigcod + ": ");
     cred = sc.nextInt();
     
     temp = temp + (calf*cred);
     sumcred = sumcred + cred;
     cont++;

      System.out.println ("Ingrese el codigo de la siguiente asignatura: ");
      asigcod = sc.nextInt();

      if (asigcod == 9999)
      {
        if (sumcred >= 25 && sumcred <= 50)
        {
          prompond = Math.round((temp /sumcred) * 100.0) / 100.0 ;
        } else{
        System.out.println ("La cantidad de creditos no estan entre los rangos permitidos... Intente nuevamente");
        System.out.println ("Ingrese el codigo de la siguiente asignatura: ");
        asigcod = sc.nextInt();

        temp = 0;
        sumcred = 0;
        cont = 0;
        }
      }
    }
    //Datos de salida
    System.out.println ("Cantidad de asignaturas cursadas es: " + cont);
    System.out.println ("Suma de creditos: " + sumcred);
    System.out.println ("El promedio ponderado: " + prompond);
  }
}