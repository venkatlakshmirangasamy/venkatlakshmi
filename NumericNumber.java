import java.util.Scanner;

public class NumericNumber {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the string:");
	String st=scanner.next();
	int count=0;
	for(int i=0;i<st.length();i++)
	{
	if(Character.isDigit(st.charAt(i)))
	{
		count++;
	}
}
	if(count>=0)
	{
		System.out.println("the numeric count is:"+count);
	}
	else if(count==0)
	{
		System.out.println("there is no numeric integer");
	}
}
}
