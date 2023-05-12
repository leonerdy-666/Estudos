#language:pt
Funcionalidade: exclusão Termo Aditivo Geral
 @ExclusãoAlteraçãoTermoAditivo
Esquema do Cenário: 
	Dado que acesso ao menu fase quatro e ao submenu termo aditivo para exclusão particular para alteração
  Quando preecho o filtro código do ajuste "<codigoAjuste>", código do termo aditivo "<codigoTermoAditivo>", numero termo aditivo "<numeroTermoAditivo>" e ano termo aditivo "<anoTermoAditivo>" para alteração
  E clico no botão buscar, excluir e confirmar para alteração
  Então recebo uma mensagem de sucesso na tela de termo aditivo "<mensagem>" para alteração
Exemplos:
	|codigoAjuste|codigoTermoAditivo|numeroTermoAditivo|anoTermoAditivo|mensagem                                 |
	|221         |2020123456789     |01                |	2020         |O termo aditivo foi excluído com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoAlteraçãoGeral
@ExclusãoAlteraçãoFase4
Esquema do Cenário: 
  Dado que acesso ao submenu termo aditivo para exclusão geral para alteração
  Quando preecho o filtro código do ajuste "<codigoAjuste>", código do termo aditivo "<codigoTermoAditivo>", numero termo aditivo "<numeroTermoAditivo>" e ano termo aditivo "<anoTermoAditivo>" para alteração
  E clico no botão buscar, excluir e confirmar para alteração
  Então recebo uma mensagem de sucesso na tela de termo aditivo "<mensagem>" para alteração
Exemplos:
  |codigoAjuste|codigoTermoAditivo|numeroTermoAditivo|anoTermoAditivo|mensagem                                 |
  |221         |2020123456789     |01                |  2020         |O termo aditivo foi excluído com sucesso.|