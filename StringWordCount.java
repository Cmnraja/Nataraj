import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner(System.in);
		String a=s.nextLine();
		int l=a.length();
		int count=1;
		for(int i=0;i<l;i++)
		{
		    if(a.charAt(i)==' ')
		    count=count+1;
		}
	System.out.println(count);}
}
