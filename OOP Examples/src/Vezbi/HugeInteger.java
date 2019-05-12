package Vezbi;

import java.util.Arrays;
//import java.util.Scanner;
import java.util.Random;

public class HugeInteger {
	
	Random gen = new Random(); 
	int niza = gen.nextInt(40);

	private int arrayNum[] = new int[niza];

	public HugeInteger() {
		super();
	}

	public HugeInteger(int[] arrayNum) {
		super();
		this.arrayNum = arrayNum;
	}

	public int[] getArrayNum() {
		return arrayNum;
	}

	public void setArrayNum(int[] arrayNum) {
		this.arrayNum = arrayNum;
	}

	@Override
	public String toString() {
		for (int i = 0; i < arrayNum.length; i++)
			System.out.println(arrayNum[i]);
		return "HugeInteger [arrayNum=" + Arrays.toString(arrayNum) + "]";
	}

	public HugeInteger insertt(HugeInteger ab) {
		
		System.out.println(niza);
		
		int[] a = new int[niza];
		HugeInteger rez = new HugeInteger(); 
		
		for (int i = 0; i < a.length ; i++)
		{
			int randomNum= gen.nextInt(1000);
			a[i]=randomNum;
		}
		
		System.out.println("Array elements are : ");
		ab.setArrayNum(a);
		for (int i = 0; i < ab.getArrayNum().length; i++)
			rez.getArrayNum()[i] = ab.getArrayNum()[i];
			return rez ;
 
	}

	public HugeInteger coll(HugeInteger ab, HugeInteger cd)

	{
		HugeInteger rez = new HugeInteger();

		for (int i = 0; i < ab.getArrayNum().length; i++) {

			System.out.println(ab.getArrayNum()[i] + " " + cd.getArrayNum()[i]);
			rez.getArrayNum()[i] = ab.getArrayNum()[i] + cd.getArrayNum()[i];

		}
		return rez;
	}

	public HugeInteger sub(HugeInteger ab, HugeInteger cd)

	{
		HugeInteger rez = new HugeInteger();

		for (int i = 0; i < ab.getArrayNum().length; i++) {

			System.out.println(ab.getArrayNum()[i] + " " + cd.getArrayNum()[i]);
			rez.getArrayNum()[i] = ab.getArrayNum()[i] - cd.getArrayNum()[i];

		}
		return rez;
	}

	public boolean isEqual(HugeInteger ab, HugeInteger cd)

	{

		if (Arrays.equals(ab.getArrayNum(), cd.getArrayNum())) {
			return true;

		} else
			return false;

	}
	public boolean isNotEqualTo(HugeInteger ab, HugeInteger cd)

	{

		if (!Arrays.equals(ab.getArrayNum(), cd.getArrayNum())) {
			return true;

		} else
			return false;
	}
		
/*		public boolean isGreaterThan(HugeInteger ab, HugeInteger cd)

		{

			if (Arrays.cc(ab.getArrayNum(), cd.getArrayNum())) {
				return false;

			} else
				return true;

	}*/
	

}
