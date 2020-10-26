import java.lang.Math;

// Activity 1
public class TestBankAccount{

 public static void main(String[] args){
  BankAccount obj = new BankAccount();
   obj.depositmoney(100);
   obj.withdrawmoney(50);
   obj.depositmoney(110);
   obj.depositmoney(220);
   obj.withdrawmoney(100);
   obj.depositmoney(70);
   obj.withdrawmoney(150);
   obj.depositmoney(140);
   obj.depositmoney(230);
   obj.withdrawmoney(100);
   obj.depositmoney(180);
   obj.depositmoney(220);
   obj.withdrawmoney(190);
   obj.deductMonthlyCharge();
   obj.getBalance();


 }
}
