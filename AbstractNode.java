package ast;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractNode implements Node {
	protected List<Node> children = new LinkedList<Node>();
	protected Node parent;

    @Override
    public int size() {
        int s = 1;
        if(children==null) return s;
        for(Node child : children) 
        {
        	s+=child.size();
        }
        return s;
    }

    @Override
    public Node nodeAt(int index) {
        // TODO Auto-generated method stub
    	//Should be Implemented by Pretty Printing
        return null;
    }

    @Override
    public StringBuilder prettyPrint(StringBuilder sb) {
        List<Node> nodes= getChildren();
        for (Node n: nodes){
            sb.append(n.prettyPrint(sb).toString());
        }

        return sb;
    }

    public String print(Node n){
        List<Node> nodes= getChildren();
        for (int i=0;i<nodes.size();i++){
            exp+=(nodes.get(i).print(nodes.get(i)));
        }
    }

    @Override
    public Node clone() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Node> getChildren() {
        return children;
    }

    /**
     * You can remove this method if you don't like it.
     *
     * Sets the children of this {@code Node}.
     *
     * @param children A list of the children this {@code Node}.
     */
    public void setChildren(List<Node> children) {
        this.children =  children;
    }
    /**
     * 
     * @param child Node containing child to be added
     * @return whether the child was added to list of children or not
     */
    public Node addChild(AbstractNode child) {
    	children.add(child);
    	child.setParent(this);
    	return child;
    }

    @Override
    public Node getParent() {
    	return parent;
    }

    /**
     * You can remove this method if you don't like it.
     *
     * Sets the parent of this {@code Node}.
     *
     * @param p the node to set as this {@code Node}'s parent.
     */
    public void setParent(Node p) {
        parent = p;
    }
}
