package Vezbi;

import java.lang.String;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array1[] = { "eden", "eden1" };
		String array2[] = { "dva", "dva2" };
		String array3[] = { "tri", "tri3" };

		String type1 = "1";
		String type2 = "2";
		String type3 = "3";

		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		Computer ob1 = new Computer();
		Computer ob2 = new Computer(type2, num2);
		Computer ob3 = new Computer(type3, num3, array3);

		ob1.setType(type1);
		ob1.setProcSpeed(num1);
		ob1.setFiles(array1);
		ob2.setFiles(array2);

	/*	for (int i = 0; i < ob1.getFiles().length; i++) {
			System.out.println("Type1: " + ob1.getType() + " Proc Speed 1 : " + ob1.getProcSpeed() + " Array1: "
					+ ob1.getFiles()[i].toString());
		}

		for (int i = 0; i < ob2.getFiles().length; i++) {
			System.out.println("Type1: " + ob2.getType() + " Proc Speed 2 : " + ob2.getProcSpeed() + " Array1: "
					+ ob2.getFiles()[i].toString());
		}
		for (int i = 0; i < ob3.getFiles().length; i++) {
			System.out.println("Type1: " + ob3.getType() + " Proc Speed 3 : " + ob3.getProcSpeed() + " Array1: "
					+ ob3.getFiles()[i].toString());
		} */

		System.out.println(ob1.toString());
		System.out.println(ob2.toString());
		System.out.println(ob3.toString());
		
		
	}

}
