package interfaces;

public class demo {
/* we can't create method with body iside interface
 * we can't crate object for interfaces
 * we can't create constructor for interface
 * we acces interface in anoter class by implements keyword 
 * bank interface and its method can access by HdFC and ICICI by implements key and specifically HDFC can also have ow method 
 * along with method of bank interface.
 * New keyword not  accepted 
 * we can create object for HDFC in ICICI ;  Bank bank = new HDFCBANK();
 */
	public static void main(String[]args) {
		
          icici bank= new icici();
          //Bank bank = new Bank();// we can not create object for interface
          bank.CalculareInterestAmmount();
          bank.ClosebankAccount();
          bank.DefinedInterestrates();
          bank.depoasiteMoney();
          bank.OpenbankAccount();
          bank.OpenfixedDeposite();
          bank.OpenRecurringDeposite();
          bank.transferMoney();
          bank.withdrawMoney();
          
        // single class can implements multiple interface 
          // let two interface Bank1 and Bank2
          //create a class classA
          // public class classA implements Bank1,Bank2{
          //                }
          //
	
	
	}
}
