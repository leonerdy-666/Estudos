#language:pt
Funcionalidade: exclusão Termo Aditivo Geral
@ExclusãoTermoAditivo
Esquema do Cenário: 
	Dado que acesso ao menu fase quatro e ao submenu termo aditivo para exclusão particular
	Quando preecho o filtro código do ajuste "<codigoAjuste>", código do termo aditivo "<codigoTermoAditivo>", numero termo aditivo "<numeroTermoAditivo>" e ano termo aditivo "<anoTermoAditivo>"
	E clico no botão buscar, excluir e confirmar
	Então recebo uma mensagem de sucesso na tela de termo aditivo "<mensagem>"
Exemplos:
	|codigoAjuste|codigoTermoAditivo|numeroTermoAditivo|anoTermoAditivo|mensagem                                 |
	|221         |2020123456789     |01                |2020           |O termo aditivo foi excluído com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoGeral
@ExclusãoFase4
Esquema do Cenário: 
	Dado que acesso ao submenu termo aditivo para exclusão geral
	Quando preecho o filtro código do ajuste "<codigoAjuste>", código do termo aditivo "<codigoTermoAditivo>", numero termo aditivo "<numeroTermoAditivo>" e ano termo aditivo "<anoTermoAditivo>"
	E clico no botão buscar, excluir e confirmar
	Então recebo uma mensagem de sucesso na tela de termo aditivo "<mensagem>"
Exemplos:
	|codigoAjuste|codigoTermoAditivo|numeroTermoAditivo|anoTermoAditivo|mensagem                                 |
	|221         |2020123456789     |01                |	2020         |O termo aditivo foi excluído com sucesso.|