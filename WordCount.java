import java.util.Scanner;

public class WordCount {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int i=0;
	int count=0;
	String st="Hi Hello world";
	String st1[]=st.split("\\s");
	System.out.println("the splitted words are:");
	for(String st2:st1)
	{
	count++;	
	System.out.println(st2);
	}
	System.out.println("the count of the given words in the string is:"+count);
}
}
