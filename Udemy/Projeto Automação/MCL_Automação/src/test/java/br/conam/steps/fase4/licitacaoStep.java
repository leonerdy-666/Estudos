package br.conam.steps.fase4;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import br.conam.core.Base;
import cucumber.api.Scenario;
import cucumber.api.java.AfterStep;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;

public class licitacaoStep extends Base {
			
	/*********************************** LOCATORS INCLUSÃO ***********************************/
	
	/****************************** ABA DADOS INICIAIS **************************/
	
	private static By acessoaopainel = By.linkText("Fase 4");
	private static By acessoaosubmenu = By.linkText("Licitação");
	private static By botaonovalicitacao = By.linkText("Nova Licitação");
	
	/*Tipo de Prestação*/
	private static By selecaoeAdesaoAtaRegistro = By.xpath("//label[2]/div/div[3]");
	private static By itemeAdesaoAtaRegistro = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:adesaoAtaRegistroPrecoOutroOrgao_1");
	private static By selecaoessaLicitacaoOrgaos = By.xpath("//section[2]/label[2]/div/div[3]/span");
	private static By itemessaLicitacaoOrgaos = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:orgaosParticipantes_1");
	
	/*Modalidade da Licitação*/
	private static By selecaomodalidadeLicitacao = By.xpath("//fieldset[2]/div/section/label[2]/div/div[3]");
	private static By itemmodalidadeLicitacao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:tipoDeLicitacao_1");
	
	/*Dados*/
	private static By campocodigoLicitacao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:codigoLicitacao");
	private static By camponProcessoADM = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:numeroProcAdministrativo");
	private static By campoanoProcessoADM = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:anoProcAdministrativo");
	private static By camponLicitacao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:numeroLicitacao");
	private static By campoanoLicitacao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:anoLicitacao");
	
	/*Lei de Regência*/
	private static By selecaoleiRegencia = By.xpath("//fieldset[4]/div/section/label[2]/div/div[3]/span");
	private static By itemleiRegencia = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:leiRegencia_1");
	
	/*Natureza da licitação*/
	private static By selecaotipoNatureza = By.xpath("//fieldset[5]/div/section/label[2]/div/div[3]/span");
	private static By itemtipoNatureza = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:tipoNatureza_3");
	
	/*Divisão do Objeto*/
	private static By selecaolicitaE = By.xpath("//fieldset[6]/div/div/section/label[2]/div/div[3]/span");
	private static By itemlicitaE = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:unica_1");
	private static By selecaotipoObjeto = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:tipo_label");
	private static By itemtipoObjeto = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:tipo_1");
	private static By campovalorEstimadoLicitacao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:valorEstimado_input");
	private static By selecaoobjetoLicitacao = By.xpath("//div[2]/section[2]/label[2]/div/div[3]/span");
	private static By itemobjetoLicitacao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:tipoObjeto_1");
	private static By campodescrevaObjeto = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:descricaoObjeto");
	private static By campojustificativaContrato = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:justificativaObjeto");
	private static By botaoproximoAbaDadosIniciais = By.linkText("Próximo");
	
	
	/****************************** ABA DADOS ADICIONAIS **************************/
	
	private static By abaDadosAdicionais = By.linkText("Dados Adicionais");
	
	/*Tipo Licitação*/
	private static By selecaotipoLicitacao = By.xpath("//div[2]/span/fieldset/div/section/label[2]/div/div[3]/span");
	private static By itemtipoLicitacao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosAdicionaisDados:modoLicitacao_1");
	
	/*Permite Subcontratação*/
	private static By selecaohaPrevisaoPermissao = By.xpath("//div[2]/span/fieldset[2]/div/section/label[2]/div/div[3]/span");
	private static By itemhaPrevisaoPermissao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosAdicionaisDados:subcontratacao_2");
	
	/*Benefício da Lei Complementar 123/2006 - Micro e EPP*/
	private static By selecaoseraAplicadoBeneficio = By.xpath("//div[2]/span/fieldset[3]/div/section/label[2]/div/div[3]/span");
	private static By itemseraAplicadoBeneficio = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosAdicionaisDados:beneficioLei1232006_1");
	private static By botaoproximoAbaDadosAdicionais = By.xpath("//div[2]/footer/a[2]/i");
	
	
	/****************************** ABA PRÉ-QUALIFICAÇÃO **************************/
	
	/*pré Qualificação*/
	private static By abaPreQualificacao = By.linkText("Pré-qualificação");
	private static By selecaohouveFase = By.xpath("//div[3]/span/fieldset/div/div/section/label[2]/div/div[3]");
	private static By itemhouveFase = By.id("licitacaoDados:licitacaoForm:tabLicitacao:preQualificacaoDados:preQualificacao_1");
	private static By botaoproximoAbapreQualificacao = By.xpath("//div[3]/footer/a[2]");
	
	
	/****************************** ABA LOTE/ITEM **************************/
	
	private static By abaLoteItem = By.linkText("Lote/Item");
	
	/*Lote/Itens*/
	private static By botaoacao = By.xpath("//td[7]/a/i");
	
	/*Lote-popUp*/
	private static By campodescrevaObjetoLote = By.id("editLicitacaoLote:formPopupEditLicitacaoLote:descricaoLote");
	private static By campoquantidade = By.id("editLicitacaoLote:formPopupEditLicitacaoLote:quantidade_input");
	private static By campounidadeMedida = By.id("editLicitacaoLote:formPopupEditLicitacaoLote:unidadeMedida");
	private static By selecaolotePossui = By.xpath("//div[3]/div/div/div[3]/span");
	private static By itemlotePossui = By.id("editLicitacaoLote:formPopupEditLicitacaoLote:possuiOrcamento_1");
	private static By selecaoloteComposto = By.xpath("//div[4]/div/div/div[3]/span");
	private static By itemloteComposto = By.id("editLicitacaoLote:formPopupEditLicitacaoLote:possuiItens_1");
	private static By selecaoclassificacaoEconomica = By.xpath("//span/div/div[3]/span");
	private static By itemclassificacaoEconomica = By.id("editLicitacaoLote:formPopupEditLicitacaoLote:tipoClassificacaoEconomica1_1");
	private static By selecaocodigoClassificacao = By.xpath("//button/span");
	private static By itemcodigoClassificacao = By.cssSelector("li.ui-autocomplete-item.ui-autocomplete-list-item.ui-corner-all.ui-state-highlight");
	private static By selecaotipoExecucao = By.xpath("//div[3]/div/div/div/div[3]/span");
	private static By itemtipoExecucao = By.id("editLicitacaoLote:formPopupEditLicitacaoLote:tipoExecucao_1");
	private static By botaosalvarpopup = By.id("editLicitacaoLote:formPopupEditLicitacaoLote:j_idt2401");
	
	/*Lote/Item*/
	private static By botaoproximoAbaLoteItem = By.xpath("//div[4]/footer/a[2]/i");
	
	
	/****************************** ABA DECLARAÇÃO EXISTÊNCIA DE RECURSOS **************************/
	
	/*Declaração de Existência de Recursos*/
	private static By abaDeclaracaoExistenciaRecursos = By.linkText("Declaração de Existência de Recursos");
	private static By selecaoconstaProcedimento = By.xpath("//div[5]/span/fieldset/div/div/section/label[2]/div/div[3]/span");
	private static By itemconstaProcedimento = By.id("licitacaoDados:licitacaoForm:tabLicitacao:declaracaoExistenciaRecursoDados:recursoOrcamentarioParaContratacao_1");
	private static By botaoproximoAbaDeclaracaoExistenciaRecurso = By.xpath("//div[5]/footer/a[2]");
	
	
	/****************************** ABA LRF **************************/
	
	/*Atendimento à LRF*/
	private static By abaLRF = By.linkText("LRF");
	private static By selecaoespecieDespesa = By.xpath("//div[6]/fieldset/div/section/label[2]/div/div[3]/span");
	private static By itemespecieDespesa = By.id("licitacaoDados:licitacaoForm:tabLicitacao:lrfDados:especieDespesa_1");
	private static By botaoproximoAbaLRF = By.xpath("//div[6]/footer/a[2]");
	
	
	/****************************** ABA PARECER TÉCNICO-JURÍDICO/AUDIÊNCIA **************************/
	
	private static By abaPareceTecnicoJuridico = By.linkText("Parecer Técnico-jurídico/Audiência");
	
	/*Parecer Técnico-Jurídico*/
	private static By selecaoconstaProcedimentoTecnico = By.xpath("//div[7]/fieldset/div/section/label[2]/div/div[3]/span");
	private static By itemconstaProcedimentoTecnico = By.id("licitacaoDados:licitacaoForm:tabLicitacao:parecerTecnicoDados:parecerTecnicoJuridico_1");
	
	/*Audiência Pública*/
	private static By selecaohouveAudiencia = By.xpath("//fieldset[2]/div/div/section/label[2]/div/div[3]/span");
	private static By itemhouveAudiencia = By.id("licitacaoDados:licitacaoForm:tabLicitacao:parecerTecnicoDados:audienciaPulica_1");
	private static By botaoproximoAbaParecerTecnico = By.xpath("//div[7]/footer/a[2]");
	
	
	/****************************** EDITAL 2ª FASE **************************/
	
	private static By abaeditalSegundaFase = By.linkText("Edital");
	
	/*Edital 2ª Fase*/
	private static By camponumeroEdital = By.id("licitacaoDados:licitacaoForm:tabLicitacao:editalDados:editalNumero");
	private static By selecaodataEdital = By.id("licitacaoDados:licitacaoForm:tabLicitacao:editalDados:editalData_input");
	private static By itemdataGeral = By.linkText("14");
	
