import java.util.Scanner;
public class Rockpaperscissor {

	public static void main(String[] args) {
		System.out.println(".....WELCOME TO ROCK PAPER SCISSORS GAME....");

		Scanner sc= new Scanner(System.in);
		int max=3;
		int min=1;
		int your_score=0;
		int AI_score=0;
		while(true) {
			
			int random=min+(int)(Math.random()*(max-min)+1);
			System.out.println("__Select rock/paper/scissor__");
			System.out.println("Rock");
			System.out.println("Paper");
			System.out.println("Scissor");
			System.out.println("To exit type Exit");
			String res=sc.nextLine();
			System.out.println();
			 if(res.equalsIgnoreCase("Exit")) {
				System.out.println("THANKS FOR PLAYING");
				System.out.println("The AI score is.."+AI_score);
				System.out.println("Your score is.."+your_score);
				break;
			}
			
			String Randomres="";
			if(random==1) {
				Randomres="Rock";
			}
			else if(random==2) {
				Randomres="Paper";
				
			}
			else {
				Randomres="Scissor";
				
			}
			
			
			if(Randomres.equalsIgnoreCase("Rock") && res.equalsIgnoreCase("Paper")) {
				System.out.println("You win");
				your_score++;
			}
			else if(Randomres.equalsIgnoreCase("Paper")&& res.equalsIgnoreCase("Rock")) {
				System.out.println("you lose");
				AI_score++;
			}
			else if(Randomres.equalsIgnoreCase("Rock")&& res.equalsIgnoreCase("Scissor")){
				System.out.println("you loose");
				AI_score++;
			}
			else if(Randomres.equalsIgnoreCase("Paper")&& res.equalsIgnoreCase("Scissor")) {
				System.out.println("You win");
				your_score++;
				
			}
			else if(Randomres.equalsIgnoreCase(res)) {
				System.out.println("It was a tie");
				
			}
			else if(Randomres.equalsIgnoreCase(res)){
				System.out.println("It was a tie");
			}
			else if(Randomres.equalsIgnoreCase("Scissor")&& res.equalsIgnoreCase("Paper")) {
				System.out.println("You loose");
				AI_score++;
				
			}
			
			else if(Randomres.equalsIgnoreCase("Scissor")&&res.equalsIgnoreCase("Rock")) {
				System.out.println("You win");
				your_score++;
			}
			
			else if(Randomres.equalsIgnoreCase(res)) {
				System.out.println("It was a tie");
				
			}
			
			System.out.println("the Ai chosse "+Randomres);
			System.out.println();
			
			
			
			
			}
		}
		// TODO Auto-generated method stub

	}


