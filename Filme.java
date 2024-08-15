import java.util.List;

public class Filme extends Video {

	private int duracao;

	// Construtor para a classe filho
	public Filme(int codigo, String titulo, String diretor, int ano_lancamento, String genero, List<String> atores,
			int duracao) {
		super(codigo, titulo, diretor, ano_lancamento, genero, atores);
		this.duracao = duracao;
	}

	// Gets e Sets
	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public String exibir() {

		String aux = super.exibir();

		aux += "Duracao: " + duracao + "\n";

		return aux;

	}

}
