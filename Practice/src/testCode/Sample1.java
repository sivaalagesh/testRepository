package testCode;

class Test
{
	void di() {
		System.out.println("Text from Test Class");
	}
}

public class Sample1 extends Test
{
	public static void main(String[] args) 
	{
		Sample1 s = new Sample1();
//		s.di();
		for(int i=0;i<10;i++)
		{
			s.di();
		 System.out.println("Hello");
		}

	}

}
