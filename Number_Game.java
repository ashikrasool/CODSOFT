import java.util.*;

public class Number_Game
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Random random=new Random();
		int maxattempts=10;
		int score=0;
		boolean play=true;
		System.out.println("Let's play Number Game");
		System.out.println("Guess the random number between 1 to 100");		
		while(play){
		    int num=random.nextInt(100)+1;
		    System.out.println("Random number generated try to find it!");
		    int attempts=0;
		    boolean found=false;
		    while(attempts<maxattempts){
		        System.out.print("What's your guess? : ");
		        int guess=s.nextInt();
		        if((Math.abs(num-guess))>0 && Math.abs(num-guess)<=10){
		            System.out.println("You're too close");
		        }
		        else if(guess<num){
		            System.out.println("It's too low! Go again");
		        }
		        else if (guess>num){
		            System.out.println("It's too high! Go again");
		        }
		        else{
		            System.out.print("You guessed it right!");
		            score+=(maxattempts-attempts)*10;
		            found=true;
		            break;
		        }
		        attempts++;
		    }
		    if(!found){
		        System.out.println("You Lose! The number is : "+num);
		    }
		    System.out.println("Score : "+score);
		    System.out.println("Play again ? yes or no");
		    String again=s.next().toLowerCase();
		    if(again=="yes"){
		        play=true;
		    }
		    else{
		        play=false;
		        System.out.println("Thanks for playing!");
		    }
		}
	}
}
