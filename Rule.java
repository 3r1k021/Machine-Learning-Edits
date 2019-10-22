package ast;

/** A representation of a critter rule. */
@SuppressWarnings("unused")
public class Rule extends AbstractNode {
	private Condition cnd;
	private Command cmd;
	public Rule(Condition a, Command b)
	{
		cnd = (Condition)addChild(a);
		cmd = (Command)addChild(b);
	}

	@Override
	public StringBuilder prettyPrint(StringBuilder sb){
		sb.append(cnd.prettyPrint(sb).toString()+" --> "+cmd.prettyPrint(sb).toString());
		return sb;
	}
}
