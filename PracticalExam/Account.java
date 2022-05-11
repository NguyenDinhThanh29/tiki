import java.util.Scanner;
public class Account {
    private String customerCode;
    private String customerName;
    private int accNumber;
    private long amount = 0;//default amount

    public void input(){
        Scanner ip = new Scanner(System.in);
        do {
            System.out.println("Enter your Code: ");
            customerCode = ip.next();
            System.out.println("Enter your Name: ");
            customerName = ip.next();
            System.out.println("Enter your account number: ");
            accNumber = ip.nextInt();
            System.out.println("Enter your amount: ");
            amount = ip.nextLong();
        } while (accNumber<100000 || accNumber > 101000|| customerCode.length() <= 5 );
    }

    public void DepositAndWithdraw(){
        long money;
        int type;
        Scanner ip = new Scanner(System.in);
        System.out.println("What service do you want:");
        System.out.println("0.Deposit \t \t  1.Withdraw");
        type = ip.nextInt();
        System.out.println("Enter money: ");
        money = ip.nextLong();
        if (type == 0){
            System.out.println("You choose deposit "+ money+ " to your amount");
            System.out.println("Success");
            amount = money + amount;
            System.out.println("Your amount: "+ amount);
        }

        if (type == 1){
            if (money > amount){
                System.out.println("Non-sufficient funds");
            }
            else if (money <= amount) {
                System.out.println("You choose withdraw "+ money +" from your amount");
                System.out.println("Success");
                amount = amount - money;
                System.out.println("Amount: "+ amount);
            }
        }

        System.out.println("======End=====");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}