package ast;
@SuppressWarnings("unused")
public class MulOp extends Expr implements Node {
	private Expr t1,t2;
	private Operator me;
	public MulOp(Expr a, Operator o,Expr b) {
		addChild(a);
		addChild(b);
		me = o;
	}
	public enum Operator{
		MUL,
		DIV,
		MOD;
	}

	@Override
	public StringBuilder prettyPrint(StringBuilder sb) {
		if (me==Operator.MUL){
			sb.append("* ");
		}else if (me==Operator.DIV){
			sb.append("/ ");
		}else{
			sb.append("mod ");
		}
		return sb;
	}
}
