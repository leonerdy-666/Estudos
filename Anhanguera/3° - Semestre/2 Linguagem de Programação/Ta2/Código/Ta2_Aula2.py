#Algoritmo de Busca
nomes = 'João Marcela Sonia Daryl Vernon Eder Mechelle Edan Igor Ethan Reed Travis Hoyt'.split()
print('Marcela' in nomes) 
print('Roberto' in nomes)

#busca linear
def executar_busca_linear(lista, valor):
    for elemento in lista:
        if valor==elemento:
            return True
        return False
    
#determinar o valor na lista
vogais = 'aeiou'
resultado = vogais.index('e')
print(resultado)