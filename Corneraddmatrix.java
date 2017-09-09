import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner (System.in);
		int a =s.nextInt();
		int sum =0;
		int a1[][] =new int [a][a];
		for(int i=0;i<a;i++){
		for(int j=0;j<a;j++){
		    a1[i][j]=s.nextInt();
		    System.out.print(a1[i][j]+" ");
		}
		System.out.println(" ");
		}
System.out.println(a1[0][0]+a1[0][a-1]+a1[a-1][0]+a1[a-1][a-1]);
	}
}
