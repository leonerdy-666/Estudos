class PrimeiraClasse:

    def imprimir_mensagem(self, nome): #criando um metodo
        print(f"olá {nome}, seja bem vindo!")
       
objeto1 = PrimeiraClasse() #instanciando um objeto do tipo PrimeiraClasse
objeto1.imprimir_mensagem('joao') #invocando o metodo

#contrutor da classe init()
class Televisao:
    def __init__(self):
        self.volume = 10
    def aumentar_volume(self):
        self.volume += 1
    def diminuir_volume(self):
        self.volume -= 1

tv = Televisao()
print("volume ao ligar a tv = ", tv.volume)
tv.aumentar_volume()
print("volume da tv = ", tv.volume)

#variaveis e  metodos  privados
class ContaCorrente:
    def __init__(self):
        self.saldo = None
    def depositar(self, valor):
        self.saldo +=valor
    def consultar_saldo(self):
        return self._sald 
    
#herança
class Pessoa:
    def __init__(self):
        self.cpf = None
        self.nome = None
        self.endereco = None

class Funcionario(Pessoa):
    def __init__(self):
        self.matricula = None
        self.salario = None
    def bater_ponto(self):
        #codigo
        pass
    def fazer_login(self):
        #codigo aqui
        pass

f1 = Funcionario()
f1.nome = "Leonardo"
print(f1.nome)

c1 = Pessoa()
c1.cpf = "111.111.111-11"
print(c1.cpf)

#metodo magico  função dir()

print(dir(Pessoa()))

