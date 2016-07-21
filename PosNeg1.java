import java.util.*;
public class PosNeg1 {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int num;
	System.out.println("enter the number:");
	num=scanner.nextInt();
	if(num<0)
		System.out.println("the given number is negative");
	else if(num>0)
		System.out.println("the given number is positive");
	else if(num==0)
		System.out.println("the given number is zero");
	}

}
