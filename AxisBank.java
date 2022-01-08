package week3.day1.assignment;

public class AxisBank extends BankInfo{
	public void deposit()
	{
		System.out.println("amount deposited in axis bank");
	}

	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		//overridden
		bank.deposit();
		
		bank.fixed();
		bank.savings();
		
		//call from parent method
		BankInfo bf=new BankInfo();
		bf.deposit();
		
	}

}
