import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
class useraccount
{
	public void withdraw(double amount,double balance)
	{
		 
        if (balance >= amount) {
            balance = balance -amount;
            System.out.println("Please collect your money and collect the card");
			 displayBalance(balance);
        }
        else {
            System.out.println("Sorry! Insufficient Funds");
            System.out.println();
        }
       
	}
	public void deposite(double damount,double balance)
	{
		
        balance = balance + damount;
        System.out.println("Your Money has been successfully deposited");
        displayBalance(balance);
	}
	public void displayBalance(double balance)
	{
		System.out.println("Your balance is :-"+balance);
	}
}
public class ATM
{
	public static void main(String[] args)  throws IOException
	{
		int tries=1;
		int pin=1234;
		System.out.println("ATM Machine"); 
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name :-");
		String name = bufferedReader.readLine();
		
		System.out.println("Enter your account number :-");
		double ac = Double.parseDouble(bufferedReader.readLine());
		
		System.out.println("Enter password :-");
		double pass = Double.parseDouble(bufferedReader.readLine());
		while(tries<3 && pass!=pin)
		{
			System.out.println("INCORRECT PIN. TRY AGAIN.");
            System.out.println("Enter password :- ");
			pass = Double.parseDouble(bufferedReader.readLine());
			tries++;
		}
		if(pass==pin)
		{
			System.out.println("Welcome!Your login is successfully done...");
			System.out.println("1. WITHDRAW MANY");
			System.out.println("2. DEPOSITE MANY");
			System.out.println("3. CHECK BALANCE");
			System.out.println("Enter your choice :-");
			int ch = Integer.parseInt(bufferedReader.readLine());  
			double amount,balance=16000,damount;
			useraccount us=new useraccount();
			Scanner sc = new Scanner(System.in);
			
			switch(ch)
			{
				case 1:
						System.out.println("Withdrawn Operation:");
						System.out.println("Withdrawing Amount :- ");
						amount=sc.nextDouble();
						us.withdraw(amount,balance);
				break;
				case 2:
						System.out.println("Deposit Operation:");
						System.out.println("Depositing Amount : ");
						damount=sc.nextDouble();
						us.deposite(damount,balance);
				break;
				case 3:us.displayBalance(balance);
				break;
				default:
				System.out.println("Invalid choice");
				
			}
		}
		else if (tries >3)
		{
            System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
		}
		
	}
}