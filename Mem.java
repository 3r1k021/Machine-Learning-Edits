package ast;

public class Mem extends Expr implements Node {
	Expr index;
	public Mem(Expr r) {
		addChild(r);
		index =r;
	}
}
