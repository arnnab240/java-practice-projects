import java.util.*;
public class Inventory {

	public static void main(String[] args) {
		ArrayList<String> Product= new ArrayList();
		ArrayList<Double> Price= new ArrayList();
		ArrayList<Integer> Unit = new ArrayList<>();
		ArrayList<Double> Total=new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		boolean run=true;
		while(run) {

		
		System.out.println("1:Enter the Invetory");
		System.out.println("2:Display all the Inventory");
		System.out.println("3:Srech for a specific Item");
		System.out.println("4:Delete the item in inventory");
		System.out.println("5:Exit");
		System.out.print("Enter your choice:");
		int res=sc.nextInt();
		sc.nextLine();
		
		switch(res) {
		case 1:System.out.println("....Enter all the details of the product enter exit or stop to stop.....");
			while(true) {
			System.out.print("Enter the name of the items:");
		String pro=sc.nextLine();
		if(pro.equalsIgnoreCase("Exit")||pro.equalsIgnoreCase("Stop")) {
			break;
					
				}
		
		Product.add(pro);
		
		System.out.print("Enter the price of the item:");
		double pr=sc.nextDouble();
		Price.add(pr);
		
		
		System.out.print("Enter the Quantity of the unit");
		int un=sc.nextInt();
		Unit.add(un);
		sc.nextLine();
		
		double tot=pr*un;
		Total.add(tot);
		System.out.println( );
		

		
		}break;
		
		
		case 2 :for (int i=0;i<Product.size();i++){
			System.out.println((i+1)+" "+"Item:"+Product.get(i)+" "+ "Price:"+Price.get(i)+" "+"Unit:"+Unit.get(i)+" "+"Taotal:"+Total.get(i));
		}break;
			
			
			
			
			
		case 4: System.out.print("Enter the Product name to remove:");
		String re=sc.nextLine();
		for(int r=0;r<Product.size();r++) {
			if(re.equalsIgnoreCase(Product.get(r))) {
				Product.remove(r);Price.remove(r);Unit.remove(r);Total.remove(r);
			}
		}break;
		
		case 3:System.out.println("Enter the Product name you want to search");
		String sr=sc.nextLine();
		for(int u=0;u<Product.size();u++) {
		if(sr.equalsIgnoreCase(Product.get(u))) {
			System.out.println((u+1)+"Item:"+Product.get(u)+" "+ "Price:"+Price.get(u)+" "+"Unit:"+Unit.get(u)+" "+"Taotal:"+Total.get(u));
		}
		}
		System.out.println();
		break;
		
		case 5:System.out.println(".....Thanks for Using the Inventory.....");
		run=false;break;
		default:System.out.println("Wrong command enter.. try Again");
		
		}
		// TODO Auto-generated method stub

	


}
	}
}

