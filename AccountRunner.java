class Account {
    double balance;
    String rupees;

    public Account(){
        balance=200;
        rupees="Rs";
    }

    public Account(double b, String r){
        balance=b;
        rupees=r;
    }

    public void withdrawBalance(double amount){
        if (amount<=balance){
            balance-=amount;
        }
        else{System.out.println("Insufficeinct balance");
        }
    }

    public void depositBalance(double amount){
        balance+=amount;
    }

    public void displayBalance(){
        System.out.println(balance);
    }
}

public class AccountRunner{
    public static void main(String[] args) {
        Account a1=new Account();
        a1.withdrawBalance(200);
        a1.depositBalance(20);
        a1.displayBalance();
    }
}


