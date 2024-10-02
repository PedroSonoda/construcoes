package Construtores;

public class Pessoa {
	private String nome;
	private int Idade;

	//Construtor padrão é criado mesmo que não explicitado

	public Pessoa(){
	}
	// Método construtor com argumento
	public Pessoa (String nome) {
		this.nome = nome;
	}
	public Pessoa (String nome, int idade) {
		this.nome = nome;
		this.Idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome (String nome) {
		this.nome =  nome;
	}
	public int getIdade() {
		return Idade ;
	}
	public void setIdade(int idade) {
		this.Idade = idade;
	}
}
