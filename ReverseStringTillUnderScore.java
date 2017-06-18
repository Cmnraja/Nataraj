import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner(System.in);
		String a =s.nextLine();
		char a1[] =a.toCharArray();
		String[] r =a.split("_");
		int l =r[0].length();
		int count =0; 
		int j =a.indexOf('_');
		if(j!=-1){
		StringBuilder in = new StringBuilder();
		in.append(r[0]);
		in = in.reverse();
		 System.out.print(in);  
		 for(int i=j;i<a.length();i++)
		 {
		     System.out.print(a1[i]);
		 }
		}
        else
        {
            StringBuilder in1 =new StringBuilder();
            in1.append(a);
            in1=in1.reverse();
            System.out.println(in1);
        }
    }
    
}
