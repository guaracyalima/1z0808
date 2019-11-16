class MenorEscopo {
	static int x = 15;

	public static void main(String[] x) {
		x = 200;
		System.out.println(x);

		//a = compila e roda, imprimindo 200
		//
		// Na verdade não compila, pois assume-se que o x
		// do menor escopo é um array de string, e não um inteiro;
		// imprimindo o erro:
		//  error: incompatible types: int cannot be converted to String[]
	}
}
