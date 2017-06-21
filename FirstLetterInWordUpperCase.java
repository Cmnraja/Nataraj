import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner(System.in);
		String a =s.nextLine();//joIN tHE ParTY
		char c='\0';
		System.out.print(Character.toUpperCase(a.charAt(0)));
		System.out.print(a.charAt(1));
		for(int i=1;i<a.length()-1;i++)
		{
		    if(a.charAt(i)==' ')
		    {
		      c =a.charAt(i+1);   
		   //  System.out.println(c);
		 
		  System.out.print(Character.toUpperCase(a.charAt(i+1)));
		    
		    }
		    else
		    System.out.print(a.charAt(i+1));//JoIN THE ParTY
		}

	}
}
