import java.util.Scanner;

public class agecalculate10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner in = new Scanner(System.in);
		   
		 
		//input string    
		 
		String s = in.next();

		int add;
		 
		char ch;
		// Compute length of string   
		int l= s.length();
		// convert string to lowercase to make it easy .

		String t=s.toLowerCase(); 
		// take the last character from the given string.
		ch=t.charAt(l-1);
		// convert character to Acii value

		int u = (int)ch;
		// lower case ascii start from 96 substract from Ascii value of given character

		int v= u-96;

		// add the length of string and alphabetican number of last character.

		add=l+v;
		System.out.println(add);

	}

}
