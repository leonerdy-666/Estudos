import pandas as pd

pd.Series(data=5)

lista_nomes = 'howard ian jonnah kellie' .split()

pd.Series(lista_nomes) #cria uma  series com o valor da lista

dados = {
    "nome1" : "howard",
    "nome2" : "ian",
    "nome3" : "jonnah",
    "nome4" : "kellie",
}

print(pd.Series(dados)) #cria uma series com um dicionario





series_dados = pd.Series ([10.2, -1, None, 15, 23.4])
print('Quantidade de linhas = ', series_dados.shape) # Retorna uma tupla com o número de linhas print('Tipo de dados', series_dados.dtypes) # Retorna o tipo de dados, se for misto será object
print('Os valores são únicos?', series_dados.is_unique) # Verifica se os valores são únicos (sem duplicações) print('Existem valores nulos?', series_dados.hasnans) # Verifica se existem valores nulos
print('Quantos valores existem?', series_dados.count()) # Conta quantas valores existem (excluí os nulos)

lista_nomes = 'Howard Ian Peter Jonah Kellie'.split()

pd.DataFrame(lista_nomes, columns=['nome'])

print(pd.DataFrame(lista_nomes, columns=['nome']))

teste = 'https://pt.wikipedia.org/wiki/Austr%C3%A1lia'

dfs = pd.read_html(teste)

print(type(dfs))
print(len(dfs))