
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int temp=1;
Scanner scanner=new Scanner(System.in);
System.out.println("enter the number:");
int n=scanner.nextInt();
for(int i=1;i<=n;i++)
{
	temp=temp*i;
}
System.out.println(temp);
}
}
