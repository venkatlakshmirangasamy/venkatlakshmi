import java.util.Scanner;

public class SpecialCharacter {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the string:");
	String st=scanner.next();
	int count=0;
	for(int i=0;i<st.length();i++)
	{
		if((!Character.isAlphabetic(st.charAt(i)))&&!Character.isDigit(st.charAt(i)))
		{
			count++;
		}
	}
	System.out.println("the special character count value is:"+count);
}
}
