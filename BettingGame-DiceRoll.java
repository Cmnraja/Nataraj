import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner(System.in);
		String a =s.nextLine();
		int l =a.length();
		String t[]=a.split(" ");
		int n[] =new int[l];
		int i,count=0,count1=0;
		for(i=0;i<=l/2;i++)
		{
		   n[i]=Integer.parseInt(t[i]);
		   if(n[i]%2==0)
		   count1=count1+1;
		   else
		   count =count+1;
		   
		}
		for(i=0;i<=l/2;i++)
		{
		    System.out.println(n[i]);
		}
		System.out.println(count1);
		System.out.println(count);
		int g =s.nextInt();
		int z =s.nextInt();
		int t1 =g*count-z*count1;
		System.out.println(t1);

	}
}
