
public class Exercicio008 {

	public static void main(String[] args) {
		System.out.println(imprimir (0));
	}
	
	private static int imprimir(int n) {
		for (int i = 100; i >= 0; i--){

			System.out.println(n+ i--);
			}
		return n;
	}
}
