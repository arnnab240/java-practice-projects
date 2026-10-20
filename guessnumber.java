import java.util.Scanner;
public class guessnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int min=1;
		int max= 9;
		
		String ch="y";
		while(ch.equalsIgnoreCase("y")) {
		int CG=min+(int)(Math.random()*(max-min)+1);
		System.out.print("guess the number between 1 to 9: ");
		
		int UG= sc.nextInt();
		if(UG==CG) {
			System.out.println("you got it right!😊");
		
		}
		else if(Math.abs(UG-CG)==1 ) {
			System.out.println("you almost got it🤷‍♀️");
			
		}
		else {
			System.out.println("guess again you got it wrong😒");
		}
		// TODO Auto-generated method stub
		System.out.println("the number is "+CG);
		
		sc.nextLine();
		System.out.print("Do u want to continue...y/n ");
		ch=sc.nextLine();
		

	}
		sc.close();

	}
	}
