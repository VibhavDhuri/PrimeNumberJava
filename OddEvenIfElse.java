import java.util.Scanner;
public class OddEvenIfElse {

	public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter the number to find out if it is Odd/Even:");
	int num = scanner.nextInt();
	if (num % 2 == 0)
	{
		System.out.println( num + " is Even.");
	}
	else
	{
		System.out.println(num + " is Odd.");
	}	
	}

}
