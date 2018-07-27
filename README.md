# Java_Strings
String and StringBuffer methods


import java.util.Scanner;

public class stringrev
{

public static void main(String[] args)
{

//taking input from the keyboard with the help of Scanner
Scanner in = new Scanner(System.in);
String s=in.next();
String s1= in.next();

//Performing Case sensitive comparision using equals()
 if(s.equals(s1))
{

//reverse string using StringBuffer if s and s1 are equal.
StringBuffer s2= new StringBuffer(s);
s2.reverse();

//print the reverse string s2
System.out.println(s2);
}

else
{
System.out.println("Reverse Not supported");
}
}
}





}
}
