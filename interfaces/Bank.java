package interfaces;

public interface Bank {
String accountType= "saving";
String accountype=  "current";

public void withdrawMoney();
public void depoasiteMoney();
public void transferMoney();
public void OpenfixedDeposite();
void OpenRecurringDeposite();// by default it is public
void OpenbankAccount();
void ClosebankAccount();
void CalculareInterestAmmount();
void DefinedInterestrates();
// interfaces naming convention is pascal case



}

