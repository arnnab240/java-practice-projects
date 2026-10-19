import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double balance=1000.00;
		boolean run= true;
		String hc="y";
		while(hc.equalsIgnoreCase("y")) {
			while(run) {
				System.out.println("select from below");
				System.out.println("1:Check Balance");
				System.out.println("2:withdraw Money");
				System.out.println("3:Deposit Money");
				System.out.println("4:Exit");
				int res=sc.nextInt();
				
				switch(res) {
				case 1:System.out.println("The net balance is"+balance);break;
				case 2:System.out.println("Enter the amount to withdraw");
				int withdraw=sc.nextInt();
				if(balance> withdraw) {
					balance= balance-withdraw;
					System.out.println("Withdrawl sucessfull...");
				}
				else {
					System.out.println("no suficient amount");
					run= false;
				}
				;break;
				case 3:System.out.println("Enter the amount u want to deposit");
				int deposit=sc.nextInt();
				balance=balance+deposit;
				System.out.println("the amount deposited sucessfully");break;
				
				case 4:System.out.println("Thanks for using ATM...");
				run=false;break;
				default:System.out.println("Invalid choise");run=false;
				
				}
			

			}
						System.out.println("do u want to continue...y/n");
			sc.nextLine();
			hc=sc.nextLine();
			if(hc.equalsIgnoreCase("y")) {
				run=true;
			
		}
		
			
			
		}
		
		// TODO Auto-generated method stub

	}
}


