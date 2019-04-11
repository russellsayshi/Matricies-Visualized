public class Integer extends Expression {
	private long val;

	public Integer(long val) {
		this.val = val;
	}

	@Override
	public Expression simplify() {
		return this;
	}

	@Override
	public Scalar approximate() {
		return scalar();
	}

	public Integer multiply(Integer other) {
		return new Integer(val * other.val);
	}

	public Integer mod(Integer mod) {
		return new Integer(val % other.val);
	}

	@Override
	public Expression add(Integer other) {
		return new Integer(val + other.val);
	}

	public Integer subtract(Integer other) {
		return new Integer(val - other.val);
	}

	@Override
	public Expression addInverse() {
		return new Integer(-val);
	}

	@Override
	public Expression substitute(Variable var, Expression value) {
		return this;
	}

	public Scalar scalar() {
		return new Scalar((double)val, 0);
	}
}
