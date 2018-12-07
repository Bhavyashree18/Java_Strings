import java.util.Scanner;

public class freqch8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
String s= in.next(); //input string
int l= s.length();// length of string

int[] a = new int[256];
int i=0;
for(i=0;i<l;i++)
{
	a[(int)s.charAt(i)]++; //increment frequency
}
int max=0;
int min=0;
char ch=' ';
char c =' ';

for(i=0;i<256;i++)
{
	if(max<a[i]) //check for max frequency with each character frequency
	{
		max=a[i];
		ch= (char)i;//convert max freq chracter to char and store in ch
	}
}
/*for(i=0;i<256;i++)
{
	if(a[i]!=0)
	{
		
			
			System.out.println("fre: " +(char)i + " " +a[i]);
	}
}*/
for(i=0;i<256;i++)
{
	if(a[i]!=0)
	{
			
			if(a[min]==0 || a[i]<a[min]) // find min frequency charcter
			{
				min=i;
				
				c=(char)i;// min frequency store in char c.
			}
	}
}
	
	System.out.println("max :" + ch);
	System.out.println("min :" + c);
	}

	}
	
