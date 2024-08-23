import java.util.Scanner;
public class IT24100860Lab5Q2
{
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		int number,type;
		
		System.out.print("Enter the number of new members introduced: ");
		number=input.nextInt();
		
		if (number < 0)
		{
			System.out.println("Input must be a number 0 or greater");
		}
		else
		{
			switch(number)
			{
				case 0:System.out.println("No prize");
				break;
				case 1:System.out.println("Prize is a : Pen");
				break;
				case 2:System.out.println("Prize is an : Umbrella");
				break;
				case 3:System.out.println("Prize is a : Bag");
				break;
				case 4:System.out.println("Prize is a : Travelling Chair");
				break;
				default:System.out.println("Prize : Headphone");
				break;
			}
		}
	}
}