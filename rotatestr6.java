import java.util.Scanner;

public class rotatestr6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in    =   new Scanner(System.in);
		    
		 // take string Input S1
		        String  s1   =   in.nextLine();
		        String res=" ";
		       
		// find the length of s1 and s2
		int l1= s1.length();

		// check if length is even 
		if(l1%2==0)
		{
		    // Perform Clock-Wise Rotation
		    System.out.println("clockwise");

		    // store last character in res string
		    res+=s1.charAt(l1-1);

		    for(int i=0;i<l1-1;i++)
		    {
		        //add the remaining character to previous res string.
		        res+=s1.charAt(i);
		    }
	}


//length is odd 
else
{
 // Perform anti-clockwise Rotation
  System.out.println("anti-clockwise");

  //res+=s1.charAt(0);
 for(int i=1;i<l1;i++)
 {
     // take all character in the string except first one and store in res string
     res+=s1.charAt(i);
   
 }
 // add first character toprevious res string.
 res+=s1.charAt(0);
}
//print Final res string.
System.out.println(res);
}
}