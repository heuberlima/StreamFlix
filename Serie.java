import java.util.List;

public class Serie extends Video {

	private int num_temporadas;

	// Construtor da classe filha, mas que recebe todos os atributos necessários
	// para a criação da classe pai
	public Serie(int codigo, String titulo, String diretor, int ano_lancamento, String genero, List<String> atores,
			int num_temporadas) {
		super(codigo, titulo, diretor, ano_lancamento, genero, atores);
		this.num_temporadas = num_temporadas;
	}

	// Gets e Sets
	public int getNum_temporadas() {
		return num_temporadas;
	}

	public void setNum_temporadas(int num_temporadas) {
		this.num_temporadas = num_temporadas;
	}

	@Override
	public String exibir() {

		String aux = super.exibir();

		aux += "Num Temporadas: " + num_temporadas + "\n";

		return aux;

	}

}
