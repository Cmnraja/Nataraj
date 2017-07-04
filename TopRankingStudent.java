import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();//3
		int i;
		String a[] = new String[n];
		int maths[] =new int[n];
		int physics[] = new int[n];
		int chem[] = new int[n];
		String name[]=new String[n];
		int total[]=new int[n];
		String x =s.nextLine();
		for(i=0;i<n;i++)
		{
		a[i]=s.nextLine();//Arunthathi 100 90 85   Bhuvana 100 95 80 Chandan 100 95 78
		System.out.println(a[i]);
		String b[]=a[i].split(" ");
	    name[i] = b[0];
		maths[i]=Integer.parseInt(b[1]);
		physics[i] =Integer.parseInt(b[2]);
		chem[i]=Integer.parseInt(b[3]);
	    total[i]=maths[i]+physics[i]+chem[i];
	    System.out.println(total[i]);
	}
	int l=0;
	int t=0;
	for(i=0;i<n;i++)
	{
	    if(l<total[i])
	    {
	        l=total[i];
	        t=i;
	    }
	    else if(l==total[i])
	    {
	        if(maths[i]>maths[i-1]){
	        l=total[i];t=i;}
	        else if(maths[i]==maths[i-1])
	        {
	            if(physics[i]>physics[i-1]){
	            l=total[i];t=i;}
	            else if(physics[i]==physics[i-1])
	            {
	                if(chem[i]>chem[i-1]){
	                l=total[i];t=i;}
	            }
	        }
	       
	    }
	}
	 System.out.println(name[t]);   //Bhuvana

	
		

	}
}
