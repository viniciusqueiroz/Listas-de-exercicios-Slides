package mlp;

public class Aluno{
	private String nome;
	private String cpf;
	private int idade;
	private Curso curso;
	
	
	public Aluno(String nome, String cpf, int idade, String nomeCurso, String codigo){
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		Curso novo = new Curso(nomeCurso, codigo);
		this.curso = novo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void getCurso() {
		System.out.println("CODIGO -"+curso.getNome());
		System.out.println("CURSO -"+curso.getCodigo());
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
