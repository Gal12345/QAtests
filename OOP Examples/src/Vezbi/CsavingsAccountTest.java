package Vezbi;
import Vezbi.CsavingsAccount;
public class CsavingsAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=63;
		int b=78;
		int c=2;
		int d=4;
		CsavingsAccount ob = new CsavingsAccount();
		CsavingsAccount ob1 = new CsavingsAccount(a,b);
		CsavingsAccount ob2 = new CsavingsAccount(c,d);
		CsavingsAccount ob3 = new CsavingsAccount(c,d);
		/*ob1.modifyInterestRate(5.20);
		System.out.println(ob1.getmAnnualInterestRate());*/
		System.out.println(ob.isGreater(ob1, ob2) + ob.isGreater(ob1, ob3) + " broj objekti " + ob.numOfInstances());
		
	}

}
