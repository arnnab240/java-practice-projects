import java.util.Scanner;
public class menu {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int amount=0;
		boolean run=true;
		String hc="y";
		while(hc.equalsIgnoreCase("y")) {
			
			while(run) {
				System.out.println("-----WELCOME TO BILY BURGERS-----");
				System.out.println("1-Burger:$5");
				System.out.println("2-Pizza:$8");
				System.out.println("3-Fries:$3");
				System.out.println("4-Soda:$2");
				System.out.println("5-Finish");
				System.out.print("chose the food you want..");
				int res=sc.nextInt();
				switch(res) {
				case 1:System.out.println("enter the quantity of burger..");
				sc.nextLine();
				int no=sc.nextInt();
				amount=amount+(5*no);
				break;
				
				
				case 2:System.out.println("enter the amount of pizza...");
				sc.nextLine();
				no=sc.nextInt();
				amount=amount+(8*no);break;
				
				case 3:System.out.println("enter the amount of fries...");
				sc.nextLine();
				no=sc.nextInt();
				amount=amount+(3*no);
				break;
				
				
				
				case 4:System.out.println("enter the amount of soda...");
				sc.nextLine();
				 no=sc.nextInt();
				 amount=amount+(2*no);
				break;
				
				case 5:System.out.println("Thanks for your order...");
				run=false;break;
				
				default:System.out.println("the item does not exist");
				
				
				
				
				}
				System.out.println("the total bill is.. $"+amount);
			}
			
			
			sc.nextLine();
			System.out.println("do u want to order again...y/n");
			hc=sc.nextLine();
			if(hc.equalsIgnoreCase("y")) {
				run=true;
			}
		}
		sc.close();
		
		

	}

}
