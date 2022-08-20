
def tipodefigurita(t):
    lista = []
    for i in t:
        if i not in lista:
            lista.append(i)
    return lista
#print(tipodefigurita(['accion','magia','batalla','batalla','batalla','accion','magia','batalla','batalla','batalla']))


def mefaltandeltipodefigurita(x, y, z):

    lista = []
    for i in range(len(x)):
        if z == y[x[i]]:
            lista.append(x[i])
    return (lista)
# print(mefaltandeltipodelamina([3,6,8],['accion','magia','batalla','batalla','batalla','accion','magia','batalla','batalla','batalla'],'batalla'))


def notengo(a, b):
    lista = []
    for i in a:
        if i not in b:
            lista.append(i)
    return lista
# print(notengo([3,5,7,10,15,16],[4,10,5,8]))


def puedocambiar(a, b):
    lista1 = 0
    lista2 = 0
    for i in b:
        if i not in a:
            lista1 += 1
    for i in a:
        if i not in b:
            lista2 += 1
    return(min(lista1, lista2))

print(puedocambiar([3,5,7,10,15,16],[4,10,5,8]))
