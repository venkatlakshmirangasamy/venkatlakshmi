import java.util.Scanner;

public class NumberPalindrome {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number:");
	int number=scanner.nextInt();
	int duplicate=number;
	int r=0;
	int q=0;
	int temp=0;
	while(number!=0)
	{
		r=number%10;
		number=number/10;
		q=q*10+r;
	}
	if(q==duplicate)
	{
		System.out.println("It is palindrome");
	}
	else
	{
		System.out.println("It is not an palindrome");
	}
}
}
