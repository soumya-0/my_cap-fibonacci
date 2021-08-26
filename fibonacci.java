import java.io.*;
public class fibonacci 
{	
	public static void main(String[] args)throws IOException
	{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.print("Enter the the range");
		int n=Integer.parseInt(br.readLine());
		int a=0,b=1,c;
		System.out.println("Fibo series are");
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=0;i<n;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
	}

}
