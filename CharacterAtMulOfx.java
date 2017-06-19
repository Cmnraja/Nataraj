import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner (System.in);
		String a =s.next();
		int j=s.nextInt();
		for(int i=0;i<a.length();i++)
		{
		    if((i+1)%j==0)
		    System.out.println(a.charAt(i));
		        
		}

	}
}
