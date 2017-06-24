import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner (System.in);
		int n =s.nextInt();
		String a[] =new String[n*2];
		int b[] = new int[n*2];
		float avg =0.0f,avg1=0.0f;
		for(int i=0;i<(n*2);i++)
		{
		    a[i]=s.next();
		   // System.out.println(a[i]);
		    b[i] =Integer.parseInt(a[i]);
		}
		for(int i=0;i<(n*2);i=i+2)
		{
		    avg =avg+b[i];
		    avg1 = avg1+b[i+1];
		}
		System.out.printf("%.2f\n",avg/n);
		System.out.printf("%.2f",avg1/n);

	}
}
