package week1.day1;

public class factorial {

	public static void main(String[] args) {
		int fac,inp;
		fac=1;
		for (inp=5;inp>=1;inp--)
		{
			fac=inp*fac;
			System.out.print(inp);
			if (inp>1)
			{
			System.out.print("*");
			}
		}
		System.out.print("="+fac);
	}
}
