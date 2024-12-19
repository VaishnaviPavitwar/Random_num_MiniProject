
import java.util.*;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int my_no=0, user_no=0;
		my_no= (int)(Math.random()*100);
		do
		{
			System.out.println("Guess the number(1-100): ");
			user_no=sc.nextInt();
			if(user_no==my_no)
			{
				System.out.println("Whoo!! Congrats, You guessed it correct.");
				break;
			}
			else if(user_no>my_no)
				System.out.println("Your number is too big.");
			else
				System.out.println("Your number is too small.");
		}while(user_no>=0 && user_no<=100);
		
		System.out.println("My number was: " +my_no);
	}
}