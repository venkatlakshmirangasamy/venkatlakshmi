import java.util.*;
public class LargestNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the  three numbers:");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
	    if(a>b&&a>c)
	    System.out.println(a+" "+"is tha greatst one");
	    else if(b>c)
	    	System.out.println(b+" "+" is greater one");
	    else 
	    	System.out.println(c+" "+"is greater one");
	}

}
