import java.util.Scanner;

class Ejercicio_dos{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){
    
    char tarjeta, tipo;
    int i, n;
    double total1, total2, total3, total4, total5, total6, total;
    double descuento1, descuento2, descuento3;
    descuento1 = descuento2 = descuento3 = 0;
    total1 = total2 = total3 = total4 = total5 = total6 = 0;

    System.out.println ("Ingrese el número de hamburguesas que desea: ");
    n = sc.nextInt();

    for(i = 1; i <= n;i++)
    {
      do
      {
        System.out.println ("Hamburguesa " + i +": ");
        do
        {
          System.out.println ("Ingrese que tipo de hamburguesa desea: ");
          System.out.println ("Hamburguesa sencilla (S) con precio de S/20");
          System.out.println ("Hamburguesas dobles (D) con precio de S/25");
          System.out.println ("Hamburguesas triples (T) con precio de S/28");
          System.out.println ("----------------------------------------");
          tipo = sc.next().charAt(0);
        } while (tipo != 'S' && tipo != 'D' && tipo != 'T');
        do
        {
          System.out.println ("----------------------------");
          System.out.println ("¿Quiere pagar con tarjeta de credito?");
          System.out.println ("Si (S) o No (N): ");
          System.out.println ("------------------");
          tarjeta = sc.next().charAt(0);

        }while (tarjeta != 'S' && tarjeta != 'N');
      }while (i > n);
      if (tipo == 'S' && tarjeta ==  'S')
    {
      descuento1 = 20 * 0.05;
      total1 = descuento1 + 20;
    } if (tipo == 'S' && tarjeta ==  'N')
    {
      total2 = 20;
    } if (tipo == 'D' && tarjeta ==  'S')
    {
      descuento2 = 25 * 0.05;
      total3 = descuento2 + 25;
    } if (tipo == 'D' && tarjeta ==  'N')
    {
      total4 = 25;
    } if (tipo == 'T' && tarjeta ==  'S')
    {
      descuento3 = 28 * 0.05;
      total5 = descuento3 + 28;
    } if (tipo == 'T' && tarjeta ==  'N')
    {
      total6 = 28;
    }
    }
    total = total1 + total2 + total3 + total4 + total5 + total6;
    System.out.println ("---------------------------------------");
    System.out.println ("El total a pagar por " + n + " hamburguesas es: S/" + total);

  }
}