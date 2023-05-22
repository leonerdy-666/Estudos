#Tipos de Sequencia
texto = "Aprendendo Python na disciplina de linguagem de programação."

print(f"Tamanho do texto = {len(texto)}")
print (f"Python in texto = {'Python' in texto}")
print(f"Quantidade de y no texto = {texto.count('y')}")
print (f"As 5 primeiras letras são: {texto[0:6]}")

#Função de Repetição

vogais = ['a', 'e', 'i', 'o', 'u'] # também poderia ter sido criada usando aspas duplas
for vogal in vogais: print (f'Posição = {vogais.index (vogal)}, valor = {vogal}')

#Função split
texto = "Aprendendo Python na disciplina de linguagem de programação."
print (f"texto = {texto}")
print (f"Tamanho do texto = {len(texto)}\n")
palavras = texto.split()
print (f"palavras = {palavras}")
print (f"Tamanho de palavras = {len (palavras)}")

#listas 
linguagens = ["Python", "Java", "JavaScript", "c", "C#", "C++", "Swift", "Go", "Kotlin"]
#linguagens '''Python Java JavaScript C C# C++ Swift Go Kotlin'''. .split() # Essa sintaxe produz o mesmo resultado que a linha 1

print("Antes da listcomp = ", linguagens)

linguagens = [item.lower() for item in linguagens]

print("\nDepois da listcomp = ", linguagens)

#função map

print("Exemplo")
linguagens = '''Python Java JavaScript C C# nova_lista = C++ Swift Go Kotlin'''.split() 
map(lambda x: x.lower(), linguagens) 
print (f"A nova lista é = {nova_lista}\n")
nova_lista = list(nova_lista)
print (f"Agora sim, a nova lista é {nova_lista}")

#função range


numeros = list(range(0, 21))

numeros_pares = list(filter(lambda x: x % 2  == 0, numeros))

print(numeros_pares)

#Função tuplas
vogais ('a', 'e', 'i', 'o', 'u') 
print (f"Tipo do objeto vogais = {type(vogais)}")

for p, x in enumerate(vogais):
 print("Posição = {p}, valor = {x}")

 #objeto tipo SET
 len(s)
 x in s
 x not in s

 #Objeto tipo mapping
 

