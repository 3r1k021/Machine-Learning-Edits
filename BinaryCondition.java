package ast;

/** A representation of a binary Boolean condition: 'and' or 'or' */
public class BinaryCondition extends Condition {
	Operator o;

    /**
     * Create an AST representation of l op r.
     *
     * @param l
     * @param op
     * @param r
     */
    public BinaryCondition(Condition l, Operator op, Condition r) {
        addChild(l);
        addChild(r);
        o = op;
    }

    /** An enumeration of all possible binary condition operators. */
    public enum Operator {
        OR,
        AND;
    }

    @Override
    public StringBuilder prettyPrint(StringBuilder sb){
        if (o==Operator.OR) {
            List<Node> leftRight = this.getChildren();
            sb.append(leftRight.get(0).prettyPrint(sb).toString() + " or " + leftRight.get(1).prettyPrint(sb).toString());
        }else{
            List<Node> leftRight = this.getChildren();
            sb.append(leftRight.get(0).prettyPrint(sb).toString() + " and " + leftRight.get(1).prettyPrint(sb).toString());
        }
        return sb;
    }
}
