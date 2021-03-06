package br.com.fiap.bean.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.fiap.bean.Genero;
import br.com.fiap.bean.Pessoa;

public class Teste {
	
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setSexo(Genero.FEMININO);
		
		Calendar data = Calendar.getInstance(); //DATA ATUAL
		Calendar data2 = new GregorianCalendar(2000, Calendar.JANUARY, 20); //ANO. MES , DIA
		
		p.setDataNascimento(data);
		
		//FORMATAR A DATA PARA EXIBIR
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(data.getTime()));
		System.out.println(sdf.format(data2.getTime())); 
	}
}
