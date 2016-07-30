import java.util.Scanner;

public class SumOfNumbers {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int sum=0;
	System.out.println("enter the N numbers:");
	int n=scanner.nextInt();
	for(int i=0;i<=n;i++)
	{
		sum+=i;
	}
	System.out.println(sum);
}
}
