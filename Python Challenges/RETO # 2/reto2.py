
vigbiana = (input("Equipo VIGBIANA ingrese armas: "))
fiotia = (input("Equipo FIOTIA ingrese armas: "))
armas = (input("Ingrese ARMAS del juego: "))
cont_v = 0
cont_f = 0


def sixty_nine(v, f):
    if v > f:
        print(f"V",end="")
    elif f > v:
        print(f"F",end="")
    else:
        print(f"≈",end="")


for i in armas:
    if i in vigbiana:
        cont_v += 1
    if i in fiotia:
        cont_f += 1
    sixty_nine(cont_v, cont_f)


# entrada:
# vigbiana = +XMY*|
# fiotia = +XWY.-
# armas = WWX.-.+M-M||+..+XM|XM

# Salida

# FFFFFFFFFFFFFFFFFFFFF



        











