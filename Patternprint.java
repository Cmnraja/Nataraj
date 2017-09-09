import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner(System.in);
		String a =s.nextLine();
		for(int i=0;i<a.length();i++)
		{
		    char a1 =a.charAt(i);//a
		    for(int j=1;j<=i+1;j++)
		    System.out.print(a1);
		    System.out.println();
		    
		}

	}
}
