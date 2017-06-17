import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner(System.in);
		int a =s.nextInt();
		int i,co=0;
		int []c =new int [a];
		for(i=0;i<a;i++)
		{
		    c[i]=s.nextInt();
		    
		}
		Arrays.sort(c);
		for(i=2;i<c[0];i++)
		{
		    if(c[0]%i==0&&c[a-1]%i==0)
		    co=co+1;
		   
		}
		System.out.println(co+1);
		
		        
	}
}
