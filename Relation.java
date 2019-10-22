package ast;
@SuppressWarnings("unused")
public class Relation extends Condition implements Node {
	private Expr r;
	private Expr l;
	private Operator op;
    /**
     * Create an AST representation of l op r.
     *
     * @param l
     * @param op
     * @param r
     */
    public Relation(Expr l, Operator op, Expr r) {
        this.l = l;
        this.r = r;
        this.op = op;
        this.addChild(l);
        this.addChild(r);
    }

    /** An enumeration of all possible binary condition operators. */
    public enum Operator {
        LT,
        LE,
        EQ,
        GE,
        GT,
        NE;
    }

    @Override
    public StringBuilder prettyPrint(StringBuilder sb) {
        if (op==Operator.LT){
            sb.append("< ");
        }else if (op==Operator.LE){
            sb.append("<= ");
        }else if (op==Operator.EQ){
            sb.append("= ");
        }else if (op==Operator.GE) {
            sb.append(">= ");
        }else if (op==Operator.GT) {
            sb.append("> ");
        }else if (op==Operator.NE) {
            sb.append("!= ");
        }
        return sb;
    }
}