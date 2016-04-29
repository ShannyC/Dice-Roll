import java.util.Scanner;

public class method {
	private static Scanner userInput;
	private static int age;


	public static void main(String[] args)
	{
		greetPlayer();
		generateRandomNumber();
	}
	
	public static void greetPlayer()
	{
		userInput = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = userInput.nextLine();
		System.out.println("Hi," + name + ",I hope you enjoy the game!");
	}
	
	public static void  generateRandomNumber()
	{
		userInput = new Scanner(System.in);
		System.out.println("choose a random number!");
		int randomNumber = userInput.nextInt();
		System.out.println("You have chosen, " + randomNumber + ", as your number!");
		
	}


	
	
}
