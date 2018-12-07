import java.util.Scanner;

public class splitmin3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in= new Scanner(System.in);
        
        // take input string 
        String s1 = in.nextLine();   
        
        // convert all uppercase to lower case make it easier.
        String str = s1.toLowerCase();
        
        // Split the string based on white space
        String[] t = str.split(" "); 
        
       // Print original string
        System.out.println(s1);
        
        // find the length of split string 
        int len =t.length;
        // asign the first word of split string to be small string 
        
        String minw = t[0];
        // traverse the split string 
        for (int i = 1; i < len; i++)
        {
        // compare the first element with rest element and find which is small
        if (minw.length()>t[i].length())
        {
            // assign the small word to the string minw.
            minw = t[i];

        }
        
        
        }
       System.out.println();
        //Print the small word
        System.out.println("Smallest word from the split string is : " + minw);
    }

	}


