package Vezbi;

//import java.util.*;
//import java.lang.*;

public class Rational {

	private int numerator;
	private int denominator;

	public Rational() {
		super();
		this.numerator = 1;
		this.denominator = 1;

	}

	public static int gcd(int a, int b) {
		if (a == 0)
			return b;

		return gcd(b % a, a);
	}

	public Rational(int numerator, int denominator) {

		super();

		int gcdNum = gcd(numerator, denominator);
		int num = numerator / gcdNum;
		int denum = denominator / gcdNum;
		if (denum < 0) {
			denum *= (-1);
			num *= -1;
		}
		this.numerator = num;
		this.denominator = denum;

	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {

		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		if (denominator < 0) {
			denominator = denominator * (-1);
			numerator *= -1;
		}

		this.denominator = denominator;
	}

	public String toString() {
		if (numerator == denominator) {
			return +numerator + "/" + denominator + " = 1";
		}
		if (denominator == 1) {
			return +numerator + "/" + denominator + " = " + numerator;
		}
		return +numerator + "/" + denominator;
	}

	public Rational sum(Rational x, Rational y) {
		Rational suma = new Rational();
		int de = (x.getDenominator() * y.getDenominator());
		int numer1 = (x.getNumerator() * (de / x.getDenominator()));
		int numer2 = (y.getNumerator() * (de / y.getDenominator()));
		suma.setNumerator(numer1 + numer2);
		suma.setDenominator(de);
		return simple(suma);
	}

	public Rational subtraction(Rational x, Rational y) {
		Rational sub = new Rational();
		int de = (x.getDenominator() * y.getDenominator());
		int numer1 = (x.getNumerator() * (de / x.getDenominator()));
		int numer2 = (y.getNumerator() * (de / y.getDenominator()));
		sub.setNumerator(numer1 - numer2);
		sub.setDenominator(de);
		return simple(sub);
	}

	public Rational multiply(Rational x, Rational y) {
		Rational rez = new Rational();
		int numer = (x.getNumerator() * y.getNumerator());
		int denom = (x.getDenominator() * y.getDenominator());
		rez.setNumerator(numer);
		rez.setDenominator(denom);
		return simple(rez);
	}

	public Rational division(Rational x, Rational y) {
		Rational rez = new Rational();
		int numer = (x.getNumerator() * y.getDenominator());
		int denom = (x.getDenominator() * y.getNumerator());
		rez.setNumerator(numer);
		rez.setDenominator(denom);
		return simple(rez);
	}

	public Rational simple(Rational s) {
		Rational rez = new Rational();
		int gcdNum = gcd(s.getNumerator(), s.getDenominator());
		int num = s.getNumerator() / gcdNum;
		int denum = s.getDenominator() / gcdNum;
		rez.setNumerator(num);
		rez.setDenominator(denum);
		return rez;
	}

}
