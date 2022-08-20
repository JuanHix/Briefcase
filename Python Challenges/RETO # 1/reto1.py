
# Bascula Magica reto.
def bascula():
     if  nico <= 20 :
          print("uno")
     elif nico >= 21 and  nico < 40:
          print("dos")
     elif nico >= 41 and nico < 80:
          print("tres")
     else: 
          nico >= 41 and nico < 80
          print("cuatro")

ale = int(input("Ingrese peso Ale: "))  
gi = ( ale * 2 ) + 4
nico = ( gi + ale ) // 5
print(ale, gi, nico) 
bascula()

# otra forma.

def bascula_magica(peso):
        ale = int(input("Ingrese peso Ale: ")) 
        gi = (ale * 2) + 4
        nico = (gi + ale) // 5
        print(ale, gi, nico)
        if nico in range(0, 20):
         print("uno")
        elif nico in range(21, 40):
         print("dos")  
        elif nico in range(41, 80):
         print("tres")      
        else : 
         nico in range(81, )
         print("cuatro")
print(bascula_magica())         





  



