import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int a[] = new int[n];
		int i,result=-1;
		for(i=0;i<n;i++)
		a[i]=s.nextInt();
		Arrays.sort(a);
		int x=s.nextInt();
		for(i=0;i<n;i++)
		{
		    if(a[i]%x==0)
		    result=a[i];
		}
		System.out.print(result);

	}
}
