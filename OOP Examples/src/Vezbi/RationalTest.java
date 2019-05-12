package Vezbi;

public class RationalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=4;
		int c=1;
		int d=-4;
		Rational ob = new Rational();
		Rational ob1 = new Rational(a,b);
		Rational ob2 = new Rational(c,d);
		
		System.out.println(ob);
		System.out.println("First number: " + ob1.toString() + " Second number: " + ob2.toString());
		System.out.println("The sum is: " + ob1.sum(ob1,ob2));
		System.out.println("The subtraction is: " + ob.subtraction(ob1,ob2));
		System.out.println("The multiplication is: " + ob.multiply(ob1,ob2));
		System.out.println("The division is: " + ob.division(ob1,ob2));
		
		
	}

}
