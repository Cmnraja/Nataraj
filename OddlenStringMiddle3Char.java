import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner(System.in);
		String a =s.next();
		int l=a.length();
		l=l/2;
		System.out.print(a.charAt(l-1));
		System.out.print(a.charAt(l));
		System.out.print(a.charAt(l+1));

	}
}
