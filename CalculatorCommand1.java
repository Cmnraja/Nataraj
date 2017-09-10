import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String a=s.next();
        String a1=a.replaceAll("[^0-9]"," ");
        System.out.println(a1);
        String a2[]=a1.split(" ");
        int x=Integer.parseInt(a2[0]);
        int y=Integer.parseInt(a2[1]);
        int z=Integer.parseInt(a2[2]);
        System.out.println(a2[0]+"hg"+a2[1]+"fu"+a2[2]);
        char f='@';
        if(x+y==z)
        f='+';
        else if(x-y==z)
        f='-';
        else if(x*y==z)
        f='*';
        else
        f='/';
        System.out.println(f);
        
       
		//Your Code Here

	}
}
