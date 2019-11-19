package projeto2unidade;

public class Candidato extends Pessoa {

	private int numero;
	private String partido;
	private int votos;
	
	public Candidato() {
		super();
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getPartido() {
		return partido;
	}
	
	public void setPartido(String partido) {
		this.partido = partido;
	}
		
	public int getVotos() {
		return votos;
	}
	
	public void setVotos(int votos) {
		this.votos = votos;
	}
	
	public void incrementovotos() {
		votos = votos + 1;
	}
	
	public void Exibe() {
		System.out.println("O número do candidato é: " + this.getNumero());
		System.out.println("O nome do candidato é: " + this.getNome());
		System.out.println("O partido do candidato é: " + this.getPartido());
		System.out.println("O número de votos atual é de: " + this.getVotos());
		System.out.println(" ");
	}
	
	public void Exibefinal() {
		System.out.println(getNome() + " - " + getVotos());
	
	}
	
	public Candidato(String nome, int idade, String sexo, int numero, String partido) {
		super(nome, idade, sexo);
		this.numero = numero;
		this.partido = partido;
		votos = 0;
	}
}
