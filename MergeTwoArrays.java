import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner(System.in);
		int n =s.nextInt();
		int a[] = new int[20];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int n1 =s.nextInt();
        
        for(int i=n;i<(n+n1);i++)
        {
            a[i]=s.nextInt();
        }
        
        int b[] = new int[n+n1];
        for(int i=0;i<(n+n1);i++)
        {
           b[i]=a[i];
        }
        Arrays.sort(b);
        for(int i=0;i<(n+n1);i++)
        {
            System.out.println(b[i]);
        }
	}
}
