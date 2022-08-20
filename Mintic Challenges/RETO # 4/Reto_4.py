import json

laminas = input("D:")
letras = input("L:")
carga = json.loads(laminas)
contador = 0
diccionario = {}
num = ""

for i in letras:
    for x, y in carga.items():
        if x == i:
            diccionario[x] = y
            contador += y
            num += x
            num += " "

print(contador)
print(num)
