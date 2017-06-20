import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner(System.in);
		String a =s.nextLine();//mayday
		String b =s.nextLine();//daybreak
		int c=0;
		
		    for(int j=0;j<a.length();j++)
		    {
		        if(b.charAt(0)==a.charAt(j)&&b.charAt(1)==a.charAt(j+1)&&
		        b.charAt(2)==a.charAt(j+2))
		        {
		          
		             c=j;
		             
		        }
		    }
		    System.out.println(c);
		    
		for(int i=c;i<a.length();i++)
		{
		    System.out.print(a.charAt(i));
		}
		

	}
}
