package br.conam.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import br.conam.core.DriverFactory;
import br.conam.core.Inicializacao;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/",
		glue = "br.conam.steps",
		monochrome = true,
		tags = "@ExclusãoAlteracaoAposentadopensionista",
	    plugin = {"pretty", "html:target/cucumber-reports/cucumber-html-reports","json:target/reports/CucumberReport.json"}, //"de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"},
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false
		)
	
	public class RunnerTest{
	@BeforeClass
	public static void inicializa() throws Exception {
		new Inicializacao();
	}
	@AfterClass
	public static void finaliza() {
		DriverFactory.killDriver();
	}
	
	/**
	 * MANUAL DE INSTRUÇÃO DAS FEATURES 
	 * 
	 ******************************** INCLUSÕES PARTICULARES: ********************************              |		******************************** INCLUSÕES GERAIS ********************************
	 *																										|
	 * Para rodar features de inclusão particular insira após o @ a tag desejada que foi listada a seguir;	|Para rodar features de inclusão geral insira após o @ a tag desejada que foi listada a seguir;
	 * 																										|
	 * Fase 3 - Atos de Pessoal:																			|Todas as features:
	 * InclusãoAtoNormativo                                 												| InclusãoGeral
	 * InclusãoAgentePublico																				|						
	 * InclusãoCargo																						|Fase 3 - Atos de Pessoal:
	 * InclusãoFunção																						| InclusãoGeralFase3
	 * InclusãoQuadroPessoal																				|
	 * InclusãoLotação																						|Fase 3 Remunerações:
	 * 																										| InclusãoGeralFase3Remuneração
	 * Fase 3 Remunerações:																					|
	 * InclusãoAposentadoPensionista																		|Fase 3 Remunerações: 
	 * InclusãoVerbaRemuneratoria																			| InclusãoGeralFase3Remuneração
	 * InclusãoResumoFolha																					|
	 * InclusãoFolhaOrdinaria																				|Fase 4:
	 * InclusãoPagamentoFolha																				| inclusãoGeralfase4	
	 * InclusãoFolhaSuplementar																				|
	 * 																										|
	 * Fase 4:																								|
	 * InclusãoLicitação																					|
	 * Inclusãoajuste																						|
	 * InclusãotermoAditivo																					|
	 * InclusãoExecução																						|
	 * 																										|
	 																										|
		 ********************************* ALTERAÇÕES PARTICULARES ********************************			|       ********************************* ALTERAÇÕES GERAIS *********************************
	 *																										|
	 * Fase 3 - Atos de Pessoal:																			|Todas as features:
	 * AlteraçãoAtoNormativo																				| AlteraçãoGeral
	 * Alteraçãoagentepublico																				|	
	 * Alteraçãocargo																						|Fase 3 - Atos de Pessoal:
	 * AlteraçãoFunção																						| AlteraçãoFase3
	 * AlteraçãoQuadroPessoal																				|
	 * AlteraçãoLotação																						|Fase 3 Remunerações:
	 *																										| AlteraçãoFase3Remunerações
	 * Fase 3 Remunerações:																					|
	 * AlteraçãoAposentadoPensionista																		|Fase 4 
	 * AlteraçãoVerbaRemuneratoria																			| AlteraçãoGeralFase4
	 * AlteraçãoResumoFolha																					|
	 * AlteraçãoFolhaOrdinaria																				|
	 * AlteraçãoPagamentoFolha																				|	
	 * AlteraçãoFolhaSuplementar																			|
	 *																										|
	 * Fase 4:																								|
	 * AlteraçãoLicitação																					|
	 * AlteraçãoAjuste																						|		
	 * AlteraçãoTermoAditivo																				|
	 * AlteraçãoExecução																					|		
	 *
	  ********************************* EXCLUSÕES PARTICULARES ********************************				|     ***************************************** EXCLUSÕES GERAIS *********************************
	 *                                                                                                      | 
	 * Para rodar features de Exclusão Particular insira após o @ a tag desejada que foi listada a seguir;	|para rodar features de Exclusões gerais insira após o @ a tag desejada que foi listada a seguir;
	 * 																										|
	 * Fase 3 - Atos de Pessoal:																			|Todas as Features:	
	 * ExclusãoAtoNormativo																					| ExclusãoGeral
	 * ExclusãoAgentePúblico																				|
	 * ExclusãoCargo																						|Fase 3 - Atos de Pessoal:
	 * ExclusãoFunção																						| ExclusãoFase3
	 * ExclusãoQuadroPessoal																				|
	 * ExclusãoLotação 																						|Fase 3 Remunerações:
	 * 																										| exclusãofase3Remunerações
	 * Fase 3 Remunerações:																					|
	 * ExclusãoAposentadoPensionista																		|Fase 4:		
	 * exclusãoVerbaRemuneratoria																			| exclusãofase3Remunerações	
	 * exclusãoResumoFolha																					|
	 * ExclusãoFolhaOrdinaria																				|
	 * ExclusãoPagamentoFolha																				|			
	 * ExclusãoFolhaSuplementar																				|
	 * 																										|
	 * Fase 4:																								|
	 * ExclusãoLicitação																					|	
	 * ExclusãoTermoAditivo																					|
	 * ExclusãoExecução																						|
	 * ExclusãoAjuste																						|
	 * 																										|
	 *
	 *	
	  ********************************* EXCLUSÕES PARTICULARES ********************************				|     ***************************************** EXCLUSÕES GERAIS *********************************
	 *                                                                                                      | 
	 * Para rodar features de Exclusão Particular insira após o @ a tag desejada que foi listada a seguir;	|para rodar features de Exclusões gerais insira após o @ a tag desejada que foi listada a seguir;																									
	 *																										|
	 * Fase 3 - Atos de Pessoal:																			|
	 * ExclusãoAlteraçãolotação																				|Todas as Features:
	 * ExclusãoAlteraçãoQuadroPessoal																		| ExclusãoAlteraçãoGeral
	 * exclusãoAlteraçãoFunção																				|
	 * exclusãoAlteraçãoCargo																				|Fase 3 - Atos de Pessoal:
	 * ExclusãoAlteraçãoAgentePublico																		| exclusãoAlteraçãoFase3
	 * ExclusãoAlteraçãoAtoNormativo																		|
	 * 																										|Fase 3 Remunerações:	
	 * Fase 3 Remunerações:																					| exclusãoAlteraçãoFase3Remunerações
	 * ExclusãoAlteraçãoFolhaSuplementar																	|	
	 * exclusãoAlteraçãoPagamentoFolha																		|Fase 4:
	 * ExclusãoAlteraçãoFolhaOrdinaria																		| ExclusãoAlteraçãoFase4
	 * ExclusãoAlteraçãoResumoFolha																			|
	 * exclusãoAlteraçãoVerbaRemuneratória																	|
	 * ExclusãoAlteracaoAposentadopensionista																|
	 * 																										|
	 * 																										|
	 * Fase 4:																								|
	 * ExclusãoAlteraçãoLicitação																			|
	 * ExclusãoAlteraçãoTermoAditivo
	 * ExclusãoAlteraçãoExecução
	 * ExclusãoAlteraçãoAjuste
	 * 
	 * 
	 * @author Leonardo Mendes Florentino
	 */
}