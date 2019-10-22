package ast;
@SuppressWarnings("unused")
public class Action extends AbstractNode implements Node {
	private String dothis;
	public Action(String action) {dothis = action;}

	@Override
	 public StringBuilder prettyPrint(StringBuilder sb){
        	sb.append(dothis+" ");
		 if (this.getChildren().size()>0){
			sb.append("[");	 
		 }
		for (Node n : this.getChildren()){
			
			sb.append(n.prettyPrint(sb).toString());
		}
		 
		 if (this.getChildren().size()>0){
			sb.append("]");	 
		 }
		return sb;
    	}
}
