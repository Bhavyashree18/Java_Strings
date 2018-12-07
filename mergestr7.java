import java.util.*;
public class mergestr7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in    =   new Scanner(System.in);
	    
	    // take string Input s1 and s2
	        String  s1   =   in.nextLine();
	        String  s2   =   in.nextLine();
	        
	        // find the length of s1 and s2
	int l1= s1.length();
	int l2= s2.length();

	// take output string initialized to empty

	String result= " ";
	// compare the lengths of string 
	if(l1==l2)
	{
	 //traverse the string
	 for(int i=0;i<l1;i++)
	    {
	        // take the string character by character and store in result using charAt() function
	        
	        result+= s1.charAt(i);
	        result+= s2.charAt(i);
	    }

	 System.out.println(result);   
	}
	else
	{
	    System.out.println("lengths not equal");
	}
	}

}
