package pe.edu.upeu.examen;

import pe.edu.upeu.utils.*;

public class ResolucionExamen {

    static LeerTeclado lt = new LeerTeclado();

    public void Ejercicio2()
    {
        int n, categoria;
        double precio, impuesto, categoria1, categoria2, categoria3, total;
        categoria1 = categoria2 = categoria3 = total = impuesto = 0;
        n = lt.leer(0, "Ingrese el numero de autos ");
        while (n > 0)
        {
            precio = lt.leer(0, "Ingrese el precio del auto ");
            categoria = lt.leer(0, "Ingrese la categoria del auto ");
            if (categoria > 0 && categoria <= 3)
            {
                if (categoria == 1)
                {
                    impuesto = precio * 0.12;
                    categoria1 = categoria1 + impuesto;
                }
                else if (categoria == 2)
                {
                    impuesto = precio * 0.08;
                    categoria2 = categoria2 + impuesto;
                }
                else
                {
                    impuesto = precio * 0.05;
                    categoria3 = categoria3 + impuesto;
                }
                total = total + impuesto;
                System.out.println("El impuesto a pagar por el auto " + n + " es = " + impuesto + "\n");
                n--;
            }
            else {
                System.out.println("Ingrese la categoria correcta");
            }

        }
        System.out.println("El impuesto a pagar por la categoria 1 es = S/" + categoria1);
        System.out.println("El impuesto a pagar por la categoria 2 es = S/" + categoria2);
        System.out.println("El impuesto a pagar por la categoria 3 es = S/" + categoria3);
        System.out.println("El impuesto total por todos los autos es = S/" + total);

    }
    
    public void Ejercicio3()
    {
        int i, k, multi;

        for (i = 1; i <= 20; i++)
        {
            System.out.println("\n-----------" + i + "-----------\n");
            for (k = 1; k <= 10; k++)
            {
                multi = i * k;
                System.out.println (i + " * " + k + " = " + multi);
            }

        }
    }

    public void Ejercicio4()
    {
        int i, suma = 0, n;
        i = 1;

        n = lt.leer(0, "Introduce un número ");
        while (i < n)
        {
            if (n % i == 0)
            {
                suma = suma + i;
            }
            i++;
        }
        if (suma == n) {           // si el numero es igual a la suma de sus divisores es perfecto                
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");

        }
    }

    public int Ejercicio5(int x, int n)
    {
        if (n == 0) return 1;
        return  x * Ejercicio5(x, n - 1);
    }
}