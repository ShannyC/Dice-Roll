import java.util.Scanner;

public class diceRoll {
	public static void main(String[]args)
	{
		rollDice();
		greetPlayer();
	}
	static int diceTotal = 0;
	private static Scanner userInput;
	public static void rollDice ()
	{
		int dice1 = (int)(Math.random() * 6) + 1;
		int dice2 = (int)(Math.random() * 6) + 1;
		diceTotal = dice1 + dice2;
	}
	public static void greetPlayer()
	{
		userInput = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = userInput.nextLine();
		System.out.println("Hi," + name + ", I hope you enjoy the gane!");
		
	}
	

}
