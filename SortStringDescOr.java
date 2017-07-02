import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner(System.in);
		int n =s.nextInt();
		String a[]= new String[n];
		String x;
		for(int i=0;i<n;i++)
		a[i]=s.next();
	    for(int i=0;i<n;i++)
	    {
	        for(int j=i+1;j<n;j++)
	        {
	            if(a[i].compareTo(a[j])<0){
	            x=a[i];
	            a[i]=a[j];
	            a[j]=x;}
	            
	        }
	        
	        
	    }
	    
	    for(String z:a)
	    System.out.println(z);

	}
}
