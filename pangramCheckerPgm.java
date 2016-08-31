import java.util.Scanner;

public class pangramCheckerPgm {
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("enter the String:");
		       String str=sc.nextLine();
	        char[] arr=new char[26];
	        char[] b=new char[26];
	        int l=0,l1=0,count=0;
	        for(char i='a';i<='z';i++)
	        {
	         arr[l]=i;
	         l++;
	        }
	         for(char j='A';j<='Z';j++)
	        {
	         b[l1]=j;
	         l1++;
	        }
	       for(int i=0;i<26;i++){
	       for(int j=0;j<str.length();j++)
	       {
	        if(str.charAt(j)==arr[i]||str.charAt(j)==b[i])
	        {
	          count++;
	          arr[i]=(char)-1;
	           b[i]=(char)-1;
	        }
	            }}
	        if(count==26)
	        {
	            System.out.println("it is a pangram");
	        }
	        System.out.println("its not a pangram");
	    }
	}
