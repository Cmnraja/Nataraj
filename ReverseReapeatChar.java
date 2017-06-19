import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner(System.in);
		String a =s.nextLine();
		int l=a.length();
		int flag=0;
		for(int i=l-1;i>=0;i--)
		{
		   
		    for(int j=i-1;j>=0;j--)
		    {
		       
		        if(a.charAt(i)==a.charAt(j))
		        {
		          
		           System.out.println(a.charAt(j));
		            flag =1;
		            break;
		            
		        }
		    }
		    if(flag==1)
		    {
		    break;
		    }
		}

	}
}
