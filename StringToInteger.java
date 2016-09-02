import java.util.Scanner;

public class StringToInteger {
public static void main(String[] args) {
String str="java";
StringBuffer sr=new StringBuffer(str);
for(int i=0;i<sr.length();i++){
	int c=sr.charAt(i)-96;
	System.out.println(c);
}

}
}
