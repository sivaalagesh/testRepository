package Test1;

class Test
{
	void di() {
		System.out.println("Hello World");
	}
}

public class InheritTest extends Test
{
	public static void main(String[] args) 
	{
		InheritTest s = new InheritTest();
//		s.di();
		for(int i=0;i<10;i++)
		{
			s.di();
		 System.out.println("Welcome u all!");
		}

	}

}
