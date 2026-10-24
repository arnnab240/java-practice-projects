import java.util.*;
public class Phonedirectry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> name=new ArrayList();
		Scanner sc= new Scanner(System.in);
		ArrayList<String> phone=new ArrayList();
		System.out.println("....Welcome To Phone Directry....");
		boolean run=true;
		while(run) {
			System.out.println("1: Add contact");
			System.out.println("2: show all contact");
			System.out.println("3: Remove any contact");
			System.out.println("4: Exit");
			System.out.print("Enter your choice:");
			int rec=sc.nextInt();
			sc.nextLine();
			
			switch(rec) {
			case 1:System.out.println("Enter your contact and type exit to exit");
				while(true) {
					
				System.out.print("Enter the Name of the contact: ");
				
			String enter=sc.nextLine();
			
			if(enter.equalsIgnoreCase("exit")) {
				break;}
			
			
			
			System.out.print("Enter the Phone Number of the contact: ");
			String ph=sc.nextLine();
			
			
			
				
			name.add(enter);
			phone.add(ph);
				}
				System.out.println();
				break;
			  
			
			case 2: System.out.println("..The Content of the Directry..");
			int n=0;
			while(n<name.size()) {
				System.out.println((n+1)+":"+name.get(n)+":"+phone.get(n));
				n=n+1;
				
				
				
			
			}
			System.out.println( );
			break;
			
			
			
			
			case 3:System.out.print("Enter the name of contact you want to delete: ");
			String remove=sc.nextLine();
			boolean found=false;
			for(int i=0;i<name.size();i++) {
				String rev=name.get(i);
				if(remove.equalsIgnoreCase(rev)) {
					name.remove(i);phone.remove(i);
					found=true;
					System.out.println("Name removed Sycessfully");
					break;
				}
				
				
			}
			if(!found) {
			System.out.println("No such record found");}
			System.out.println();
			
			
			
			break;
			
			
			
			case 4:System.out.println(".....Thanks for using Phone Directry....");
			run=false;break;
			
			default:System.out.println("Wrong Command Entered .  ....Try again....");
			
			
			}
			
			
			
		}
	}

}
