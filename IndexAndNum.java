import java.util.Scanner;

public class IndexAndNum {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the limit of array elements:");
	int n=s.nextInt();
	int arr[]=new int[n];
	System.out.println("enter the array:");
	for(int i=0;i<n;i++)
	{
	arr[i]=s.nextInt();	
	}
	int count=0;
	for(int i=0;i<n;i++)
	{
		if(arr[i]==i)
		{
			count=1;
			System.out.println("the number"+" "+i+" "+"equals its index"+" "+arr[i]);
		}
		
	}
	
}
}
