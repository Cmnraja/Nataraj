import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner(System.in);
		String s1=s.next();
		String s2 =s.next();
		int l = s1.length();
		int l1=s2.length();
		char b[] = new char[l];
		char b1[] = new char[l1];
		int i;
		int j,count=0;
		for(i=0;i<l;i++)
		{
		    b[i]=s1.charAt(i);
		 
		}
		for(i=0;i<l1;i++)
		{
		    b1[i]=s2.charAt(i);
		}
		for(i=0;i<l;i++)
		{
		    for(j=0;j<l1;j++)
		    {
		        if(b1[j]==b[i])
		        {
		            count =count+1;
		            b1[j]=' ';
		            break;
		        }
		    }
		}
		System.out.println(count);
		

	}
}
