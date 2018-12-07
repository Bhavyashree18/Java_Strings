import java.util.Scanner;

public class splitsort4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in= new Scanner(System.in);
        
        String temp;
        int i,j;
        // take input string 
        String s1 = in.nextLine();   
        // convert all uppercase to lower case make it easier.
        String str = s1.toLowerCase();
        // Split the string 
        String[] t = str.split(" ");   
       
        System.out.println(s1);
        
    /*for(String s : t){
    System.out.println(s);
    }*/
// find the length of split string 
        int len =t.length;      
       
        // Perform sort by taking 2 for loop
        for(i=0; i<len; i++)
        {
            for(j=1; j<len; j++)
            {
            	// use compareTo() to find which word comes first in dictionary 
                if(t[j-1].compareTo(t[j])>0)
                {
                    // swap the words if second word comes first. using string temp
                    temp=t[j-1];
                    t[j-1]=t[j];
                    t[j]=temp;
                }
            }
        }
        
		// after performing sort print all word in an dictiory format.
    System.out.println("*" + " Dictionary Order " + " *");
        for(i=0;i<len;i++)
        {
            System.out.print(" "+ t[i]);
        }
            }
	}


