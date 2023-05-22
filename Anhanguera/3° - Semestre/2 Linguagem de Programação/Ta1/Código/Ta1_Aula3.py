
# estrutura  condicional simples
nome = 'Daniel'
sobrenome = ''
lista = []

if nome:
    print('A variável nome não é vazia')

# estrutura composta
valor1 = 10
valor2 = 20
if valor1 > valor2:
    print('o valor1 é maior do que O valor2')
else:
    print('o valor2 é maior do que o valor1')


# estruturas Lógicas, condicionais e de repetição em python

# estruturas Lógicas
cor = "verde"
if cor == 'verde':
    print('Acelerar')

elif cor == 'amarelo':
    print('Atenção')

else:
    print('Parar')

# estruturas condicionais
qtde_faltas = int(input("digite a quantidade de faltas: "))
media_final = float(input("digite a média final: "))

if qtde_faltas <= 5 and media_final >= 7:
    print("Aluno Aprovado!")
else:
    print("Aluno Reprovado!")

# estruturas de repetição
numero = 1

while numero != 0:
    numero = int(input("Digite um número: "))

    if numero % 2 == 0:
        print("Número par")
    else:
        print("Número Ímpar")

nome = "guido"

for c in nome:
    print(c)

nome1 = "Guido"

for i, c in enumerate(nome1):
    print(f"Posição = {i}, valor = {c}")

for x in range(10):
    print(x)
