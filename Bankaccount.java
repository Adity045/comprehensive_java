public class Bankaccount {
    int accountNumber;
    String holderName;
    double balance;

    Bankaccount() {
        accountNumber = 0;
        holderName = "Unknown";
        balance = 0.0;
        
    }
Bankaccount(int accountNumber,String holderName,double balance){
    this.accountNumber = accountNumber;
    this.holderName = holderName;
    this.balance = balance;
}
void deposite(double amount){
    balance = balance + amount;
    System.out.println("Amount deposited:"+amount);
}
void withdraw(double amount){
    if (amount <= balance){
        balance = balance - amount;
        System.out.println("Amount withdrawn:"+amount);
    }else{
        System.out.println("Insufficient balance");
    }
}
void displayDeatails(){
    System.out.println("Account Number:"+accountNumber);
    System.out.println("Holder Nmae:"+holderName);
    System.out.println("Balance:"+balance);
}
}
class Test{
    public static void main(String[]args){
        Bankaccount acc1 = new Bankaccount();
        acc1.displayDeatails();
        System.out.println();

        Bankaccount acc2 = new
        Bankaccount(101,"Aditya",5000);
        acc2.deposite(2000);
        acc2.withdraw(1500);
        acc2.displayDeatails();
    }
}