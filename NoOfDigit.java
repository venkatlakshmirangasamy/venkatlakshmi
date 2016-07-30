import java.util.Scanner;

public class NoOfDigit
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number:");
		int a=scanner.nextInt();
		int digit=(int) (Math.log10(a)+1);
		System.out.println("the digit is:"+digit);
	}
}
