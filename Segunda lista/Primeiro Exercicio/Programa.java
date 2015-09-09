package mlp;

public class Programa {

	public static void main(String[] args) {
		Conta vinicius = new Conta("123311",3244.00);
		vinicius.creditar(100);
		System.out.println(vinicius.getSaldo());
		vinicius.debitar(500);
		System.out.println(vinicius.getSaldo());
	}

}
