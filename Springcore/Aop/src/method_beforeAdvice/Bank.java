package method_beforeAdvice;

public class Bank {
	private int amount=5000;
	private String accNo="sbi123";
	
	public int deposit(String accNo ,int amount ) 
	{
		if(accNo.equals(this.accNo))
		{
			System.out.println("in Deposit method");
			this.amount=this.amount+amount;
			return this.amount;
		}
		else
		{
			throw new  AcNotFoundException();
		}
	}

}
