public class Complex extends Expression {
	private double r;
	private double i;

	public Complex(double r, double i) {
		this.r = r;
		this.i = i;
	}

	@Override
	public Expression simplify() {
		return this;
	}
	@Override
	public Scalar approximate() {
		return this;
	}
	@Override
	public Expression substitute(Variable var, Expression value) {
		return this;
	}

	public double magnitude() {
		return Math.sqrt(r * r + i * i);
	}

	@Override
	public Expression multiply(Scalar other) {
		return new Scalar(r * other.r - i * other.i,
			i * other.r + r * other.i);
	}

	@Override
	public Expression add(Scalar other) {
		return new Scalar(r + other.r, i + other.i);
	}

	public Scalar subtract(Scalar other) {
		return new Scalar(r - other.r, i - other.i);
	}

	@Override
	public Expression addInverse() {
		return new Scalar(-r, -i);
	}

	public boolean isInteger() {
		return i == 0 && (r % 1 == 0);
	}

	public Integer integer() {
		if(!isInteger()) throw new RuntimeException("Scalar has imaginary component or non-integer real component.");
		return Integer((long)r);
	}

	//Fetch real and imaginary components
	public double real() {
		return r;
	}
	public double imag() {
		return i;
	}
}
