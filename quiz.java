package github;


import java.util.Scanner;
public class quiz {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Score=0;
		String ch="y";
		while(ch.equalsIgnoreCase("y")) {
			System.out.println("wlecome to the quiz travia");
			System.out.println();
			System.out.println("Q1:'what does a intiger divide by intiger give in java'");
			System.out.println("A:intiger");
			System.out.println("B: Decimal");
			System.out.println("C:String");
			System.out.println("D:None of the above");
			String A1=sc.nextLine();
			if(A1.equalsIgnoreCase("A")) {
				System.out.println("you got it right");
				Score=Score+10;
			}
			else {
				System.out.println("the answer is wrong");
				Score=Score-2;
			}
			System.out.println();
			System.out.println("Q2:'the case in switch case initialy consist of which datatype'");
			System.out.println("A:String");
			System.out.println("B:Intiger");
			System.out.println("C:Double");
			System.out.println("D:Non of the above");
			String A2=sc.nextLine();
			if(A2.equalsIgnoreCase("B")) {
				System.out.println("you got it right");
				Score=Score+10;
			}
			else {
				System.out.println("you got it wrong");
				Score=Score-2;
				
			}
			
			
			System.out.println();
			System.out.println("Q3:'The largest value that intiger can hold'");
			System.out.println("A:2358669854");
			System.out.println("B:2588497620");
			System.out.println("C:2147483647");
			System.out.println("D:2168946312");
			String A3=sc.nextLine();
			if(A3.equalsIgnoreCase("c")) {
				System.out.println("you got it right");
				Score=Score+10;
			}
			else {
				System.out.println("you got it wrong");
				Score=Score-2;
			}
			System.out.println();
			System.out.println("Q4:'What is the method to convert string into intiger'");
			System.out.println("A:Intiger.parseInt()");
			System.out.println("B:intiger.parseint()");
			System.out.println("C:Intiger.ParseInt()");
			System.out.println("D:Intiger.parseInt");
			String A4=sc.nextLine();
			if(A4.equalsIgnoreCase("A")) {
				System.out.println("you got it right");
				Score=Score+10;
			}
			else {
				System.out.println("you got it wrong");
				Score=Score-2;
				
			}
			System.out.println();
			System.out.println("Q5:'Which of the following is not a arethmetic operator'");
			System.out.println("A:+");
			System.out.println("B:/");
			System.out.println("C://");
			System.out.println("D:%");
			String A5=sc.nextLine();
			if(A5.equalsIgnoreCase("C")) {
				System.out.println("you got it right");
				Score=Score+10;
				
			}
			else {
				System.out.println("you got it wrong");
				Score=Score-2;
			}
			System.out.println();
			System.out.println("THE QUIZ IS OVER AND THE TOTAL SCORE IS "+Score);
			System.out.println();
			
			System.out.println("Do you want to play again...y/n");
			
			ch=sc.nextLine();
			
			
			
		// TODO Auto-generated method stub

	}

}
}
