package br.ce.leonardo.steps;
import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import junit.framework.Assert;

public class AprenderCucumberSteps {

	@Dado("^que criei o arquivo corretamente$")
	public void que_criei_o_arquivo_corretamente() throws Throwable {
	}

	@Quando("^executa-lo$")
	public void executa_lo() throws Throwable {
	}

	@Então("^a especificação deve finalizar com sucesso$")
	public void a_especificação_deve_finalizar_com_sucesso() throws Throwable {
	}

	/********** contador ***********/
	private int contador = 0;

	@Dado("que o valor do contador é {int}")
	public void que_o_valor_do_contador_é(int int1) {
		contador = int1;
	}

	@Quando("eu incrementar em {int}")
	public void eu_incrementar_em(int int1) {
		contador = contador + int1;
	}

	
	@Então("o valora será {int}")
	public void o_valora_será(int int1) {
		Assert.assertEquals(int1, contador);
	}

	Date entrega = new Date();

	@Dado("que a entrega é dia {int}\\/{int}\\/{int}")
	public void que_a_entrega_é_dia(int dia, int mes, int ano) throws Throwable {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.MONTH, mes - 1);
		cal.set(Calendar.YEAR, ano);
		entrega = cal.getTime();
	}

	@Quando("a entrega atrasar {int} {string}")
	public void a_entrega_atrasar(int int1, String tempo) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		if (tempo.equals("dias")) {
			cal.add(Calendar.DAY_OF_MONTH, int1);
		}
		
		if (tempo.equals("meses")) {
			cal.add(Calendar.MONTH, int1);
		}
		entrega = cal.getTime();
	}

	@Quando("a entrega atrasar {int} dias")
	public void a_entrega_atrasar_dias(int int1) throws Throwable {
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		cal.add(Calendar.DAY_OF_MONTH, int1);
		entrega = cal.getTime();
	}

	@Então("a entrega será efetuada em {string}")
	public void a_entrega_será_efetuada_em(String data) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyy");
		String dataFormatada = format.format(entrega);
		assertEquals(data, dataFormatada);
	}
	
/************** desafio **************/	
	
	@Dado("que o ticket é {string}")
	public void que_o_ticket_é(String string) {
	   
	}

	@Dado("que o valor da passagem é R$ {string}")
	public void que_o_valor_da_passagem_é_r$(String string) {
	}

	@Dado("que o nome do passageiro é {string}")
	public void que_o_nome_do_passageiro_é(String string) {
	}

	@Dado("que o telefone do passageiro é {string}")
	public void que_o_telefone_do_passageiro_é(String string) {
	}

	@Quando("criar os steps")
	public void criar_os_steps() {
	}

	@Então("o teste vai funcionar")
	public void o_teste_vai_funcionar() {
	}
	
	@Dado("que o ticket especial é {string}")
	public void que_o_ticket_especial_é(String string) {
	}	
	
	@Dado("que o telefone do passageiro é o {string}")
	public void que_o_telefone_do_passageiro_é_o(String string) {
	}

	@Dado("que o telefone do passageiro é o tel {string}")
	public void que_o_telefone_do_passageiro_é_o_tel(String string) {
	}
	
	
}
