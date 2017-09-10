import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s = new Scanner(System.in);
		String a=s.next();
		TreeSet<Character> y =new TreeSet<>();
		for(int i=0;i<a.length();i++)
		{
		    y.add(a.charAt(i));
		}
		for(Character x:y)
		System.out.print(x);
		List<Character> a1 =new ArrayList<y>();
		Collection.reverse(a1);
		
	//	Collections.reverse(y);
		for(Character x1:a1)
		System.out.print(x1);

	}
}
