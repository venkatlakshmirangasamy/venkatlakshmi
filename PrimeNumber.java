import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int flag = 0;
	System.out.println("Enter the number:");
	int number = scanner.nextInt();
	if(number==1)
    {
    	System.out.println("1 is an neither prime nor composite");
    }
	else{
		for(int i=2; i<number; i++)

			{
			    if(number % i == 0)
			    {
					flag++;
			    }
			
		}
			if(flag!=0){
				System.out.println("not a prime");
			}
			else{
				System.out.println("prime");
			}
	}
}
}
