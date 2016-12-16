import java.lang.*;
public class wrapperClass 
{
	public static void main(String[] args)
	{
		int i=10;
		int j=124;
		
		Integer b=new Integer(50);
				
		Integer a=Integer.valueOf(i); //Explicit 
		Integer p=j; //Auto boxing
		
		int c=b.intValue(); //Vice-Versa
		
		System.out.println(+a);
		System.out.println(+p);
		System.out.println(a.compareTo(p));
		
	}
	
	}