	/*Publicação do Edital em Veículos de Comunicação*/
	private static By selecaohouvePublicacaoEdital = By.xpath("//span/fieldset[2]/div/div/section/label[2]/div/div[3]");
	private static By itemhouvePublicacaoEdital = By.id("licitacaoDados:licitacaoForm:tabLicitacao:editalDados:houvePublicacaoEdital_1");
	
	/*Garantia para participação da Licitação*/
	private static By selecaohaExigenciaGarantia = By.xpath("//fieldset[3]/div/div/section/label[2]/div/div[3]/span");
	private static By itemhaExigenciaGarantia = By.id("licitacaoDados:licitacaoForm:tabLicitacao:editalDados:exigenciaGarantia_1");
	private static By botaoproximoAbaEditalSegunda = By.xpath("//div[8]/footer/a[2]");
	
	
	/****************************** DATAS **************************/
	
	private static By abaDatas = By.linkText("Datas");
	
	/*Datas*/
	private static By selecaohouveEntrega = By.xpath("//div[9]/fieldset/div/div/section/label[2]/div/div[3]/span");
	private static By itemhouveEntrega = By.id("licitacaoDados:licitacaoForm:tabLicitacao:datasDados:houveEntregaProposta_1");
	private static By selecaohouveAbertura = By.xpath("//div[9]/fieldset/div/div[2]/section/label[2]/div/div[3]");
	private static By itemhouveAbertura = By.id("licitacaoDados:licitacaoForm:tabLicitacao:datasDados:houveAberturaLicitacao_1");
	private static By selecaohouveJulgamento = By.xpath("//div[3]/section/label[2]/div/div[3]");
	private static By itemhouveJulgamento = By.id("licitacaoDados:licitacaoForm:tabLicitacao:datasDados:houveJulgamento_1");
	private static By botaoproximoAbaDatas = By.xpath("//div[9]/footer/a[2]");
	
	
	/****************************** COMISSÃO DA LICITAÇÃO **************************/
	
	private static By abacomissaoLicitacao = By.linkText("Comissão de Licitação");
	private static By selecaoExisteComissao = By.xpath("//div[10]/fieldset/div/section/label[2]/div/div[3]/span");
	private static By itemExisteComissao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:comissaoLicitacaoDados:existeComissaoLicitacao_1");
	private static By botaoproximoAbaComissaoLicitacao = By.xpath("//div[10]/footer/a[2]");
	
	
	/****************************** Licitantes **************************/
	
	private static By abaLicitantes = By.linkText("Licitantes");
	
	/*Licitantes*/
	private static By selecaoexistemLicitantes = By.xpath("//div[11]/fieldset/div/section/label[2]/div/div[3]/span");
	private static By itemexistemLicitantes = By.id("licitacaoDados:licitacaoForm:tabLicitacao:licitantesDados:existeLicitantes_1");
	private static By botaoproximoAbaLicitantes = By.xpath("//div[11]/footer/a[2]");
	
	
	/****************************** Atestados Desempenho **************************/
	
	private static By abaAtestadoDesempenho = By.linkText("Atestados de Desempenho");
	
	/*Atestado Desempenho*/
	private static By selecaohaExigenciasAtestado = By.xpath("//div[12]/fieldset/div/section/label[2]/div/div[3]/span");
	private static By itemhaExigenciasAtestado = By.id("licitacaoDados:licitacaoForm:tabLicitacao:atestadoDesempenhoDados:exigenciaAtestadoDesempenho_1");
	private static By botaoproximoAbaAtestadoDesempenho = By.xpath("//div[12]/footer/a[2]");
	
	
	/****************************** Índices Econômicos **************************/
	
	private static By abaIndicesEconomicos = By.linkText("Índices Econômicos");
	
	/*Índices Econômicos*/
	private static By selecaohaExigenciaIndices = By.xpath("//div[13]/fieldset/div/section/label[2]/div/div[3]/span");
	private static By itemhaExigenciaIndices = By.id("licitacaoDados:licitacaoForm:tabLicitacao:indiceEconomicoDados:exigenciaIndiceEconomico_1");
	private static By botaoproximoabaIndicesEconomicos = By.xpath("//div[13]/footer/a[2]");
	
	/****************************** Amostras **************************/
	
	private static By abaAmostras = By.linkText("Amostras");
	
	/*Amostras*/
	private static By selecaohaExigenciaAmostras = By.xpath("//div[14]/fieldset/div/div/section/label[2]/div/div[3]/span");
	private static By itemhaExigenciaAmostras = By.id("licitacaoDados:licitacaoForm:tabLicitacao:amostraDados:exigenciaAmostra_1");
	private static By botaoProximoAbaAmostras = By.xpath("//div[14]/footer/a[2]");
	
	/****************************** Tributos **************************/
	
	private static By abaTributos = By.linkText("Tributos");
	
	/*Quitação Produtos*/
	private static By selecaohaExigenciaPreviaQuitacao = By.xpath("//div[15]/fieldset/div/section/label[2]/div/div[3]/span");
	private static By itemhaExigenciaPreviaQuitacao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:tributoDados:exigenciaPreviaQuitacaoTributo_1");
	private static By botaoproximoAbaTributos = By.xpath("//div[15]/footer/a[2]");
	
	/****************************** Ata de Recebimento e Julgamento **************************/
	
	private static By abaJulgamentoRecursos = By.linkText("Julgamento/Recursos");
	
	/*Ata de abertura e julgamento da habilitação*/
	private static By selecaohaProcedimentoAberturaHabilitacao = By.xpath("//div[16]/fieldset/div/div/section/label[2]/div/div[3]");
	private static By itemhaProcedimentoAberturaHabilitacao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:julgamentoRecursoDados:ataAberturaHabilitacao_1");
	private static By selecaohaProcedimentoJulgamentoHabilitacao = By.xpath("//div[16]/fieldset/div/div[2]/section/label[2]/div/div[3]/span");
	private static By itemhaProcedimentoJulgamentoHabilitacao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:julgamentoRecursoDados:ataJulgamentoHabilitacao_1");
	
	/*Ata de abertura e julgamento das propostas*/
	private static By selecaohaProcedimentoAberturaPropostas = By.xpath("//div[16]/fieldset[2]/div/div/section/label[2]/div/div[3]/span");
	private static By itemhaProcedimentoAberturaPropostas = By.id("licitacaoDados:licitacaoForm:tabLicitacao:julgamentoRecursoDados:ataAberturaJulgamentoProposta_1");
	private static By selecaohaProcedimentoJulgamentoPropostas = By.xpath("//fieldset[2]/div/div[2]/section/label[2]/div/div[3]/span");
	private static By itemhaProcedimentoJulgamentoPropostas = By.id("licitacaoDados:licitacaoForm:tabLicitacao:julgamentoRecursoDados:ataJulgamentoProposta_1");
	
	/*Existe quadro comparativo de preços das propostas*/
	private static By selecaoexisteQuadroComparativoPrecosPropostas = By.xpath("//div[16]/fieldset[3]/div/section/label[2]/div/div[3]/span");
	private static By itemexisteQuadroComparativoPrecosPropostas = By.id("licitacaoDados:licitacaoForm:tabLicitacao:julgamentoRecursoDados:quadroComparativo_1");
	
	/*Recursos*/
	private static By selecaohouveInterposiçãoRecurso = By.xpath("//div[16]/fieldset[4]/div/section/label[2]/div/div[3]");
	private static By itemhouveInterposiçãorecurso = By.id("licitacaoDados:licitacaoForm:tabLicitacao:julgamentoRecursoDados:houveInterposicaoRecurso_1");
	 
	/*Sessão pública*/
	private static By selecaohouveSessaoPublica = By .xpath("//div[16]/fieldset[5]/div/section/label[2]/div/div[3]/span");
	private static By itemhouveSessaoPublica = By.id("licitacaoDados:licitacaoForm:tabLicitacao:julgamentoRecursoDados:houveSessaoPublica_1");
	private static By botaoproximoAbaJulgamentoRecursos = By.xpath("//div[16]/footer/a[2]");
	
	/****************************** Homologação **************************/
	
	private static By abaHomologacao = By.linkText("Homologação");
	
	/*Homologação*/
	private static By selecaohaProcedimentoComprovacaoPublicacaoHomologacao = By.xpath("//div[17]/fieldset/div/div/section/label[2]/div/div[3]/span");
	private static By itemhaProcedimentoComprovacaoPublicacaoHomogalacao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:homologacaoDados:comprovacaoPublicacaoHomologacao_1");
	private static By botaoproximoAbaHomologacao = By.xpath("//div[17]/footer/a[2]/i");
	
	
	/****************************** Adjudicação **************************/
	
	private static By abaAdjudicacao = By.linkText("Adjudicação");
	
	/*Adjudicação*/
	private static By selecaohaProcedimentoComprovacaoPublicacaoAdjudicacao = By.xpath("//div[18]/fieldset/div/div/section/label[2]/div/div[3]");
	private static By itemhaProcedimentoComprovacaoPublicacaoAdjudicacao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:adjudicacaoDados:comprovacaoPublicacaoAdjudicacao_1");
	private static By botaoproximoAbaAdjudicacao = By.xpath("//div[18]/footer/a[2]");
	
	
	/****************************** Autorização **************************/
	
	private static By abaAutorizacao = By.linkText("Autorização");
	
	/*Autorização Secretária da Fazenda e Planejamento*/
	private static By selecaohaAutosAutorizacaoSecretariaEstadual = By.xpath("//div[19]/fieldset/div/section/label[2]/div/div[3]/span");
	private static By itemhaAutosAutorizacaoSecretariaEstadual = By.id("licitacaoDados:licitacaoForm:tabLicitacao:autorizacaoDados:existeAutorizacaoSecretaraiEst_1");
	
