import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private int codigo;
	private String nome;
	private String email;
	private String forma_pagamento;
	private String senha;
	private List<Video> favoritos;
	private List<Video> historico_visualizacao;

	// Construtor da classe usuário, que recebe todos os parametros
	public Usuario(int codigo, String nome, String email, String forma_pagamento, String senha) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.forma_pagamento = forma_pagamento;
		this.senha = senha;

		favoritos = new ArrayList<>();

	}

	// Gets e Sets
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getForma_pagamento() {
		return forma_pagamento;
	}

	public void setForma_pagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Video> getFavoritos() {
		return favoritos;
	}

	public void setFavoritos(List<Video> favoritos) {
		this.favoritos = favoritos;
	}

	public List<Video> getHistorico_visualizacao() {
		return historico_visualizacao;
	}

	public void setHistorico_visualizacao(List<Video> historico_visualizacao) {
		this.historico_visualizacao = historico_visualizacao;
	}

	// Metodos para atendimento dos requisitos funcionais
	public void cadastrar_usuario(Usuario usuario) {

		this.codigo = usuario.getCodigo();
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.forma_pagamento = usuario.getForma_pagamento();
		this.senha = usuario.getSenha();

	}

	public void adicionarFavoritos(Video video) {
		favoritos.add(video);
	}

	public void removerFavoritos(Video video) {
		favoritos.remove(video);
	}

	public void assitirVideo(Video video) {
		historico_visualizacao.add(video);
	}

	// Métodos relacionados aos requisitos funcionais
	public String exibir() {

		String retorno = "Codigo: " + codigo + "\n" +
				"Nome: " + nome + "\n" +
				"email: " + email + "\n" +
				"Forma Pagto: " + forma_pagamento + "\n" +
				"Senha: " + senha + "\n";

		return retorno;
	}

}
