import java.util.Scanner;

public class togglestr5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		   
		//input string    
		 
		String s = in.next();
		     
		char ch;
		//iterate string character by Character 
		
		for(int i=0;i<s.length();i++)      
		 {
			ch=s.charAt(i);

			//check if character is Uppercase
			          
			if(Character.isUpperCase(ch))

			{
			//Convert the character to Lowercase if condition true
				
			System.out.print(Character.toLowerCase(ch));


			}
			else

				//check if character is Lowercase

				if(Character.isLowerCase(ch))
				{

				//Convert the character to Uppercase if condition true 

				System.out.print(Character.toUpperCase(ch));

				}

				else
					System.out.print(ch);
		 }    
	}

}
