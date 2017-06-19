import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner(System.in);
		int a =s.nextInt();
		if(a%100==0)
		{
		    a=a/100;
		if(a%4==0)
		System.out.println("yes");
		else
		System.out.println("no");
		}
		else if(a%4==0)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
