import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner(System.in);
		int n =s.nextInt();
		int a[]=new int [n];
		int b[]=new int [n];
		int b1[]=new int [n];
		int c=0,c1=0;
		int k=0,k1=0;
		for(int i=0;i<n;i++)
		{  a[i]=s.nextInt();
		   if(a[i]%2==0){
		        b[k]=a[i];
		        c++;
		       k++;  }
		    else
		    { b1[k1]=a[i];
		        k1++;
		        c1++; }
    	}
    	int ev[] = new int[c];
    	int odd[] =new int [c1];
    	int q=0,q1=0;
    	for(int k2=0;k2<c;k2++)
    	{ev[q]=b[k2];
    	    q++;}
    	for(int k2=0;k2<c1;k2++)
    	{  odd[q1]=b1[k2];
    	    q1++;}
    	    Arrays.sort(ev);
    	    Arrays.sort(odd);
    	    int f=0,f1=0;
    	    for(int i=0;i<n;i++)
    	    {
    	        if(a[i]%2==0){
    	            System.out.println(ev[f]);
    	            f++;
    	        }
    	        else{System.out.println(odd[f1]);
    	            f1++;
    	        }
    	    }
    	

	}
}
