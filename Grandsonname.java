
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s=new Scanner(System.in);
		String a[] = new String[3];
		String b[] = new String[6];
		int k=0;
		for (int i=0;i<3;i++)
		{
		    a[i]=s.nextLine();
		    String c[] = a[i].split(" ");
		    b[k]=c[0];
		    k++;
		    b[k]=c[1];
		    k++;
		}
		int c1=0;
		String z2=null,z1=null,z;
		int count=1;
		for(int i=1;i<6;i+=2)
		{
		    z2=b[i];
		    z=z2;
		    z1=b[i-1];
		    System.out.println(z);
		    count =1;
		    while(count!=3){
		    for(int j=0;j<5;j+=2)
		    {
		        if(z.equals(b[j])&&c1<=2)
		        {
		          z=b[j+1];
		          System.out.println(z);
		          c1=c1+1;
		          System.out.println(c1);
		        }
		        if(c1==2)
		        break;
			    }
			    count++;
		    }
		    if (c1==2)
		    break;
		}
		System.out.println(z1+" "+z2);

	}
}
