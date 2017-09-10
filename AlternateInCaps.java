import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner(System.in);
		String a=s.nextLine();
		String a1[] =a.split("[ ]");
		for(String x:a1){
	//	System.out.println(x);
		int i=0;
		for(Character c:x.toCharArray()){
 
		System.out.print(i%2==0?Character.toUpperCase(c):Character.toLowerCase(c));
		i++;
		}
		System.out.print(" ");
		}

	}
}
