package classes_and_objects;

public class FractionUse {
	public static void main(String [] args) {
		Fraction f1 = new Fraction(4, 6);
		f1.print();
//		f1.setNumerator(12);
//		f1.getDenominator();
//		f1.increment();
		f1.print();
		
		Fraction f2 = new Fraction(4, 8);
		f1.add(f2);
		f1.print();
		
		Fraction f3 = new Fraction(3, 4);
		f1.multiply(f3);
		f1.print();
	}

}