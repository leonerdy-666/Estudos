#funções Python

#função eval()

a = 2
b = 1

equacao = input("Digite a fórmula geral da equação linear ( a * x + b): ")
print(f"\nA  entrada do usuário {equacao} é do tipo {type(equacao)}")

for x in range(5):
    y = eval(equacao)
    print(f"\nResultado da equação para x = {x} é {y}")

def imprimir_mensagem(disciplina, curso):
    
    print(f"minha primeira função em {disciplina} do curso {curso}")

imprimir_mensagem("python", "ads")

def somar(a, b):
    return a + b
r = somar(2, 3)
print(r)

#parametro posicinal obrigatorio valor default

def  calcular_desconto(valor, desconto = 0):
    valor_com_desconto = valor - (valor * desconto)
    return valor_com_desconto

valor1 = calcular_desconto(100)
valor2 = calcular_desconto(100, 0.25)

print(f"/n primeiro valor =  {valor1}")
print(f"/n primeiro valor =  {valor2}")

#Parametro nominal obrigatorio sem valor default

def converter_maiuscula(texto, flag_maiuscula):
    if flag_maiuscula:
        return texto.upper()
    else:
        return texto.lower()
    
texto = converter_maiuscula(flag_maiuscula=True, texto="joão")
print(texto)

#Parametro posicional e não obrigatorio

def imprimir_parametros(*args): 
    qtde_parametros = len(args) 
    print(f"Quantidade de parâmetros = {qtde_parametros}")


for i, valor in enumerate(args):
    print(f"Posição = {i}, valor = {valor}")

print("\nChamada 1")
imprimir_parametros("São Paulo", 10, 23.78, "João") 
print("\nChamada 2")
imprimir_parametros(10, "São Paulo")

#parametro nominal e não obrigatorio (kwargs)

def imprimir_parametros (**kwargs):
    print(f"Tipo de objeto recebido = {type (kwargs)}\n")
qtde_parametros = len(kwargs)
print(f"Quantidade de parâmetros = {qtde_parametros}")

for chave, valor in kwargs.items(): 
    print (f"variável = {chave}, valor = {valor}")

print("\nChamada 1")
imprimir_parametros (cidade="São Paulo", idade=33, nome="João") 
print("\nChamada 2")
imprimir_parametros (desconto=10, valor=100)

#função anonima

soma = lambda x, y: x + y 
soma(x=5, y=3)

