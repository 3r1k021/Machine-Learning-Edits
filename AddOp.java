package ast;
@SuppressWarnings("unused")
public class AddOp extends Expr implements Node {
	private Expr t1,t2;
	private Operator me;
	public AddOp(Expr a, Operator o, Expr b) {
		addChild(a);
		addChild(b);
		t1 = a;
		t2 = b;
		me = o;
	}

	@Override
	public StringBuilder prettyPrint(StringBuilder sb) {
		if (me==Operator.PLUS){
			sb.append("+ ");
		}else{
			sb.append("- ");
		}
		return sb;
	}

	public enum Operator{
		PLUS,
		MINUS;
}
}