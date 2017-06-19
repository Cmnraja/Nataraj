import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String a =s.next();
	char l=a.charAt(0);
	if(l>='a'&&l<='z')
	{
	    System.out.println(l+"-"+a.toUpperCase());
	}
	else
	System.out.println(l+"-"+a.toLowerCase());
    }
}
