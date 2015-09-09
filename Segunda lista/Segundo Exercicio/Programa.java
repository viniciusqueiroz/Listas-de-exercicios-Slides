package mlp;

public class Programa {

	public static void main(String[] args) {
		Aluno vinicius = new Aluno("Vinicius","084-235-074-33",27,"MLP","2a3f");
		System.out.println("NOME -"+vinicius.getNome());
		System.out.println("CPF - "+vinicius.getCpf());
		System.out.println("IDADE - "+vinicius.getIdade());
		vinicius.getCurso();
	}
}
