package br.ce.leonardo.converters;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class DateConverter {
	
	
	public Date transform(String arg0) {
	DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	try {
		Date retorno = format.parse(arg0);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	return null;
	}
	
	}



