import javax.swing.*;
import BreezySwing.*;

public class mainFractionComplex extends GBFrame {

	// JTextArea outputArea = addTextArea ("", 4,4,2,5);

	// fractions input
	JLabel Fraction1 = addLabel("Frac1", 1, 1, 1, 1);
	IntegerField num1 = addIntegerField(1, 2, 1, 1, 1);
	IntegerField denom1 = addIntegerField(1, 3, 1, 1, 1);

	JLabel Fraction2 = addLabel("Frac2", 1, 5, 1, 1);
	IntegerField num2 = addIntegerField(1, 2, 5, 1, 1);
	IntegerField denom2 = addIntegerField(1, 3, 5, 1, 1);

	// complex numbers input
	JLabel complex1 = addLabel("Complex1", 6, 2, 1, 1);
	JLabel complex2 = addLabel("Complex2", 6, 5, 1, 1);
	DoubleField complex1a = addDoubleField(0, 7, 1, 1, 1);
	DoubleField complex1b = addDoubleField(0, 7, 2, 1, 1);
	JLabel i1 = addLabel("i", 7, 3, 1, 1);

	DoubleField complex2a = addDoubleField(0, 7, 4, 1, 1);
	DoubleField complex2b = addDoubleField(0, 7, 5, 1, 1);
	JLabel i2 = addLabel("i", 7, 6, 1, 1);

	// Buttons
	JButton addFrac = addButton("Add", 5, 1, 1, 1);
	JButton subtractFrac = addButton("Subtract", 5, 3, 1, 1);
	JButton multiplyFrac = addButton("Multiply", 5, 5, 1, 1);
	JButton divideFrac = addButton("Divide", 5, 7, 1, 1);

	JButton addComp = addButton("Add", 10, 1, 1, 1);
	JButton subtractComp = addButton("Subtract", 10, 3, 1, 1);
	JButton multiplyComp = addButton("Multiply", 10, 5, 1, 1);
	JButton divideComp = addButton("Divide", 10, 7, 1, 1);

	public void buttonClicked(JButton buttonObj) {

		try {

			if (buttonObj == addFrac) {
				fraction frac1 = new fraction(num1.getNumber(), denom1.getNumber());
				fraction frac2 = new fraction(num2.getNumber(), denom2.getNumber());

				fraction frac3 = (fraction) frac1.add(frac2);
				frac3 = frac3.simplify();
				messageBox(frac3, 300, 200);

			}

			if (buttonObj == subtractFrac) {
				fraction frac1 = new fraction(num1.getNumber(), denom1.getNumber());
				fraction frac2 = new fraction(num2.getNumber(), denom2.getNumber());

				fraction frac3 = (fraction) frac1.subtract(frac2);
				frac3 = frac3.simplify();
				messageBox(frac3, 300, 200);

			}

			if (buttonObj == multiplyFrac) {
				fraction frac1 = new fraction(num1.getNumber(), denom1.getNumber());
				fraction frac2 = new fraction(num2.getNumber(), denom2.getNumber());

				fraction frac3 = (fraction) frac1.multiply(frac2);
				frac3 = frac3.simplify();
				messageBox(frac3, 300, 200);

			}
			if (buttonObj == divideFrac) {
				fraction frac1 = new fraction(num1.getNumber(), denom1.getNumber());
				fraction frac2 = new fraction(num2.getNumber(), denom2.getNumber());

				fraction frac3 = (fraction) frac1.divide(frac2);
				frac3 = frac3.simplify();
				messageBox(frac3, 300, 200);

			}

			if (buttonObj == addComp) {
				complexNumber num1 = new complexNumber(complex1a.getNumber(), complex1b.getNumber());
				complexNumber num2 = new complexNumber(complex2a.getNumber(), complex2b.getNumber());

				complexNumber num3 = (complexNumber) num1.add(num2);
				messageBox(num3, 300, 200);
			}

			if (buttonObj == subtractComp) {
				complexNumber num1 = new complexNumber(complex1a.getNumber(), complex1b.getNumber());
				complexNumber num2 = new complexNumber(complex2a.getNumber(), complex2b.getNumber());

				complexNumber num3 = (complexNumber) num1.subtract(num2);
				messageBox(num3, 300, 200);
			}
			if (buttonObj == multiplyComp) {
				complexNumber num1 = new complexNumber(complex1a.getNumber(), complex1b.getNumber());
				complexNumber num2 = new complexNumber(complex2a.getNumber(), complex2b.getNumber());

				complexNumber num3 = (complexNumber) num1.multiply(num2);
				messageBox(num3, 300, 200);
			}

			if (buttonObj == divideComp) {
				complexNumber num1 = new complexNumber(complex1a.getNumber(), complex1b.getNumber());
				complexNumber num2 = new complexNumber(complex2a.getNumber(), complex2b.getNumber());

				complexNumber num3 = (complexNumber) num1.divide(num2);
				messageBox(num3, 300, 200);
			}

		} catch (ArithmeticException e) {

			messageBox(e.getMessage());

		}

	}

	public static void main(String[] args) {

		JFrame frm = new mainFractionComplex();
		frm.setTitle("Calculator");
		frm.setSize(700, 200);
		frm.setVisible(true);
	}

}
