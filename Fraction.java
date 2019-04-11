public class Fraction extends Expression {
	private Expression numerator;
	private Expression denominator;

	public Fraction(Expression numerator, Expression denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public Fraction reciprocal() {
		return new Fraction(denominator, numerator);
	}

	public Fraction add(Fraction other) {

	}
}
