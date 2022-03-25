package interfaces;

public  abstract class HDFC implements Bank  {

	@Override
	public void withdrawMoney() {
		// TODO Auto-generated method stub
		
	}
// apart from implementing the method inside interface you can keep own method for specific class(for HDFC)
	public void OpenFlexibleFixedDepositeAccount() {
		
		// but you must keep methods of interface to your defined class.
		// if you remove abstract class of bank interface, will result compiler error 
		// for avoiding compiler error we ave to put abstract key like "public abstract class  implements Bank{}
	}
	@Override
	public void depoasiteMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OpenfixedDeposite() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OpenRecurringDeposite() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OpenbankAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ClosebankAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CalculareInterestAmmount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DefinedInterestrates() {
		// TODO Auto-generated method stub
		
	}
	

}
