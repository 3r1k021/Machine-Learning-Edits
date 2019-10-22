package ast;

public class Update extends AbstractNode implements Node {
	private Expr index;
	private Expr assigned;
	public Update(Expr i, Expr a) {
		this.index = i;
		this.assigned = a;
		addChild(i);
		addChild(a);
	}

	@Override
	public StringBuilder prettyPrint(StringBuilder sb) {
		sb.append("mem[ "+index.prettyPrint(sb).toString()+" ] :="+assigned.prettyPrint(sb).toString());
		return sb;
	}

}
