import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner(System.in);
		int a1=s.nextInt();//4
		int a[]=new int [a1];
		int sum=0,input=0;
		String z;
		for(int i=0;i<a1;i++)
		{
		    a[i]=s.nextInt();//39 -8 57 24
		
		    if(a[i]>0)
		    {
		        if(a[i]%2!=0)
		        {
		           sum =sum+a[i];
		        }
		        else
		        {
		            String a2 =String.valueOf(a[i]);
		           // System.out.println(a2);
		            StringBuilder in =new StringBuilder();
		            in.append(a2);
		            in =in.reverse();
		         //   System.out.println(in);
		            z=in.toString();
		            input =Integer.parseInt(z);
		            sum =sum +input;
		        }
		    }
		}
		System.out.println(sum);//39+57+42

	}
}
