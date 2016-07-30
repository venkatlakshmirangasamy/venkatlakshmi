import java.util.*;
public class Fibonacci
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
int first=0,second=1;
int n=s.nextInt();
System.out.print(first);
System.out.print(second);
	for(int i=3;i<=n;i++)
	{
		int a=first+second;
		System.out.print(a);
		first=second;
		second=a;			
}
	
	}
}
