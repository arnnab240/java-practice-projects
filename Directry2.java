import java.util.*;
public class Directry2{

	public static void main(String[] args) {

		ArrayList<String> ar=new ArrayList();
		Scanner sc=new Scanner(System.in);
		boolean run=true;
		while(run) {
			System.out.println("1:Add a task");
			System.out.println("2:View all task");
			System.out.println("3:Delete a task");
			System.out.println("4:Exit");
			System.out.print("Enter your choice:");
			int res=sc.nextInt();
			sc.nextLine();
			
			
			switch(res) {
			
			
			
			case 1:System.out.println("Enter the task you want to add to your directry and after complete writing enter Stop to Stop");
			System.out.println();	
			while(true) {
					System.out.print("Enter the task:");
				
				
			String Add=sc.nextLine();
			
			if(Add.equalsIgnoreCase("Stop")||Add.equalsIgnoreCase("Finish")) {
				break;
			}
			ar.add(Add);
			ar.replaceAll(String::toLowerCase);

			
			}break;
			
			
			
			case 2:System.out.println("The task you stored is."+ar);
			System.out.println();break;
			
			case 3:if(ar.isEmpty()) {
				System.out.println("the directry is already empty..");
				System.out.println();
				break;}
				else {
					System.out.println(ar);
					System.out.println("Enter the thing you want to remove...");
					String remove=sc.nextLine();
					remove=remove.toLowerCase();
					ar.remove(remove);
					System.out.println();break;
					
				}
			case 4:System.out.println("Thanks for entering");
			run=false;break;
			
			default:System.out.println("Invalid input..");
			}
			
			
			
			}
		}
		
		
		// TODO Auto-generated method stub

	}


