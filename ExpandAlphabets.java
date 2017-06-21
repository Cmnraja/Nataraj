import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner (System.in);
		String a=s.next();//4a5h
		int l =a.length();//4
		char b[]=a.toCharArray();
		int n[]=new int [l];
		char b1[]=new char[l];
		char b2[]=new char[l];
		int k=0;
		int c=0;
    	for(int i=0;i<l;i++)
    	{
    	    if(b[i]>='a'&&b[i]<='z'||b[i]>='A'&&b[i]<='Z')
    	    {   b2[k]=b[i];
    	        b1[i]=' ';
    	        k++;
    	        c++;
    	    }
    	    else
    	    {
    	        b1[i]=b[i];
    	    }
    	}
    	    String re =String.valueOf(b1);
    	    String ch[] =re.split(" ");
    	    for(int i=0;i<c;i++)
    	    {
    	    n[i]=Integer.parseInt(ch[i]);
    	    }
    	    for(int i=0;i<c;i++)
    	    {
    	        for(int j=0;j<n[i];j++)
    	        {
    	            System.out.print(b2[i]);//aaaahhhhh
    	        }
    	    }
    	   
    	
    	
    

		

	}
}
