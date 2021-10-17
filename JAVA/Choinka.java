
public class Choinka 
{
  public static void main(String[] args) 
  {
    int height = 10;
    for (int i = 0; i < height; i++) 
    {
      for (int j = 0; j < height - i; j++) 
      {
        System.out.print(" ");
      }
      for (int j = 0; j <= i * 2; j++) 
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}