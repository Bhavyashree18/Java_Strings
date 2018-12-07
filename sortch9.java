import java.util.Scanner;
import java.util.Arrays;

public class sortch9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in    =   new Scanner(System.in);
	    
	    // take string Input
	        String  s   =   in.nextLine();
s=s.toLowerCase();
	        int even=0, odd =   0,
	        len =   s.length(); // length of string
	        
	 // take 2 string to store odd and even positioned character

	        char strO[]  =   new char[50],
	             strE[] = new char[50];
	             
	// Convert the given string to character             
	char ch[] = s.toCharArray(); 

	// sort the character 
	Arrays.sort(ch);

	// convert chararray to String 
	String t = new String(ch);

	        for(int j=0 ; j<len ; j++)
	        {
	            // find the position is even
	            if(j%2 == 0)
	            {
	                // store even position character to String
	                strE[even]   =   t.charAt(j);
	                even++;
	            }

	            // find the position is odd
	            if(j%2 == 1)
	            {
	                   // store odd position character to String
	                strO[odd]   =   t.charAt(j);
	                odd++;
	            }
	        }
	        System.out.println(t);
	        System.out.print("even pos : ");
	       System.out.println(strE);
	       System.out.print("odd pos : ");
	        System.out.println(strO);
	}

}
