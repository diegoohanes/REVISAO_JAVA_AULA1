package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME) // MANTEM A ANOTAÇÃO ATÉ A EXECUÇÃO
@Target(ElementType.FIELD) // ANOTAÇÃO PODE SER UTILIZADA EM ATRIBUTOS 
public @interface Coluna {

	String nome();
	
	boolean nullable();
	
	
	
}
