import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner(System.in);
		int a,b;
		a=s.nextInt();//7
		b=s.nextInt();//6
		int []a1 =new int[a];
		int s2=0,count=0,count1=0;
		int s1=0,count2=0;
		for(int i=0;i<a;i++)
		{
		   a1[i]=s.nextInt(); //1 2 3 4 3 4 2
		  
		}
		for(int i=0;i<a;i++)
		{
		    if(a1[i]==b&&s2==0)
		    {
		        count=count+1;
		        s2=s2+1;
		    }
		}
		for(int i=0;i<a;i++)
		{
		    for(int j=i+1;j<a;j++)
		    {
		        
		        if(a1[j]==a1[i]&&s1==0)
		        {
		            if(a1[i]+a1[j]==b)
		          {  
		              count1=count1+1;
		            s1=s1+1;
		            break;}
		        }
		    }
		}
		
		Arrays.sort(a1);
		for(int i=0;i<a;i++)
		{
		for(int j=i+1;j<a;j++)
		{
		    if(a1[i]==a1[j])
		    {
		        a1[j]=b+1;
		    }
		}
		}
	
		for(int i=0;i<a;i++)
		{
		    for(int j=i+1;j<a;j++)
		    {
		        if(a1[j]+a1[i]==b)
		        {
		            count2=count2+1;
		            break;
		        }
		    }
		}
		System.out.println(count+count1+count2);//2  2 and4 or 3 and 3
	}
}
