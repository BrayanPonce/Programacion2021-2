import java.util.Scanner;

class Ejercicio_ocho{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){
    
    int n;
    double precio, descuento, total, total1;
    descuento = total = total1 = 0;

    System.out.println("Ingrese la cantidad de articulos que desea comprar: ");
    n = sc.nextInt();

    while (n > 0)
    {
      System.out.println("Ingrese el precio del articulo " + n + ": ");
      precio = sc.nextInt();
      if (precio >= 200)
      {
        descuento = precio * 0.15;
      } if (precio > 100 && precio < 200)
      {
        descuento = precio * 0.12;
      } if (precio > 0 && precio <=100){
        descuento = precio * 0.10;
      }
      total1 = precio - descuento;
      System.out.println("El precio del articulo con descuento es: S/" + total1);
      System.out.println("El descuento aplicado es: S/" + descuento);
      total = total + (precio - descuento);
      n--;
    }
    System.out.println("El total a pagar es: S/" + total);
  }
}