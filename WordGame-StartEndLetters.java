import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner(System.in);
		int a =s.nextInt();
		String n[] = new String[a];
		String q[] = new String[a];
		char t;
		int k=0,flag=0;
		for(int i=0;i<a;i++)
		{
		    n[i]=s.next();
		}
		int c =s.nextInt();
		q[0]=s.next();//egg
		
		for(int i=0;i<c;i++)
		{
		    k=q[i].length();
		    t=q[i].charAt(k-1);//g
		    for(int j=0;j<a;j++)
		    {
		        if(n[j].charAt(0)==t)
		        {
		            q[i+1]=n[j];
		            
		            break;
		        }
		        
		    }
		}
		System.out.println(q[c-1]);
	

	}
}
