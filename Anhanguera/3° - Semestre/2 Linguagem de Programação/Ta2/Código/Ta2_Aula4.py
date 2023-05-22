#algoritimo de ordenação
lista = [10, 4, 1, 15, -3]

lista_ordenada1 = sorted(lista)

lista_ordenada2 = lista.sort() 

print('lista = ', lista, '\n')

print('lista_ordenada1 = ', lista_ordenada1)
print('lista_ordenada2 = ', lista_ordenada2)

print('lista = ', lista)

#selection sort
def executar_selection_sort(lista):
    n = len(lista)
    for i in range(0, n):
        index_menor = i
        for j in range(i+1, n):
            if lista[j] < lista[index_menor]:
                index_menor = j
            lista[i], lista[index_menor] = lista[index_menor], lista[i]
    return lista

lista = [10, 9, 5, 8, 11, 3]
print(executar_selection_sort(lista))

#bubble sort
def executar_bubble_sort(lista):
    n = len (lista)
    for i in range(n-1):
        for j in range(n-1):
            if lista[j] > lista[j + 1]:
                lista[j], lista[j + 1] = lista[j + 1], lista[j]
    return lista
    
lista [10, 9, 5, 8, 11, -1, 3]
executar_bubble_sort(lista)

#merge sort

