package classes_and_objects;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	
	public void setNumerator(int num) {
		numerator = num;
		simplify();
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public void setDenominator(int num) {
		if(num == 0) {
			//throw error
			return;
		}
		denominator = num;
		simplify();
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void add(Fraction f2) {
		this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simplify();
	}
	
	private void simplify() {
		int gcd = 1;
		int smaller = Math.min(numerator, denominator);
		
		for(int i=2;i<=smaller;i++) {
			if(numerator%i == 0 && denominator%i == 0) {
				gcd = i;
			}
		}
		numerator = numerator/gcd;
		denominator = denominator/gcd;
	}
	
	public void increment() {
		this.numerator = this.numerator + this.denominator;
		simplify();
	}
	
	public void print() {
		System.out.println(numerator + "/" + denominator );
	}
}
