def calcular(*args):
    r = sum(args)
    for i in args:
        r += i
    return r 

obj1 = calcular(1, 4 , 5)
print(obj1)

def procurar_valor(lista, valor):
    minimo = 0
    maximo = len(lista) - 1
    while minimo <= maximo:
        meio = (minimo + maximo) // 2
        if valor < lista[meio]:
            maximo = meio - 1
        elif valor > lista[meio]:
            minimo = meio + 1
        else:
            return meio
    return None

lista1 = [1, 3, 4, 5, 7, 8, 3]

obj2 = procurar_valor(lista1, 8)

print(obj2)
