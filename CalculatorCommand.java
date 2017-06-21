import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner a =new Scanner(System.in);
		String s =a.nextLine();//10m20
		long x=0,y=0;
		char p=' ';
		for(int i=0;i<s.length();i++)
		{
		    if(s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z')
		    {
		     p=s.charAt(i);
		   String c =Character.toString(s.charAt(i));
		      String  b[] = s.split(c);
		    x=Long.parseLong(b[0]);
		    y=Long.parseLong(b[1]);
            }
        }
        
        switch (p){
            case 'A':
            case 'a':
            System.out.println(x+y);
            break;
            case 'S':
            case 's':
            System.out.println(x-y);
            break;
            case 'm':
            case 'M':
            System.out.println(x*y);//200
            break;
            case 'D':
            case 'd':
            System.out.println(x/y);
            break;
        }
        
	}
}
