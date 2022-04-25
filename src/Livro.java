public class Livro {
							
		private int codigo;
		private String titulo;
		private String autor;
		private int ano;
		private boolean estaDisponivel;
		private String emprestimoVizinho;
		
		@Override
		public String toString() {
			String status = estaDisponivel ? "sim" : "não";
			return "\n - Número: " + codigo + "\n - Titulo: " + titulo + "\n - Ano: " + ano +
					"\n - Diponivel: " + status + "\n";
		}
		
		
		
		public int getCodigo() {
			return codigo;
		}
		
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}

		public boolean getEstaDisponivel() {
			return estaDisponivel;
		}

		public void setEstaDisponivel(boolean estaDisponivel) {
			this.estaDisponivel = estaDisponivel;
		}

		public String getemprestimoVizinho() {
			return emprestimoVizinho;
		}

		public void setemprestimoVizinho(String emprestimoVizinho) {
			this.emprestimoVizinho = emprestimoVizinho;
		}

		
		
		
		
		
		public Livro (int num, String tit, String author, int year) {
			codigo = num;
			titulo = tit;
			autor = author;
			ano = year;
			estaDisponivel = true;
		}
		
		
		
		
		public void devolver() {
			if(! estaDisponivel) {
				estaDisponivel = true;
				emprestimoVizinho = null;
				System.out.println("\nTitulo devolvido com sucesso");
			}else {
				System.out.println("\nO titulo já estava disponivel");
			}
		}
		
		
		
		public void retirar(String vizinho) {
			estaDisponivel = false;
			emprestimoVizinho = vizinho;
			System.out.println("\nA retirada foi efetuada com sucesso!");
		}
		
		
		
		
		
}
