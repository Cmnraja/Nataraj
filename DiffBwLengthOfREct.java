import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner(System.in);
		String b=s.nextLine();//100000 80000
		String c =s.nextLine();//100 80
		String b1[]=b.split(" ");
		String c1[]=c.split(" ");
		int b2[] =new int [3];
		int c2[] =new int [3];
		int x[] =new int [2];
 		for(int i=0;i<2;i++)
		{
		    b2[i]=Integer.parseInt(b1[i]);
		    c2[i]=Integer.parseInt(c1[i]);
		}
		for(int i=0;i<2;i++){
	x[i] =b2[i]/5;
	
	x[i]=x[i]/c2[i];
}
int x1=x[1]-x[0];
if(x1<0)
System.out.printf("%.2f",(float)-x1);
else
System.out.printf("%.2f",(float)x1);
	}
}
