
public class Exercicio007 {

	public static void main(String[] args) {
		System.out.println(imprimir (0));
	}
	
	private static int imprimir(int n) {
		for (int i = 1; i <= 100; i++){

			System.out.println(n+ i++);
			}
		return n;
	}
}