package Vezbi;

public class CsavingsAccount {
	private static double mAnnualInterestRate;
	private double mSavingsBalance;
	private int mNumber;
    private static int count;
	
    public CsavingsAccount() {
		super();
		count++;
	}
	
    public static int numOfInstances() {
        return count;
    }

	public CsavingsAccount(double mAnnualInterestRate, double mSavingsBalance) {
		super();
		this.mAnnualInterestRate = mAnnualInterestRate;
		this.mSavingsBalance = mSavingsBalance;

	}

	CsavingsAccount(CsavingsAccount c) {
		mAnnualInterestRate = c.mAnnualInterestRate;
		mSavingsBalance = c.mSavingsBalance;
		mNumber = c.mNumber;
	}

	public double getmAnnualInterestRate() {
		return mAnnualInterestRate;
	}

	public void setmAnnualInterestRate(double mAnnualInterestRate) {
		this.mAnnualInterestRate = mAnnualInterestRate;
	}

	public double getmSavingsBalance() {
		return mSavingsBalance;
	}

	public void setmSavingsBalance(double mSavingsBalance) {
		this.mSavingsBalance = mSavingsBalance;
	}

	public int getmNumber() {
		return mNumber;
	}

	public void setmNumber(int mNumber) {
		this.mNumber = mNumber;
	}

	public String toString() {
		return "the Interest Rate is: " + mAnnualInterestRate + " The balance is: " + mSavingsBalance;
	}

	public CsavingsAccount calculateMonthlyInterest(CsavingsAccount c) {
		CsavingsAccount mi = new CsavingsAccount();
		double rez;
		double sb = c.getmSavingsBalance();
		double ai = c.getmAnnualInterestRate();
		rez = (sb * ai) / 12;
		sb += rez;
		mi.setmSavingsBalance(sb);
		mi.setmAnnualInterestRate(ai);
		return mi;
	}

	public static void modifyInterestRate(double ai) {

		mAnnualInterestRate = ai;
	}
	public String isGreater(CsavingsAccount x, CsavingsAccount y) {
		CsavingsAccount gr = new CsavingsAccount();
		double sb1 = x.getmSavingsBalance();
		double sb2 = y.getmSavingsBalance();
		if ( sb1 > sb2){
			return "pogolem e 1";
		} gr.setmSavingsBalance(sb2);
		return  "pogolem e 2";
	}
	
}
