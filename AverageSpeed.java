import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner (System.in);
		String a =s.nextLine();//60@2 120@3
		int e=0,j=0;
		int r[]=new int[50];
		float distance=0,timer=0;
		for(int i=0;i<a.length();i++)
		{
		    if(a.charAt(i)==' ')
		    e++;
		}
		String b[] =a.split(" ");
	    

	for(int i=0;i<=e;i++)
	{
	    String c[]=b[i].split("@");
	    r[j]=Integer.parseInt(c[0]);
	    r[j+1]=Integer.parseInt(c[1]);
	    j=j+2;
	}
	for(int i=0;i<=(e+1)*2;i=i+2)
	{
	    distance=r[i]+distance;//180
	    timer =timer+r[i+1];//5
	}
	float speed=(distance/timer);
	System.out.printf("%.2f",speed);
	System.out.print(" kmph");//36.00kmph	

	}
}
