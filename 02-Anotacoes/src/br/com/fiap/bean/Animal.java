package br.com.fiap.bean;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.anotacao.Tabela;

@Tabela(nome="TAB_ANIMAL")
public class Animal {
		
		
	
		@Coluna (nome="cd_animal", nullable = false)
		
		private int codigo;
		
		@Coluna (nome= "qtd_patas", nullable = true)
		private int quantidadedePatas;
		
		@Coluna (nome= "ds_especie", nullable = false)
		private String especie;
		
		@Coluna (nome="ds_voador", nullable = false)
		private boolean voador;

		
		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public int getQuantidadedePatas() {
			return quantidadedePatas;
		}

		public void setQuantidadedePatas(int quantidadedePatas) {
			this.quantidadedePatas = quantidadedePatas;
		}

		public String getEspecie() {
			return especie;
		}

		public void setEspecie(String especie) {
			this.especie = especie;
		}

		public boolean isVoador() {
			return voador;
		}

		public void setVoador(boolean voador) {
			this.voador = voador;
		}
		
		
}

