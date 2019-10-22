package ast;


public class Number extends Expr implements Node {
	@SuppressWarnings("unused")
	private int nombre;
	public Number(int n) {
		nombre = n;
	}

}
