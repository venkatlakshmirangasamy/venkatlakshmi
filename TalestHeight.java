import java.util.Arrays;
import java.util.Scanner;

public class TalestHeight {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int arr[]=new int[50];
	System.out.println("Enter the Array Element:");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=s.nextInt();
	}
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	 System.out.println("the fourth talest Element is"+arr[3]);
	 System.out.println("Enter the kth element:");
	 int kelement=s.nextInt();
	 System.out.println("the kthy element is:"+arr[kelement-1]);
}
}