	/*Declaração de Disponibilidade de Documentos*/
	private static By selecaoDeclaracaoTermosInstrucao = By.xpath("//div[19]/fieldset[2]/div/section/label[2]/div/div[3]");
	private static By itemDeclaracaoTermosInstrucao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:autorizacaoDados:existeAutorizacaoResolucao72014_1");
	
	/*Situação da Licitação*/
	private static By selecaoProcedimentoLicitatorio = By.xpath("//section/fieldset/div/div/section/label[2]/div/div[3]/span");
	private static By itemProcedimentoLicitatorio = By.id("licitacaoDados:licitacaoForm:tabLicitacao:autorizacaoDados:situacaoLicitacao_1");
	private static By selecaodataSituacaoProcedimentoLicitatorio = By.id("licitacaoDados:licitacaoForm:tabLicitacao:autorizacaoDados:dataSitProcLic_input");
	private static By botaoSalvar = By.xpath("//div[19]/footer/a[2]/i");
	private static By mensagemdeSucesso = By.xpath("//div[12]/div/div/div[2]");
	
	/**************** LOCATORS EXCLUSÃO ****************/
	
	private static By filtrocodigoLicitacao = By.id("filterForm:codigoLicitacao");
	private static By filtronumeroLicitacao = By.id("filterForm:numeroLicitacao");
	private static By filtroanoLicitacao = By.id("filterForm:anoLicitacao");
	private static By selecaomodalidade1 = By.xpath("//label[2]/div/div[3]/span");
	private static By itemmodalidade1 = By.id("filterForm:tipoDeLicitacao_1");
	private static By filtronumeroProcessoADM = By.id("filterForm:numeroProcAdministrativo");
	private static By filtroanoProcessoADM = By.id("filterForm:anoProcAdministrativo");
	private static By botaoBuscar = By.id("filterForm:j_idt72");
	private static By botaoExcluir = By.id("form:consultaTable:0:j_idt108");
	private static By botaoConfirmar = By.id("form:j_idt112");
	private static By mensagemSucessoExclusao = By.xpath("//div[10]/div/div/div[2]/span");
	
	/***************** LOCATORS ALTERAÇÃO *****************/
	
	/*Dados Iniciais*/
	private static By botaoAlteracao = By.xpath("//td[7]/a[2]");
	private static By itemEadesaoataRegistroAlteracao  = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:adesaoAtaRegistroPrecoOutroOrgao_2");
	private static By itemessalicitacaoOrgaosAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:orgaosParticipantes_2");
	private static By selecaotipoNaturezaAlteracao = By.xpath("//fieldset[3]/div/section/label[2]/div/div[3]/span");
	private static By itemtipoNaturezaAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:tipoNatureza_3");
	private static By camponumeroAtaRegistroPreçoAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:numeroAtaRegistroPreco");
	private static By selecaodataRegistroPreçoAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:dataAtaRegistroPreco_input");
	private static By camponomeOrgaoDetentorRegistro = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:nomeOrgaoDetentorRegistroPreco");
	private static By camponumeroLicitacaoAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:numeroLicitacao2");
	private static By selecaodataAutorizacaoAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:dataAutorizacao_input");
	private static By campovalidadeMesesAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:validadeAtaRegistroPrecos");
	private static By itemlicitaEAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:unica_1");
	private static By itemtipoObjetoAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:tipo_1");
	private static By itemobjetoLicitacaoAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosIniciaisDados:tipoObjeto_1");
	
	/*Dados Adicionais*/
	private static By itemtipoLicitacaoAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosAdicionaisDados:modoLicitacao_2");
	private static By itemhaPrevisãoPermissaoAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosAdicionaisDados:subcontratacao_2");
	private static By itemseraAplicadoBeneficioAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:dadosAdicionaisDados:beneficioLei1232006_1");
	
	/*Pré Qualificação*/
	private static By itemhouveFaseAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:preQualificacaoDados:preQualificacao_1");
	
	/*Lote Item*/
	private static By itemlotePossuiAlteracao = By.id("editLicitacaoLote:formPopupEditLicitacaoLote:possuiOrcamento_1");
	private static By itemloteCompostoAlteracao = By.id("editLicitacaoLote:formPopupEditLicitacaoLote:possuiItens_1");
	private static By itemclassificacaoEconomicaAlteracao = By.id("editLicitacaoLote:formPopupEditLicitacaoLote:tipoClassificacaoEconomica1_1");
	private static By itemtipoExecucaoAlteracao = By.id("editLicitacaoLote:formPopupEditLicitacaoLote:tipoExecucao_1");
	
	/*Declaração de Existencia de Recursos*/
	private static By itemconstaProcedimentoAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:declaracaoExistenciaRecursoDados:recursoOrcamentarioParaContratacao_1");
	
	/*LRF*/
	private static By itemespecieDespesaAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:lrfDados:especieDespesa_1");
	
	/*Parecer Técnico-Jurídico*/
	private static By itemconstaProcedimentoParecerAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:parecerTecnicoDados:parecerTecnicoJuridico_1");
	private static By itemhouveAudienciaAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:parecerTecnicoDados:audienciaPulica_1");
	
	/*Edital*/
	private static By itempublicacaoEditalAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:editalDados:houvePublicacaoEdital_1");
	private static By itemhaExigenciasGarantiaAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:editalDados:exigenciaGarantia_1");
	
	/*Datas*/
	private static By itemhouveEntregaAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:datasDados:houveEntregaProposta_1");
	private static By itemhouveAberturaAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:datasDados:houveAberturaLicitacao_1");
	private static By itemhouvejulgamentoAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:datasDados:houveJulgamento_1");
	
	/*Comissão de Licitação*/
	private static By itemexisteComissaoAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:comissaoLicitacaoDados:existeComissaoLicitacao_1");
	
	/*Licitantes*/
	private static By itemexistemLicitantesAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:licitantesDados:existeLicitantes_1");
	
	/*Atestados de Desempenho*/
	private static By itemhaExigenciasAtestadoAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:atestadoDesempenhoDados:exigenciaAtestadoDesempenho_1");
	
	/*Indices Economicos*/
	private static By itemhaExigenciasIndicesAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:indiceEconomicoDados:exigenciaIndiceEconomico_1");
	
	/*Amostras*/
	private static By itemhaExigenciasAmostrasAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:amostraDados:exigenciaAmostra_1");
	
	/*Tributos*/
	private static By itemhaExigenciaPreviaAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:tributoDados:exigenciaPreviaQuitacaoTributo_1");
	
	/*Julgamento/Recursos*/
	private static By itemhaProcedimentoAberturaAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:julgamentoRecursoDados:ataAberturaHabilitacao_1");
	private static By itemhaProcedimentoJulgamentoAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:julgamentoRecursoDados:ataJulgamentoHabilitacao_1");
	private static By itemhaProcedimentoAberturaPropostaAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:julgamentoRecursoDados:ataAberturaJulgamentoProposta_1");
	private static By itemhaProcedimentoAtaJulgamentoAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:julgamentoRecursoDados:ataJulgamentoProposta_1");
	private static By itemexisteQuadroComparativoPrecosAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:julgamentoRecursoDados:quadroComparativo_1");
	private static By itemhouveInterposicaoRecursoAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:julgamentoRecursoDados:houveInterposicaoRecurso_1");
	private static By itemhouveSessaoPublicaAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:julgamentoRecursoDados:houveSessaoPublica_1");
	
	/*Homologação*/
	private static By itemhaProcedimentoComprovacaoPublicacaoHomologacaoAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:homologacaoDados:comprovacaoPublicacaoHomologacao_1");
	
	/*Adjudicação*/
	private static By itemhaProcedimentoComprovacaoPublicacaoAdjudicacaoAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:adjudicacaoDados:comprovacaoPublicacaoAdjudicacao_1");
	
	/*Autorização*/
	private static By itemhaAutosAutorizacaoSecretariaEstadualAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:autorizacaoDados:existeAutorizacaoSecretaraiEst_1");
	private static By itemDeclaracaoTermosInstrucaoAlteracao = By.id("licitacaoDados:licitacaoForm:tabLicitacao:autorizacaoDados:existeAutorizacaoResolucao72014_1");
	private static By mensagemAlteracao = By.xpath("//div[12]/div/div/div[2]");
	
	
	/****************************** Metódos do Ambiente Licitação ***************************/
	
