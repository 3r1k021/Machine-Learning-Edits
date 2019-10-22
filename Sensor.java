package ast;

public abstract class Sensor extends Expr implements Node {
	Expr value;
	public Sensor(Expr val) {
		addChild(val);
		value =  val;
	}
	public Sensor() {};


	@Override
	public StringBuilder prettyPrint(StringBuilder sb){
		sb.append(this.getType()+" ");
		if (this.getChildren().size()>0){
			sb.append("[ ");
		}
		for (Node n : this.getChildren()){

			sb.append(n.prettyPrint(sb).toString());
		}

		if (this.getChildren().size()>0){
			sb.append(" ]");
		}
		return sb;
	}
}
