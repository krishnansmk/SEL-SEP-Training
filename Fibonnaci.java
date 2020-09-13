package week1.day1;

public class Fibonnaci {

	public static void main(String[] args) {
		int a,b,c;
		a=0;
		b=1;
		System.out.print(a+",");
		
		System.out.print(b+",");
		
		for (int i=1;i<=10;i++)
		{
			c=a+b;
			
			System.out.print(c);
			System.out.print(",");
			a=b;
			b=c;
		}

}
}