	/*Inclusão Geral*/
	@Dado("que acesso ao menu fasequatro e ao submenu licitação para o caminho feliz")
	public void que_acesso_ao_menu_fasequatro_e_ao_submenu_licitação_para_o_caminho_feliz() throws Exception {
		waitBase(2);
		this.clicar(acessoaopainel);
		waitBase(2);
		this.clicar(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fasequatro e ao submenu licitação")
	public void que_acesso_ao_menu_fasequatro_e_ao_submenu_licitação() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("clico no botao nova licitação")
	public void clico_no_botao_nova_licitação() throws Exception {
	    waitBase(2);
		this.clicar(botaonovalicitacao);
	}

	@Quando("seleciono os comboboxes é adesão a ata de registro de preços de outro órgão e essa licitação possui órgãos participantes e os ajustes poderão ser realizados por esses órgãos")
	public void seleciono_os_comboboxes_é_adesão_a_ata_de_registro_de_preços_de_outro_órgão_e_essa_licitação_possui_órgãos_participantes_e_os_ajustes_poderão_ser_realizados_por_esses_órgãos() throws Exception {
		this.selecionaComboBox(selecaoeAdesaoAtaRegistro, itemeAdesaoAtaRegistro);
		waitBase(2);
	    this.selecionaComboBox(selecaoessaLicitacaoOrgaos, itemessaLicitacaoOrgaos);
	}

	@Quando("seleciono o combobox modalidade de licitação")
	public void seleciono_o_combobox_modalidade_de_licitação() throws Exception {
	    this.selecionaComboBox(selecaomodalidadeLicitacao, itemmodalidadeLicitacao);
	}

	@Quando("preencho o campo codigo licitação {string} n processo administrativo {string}, ano do processo administrativo {string}, n da licitação {string}, ano da licitação {string}")
	public void preencho_o_campo_codigo_licitação_n_processo_administrativo_ano_do_processo_administrativo_n_da_licitação_ano_da_licitação(String codigoLicitacao, String nProcessoADM, String anoProcessoADM, String nLicitacao, String anoLicitacao) throws Exception {
	    this.escrever(campocodigoLicitacao, codigoLicitacao);
	    waitBase(2);
		this.escrever(camponProcessoADM, nProcessoADM);
		waitBase(2);
		this.escrever(camponProcessoADM, nProcessoADM);
		waitBase(2);
	    this.escrever(campoanoProcessoADM, anoProcessoADM);
	    waitBase(2);
	    this.escrever(campoanoProcessoADM, anoProcessoADM);
	    waitBase(2);
	    this.escrever(camponLicitacao, nLicitacao);
	    waitBase(2);
	    this.escrever(camponLicitacao, nLicitacao);
	    this.escrever(campoanoLicitacao, anoLicitacao);
	    waitBase(2);
	    this.escrever(campoanoLicitacao, anoLicitacao);
	}

	@Quando("seleciono o combobox lei de regência e o combobox tipo de natureza")
	public void seleciono_o_combobox_lei_de_regência_e_o_combobox_tipo_de_natureza() throws Exception {
		this.clicar(selecaoleiRegencia);
		waitBase(2);
	    this.selecionaComboBox(selecaoleiRegencia, itemleiRegencia);
	    waitBase(3);
	    this.selecionaComboBox(selecaotipoNatureza, itemtipoNatureza);
	}

	@Quando("seleciono o combobox a licitação é, tipo de objeto preencho o campo valor total estimado da licitação {string}, seleciono o combobox objeto da licitação e preencho os campos descreva o objeto da licitação {string}e justificativa para contratação {string}")
	public void seleciono_o_combobox_a_licitação_é_tipo_de_objeto_preencho_o_campo_valor_total_estimado_da_licitação_seleciono_o_combobox_objeto_da_licitação_e_preencho_os_campos_descreva_o_objeto_da_licitação_e_justificativa_para_contratação(String valorTotalEstimado, String descrevaObjetoLicitacao, String justificativaContratacao) throws Exception {
		waitBase(2);
		this.selecionaComboBox(selecaolicitaE, itemlicitaE);
		waitBase(2);
	    this.selecionaComboBox(selecaotipoObjeto, itemtipoObjeto);
	    waitBase(2);
	    this.escrever(campovalorEstimadoLicitacao, valorTotalEstimado);
	    waitBase(2);
	    this.clicar(selecaoobjetoLicitacao);
	    waitBase(2);
	    this.selecionaComboBox(selecaoobjetoLicitacao, itemobjetoLicitacao); 
	    waitBase(2);
	    this.escrever(campodescrevaObjeto, descrevaObjetoLicitacao);
	    waitBase(2);
	    this.escrever(campojustificativaContrato, justificativaContratacao);
	    waitBase(1);
	    this.escrever(campojustificativaContrato, justificativaContratacao);
	}

	@Quando("clico no botão próximo e clico na aba dados adicionais")
	public void clico_no_botão_próximo_e_clico_na_aba_dados_adicionais() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaDadosIniciais, abaDadosAdicionais);
	}

	@Quando("seleciono os comboboxes tipo de licitação, há previsão de permissão de subcontratação e será aplicado benefício da lc")
	public void seleciono_os_comboboxes_tipo_de_licitação_há_previsão_de_permissão_de_subcontratação_e_será_aplicado_benefício_da_lc() throws Exception {
	    this.selecionaComboBox(selecaotipoLicitacao, itemtipoLicitacao);
	    waitBase(1);
	    this.selecionaComboBox(selecaohaPrevisaoPermissao, itemhaPrevisaoPermissao);
	    waitBase(1);
	    this.selecionaComboBox(selecaoseraAplicadoBeneficio, itemseraAplicadoBeneficio);
	}

