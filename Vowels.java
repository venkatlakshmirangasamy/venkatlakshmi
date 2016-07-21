import java.util.*;
public class Vowels {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your character:");
		char u=scanner.next().charAt(0);
		switch(u)
		{
		case 'a':
			System.out.println("it is one of the vowels");
			break;
		case 'e':
			System.out.println("it is one of the vowels");
			break;
		case 'i':
			System.out.println("it is one of the vowels");
			break;
		case 'o':
			System.out.println("it is one of the vowels");
			break;
		case 'u':
			System.out.println("it is one of the vowels");
			break;
			default:
				System.out.println("it is a consonant");
				break;
		}
		
	}

}
