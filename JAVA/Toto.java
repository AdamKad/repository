import java.util.Scanner;
public class Toto 
{
	int x=1;
	int y=49;
	static int z=6;
	public void skanowanie()
	{
	Scanner skaner=new Scanner(System.in);
	System.out.println("podaj doln� granic�");
	 x=skaner.nextInt();
	System.out.println("podaj g�rn� granic�");
	 y=skaner.nextInt();
	 System.out.println("podaj ilo�� liczb");
	z=skaner.nextInt();
	}
	
	public void wybieranie()
	{
		for(int i=0;i<z;i++)
		{
		int wynik= x+(int)(Math.random()*(y-x+1));
		System.out.print(wynik+" ");
		}
		System.out.println("");
	}

	public static void main(String[] args) 
	{ 
		Toto r=new Toto();
		// r.skanowanie();
		
		for(int i=0; i<5;i++)
		r.wybieranie();
				
		
	}
}