	@Quando("clico no botão próximo e clico na aba pré qualificação")
	public void clico_no_botão_próximo_e_clico_na_aba_pré_qualificação() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaDadosAdicionais, abaPreQualificacao);
	}

	@Quando("seleciono o combobox houve fase de pré qualificação")
	public void seleciono_o_combobox_houve_fase_de_pré_qualificação() throws Exception {
	    waitBase(2);
		this.selecionaComboBox(selecaohouveFase, itemhouveFase);
	}

	@Quando("clico no botão proximo e clico na aba lote item")
	public void clico_no_botão_proximo_e_clico_na_aba_lote_item() throws Exception {
	    this.clicar(botaoproximoAbapreQualificacao);
	    this.clicar(abaLoteItem);
	}

	@Quando("clico no botão ação")
	public void clico_no_botão_ação() throws Exception {
	    this.clicar(botaoacao);
	}

	@Quando("preencho os campos descreva o objeto do lote {string}, quantidade {string} e unidade {string}")
	public void preencho_os_campos_descreva_o_objeto_do_lote_quantidade_e_unidade(String descrevaLote, String quantidade, String unidade) throws Exception {
		waitBase(2); 
		this.escrever(campodescrevaObjetoLote, descrevaLote);
		waitBase(2);
	    this.escrever(campoquantidade, quantidade);
	    waitBase(2);
	    this.escrever(campoquantidade, quantidade);
	    waitBase(2);
	    this.escrever(campounidadeMedida, unidade);
	    waitBase(2);
	    this.escrever(campounidadeMedida, unidade);
	}

	@Quando("seleciono os combobox o lote possui orçamento, o lote é composto por itens, tipo classificação econômico, código classificação e tipo de execução")
	public void seleciono_os_combobox_o_lote_possui_orçamento_o_lote_é_composto_por_itens_tipo_classificação_econômico_código_classificação_e_tipo_de_execução() throws Exception {
		waitBase(2);
		this.clicar(selecaolotePossui);
		waitBase(2);
		this.selecionaComboBox(selecaolotePossui, itemlotePossui);
		waitBase(2);
		this.selecionaComboBox(selecaoloteComposto, itemloteComposto);
		waitBase(2);
	    this.selecionaComboBox(selecaoloteComposto, itemloteComposto);
	    this.selecionaComboBox(selecaoclassificacaoEconomica, itemclassificacaoEconomica);
	    waitBase(2);
	    this.selecionaComboId(selecaocodigoClassificacao, itemcodigoClassificacao);
	    waitBase(2);
	    this.selecionaComboBox(selecaotipoExecucao, itemtipoExecucao);
	}

	@Quando("clico no botão salvar do popup")
	public void clico_no_botão_salvar_do_popup() throws Exception {
	    this.clicar(botaosalvarpopup);
	    this.VerificaMensagemPopUp(botaoproximoAbaLoteItem);
	}

	@Quando("clico no botão próximo e clico na aba declaração de existência de recursos")
	public void clico_no_botão_próximo_e_clico_na_aba_declaração_de_existência_de_recursos() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaLoteItem, abaDeclaracaoExistenciaRecursos);
	}

	@Quando("seleciono o combobox consta do procedimento declaração que atesta a existência de recursos orçamentários para a contratação")
	public void seleciono_o_combobox_consta_do_procedimento_declaração_que_atesta_a_existência_de_recursos_orçamentários_para_a_contratação() throws Exception {
	    this.selecionaComboBox(selecaoconstaProcedimento, itemconstaProcedimento);
	}

	@Quando("clico no botao proximo e na aba lrf")
	public void clico_no_botao_proximo_e_na_aba_lrf() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaDeclaracaoExistenciaRecurso, abaLRF);
	}

	@Quando("seleciono o combobox espécie de despesa")
	public void seleciono_o_combobox_espécie_de_despesa() throws Exception {
	    this.selecionaComboBox(selecaoespecieDespesa, itemespecieDespesa);
	}

	@Quando("clico no botão próximo e clico na aba parecer técnico jurídico audiência")
	public void clico_no_botão_próximo_e_clico_na_aba_parecer_técnico_jurídico_audiência() throws Exception {
		this.VerificaProximaAba(botaoproximoAbaLRF, abaPareceTecnicoJuridico);
	}

	@Quando("seleciono os comboboxes consta do procedimento parecer técnico jurídico atestando a viabilidade da contratação e houve audiência pública relativa ao processo licitatório")
	public void seleciono_os_comboboxes_consta_do_procedimento_parecer_técnico_jurídico_atestando_a_viabilidade_da_contratação_e_houve_audiência_pública_relativa_ao_processo_licitatório() throws Exception {
	    this.selecionaComboBox(selecaoconstaProcedimentoTecnico, itemconstaProcedimentoTecnico);
	    this.selecionaComboBox(selecaohouveAudiencia, itemhouveAudiencia);
	}

	@Quando("clico no botão próximo e clico na aba edital da segunda fase")
	public void clico_no_botão_próximo_e_clico_na_aba_edital_da_segunda_fase() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaParecerTecnico, abaeditalSegundaFase);
	}

	@Quando("preencho o campo número do edital {string} e data do edital")
	public void preencho_o_campo_número_do_edital_e_data_do_edital(String numeroEdital) throws Exception {
		waitBase(2);
		this.escrever(camponumeroEdital, numeroEdital);
		waitBase(2);
		this.clicar(selecaodataEdital);
		waitBase(2);
	    this.CampoData(selecaodataEdital, itemdataGeral);
	}

	@Quando("seleciono o combobox houve publicação do edital em outros veículos de comunicação e há exigências de garantia para particiação da licitação")
	public void seleciono_o_combobox_houve_publicação_do_edital_em_outros_veículos_de_comunicação_e_há_exigências_de_garantia_para_particiação_da_licitação() throws Exception {
		waitBase(3);
		this.selecionaComboBox(selecaohouvePublicacaoEdital, itemhouvePublicacaoEdital);
		waitBase(2);
	    this.selecionaComboBox(selecaohaExigenciaGarantia, itemhaExigenciaGarantia);
	}

	@Quando("clico no botão próximo e clico na aba datas")
	public void clico_no_botão_próximo_e_clico_na_aba_datas() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaEditalSegunda, abaDatas);
	}

	@Quando("seleciono os combobox houve entrega de propostas, houve abertura da licitação e houve julgamento")
	public void seleciono_os_combobox_houve_entrega_de_propostas_houve_abertura_da_licitação_e_houve_julgamento() throws Exception {
	    this.selecionaComboBox(selecaohouveEntrega, itemhouveEntrega);
	    waitBase(2);
	    this.selecionaComboBox(selecaohouveAbertura, itemhouveAbertura);
	    waitBase(2);
	    this.selecionaComboBox(selecaohouveJulgamento, itemhouveJulgamento);
	}

	@Quando("clico no botão próximo e clico na aba comissão licitação")
	public void clico_no_botão_próximo_e_clico_na_aba_comissão_licitação() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaDatas, abacomissaoLicitacao);
	}

	@Quando("seleciono o combobox existe comissão de licitação")
	public void seleciono_o_combobox_existe_comissão_de_licitação() throws Exception {
	    this.selecionaComboBox(selecaoExisteComissao, itemExisteComissao);
	}

	@Quando("clico no botão próximo e clico na aba licitantes")
	public void clico_no_botão_próximo_e_clico_na_aba_licitantes() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaComissaoLicitacao, abaLicitantes);
	}

	@Quando("seleciono o combobox existem licitantes")
	public void seleciono_o_combobox_existem_licitantes() throws Exception {
	    waitBase(2);
		this.selecionaComboBox(selecaoexistemLicitantes, itemexistemLicitantes);
	}

	@Quando("clico no botão próximo e clico na aba atestados de desempenho")
	public void clico_no_botão_próximo_e_clico_na_aba_atestados_de_desempenho() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaLicitantes, abaAtestadoDesempenho);
	} 

	@Quando("preencho o seleciono o combobox há exigências de atestados de desempenho anterior")
	public void preencho_o_seleciono_o_combobox_há_exigências_de_atestados_de_desempenho_anterior() throws Exception {
	    this.selecionaComboBox(selecaohaExigenciasAtestado, itemhaExigenciasAtestado);
	}

	@Quando("clico no botão próximo e clico na aba índices econônomicos")
	public void clico_no_botão_próximo_e_clico_na_aba_índices_econônomicos() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaAtestadoDesempenho, abaIndicesEconomicos);
	}

	@Quando("seleciono o combobox há exigencias de índices econômicos mínimos")
	public void seleciono_o_combobox_há_exigencias_de_índices_econômicos_mínimos() throws Exception {
	    this.selecionaComboBox(selecaohaExigenciaIndices, itemhaExigenciaIndices);
	}

	@Quando("clico no botão próximo e clico na aba amostras")
	public void clico_no_botão_próximo_e_clico_na_aba_amostras() throws Exception {
	    this.VerificaProximaAba(botaoproximoabaIndicesEconomicos, abaAmostras);
	}

	@Quando("seleciono o combobox há exigências de amostras")
	public void seleciono_o_combobox_há_exigências_de_amostras() throws Exception {
	    this.selecionaComboBox(selecaohaExigenciaAmostras, itemhaExigenciaAmostras);
	}

	@Quando("clico no botão próximo e clico na aba tributos")
	public void clico_no_botão_próximo_e_clico_na_aba_tributos() throws Exception {
	    this.VerificaProximaAba(botaoProximoAbaAmostras, abaTributos);
	}

	@Quando("seleciono o combobox há exigência de prévia quitação de tributos pelos licitantes")
	public void seleciono_o_combobox_há_exigência_de_prévia_quitação_de_tributos_pelos_licitantes() throws Exception {
	    this.selecionaComboBox(selecaohaExigenciaPreviaQuitacao, itemhaExigenciaPreviaQuitacao);
	}

	@Quando("clico no botão próximo e na aba julgamento de recursos")
	public void clico_no_botão_próximo_e_na_aba_julgamento_de_recursos() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaTributos, abaJulgamentoRecursos);
	}

	@Quando("seleciono o combobox há no procedimento ata de abertura dos documentos de habilitação e há no procedimento ata de julgamento dos documentos de habilitação")
	public void seleciono_o_combobox_há_no_procedimento_ata_de_abertura_dos_documentos_de_habilitação_e_há_no_procedimento_ata_de_julgamento_dos_documentos_de_habilitação() throws Exception {
	    this.selecionaComboBox(selecaohaProcedimentoAberturaHabilitacao, itemhaProcedimentoAberturaHabilitacao);
	    waitBase(2);
	    this.selecionaComboBox(selecaohaProcedimentoJulgamentoHabilitacao, itemhaProcedimentoJulgamentoHabilitacao);
	}

	@Quando("seleciono os combobox há no procedimento ata de abertura das propostas e há no procedimento ata de julgamento das propostas")
	public void seleciono_os_combobox_há_no_procedimento_ata_de_abertura_das_propostas_e_há_no_procedimento_ata_de_julgamento_das_propostas() throws Exception {
	    this.selecionaComboBox(selecaohaProcedimentoAberturaPropostas, itemhaProcedimentoAberturaPropostas);
	    waitBase(2);
	    this.selecionaComboBox(selecaohaProcedimentoJulgamentoPropostas, itemhaProcedimentoJulgamentoPropostas);
	}

	@Quando("seleciono o combobox existe quadro comparativo de preços das propostas")
	public void seleciono_o_combobox_existe_quadro_comparativo_de_preços_das_propostas() throws Exception {
		this.selecionaComboBox(selecaoexisteQuadroComparativoPrecosPropostas, itemexisteQuadroComparativoPrecosPropostas);
	}

	@Quando("seleciono o combobox houve interposição de recurso")
	public void seleciono_o_combobox_houve_interposição_de_recurso() throws Exception {
	    this.selecionaComboBox(selecaohouveInterposiçãoRecurso, itemhouveInterposiçãorecurso);
	}

	@Quando("seleciono o combobox houve ata de sessão pública")
	public void seleciono_o_combobox_houve_ata_de_sessão_pública() throws Exception {
	    this.selecionaComboBox(selecaohouveSessaoPublica, itemhouveSessaoPublica);
	}

	@Quando("clico no botão próximo e clico na aba homologação")
	public void clico_no_botão_próximo_e_clico_na_aba_homologação() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaJulgamentoRecursos, abaHomologacao);
	}

	@Quando("seleciono o combobox há no procedimento comprovação da publicação da homologação")
	public void seleciono_o_combobox_há_no_procedimento_comprovação_da_publicação_da_homologação() throws Exception {
	    this.selecionaComboBox(selecaohaProcedimentoComprovacaoPublicacaoHomologacao, itemhaProcedimentoComprovacaoPublicacaoHomogalacao);
	}

	@Quando("clico no botão próximo e clico na aba adjudicação")
	public void clico_no_botão_próximo_e_clico_na_aba_adjudicação() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaHomologacao, abaAdjudicacao);
	}

	@Quando("seleciono o combobox há no procedimento comprovação da publicação da adjudição")
	public void seleciono_o_combobox_há_no_procedimento_comprovação_da_publicação_da_adjudição() throws Exception {
	    this.selecionaComboBox(selecaohaProcedimentoComprovacaoPublicacaoAdjudicacao, itemhaProcedimentoComprovacaoPublicacaoAdjudicacao);
	}
	
	@Quando("clico no botão próximo e clico na aba autorização")
	public void clico_no_botão_próximo_e_clico_na_aba_autorização() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaAdjudicacao, abaAutorizacao);
	}
	
	@Quando("seleciono os combobox há nos autos autorização da secretaria estadual da fazenda e do planejamento nos termo do decreto estadual, declaração nos termos do art xviii da instrução, situação do procedimento licitatório e data da situação do procedimento licitatório")
	public void seleciono_os_combobox_há_nos_autos_autorização_da_secretaria_estadual_da_fazenda_e_do_planejamento_nos_termo_do_decreto_estadual_declaração_nos_termos_do_art_xviii_da_instrução_situação_do_procedimento_licitatório_e_data_da_situação_do_procedimento_licitatório() throws Exception {
	    this.selecionaComboBox(selecaohaAutosAutorizacaoSecretariaEstadual, itemhaAutosAutorizacaoSecretariaEstadual);
	    waitBase(2);
	    this.selecionaComboBox(selecaoDeclaracaoTermosInstrucao, itemDeclaracaoTermosInstrucao);
	    waitBase(2);
	    this.selecionaComboBox(selecaoProcedimentoLicitatorio, itemProcedimentoLicitatorio);
	    waitBase(2);
	    this.CampoData(selecaodataSituacaoProcedimentoLicitatorio, itemdataGeral);
	}

	@Quando("clico no botão salvar da tela autorização")
	public void clico_no_botão_salvar_da_tela_autorização() throws Exception {
	    waitBase(2);
		this.clicar(botaoSalvar);
	}

	@Então("recebo uma mensagem de sucesso da inclusão da licitação {string}")
	public void recebo_uma_mensagem_de_sucesso_da_inclusão_da_licitação(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemdeSucesso, mensagem);
	}
	
	
	/**************** Metódo Exclusão Licitação ****************/
	
	/*Exclusão Geral*/
	@Dado("que acesso ao painel fase quatro e ao submenu licitação para exclusão geral")
	public void que_acesso_ao_painel_fase_quatro_e_ao_submenu_licitação_para_exclusão_geral() throws Exception {
		waitBase(2);
		this.clicar(acessoaopainel);
		waitBase(2);
		this.clicar(acessoaosubmenu);	
	}

	@Quando("preencho os filtros codigo Licitação {string}, numero da licitação {string} e ano da licitação {string}")
	public void preencho_os_filtros_codigo_Licitação_numero_da_licitação_e_ano_da_licitação(String codigoLicitacao, String numeroLicitacao, String anoLicitacao) throws Exception {
		this.escrever(filtrocodigoLicitacao, codigoLicitacao);
		this.escrever(filtronumeroLicitacao, numeroLicitacao);
	    this.escrever(filtroanoLicitacao, anoLicitacao);
	}
	@Quando("seleciono o combobox modalidade, preencho os filtros numero do processo administrativo {string} e ano do processo administrativo {string}")
	public void seleciono_o_combobox_modalidade_preencho_os_filtros_numero_do_processo_administrativo_e_ano_do_processo_administrativo(String numeroProcessoADM, String anoProcessoADM) throws Exception {
	    this.selecionaComboBox(selecaomodalidade1, itemmodalidade1);
	    this.escrever(filtronumeroProcessoADM, numeroProcessoADM);
	    this.escrever(filtroanoProcessoADM, anoProcessoADM);
	}

	@Quando("clico no botão buscar, excluir e confirmar da tela licitação")
	public void clico_no_botão_buscar_excluir_e_confirmar_da_tela_licitação() throws Exception {
	    this.triadeExclusão(botaoBuscar, botaoExcluir, botaoConfirmar);
	}

	@Então("recebo uma mensagem de sucesso da tela licitação {string}")
	public void recebo_uma_mensagem_de_sucesso_da_tela_licitação(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemSucessoExclusao, mensagem);
	}
	
	
	/**************** Metodo Alteração ****************/
	
	/*Metódos Alteração*/
	@Dado("que acesso ao menu fasequatro e ao submenu licitação para alteração")
	public void que_acesso_ao_menu_fasequatro_e_ao_submenu_licitação_para_alteração() throws Exception {
		waitBase(2);
		this.clicar(acessoaopainel);
		waitBase(2);
		this.clicar(acessoaosubmenu);
	}

	@Quando("preencho os filtro codigo licitação {string} numero da licitação {string}, ano da licitação {string}, seleciono o combo modalidade, numero do processo adminsitrativo {string} e ano do processo administrativo {string} e clico em buscar e alterar")
	public void preenchoOsFiltroCodigoLicitaçãoNumeroDaLicitaçãoAnoDaLicitaçãoSelecionoOComboModalidadeNumeroDoProcessoAdminsitrativoEAnoDoProcessoAdministrativoEClicoEmBuscarEAlterar(String codigoLicitacao, String numeroLicitacao, String anoLicitacao, String numeroProcessoADM, String anoProcessoADM) throws Exception {
	    this.escrever(filtrocodigoLicitacao, codigoLicitacao);
		this.escrever(filtronumeroLicitacao, numeroLicitacao);
	    this.escrever(filtroanoLicitacao, anoLicitacao);
	    this.selecionaComboBox(selecaomodalidade1, itemmodalidade1);
	    waitBase(2);
	    this.escrever(filtronumeroProcessoADM, numeroProcessoADM);
	    this.escrever(filtroanoProcessoADM, anoProcessoADM);
	    waitBase(2);
	    this.acessaAlteração(botaoBuscar, botaoAlteracao);
	}

	@Quando("seleciono os combobox é adesão a ata de registro de preços de outro órgão e essa licitação possui órgãos participantes e os ajustes poderão ser realizados por esses órgãos para alteração")
	public void seleciono_os_combobox_é_adesão_a_ata_de_registro_de_preços_de_outro_órgão_e_essa_licitação_possui_órgãos_participantes_e_os_ajustes_poderão_ser_realizados_por_esses_órgãos_para_alteração() throws Exception {
	    this.selecionaComboBox(selecaoeAdesaoAtaRegistro, itemEadesaoataRegistroAlteracao);
	    waitBase(2);
	    this.selecionaComboBox(selecaoessaLicitacaoOrgaos, itemessalicitacaoOrgaosAlteracao);
	}

	@Quando("preencho os campos codigo Licitação {string} n do precesso administrativo {string} e ano do processo administrativo {string} para alteração")
	public void preenchoOsCamposCodigoLicitaçãoNDoPrecessoAdministrativoEAnoDoProcessoAdministrativoParaAlteração(String codigoLicitacao, String numeroProcessoADM, String anoProcessoADM) throws Exception {
	    this.escrever(campocodigoLicitacao, codigoLicitacao);
		this.escrever(camponProcessoADM, numeroProcessoADM);
	    waitBase(2);
	    this.escrever(camponProcessoADM, numeroProcessoADM);
	    waitBase(2);
	    this.escrever(campoanoProcessoADM, anoProcessoADM);
	}

	@Quando("seleciono o combobox tipo de natureza para alteração")
	public void seleciono_o_combobox_tipo_de_natureza_para_alteração() throws Exception {
	    waitBase(2);
		this.selecionaComboBox(selecaotipoNaturezaAlteracao, itemtipoNaturezaAlteracao);
	}

	@Quando("preencho os campos numero da ata de registro de preço utilizada {string}, data de registro de preço, nome do órgão detentor da ata de registro de preços {string}, numero da licitação {string}, data da autorização para alteração")
	public void preencho_os_campos_numero_da_ata_de_registro_de_preço_utilizada_data_de_registro_de_preço_nome_do_órgão_detentor_da_ata_de_registro_de_preços_numero_da_licitação_data_da_autorização_para_alteração(String numeroAtaRegistro, String nomeOrgãoRegistro, String numeroLicitação) throws Exception {
		this.escrever(camponumeroAtaRegistroPreçoAlteracao, numeroAtaRegistro);
		waitBase(2);
		this.escrever(camponumeroAtaRegistroPreçoAlteracao, numeroAtaRegistro);
		waitBase(2);
		this.clicar(selecaodataRegistroPreçoAlteracao);
		waitBase(2);
		this.CampoData(selecaodataRegistroPreçoAlteracao, itemdataGeral);
		waitBase(2);
		this.clicar(camponomeOrgaoDetentorRegistro);
		waitBase(2);
		this.escrever(camponomeOrgaoDetentorRegistro, nomeOrgãoRegistro);
		waitBase(2);
		this.escrever(camponomeOrgaoDetentorRegistro, nomeOrgãoRegistro);
		waitBase(2);
		this.clicar(camponumeroLicitacaoAlteracao);
		waitBase(2);
		this.escrever(camponumeroLicitacaoAlteracao, numeroLicitação);
		waitBase(2);
		this.escrever(camponumeroLicitacaoAlteracao, numeroLicitação);
		waitBase(2);
		this.clicar(selecaodataAutorizacaoAlteracao);
		waitBase(2);
		this.CampoData(selecaodataAutorizacaoAlteracao, itemdataGeral);
	}

	@Quando("preencho o campo validade da ata de registro de preços em meses {string} para alteração")
	public void preencho_o_campo_validade_da_ata_de_registro_de_preços_em_meses_para_alteração(String validadeMeses) throws Exception {
	    this.escrever(campovalidadeMesesAlteracao, validadeMeses);
	    waitBase(2);
	    this.escrever(campovalidadeMesesAlteracao, validadeMeses);

	}

	@Quando("seleciono o combobox a licitação é, tipo de objeto, preencho o campo valor total estimado da licitação {string}, seleciono o combobox objeto da licitação, preencho o campo descreva o objeto da licitação {string} e justificativa para contratação {string} para alteração")
	public void seleciono_o_combobox_a_licitação_é_tipo_de_objeto_preencho_o_campo_valor_total_estimado_da_licitação_seleciono_o_combobox_objeto_da_licitação_preencho_o_campo_descreva_o_objeto_da_licitação_e_justificativa_para_contratação_para_alteração(String valorEstimadoLicitacao, String objetoLicitacao, String justificativaContratacao) throws Exception {
		this.clicar(selecaolicitaE);
		waitBase(2);
		this.selecionaComboBox(selecaolicitaE, itemlicitaEAlteracao);
		waitBase(2);
	    this.selecionaComboBox(selecaotipoObjeto, itemtipoObjetoAlteracao);
	    waitBase(2);
	    this.escrever(campovalorEstimadoLicitacao, valorEstimadoLicitacao);
	    waitBase(2);
	    this.escrever(campovalorEstimadoLicitacao, valorEstimadoLicitacao);
	    waitBase(2);
	    this.clicar(selecaoobjetoLicitacao);
	    waitBase(2);
	    this.selecionaComboBox(selecaoobjetoLicitacao, itemobjetoLicitacaoAlteracao); 
	    waitBase(2);
	    this.escrever(campodescrevaObjeto, objetoLicitacao);
	    waitBase(2);
	    this.escrever(campodescrevaObjeto, objetoLicitacao);
	    waitBase(2);
	    this.escrever(campojustificativaContrato, justificativaContratacao);
	    waitBase(2);
	    this.escrever(campojustificativaContrato, justificativaContratacao);
	}

	@Quando("clico no botão próximo da aba dados iniciais e clico na aba dados adicionais para alteração")
	public void clico_no_botão_próximo_da_aba_dados_iniciais_e_clico_na_aba_dados_adicionais_para_alteração() throws Exception {
		this.VerificaProximaAba(botaoproximoAbaDadosIniciais, abaDadosAdicionais);
	}

	@Quando("seleciono o combobox tipo de licitação, há previsão de permissão de subcontratação e beneficio da lei complementar micro e epp para alteração")
	public void seleciono_o_combobox_tipo_de_licitação_há_previsão_de_permissão_de_subcontratação_e_beneficio_da_lei_complementar_micro_e_epp_para_alteração() throws Exception {
	    this.selecionaComboBox(selecaotipoLicitacao, itemtipoLicitacaoAlteracao);
	    waitBase(2);
	    this.selecionaComboBox(selecaohaPrevisaoPermissao, itemhaPrevisãoPermissaoAlteracao);
	    waitBase(2);
	    this.selecionaComboBox(selecaoseraAplicadoBeneficio, itemseraAplicadoBeneficioAlteracao);
	}

	@Quando("clico no botão próximo da aba dados adicionais e clico na aba pré qualificação para alteração")
	public void clico_no_botão_próximo_da_aba_dados_adicionais_e_clico_na_aba_pré_qualificação_para_alteração() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaDadosAdicionais, abaPreQualificacao);
	}

	@Quando("seleciono o combobox houve fase pré qualificação para alteração")
	public void seleciono_o_combobox_houve_fase_pré_qualificação_para_alteração() throws Exception {
	    waitBase(2);
		this.selecionaComboBox(selecaohouveFase, itemhouveFaseAlteracao);
	}

	@Quando("clico na aba próximo da aba pré qualificação e clico na aba lote item para alteração")
	public void clico_na_aba_próximo_da_aba_pré_qualificação_e_clico_na_aba_lote_item_para_alteração() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbapreQualificacao, abaLoteItem);
	}

	@Quando("clico no botão ação, preencho os campos descreva o objeto do lote {string}, quantidade {string}, unidade {string}, seleciono os combobox lote possui orçamento, o lote é composto por itens. tipo classificação economica, codigo classificação economica e tipo execução e clico em salvar para alteração")
	public void clico_no_botão_ação_preencho_os_campos_descreva_o_objeto_do_lote_quantidade_unidade_seleciono_os_combobox_lote_possui_orçamento_o_lote_é_composto_por_itens_tipo_classificação_economica_codigo_classificação_economica_e_tipo_execução_e_clico_em_salvar_para_alteração(String descrevaLote, String quantidade, String unidade) throws Exception {
		this.clicar(botaoacao);
		waitBase(2); 
		this.escrever(campodescrevaObjetoLote, descrevaLote);
		waitBase(2);
	    this.escrever(campoquantidade, quantidade);
	    waitBase(2);
	    this.escrever(campoquantidade, quantidade);
	    waitBase(2);
	    this.escrever(campounidadeMedida, unidade);
	    waitBase(2);
	    this.escrever(campounidadeMedida, unidade);
	    waitBase(2);
		this.clicar(selecaolotePossui);
		waitBase(2);
		this.selecionaComboBox(selecaolotePossui, itemlotePossuiAlteracao);
		waitBase(2);
		this.selecionaComboBox(selecaoloteComposto, itemloteCompostoAlteracao);
		waitBase(2);
	    this.selecionaComboBox(selecaoloteComposto, itemloteCompostoAlteracao);
	    this.selecionaComboBox(selecaoclassificacaoEconomica, itemclassificacaoEconomicaAlteracao);
	    waitBase(2);
	    this.selecionaComboId(selecaocodigoClassificacao, itemcodigoClassificacao);
	    waitBase(2);
	    this.selecionaComboBox(selecaotipoExecucao, itemtipoExecucaoAlteracao);
	    waitBase(2);
	    this.clicar(botaosalvarpopup);
	}

	@Quando("clico no botão próximo da aba lote itens e clico na aba declaração de existencia de recursos para alteração")
	public void clico_no_botão_próximo_da_aba_lote_itens_e_clico_na_aba_declaração_de_existencia_de_recursos_para_alteração() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaLoteItem, abaDeclaracaoExistenciaRecursos);
	}

	@Quando("seleciono o combobox consta do procedimento declaração que atesta a existência de recursos orçamentários para a contratação para alteração")
	public void seleciono_o_combobox_consta_do_procedimento_declaração_que_atesta_a_existência_de_recursos_orçamentários_para_a_contratação_para_alteração() throws Exception {
	    this.selecionaComboBox(selecaoconstaProcedimento, itemconstaProcedimentoAlteracao);
	}

	@Quando("clico no botão próximo da aba declaração de existência de recursos e clico na aba lrf para alteração")
	public void clico_no_botão_próximo_da_aba_declaração_de_existência_de_recursos_e_clico_na_aba_lrf_para_alteração() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaDeclaracaoExistenciaRecurso, abaLRF);
	}

	@Quando("seleciono o combobox espécie de despesa para alteração")
	public void seleciono_o_combobox_espécie_de_despesa_para_alteração() throws Exception {
		this.selecionaComboBox(selecaoespecieDespesa, itemespecieDespesaAlteracao);
	}

	@Quando("clico no botão próximo da aba lrf e clico na aba parecer técnico jurídico audiência para alteração")
	public void clico_no_botão_próximo_da_aba_lrf_e_clico_na_aba_parecer_técnico_jurídico_audiência_para_alteração() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaLRF, abaPareceTecnicoJuridico);
	}
	
	@Quando("seleciono o combobox consta do procedimento parecer técnico jurpidico atestando a viabilidade da contratação e houve audiência pública relativa ao processo licitatório para alteração")
	public void seleciono_o_combobox_consta_do_procedimento_parecer_técnico_jurpidico_atestando_a_viabilidade_da_contratação_e_houve_audiência_pública_relativa_ao_processo_licitatório_para_alteração() throws Exception {
	    this.selecionaComboBox(selecaoconstaProcedimentoTecnico, itemconstaProcedimentoParecerAlteracao);
	    this.selecionaComboBox(selecaohouveAudiencia, itemhouveAudienciaAlteracao);
	}

	@Quando("clico no botão próximo da aba parecer técnico jurídico audiência e clico na aba edital para alteração")
	public void clico_no_botão_próximo_da_aba_parecer_técnico_jurídico_audiência_e_clico_na_aba_edital_para_alteração() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaParecerTecnico, abaeditalSegundaFase);
	}

	@Quando("preencho os campso número do edital {string}, data do edital, seleciono o combobox houve publicação do edital em outros veículos de comunicação e há exigência de garantia para participação da licitação para alteração")
	public void preencho_os_campso_número_do_edital_data_do_edital_seleciono_o_combobox_houve_publicação_do_edital_em_outros_veículos_de_comunicação_e_há_exigência_de_garantia_para_participação_da_licitação_para_alteração(String numeroEdital) throws Exception {
	    this.escrever(camponumeroEdital, numeroEdital);
	    waitBase(2);
	    this.escrever(camponumeroEdital, numeroEdital);
	    waitBase(2);
	    this.clicar(selecaodataEdital);
	    waitBase(2);
	    this.CampoData(selecaodataEdital, itemdataGeral);
	    waitBase(2);
	    this.selecionaComboBox(selecaohouvePublicacaoEdital, itempublicacaoEditalAlteracao);
	    waitBase(2);
	    this.selecionaComboBox(selecaohaExigenciaGarantia, itemhaExigenciasGarantiaAlteracao);
	}

	@Quando("clico no botão próximo da aba edital e clico na aba datas para alteração")
	public void clico_no_botão_próximo_da_aba_edital_e_clico_na_aba_datas_para_alteração() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaEditalSegunda, abaDatas);
	}

	@Quando("seleciono os combobox houve entrega de propostas, houve abertura da licitação e houve julgamento para alteração")
	public void seleciono_os_combobox_houve_entrega_de_propostas_houve_abertura_da_licitação_e_houve_julgamento_para_alteração() throws Exception {
	    this.selecionaComboBox(selecaohouveEntrega, itemhouveEntregaAlteracao);
	    this.selecionaComboBox(selecaohouveAbertura, itemhouveAberturaAlteracao);
	    this.selecionaComboBox(selecaohouveJulgamento, itemhouvejulgamentoAlteracao);
	}

	@Quando("clico no botão próximo da aba datas e clico na aba comissão de licitação para alteração")
	public void clico_no_botão_próximo_da_aba_datas_e_clico_na_aba_comissão_de_licitação_para_alteração() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaDatas, abacomissaoLicitacao);
	}

	@Quando("seleciono o combobox  existe comissão de licitação para alteração")
	public void seleciono_o_combobox_existe_comissão_de_licitação_para_alteração() throws Exception {
		waitBase(2);
	    this.selecionaComboBox(selecaoExisteComissao, itemexisteComissaoAlteracao);
	}

	@Quando("clico no botão próximo da aba comissão de licitação e clico na aba licitantes para alteração")
	public void clico_no_botão_próximo_da_aba_comissão_de_licitação_e_clico_na_aba_licitantes_para_alteração() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaComissaoLicitacao, abaLicitantes);
	}

	@Quando("seleciono o combobox existem licitantes para alteração")
	public void seleciono_o_combobox_existem_licitantes_para_alteração() throws Exception {
	    this.selecionaComboBox(selecaoexistemLicitantes, itemexistemLicitantesAlteracao);
	}

	@Quando("clico no botão próximo da aba licitantes e clico na aba atestado desempenho para alteração")
	public void clico_no_botão_próximo_da_aba_licitantes_e_clico_na_aba_atestado_desempenho_para_alteração() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaLicitantes, abaAtestadoDesempenho);
	}

	@Quando("seleciono o combobox há exigência de atestados de desempenho anterior para alteração")
	public void seleciono_o_combobox_há_exigência_de_atestados_de_desempenho_anterior_para_alteração() throws Exception {
	    this.selecionaComboBox(selecaohaExigenciasAtestado, itemhaExigenciasAtestadoAlteracao);
	}

	@Quando("clico no botão próximo e clico na aba indices economicos para alteração")
	public void clico_no_botão_próximo_e_clico_na_aba_indices_economicos_para_alteração() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaAtestadoDesempenho, abaIndicesEconomicos);
	}

	@Quando("seleciono o combobox indices economicos  minimos para alteração")
	public void seleciono_o_combobox_indices_economicos_minimos_para_alteração() throws Exception {
	    this.selecionaComboBox(selecaohaExigenciaIndices, itemhaExigenciasIndicesAlteracao);
	}

	@Quando("clico no botão próximo e clico na aba amostras para alteração")
	public void clico_no_botão_próximo_e_clico_na_aba_amostras_para_alteração() throws Exception {
	    this.VerificaProximaAba(botaoproximoabaIndicesEconomicos, abaAmostras);
	}

	@Quando("seleciono o combobox há exigências de amostras para alteração")
	public void seleciono_o_combobox_há_exigências_de_amostras_para_alteração() throws Exception {
	    this.selecionaComboBox(selecaohaExigenciaAmostras, itemhaExigenciasAmostrasAlteracao);
	}

	@Quando("clico no botão próximo da aba amostras e clico na aba tributos para alteração")
	public void clico_no_botão_próximo_da_aba_amostras_e_clico_na_aba_tributos_para_alteração() throws Exception {
	    this.VerificaProximaAba(botaoProximoAbaAmostras, abaTributos);
	}

	@Quando("seleciono o combobox há exigências de prévia quitação de tributos pelos licitantes para alteração")
	public void seleciono_o_combobox_há_exigências_de_prévia_quitação_de_tributos_pelos_licitantes_para_alteração() throws Exception {
	    this.selecionaComboBox(selecaohaExigenciaPreviaQuitacao, itemhaExigenciaPreviaAlteracao);
	}

	@Quando("clico no botão próximo da aba tributos e clico na aba julgamento recursos para alteração")
	public void clico_no_botão_próximo_da_aba_tributos_e_clico_na_aba_julgamento_recursos_para_alteração() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaTributos, abaJulgamentoRecursos);
	}

	@Quando("seleciono os combobox há no procedimento ata de abertura dos documentos de habilitação, ha no procedimento ata de julgamento dos documentos de habilitação para alteração")
	public void seleciono_os_combobox_há_no_procedimento_ata_de_abertura_dos_documentos_de_habilitação_ha_no_procedimento_ata_de_julgamento_dos_documentos_de_habilitação_para_alteração() throws Exception {
		this.selecionaComboBox(selecaohaProcedimentoAberturaHabilitacao, itemhaProcedimentoAberturaAlteracao);
		this.selecionaComboBox(selecaohaProcedimentoJulgamentoHabilitacao, itemhaProcedimentoJulgamentoAlteracao);
	}

	@Quando("seleciono o combobox há no procedimento ata de abertura das propostas, há no procedimento ata de julgamento das propostas para alteração")
	public void seleciono_o_combobox_há_no_procedimento_ata_de_abertura_das_propostas_há_no_procedimento_ata_de_julgamento_das_propostas_para_alteração() throws Exception {
	    this.selecionaComboBox(selecaohaProcedimentoAberturaPropostas, itemhaProcedimentoAberturaPropostaAlteracao);
	    this.selecionaComboBox(selecaohaProcedimentoJulgamentoPropostas, itemhaProcedimentoAtaJulgamentoAlteracao);
	}

	@Quando("seleciono o combobox existe quadro comparativo de preços das propostas para alteração")
	public void seleciono_o_combobox_existe_quadro_comparativo_de_preços_das_propostas_para_alteração() throws Exception {
	    this.selecionaComboBox(selecaoexisteQuadroComparativoPrecosPropostas, itemexisteQuadroComparativoPrecosAlteracao);
	}

	@Quando("seleciono o combobox houve interposição de recurso para alteração")
	public void seleciono_o_combobox_houve_interposição_de_recurso_para_alteração() throws Exception {
	    this.selecionaComboBox(selecaohouveInterposiçãoRecurso, itemhouveInterposicaoRecursoAlteracao);
	}

	@Quando("seleciono o combobox houve ata de sessão pública para alteração")
	public void seleciono_o_combobox_houve_ata_de_sessão_pública_para_alteração() throws Exception {
	    this.selecionaComboBox(selecaohouveSessaoPublica, itemhouveSessaoPublicaAlteracao);
	}

	@Quando("clico no botão próximo e clico na aba homologação para alteração")
	public void clico_no_botão_próximo_e_clico_na_aba_homologação_para_alteração() throws Exception {
		this.VerificaProximaAba(botaoproximoAbaJulgamentoRecursos, abaHomologacao);
	}

	@Quando("seleciono o combobox há no procedimento comprovação da publicação da homologação para alteração")
	public void seleciono_o_combobox_há_no_procedimento_comprovação_da_publicação_da_homologação_para_alteração() throws Exception {
	    this.selecionaComboBox(selecaohaProcedimentoComprovacaoPublicacaoHomologacao, itemhaProcedimentoComprovacaoPublicacaoHomologacaoAlteracao);
	}

	@Quando("clico no botão próximo da aba homologação e clico na aba adjudicação para alteração")
	public void clico_no_botão_próximo_da_aba_homologação_e_clico_na_aba_adjudicação_para_alteração() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaHomologacao, abaAdjudicacao);
	}

	@Quando("seleciono o combobox há no procedimento comprovação da publicação da adjudicação para alteração")
	public void seleciono_o_combobox_há_no_procedimento_comprovação_da_publicação_da_adjudicação_para_alteração() throws Exception {
	    this.selecionaComboBox(selecaohaProcedimentoComprovacaoPublicacaoAdjudicacao, itemhaProcedimentoComprovacaoPublicacaoAdjudicacaoAlteracao);
	}

	@Quando("clico no botão próximo da aba adjudicação e clico na aba autorização para alteração")
	public void clico_no_botão_próximo_da_aba_adjudicação_e_clico_na_aba_autorização_para_alteração() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaAdjudicacao, abaAutorizacao);
	}

	@Quando("seleciono o combobox há nos autos autorização da secretaria estadual da fazenda e do planejamento, nos termos do decreto estadual n para alteração")
	public void seleciono_o_combobox_há_nos_autos_autorização_da_secretaria_estadual_da_fazenda_e_do_planejamento_nos_termos_do_decreto_estadual_n_para_alteração() throws Exception {
		this.selecionaComboBox(selecaohaAutosAutorizacaoSecretariaEstadual, itemhaAutosAutorizacaoSecretariaEstadualAlteracao);
	}

	@Quando("seleciono o combobox declaração nos termos do art IIX III XVIII, da instrução para alteração")
	public void seleciono_o_combobox_declaração_nos_termos_do_art_IIX_III_XVIII_da_instrução_para_alteração() throws Exception {
	    this.selecionaComboBox(selecaoDeclaracaoTermosInstrucao, itemDeclaracaoTermosInstrucaoAlteracao);
	}

	@Quando("clico no botão salvar para alteração")
	public void clico_no_botão_salvar_para_alteração() throws Exception {
	    this.clicar(botaoSalvar);
	}
	
	@Então("recebo uma mensagem de sucesso de alteração {string} para alteracao")
	public void recebo_uma_mensagem_de_sucesso_de_alteração_para_alteracao(String mensagem) {
	    Assert.assertEquals(mensagem, this.obterTexto(mensagemAlteracao));
	}
	
	
	/**************** Metodo Exclusão Alteração ****************/
	
	/*Exclusão Alteção Geral*/
	@Dado("que acesso ao submenu licitação para exclusão geral para alteração")
	public void queAcessoAoSubmenuLicitaçãoParaExclusãoGeralParaAlteração() throws Exception {
	    this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fase quatro e ao submenu licitação para exclusão geral para alteração")
	public void queAcessoAoMenuFaseQuatroEAoSubmenuLicitaçãoParaExclusãoGeralParaAlteração() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("preencho os filtros numero da licitação {string} e ano da licitação {string} para alteração")
	public void preencho_os_filtros_numero_da_licitação_e_ano_da_licitação_para_alteração(String numeroLicitacao, String anoLicitacao) throws Exception {
		 this.escrever(filtronumeroLicitacao, numeroLicitacao);
		    this.escrever(filtroanoLicitacao, anoLicitacao);
	}

	@Quando("seleciono o combobox modalidade, preencho os filtros numero do processo administrativo {string} e ano do processo administrativo {string} para alteração")
	public void seleciono_o_combobox_modalidade_preencho_os_filtros_numero_do_processo_administrativo_e_ano_do_processo_administrativo_para_alteração(String numeroProcessoADM, String anoProcessoADM) throws Exception {
		this.selecionaComboBox(selecaomodalidade1, itemmodalidade1);
	    this.escrever(filtronumeroProcessoADM, numeroProcessoADM);
	    this.escrever(filtroanoProcessoADM, anoProcessoADM);
	}

	@Quando("clico no botão buscar, excluir e confirmar da tela licitação para alteração")
	public void clico_no_botão_buscar_excluir_e_confirmar_da_tela_licitação_para_alteração() throws Exception {
	    this.triadeExclusão(botaoBuscar, botaoExcluir, botaoConfirmar);
	}

	@Então("recebo uma mensagem de sucesso da tela licitação {string} para alteração")
	public void recebo_uma_mensagem_de_sucesso_da_tela_licitação_para_alteração(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemSucessoExclusao, mensagem);
	}
}