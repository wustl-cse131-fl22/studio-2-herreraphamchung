package studio2;
import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Start Amount: ");
		int startAmount = in.nextInt();
		System.out.println("Enter Win Probability!: ");
		double winChance = in.nextDouble();
		System.out.println("Enter win limit!: ");
		int winLimit = in.nextInt();
		System.out.println("Enter Total Simulations: ");
		int totalSimulations = in.nextInt();
		int playCounter = 0;
		int simDay = 0;
		int realStartAmount = startAmount;
		for(int i = 0; i<totalSimulations; i++)
		{
			while(startAmount > 0 && startAmount < winLimit)
			{
				if(Math.random()<=winChance)
				{
					startAmount++;
					playCounter++;

				}
				else
				{
					startAmount--;
					playCounter++;
				}

				if(startAmount == winLimit )
				{
					simDay++;
					System.out.println("Simulation " + simDay);
					System.out.println("Sucess");
					System.out.println(playCounter);
					playCounter = 0;
				}
				if(startAmount == 0)
				{
					simDay++;
					System.out.println("Simulation " + simDay);
					System.out.println("Ruin");
					System.out.println(playCounter);
					playCounter = 0;
					

				}

			}
			startAmount = realStartAmount;
		}
	}
}
