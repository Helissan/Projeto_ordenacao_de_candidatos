package projeto2unidade;

public class Pessoa {

	private String nome;
	private int idade;
	private String sexo;
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void incrementoidade() {
		idade = idade + 1;		
	}
	
	public Pessoa() {
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
}
