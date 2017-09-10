import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner(System.in);
		String a =s.next();
		int a1 =s.nextInt();
		System.out.println(a.substring(a.length()-a1)+a.substring(0,a.length()-a1));

	}
}
