import java.util.*;
class fibo
{
	public static void main(String[] args) 
	{
		System.out.println("provide me the value of n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Integer[] x=new Integer[n];
		x[0]=0;
		x[1]=1;
		for(int i=2;i<x.length;i++)
		{
			x[i]=x[i-1]+x[i-2];

		}
		for(int i=1;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
	}

}