import java.util.Scanner;
public class EuroJackpot 
{
	int x=1;
	int y=50;
	static int z=5;
	static int zak2=2;
	int max2=10;
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
		System.out.print(" +  ");
		for(int i=0;i<zak2;i++)
		{
		int wynik= x+(int)(Math.random()*(max2-x+1));
		System.out.print(wynik+" ");
		}
	}

	public static void main(String[] args) 
	{ 
		EuroJackpot r=new EuroJackpot();
		// r.skanowanie();
		
		for(int i=0; i<1;i++)
		r.wybieranie();
				
		
	}
}
