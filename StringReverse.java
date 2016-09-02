import java.util.Scanner;

public class StringReverse {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Ente the String:");
	String string=s.next();
	StringBuffer st=new StringBuffer(string);
	for(int i=0;i<st.length();i++)
	{
		st.reverse();
	}
	System.out.println(st);
}
}
