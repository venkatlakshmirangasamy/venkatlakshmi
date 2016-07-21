import java.util.*;
public class Alphabets {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char a=scanner.next().charAt(0);
		if(a>'a'&&'z'>a||a>'A'&&a>'Z')
			System.out.println("it is an alphabets");
		else
			System.out.println("it is not an alphabets");
	}

}
