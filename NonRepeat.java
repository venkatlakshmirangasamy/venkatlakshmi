import java.util.Scanner;

public class NonRepeat {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the limit:");
	int limit=s.nextInt();
	int arr[]=new int[limit];
	System.out.println("enter the array:");
	int temp=0;
	for(int i=0;i<limit;i++)
	{
		arr[i]=s.nextInt();
	}
	for(int i=0;i<limit;i++)
	{
		int v=0;
		for(int j=0;j<limit;j++)
		{
		if(arr[i]==arr[j])
		{
			v++;
		}
		}
		if(v<2)
		{
		temp=arr[i];
		}
	}
	System.out.println(temp);	
	}

}
