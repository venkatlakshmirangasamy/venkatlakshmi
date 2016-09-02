import java.util.Scanner;

public class Duplicate {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Ente the String:");
	String str=s.next();
	StringBuffer sb=new StringBuffer(str);
	for(int i=0;i<sb.length();i++)
	{
		for(int j=i+1;j<sb.length();j++)
		{
		if(sb.charAt(i)==(sb.charAt(j)))
		{
			sb.deleteCharAt(j);
		}
	}
	
	}
	String st=new String(sb);
	System.out.println(st);
}

}



