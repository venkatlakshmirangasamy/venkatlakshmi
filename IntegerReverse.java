import java.util.Scanner;

public class IntegerReverse {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=s.nextInt();
	StringBuffer st=new StringBuffer(Integer.toString(num));
	for(int i=0;i<st.length();i++)
	{
		st.reverse();
	}
	System.out.println(st);
}
}
