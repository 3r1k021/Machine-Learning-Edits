package ast;
@SuppressWarnings("unused")
public class Expression extends Expr implements Node {

	private int number;
	public void setnumber(int n) {
		number = n;
	}
	public Expression(int n) {
		number = n;
	}
	public Expression() {
	}

	@Override
	public StringBuilder prettyPrint(StringBuilder sb){
		Node par=this.getParent();
		String name=par.getClass().getName();
		if (name.equals("Sensor") || name.equals("Mem")){
			sb.append("[ ");
			for (Node n : this.getChildren()){

				sb.append(n.prettyPrint(sb).toString());
			}
			sb.append(" ]");
		}else if (name.equals("AddOp") || name.equals("MulOp")){
			sb.append("( ");
			for (Node n : this.getChildren()){

				sb.append(n.prettyPrint(sb).toString());
			}
			sb.append(" )");
		}else{
			for (Node n : this.getChildren()){

				sb.append(n.prettyPrint(sb).toString());
			}
		}

		return sb;
	}
}
