#language: pt
Funcionalidade: Aprender cucumber
  Deve executar especificação
  Como um aluno
  Eu quero aprendes a utilizar cucumber
  para que eu possa automatizar critérios de aceitação

  Cenário: Deve executar especificação
    Dado que criei o arquivo corretamente
    Quando executa-lo
    Então a especificação deve finalizar com sucesso
@esse
 Cenário: deve incrementar contador
 		Dado que o valor do contador é 15
 		Quando eu incrementar em 3
 		Então o valora será 18
 		
 	Cenário: deve incrementar contador
 		Dado que o valor do contador é 15
 		Quando eu incrementar em 3
 		Então o valora será 18
 		
 	Cenário: Deve Calcular Atraso na Entrega
 		Dado que a entrega é dia 05/04/2018
 		Quando a entrega atrasar 2 dias
 		Então a entrega será efetuada em "<data>"

	Exemplos:		
 			|data			 |
 			|07/04/2018|
 		
 	Cenário: Deve Calcular Atraso na Entrega da china
 		Dado que a entrega é dia 05/04/2018
 		Quando a entrega atrasar 2 "<tempo>"
 		Então a entrega será efetuada em "<data1>" 
 	
	Exemplos: 		
 		|data1		 |tempo|
 		|07/04/2018|dias |
 		
 		
 	Cenário: Deve criar steps genéricos para estes passos
    Dado que o ticket é "<ticket>"
    E que o valor da passagem é R$ "<passagem>"
    E que o nome do passageiro é "<passageiro>"
    E que o telefone do passageiro é "<telefone>"
    E criar os steps
    Então o teste vai funcionar
    
	Exemplos: 		
 		|ticket|passagem|passageiro     |telefone |
 		|AF345 |230,45  |Fulano da Silva|9999-9999|

	Cenário: Deve reaproveitar os steps "Dado" do cenário anterior
    Dado que o ticket é "<ticket1>"
    Dado que o ticket especial é "<ticketEspecial>"
    Dado que o valor da passagem é R$ "<passagem1>"
    Dado que o nome do passageiro é "<passageiro1>"
    Dado que o telefone do passageiro é "<telefone1>"
	Exemplos: 		
 		|ticket1|ticketEspecial|passagem1|passageiro1        |telefone1|
 		|AF345  |AB167         |1120,23  |Cicrano de Oliveira|9888-888 |

	Cenário: Deve negar todos os steps "Dado" dos cenários anteriores
    Dado que o ticket é "<ticket2>"
    Dado que o ticket é "<ticket3>"
    Dado que o valor da passagem é R$ "<passagem2>"
    Dado que o nome do passageiro é "<passageiro2>"
    Dado que o telefone do passageiro é o "<telefone2>"
    Dado que o telefone do passageiro é o tel "<telefone2>"
	Exemplos: 		
 		|ticket2|ticket3|passagem2|passageiro2            									|telefone2|
 		|CD123  |AG1234 |1.1345,56|Beltrano Souza Matos de Alcântara Azevedo|1234-5678|