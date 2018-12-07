import java.util.Scanner;

public class countch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int c=0, c1=0;
		String str=" ";
		String str1= " ";
		//taking string input
		String t =in.next();
		for(int i=0;i<t.length();i++)
		{
		//check if character is Uppercase
		if(Character.isUpperCase(t.charAt(i)))
		{
		//increment Uppercase count
		 c++;
		char x=t.charAt(i);
		    str=str + x+ " ";
		    
		}
		//check if character is Lowercase
		else if(Character.isLowerCase(t.charAt(i)))
		{
		//increment Lowercase count
		c1++;
		char y=t.charAt(i);
		    str1=str1+ y + " ";
		   
		}
		}
		// check both uppercase and lowercase count are equal
		if(c==c1)
		{
		System.out.println("Equally distributed");
		}
		// print count and character if counts are not equal
		else
		{
		    System.out.println("Uppercase character count is :"  + " "  + c + ", " + str);
		 System.out.println("Lowercase character count is : " + " " + c1 + " ," +str1);
		}
	}

}
