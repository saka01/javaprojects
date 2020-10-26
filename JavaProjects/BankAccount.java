import java.lang.Math;

// Activity 1
public class BankAccount{

  private double transc_fee = 10.00;
  private int number_of_free_transc = 10;
  private int number_of_trasc;
  private double init_trasc_fee;
  private double deposit;
  private double withdrawal;
  private double AccountBalance = 0.00;

  public BankAccount(){
   init_trasc_fee = 0.50;
   AccountBalance = AccountBalance - init_trasc_fee;
   System.out.println("Current Account Balance after creating the account is: " + AccountBalance);
  }

  public void depositmoney(double deposit){

    this.deposit=deposit;
    number_of_trasc++;
    AccountBalance = AccountBalance + deposit;
    System.out.println("Depositing " + deposit + "...\n");

    System.out.println("Current Account Balance after deposit is: " + AccountBalance);

  }

  public void withdrawmoney(double withdrawal){

    this.withdrawal=withdrawal;
    AccountBalance = AccountBalance - withdrawal;
    number_of_trasc++;
    System.out.println("Withdrawing " + withdrawal + "...\n");

    System.out.println("Current Account Balance after withdrawal is: " + AccountBalance);

  }

  public void deductMonthlyCharge(){

    double feesCharged = Math.max(number_of_trasc, number_of_free_transc) - number_of_free_transc;
    AccountBalance = AccountBalance - feesCharged * transc_fee;
    number_of_trasc = 0;
    System.out.println("Calculating Monthly charge...");
    System.out.println("Monthly charge is " + feesCharged*transc_fee);


    System.out.println("Current Account Balance after monthly charge is: " + AccountBalance);

    }

  public  void setTransactionFee(double fee)
{
transc_fee = fee;
}

public double getBalance(){
  return AccountBalance;
}



 public static void main(String[] args){
  BankAccount obj = new BankAccount();
   obj.depositmoney(100);
   obj.withdrawmoney(50);
   obj.deductMonthlyCharge();

 }
}
