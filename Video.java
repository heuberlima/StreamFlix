import java.util.List;

public class Video {

	private int codigo;
	private String titulo;
	private String diretor;
	private int ano_lancamento;
	private String genero;
	private List<String> atores;

	// Metodo construtor para a criação de objetos do tipo Video
	public Video(int codigo, String titulo, String diretor, int ano_lancamento, String genero, List<String> atores) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.diretor = diretor;
		this.ano_lancamento = ano_lancamento;
		this.genero = genero;
		this.atores = atores;
	}

	// Gets e Sets dos atributos
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

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public int getAno_lancamento() {
		return ano_lancamento;
	}

	public void setAno_lancamento(int ano_lancamento) {
		this.ano_lancamento = ano_lancamento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<String> getAtores() {
		return atores;
	}

	public void setAtores(List<String> atores) {
		this.atores = atores;
	}

	// Métodos relacionados aos requisitos funcionais
	public String exibir() {

		String retorno = "Codigo: " + codigo + "\n" +
				"Titulo: " + titulo + "\n" +
				"Diretor: " + diretor + "\n" +
				"Ano Lancamento: " + ano_lancamento + "\n" +
				"Genero: " + genero + "\n" +
				"Atores: " + atores + "\n";

		return retorno;
	}

}
