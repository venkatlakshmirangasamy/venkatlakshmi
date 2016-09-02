import java.util.Scanner;

public class FactorialNumber {
public static void main(String[] args) {
	int fact=1;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=s.nextInt();
	for(int i=1;i<=num;i++)
	{  
		fact=fact*i;
	}
	System.out.println(fact);
}
}
