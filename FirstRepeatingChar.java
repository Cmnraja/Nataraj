import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner(System.in);
		String a =s.nextLine();
		char c;
		int flag =0;
		for(int i=0;i<a.length();i++)
		{
		    for(int j=i+1;j<a.length();j++)
		    {
		        if(a.charAt(i)==a.charAt(j))
		        {
		        System.out.println(a.charAt(i));
		        flag=1;
		        break;
		        }
		        
		    }
		    if(flag==1)
		    break;
		}

	}
}
