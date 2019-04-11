public abstract class Expression {
	public Expression simplify();
	public Expression substitute(Variable var, Expression value);
	public Expression multiply(Expression other);
	public Expression add(Expression other);
	public Expression addInverse();
	public Scalar approximate();
}
