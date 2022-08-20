

entrada = input("Ingrese secuencia:").upper().split(",") # .upper cambia todoa mayuscula
                                                         # .split los datos ingresados van sepaeradopor ,
lista = []                                               
contador = 1
letras = ""

for x in range(len(entrada)):                            # itera x en el rango de 0 a 20             
    if x != (len(entrada) - 1):                          # si x es diferente a 20 - 1
        if entrada[x] == entrada[x + 1]:                 # si la pocision 0 de entrada es igual a la posicion 1
            contador += 1                                # de entrada aumeta en contador +1  
        else:                                            # si no cumple
            lista.append(entrada[x])                     # agregar en lista el indice de entrada x 
            letras = letras + str(contador)              # variable letras "1"
            contador = + 1
    else:                                                # si no
        lista.append(entrada[x])                         # agrega en la lista el indice de entrada x 
        letras = letras + str(contador) 

print(*[x for x in lista])                               # itera la lista y la imprime con espacio eliminando , y llaves 
print(*[x for x in letras])

# entrada:
# C,E,a,b,g,c,e,c,B,C,g,b,d,f,B,D,g,e,c,a

# Salida

# C E A B G C E C B C G B D F B D G E C A

# 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 11

print(len(entrada))