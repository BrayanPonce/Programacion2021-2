print("Calcular el promedio final de FP")
#Datos de entrada
nota1 = float(input("Ingrese evaluacion 1: "))
nota2 = float(input("Ingrese evaluacion 2: "))
nota3 = float(input("Ingrese evaluacion 3: "))
nota4 = float(input("Ingrese evaluacion 4: "))
nota5 = float(input("Ingrese evaluacion 5: "))
nota6 = float(input("Ingrese evaluacion 6: "))
nota7 = float(input("Ingrese evaluacion 7: "))
#Proceso
profi = (nota1 * 0.15) + (nota2 * 0.15) + (nota3 * 0.10) + (nota4 * 0.15) + (nota5 * 0.05) + (nota6 * 0.10) + (nota7 * 0.30)
#Datos de salida
print (type(profi))
print ("El promedio final es: ",round (profi,2))